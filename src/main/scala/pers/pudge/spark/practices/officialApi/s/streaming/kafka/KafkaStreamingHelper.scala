package pers.pudge.spark.practices.officialApi.s.streaming.kafka

import java.text.SimpleDateFormat
import java.util.Date
import java.util.concurrent.{Executors, ScheduledExecutorService, TimeUnit}

import org.apache.hadoop.hive.ql.io.orc._
import org.apache.hadoop.io.NullWritable
import org.apache.kafka.clients.consumer.ConsumerRecord
import org.apache.orc.mapreduce.OrcOutputFormat
import org.apache.spark.SparkConf
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.{Row, SaveMode, SparkSession}
import org.apache.spark.sql.types.{DataTypes, StructField, StructType}
import org.apache.spark.streaming.StreamingContext
import org.apache.spark.streaming.dstream.InputDStream
import org.apache.spark.streaming.kafka010.{CanCommitOffsets, HasOffsetRanges}

class KafkaStreamingHelper extends Serializable {

  val conf = new SparkConf().setMaster("local[4]").setAppName("MyKafkaStreaming")
  val pool = Executors.newSingleThreadScheduledExecutor()

  def saveOrcToHiveError(input: InputDStream[ConsumerRecord[String, String]], sc: StreamingContext) = {
//    val spark = SparkSession.builder()
//      .config(conf)
//      .enableHiveSupport()
//      .getOrCreate()

    input.foreachRDD(rdd => {
      val offsetRanges = rdd.asInstanceOf[HasOffsetRanges].offsetRanges
      val rdd2: RDD[Row] = rdd.map(record => {
        val recVal = record.value()
        val sdf = new SimpleDateFormat("yyyy-MM-dd")
        val pt = sdf.format(new Date())
        Row.fromSeq(Seq(recVal, pt))
      })
      val arr = Array(new StructField("data", DataTypes.StringType), new StructField("pt", DataTypes.StringType))
      val st = new StructType(arr)

//      val df = spark.createDataFrame(rdd2, st)
      //不能直接 saveAsTable
      //   org.apache.spark.sql.AnalysisException: Can not create the managed table('`kafka_to_hive`'). The associated location('/usr/hive/warehouse/kafka_to_hive') already exists.;
//      df.write.mode(SaveMode.Append) //overwrite 也不行
//        .format("orc")
//        .partitionBy("pt")
//        .saveAsTable("kafka_to_hive")

      //Google并试了多种方法，不能直接写orc
//      val sparkContext = sc.sparkContext
//      val rdd3 = rdd2.map(x => (NullWritable.get(), x))
//      rdd3.saveAsNewAPIHadoopFile("hdfs://localhost:8020/tmp/rdd_to_orc",
//        classOf[NullWritable],
//        classOf[OrcStruct],
//        classOf[OrcNewOutputFormat]
//      )
      input.asInstanceOf[CanCommitOffsets].commitAsync(offsetRanges)
    })

//    scheduler(spark, pool)
  }

  def saveOrcToHiveError2(input: InputDStream[ConsumerRecord[String, String]], sc: StreamingContext) = {

  }


    def scheduler(spark: SparkSession, pool: ScheduledExecutorService) = {
    pool.scheduleWithFixedDelay(new Runnable {
      override def run(): Unit = {
        spark.sql("show tables")
      }
    }, 0, 5, TimeUnit.SECONDS)
  }

}
