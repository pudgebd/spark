package pers.pudge.spark.practices.officialApi.h.hbase

import org.apache.hadoop.hbase.HBaseConfiguration
import org.apache.hadoop.hbase.client.{Put, Result}
import org.apache.hadoop.hbase.io.ImmutableBytesWritable
import org.apache.hadoop.hbase.mapred.TableOutputFormat
import org.apache.hadoop.hbase.mapreduce.TableInputFormat
import org.apache.hadoop.hbase.util.Bytes
import org.apache.hadoop.mapred.JobConf
import org.apache.kafka.common.config.ConfigDef.ConfigKey
import org.apache.spark.SparkConf
import org.apache.spark.rdd.PairRDDFunctions
import org.apache.spark.sql.types.{DataType, DataTypes, StructField, StructType}
import org.apache.spark.sql.{Row, SparkSession}
import pers.pudge.spark.practices.utils.constants.{Key, MT}

import scala.collection.mutable.ArrayBuffer


/**
  * 写hbase
  * https://segmentfault.com/a/1190000009762041
  */
object HbaseSparkDemo {


  val tableName = "t_row_begin_common_char"
  val maxBatchId = 10
  val batchSize = 1
  val partiCounts = 10
  val commonChars = ('0' to '9') ++ ('a' to 'z')
  val commonCSize = commonChars.length
  val random = new java.util.Random()

  /**
    * read
    */
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("test").setMaster(MT.LOCAL_MASTER)
//      .set("spark.serializer", "org.apache.spark.serializer.KryoSerializer")
    val spark = SparkSession.builder
      .config(conf)
      .enableHiveSupport()
      .getOrCreate()
    import spark.implicits._
    spark.createDataset(Seq(1, 2)).show()

    val ms = System.currentTimeMillis()
    println(ms)

    val hbaseConf = HBaseConfiguration.create()
    hbaseConf.set(Key.HBASE_ZOOKEEPER_QUORUM, "cdh217,cdh218,cdh219")
    hbaseConf.set(Key.HBASE_ZOOKEEPER_PROPERTY_CLIENTPORT, "2181")
    hbaseConf.set(TableInputFormat.INPUT_TABLE, "highroad:xxx_table_05")

    val hBaseRdd = spark.sparkContext.newAPIHadoopRDD(hbaseConf, classOf[TableInputFormat],
      classOf[ImmutableBytesWritable],
      classOf[Result])

    val rdd = hBaseRdd.map(tp => {
      Row.fromSeq(Seq(Bytes.toDouble(tp._2.getRow)))
    })
    val df = spark.createDataFrame(rdd, new StructType(Array(new StructField("id", DataTypes.DoubleType))))
    df.createOrReplaceTempView("highroad_xxx_table_05")
    spark.sql("select * from highroad_xxx_table_05").show()

    println("cost " + (System.currentTimeMillis() - ms) + " ms")
  }


  //随机写入 10 亿数据，靠 range.toSet.toSeq 实现随机
  //rowkey 只以数字开头，可以这样预分区
  //create 't_row_begin_common_char', 'c', SPLITS => ['1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
  //此处不包含 0,不能加上 20， 30 等，会使分布不均匀
  //*********************************************************************************************************************
  //***  用 BufferedMutator 也会大量消耗 zk 客户端连接，
  //***  最后抛出 IllegalArgumentException: A HostProvider may not be empty
  //*********************************************************************************************************************
  //only for hbase 1.X
  def main1(args: Array[String]): Unit = {
    val spark = SparkSession.builder
      .appName(tableName)
      .master(MT.LOCAL_MASTER)
      .getOrCreate()

    val conf = HBaseConfiguration.create()

    //最好在 resources 目录放入 xx-site.xml
//    conf.set("hbase.rootdir", s"hdfs://${MT.HDFS_HOST_PORT}/hbase")
//    conf.setBoolean("hbase.cluster.distributed", true)
//    conf.set("hbase.zookeeper.property.clientPort", "2181")
//    conf.set("hbase.zookeeper.quorum", MT.ZK_HOSTS)

    val jobConfig: JobConf = new JobConf(conf, this.getClass)

    // Note:  TableOutputFormat is used as deprecated code
    // because JobConf is an old hadoop API
    jobConfig.setOutputFormat(classOf[TableOutputFormat])
    jobConfig.set(TableOutputFormat.OUTPUT_TABLE, tableName)

    val range = 1 to maxBatchId
    val localData = spark.sparkContext.parallelize(range.toSet.toSeq, partiCounts).flatMap(flatMapBatchIdx(_))

    localData.saveAsHadoopDataset(jobConfig)
    localData.saveAsNewAPIHadoopDataset(conf)
  }

  //10 0000 0000
  def flatMapBatchIdx(batchIdx: Int): ArrayBuffer[(ImmutableBytesWritable, Put)] = {
    val start = (batchIdx - 1) * batchSize + 1
    val stop = batchIdx * batchSize
    val ab = new ArrayBuffer[(ImmutableBytesWritable, Put)]()

    for (i <- start to stop) {
      val iStr = commonChars(random.nextInt(commonCSize)) + Key.SEP_ + i.toString
      //            val byteInt = Random.nextInt(94) + 33
      //            val byteStr = new String(Seq[Byte](byteInt.toByte).toArray)

      val p = new Put(Bytes.toBytes(iStr))
      p.addColumn(Bytes.toBytes("c"),
        Bytes.toBytes("a"),
        Bytes.toBytes(iStr))

      ab += new ImmutableBytesWritable -> p
    }

    ab
  }


  //使用"org.apache.hbase" % "hbase-spark" % "2.0.0-alpha4" 无法在 spark 2.0 跑起，缺少org.apache.spark.Logging
  //该类已经被删除
  //    def main(args: Array[String]): Unit = {
  //        val spark = SparkSession.builder.appName("HbaseSparkDemo")
  //                .master("local[4]").getOrCreate()
  //
  //        val hbaseConf = HBaseConfiguration.create()
  //        hbaseConf.set("hbase.zookeeper.property.clientPort", "2181")
  //        hbaseConf.set("hbase.zookeeper.quorum", "nn1,nn2,dn1,dn2,dn3,dn4,dn5")
  //        val hbaseContext = new org.apache.hadoop.hbase.spark.HBaseContext(spark.sparkContext, hbaseConf)
  //
  //        val tableName = TableName.valueOf("kteset01")
  //        val rdd = hbaseContext.hbaseRDD(tableName, new Scan())
  //
  //        rdd.foreachPartition(it => {
  //            for (ele <- it) {
  //                println(StringUtils.getUtf8Str(ele._1.get))
  //            }
  //        })
  //    }


}
