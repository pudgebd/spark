package pers.pudge.spark.practices.officialApi.s.streaming.basic

import org.apache.hadoop.fs.Path
import org.apache.hadoop.io.{IntWritable, LongWritable, Text}
import org.apache.hadoop.mapred.JobConf
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat
import org.apache.spark.HashPartitioner
import org.apache.spark.sql.SparkSession
import org.apache.spark.streaming.dstream.InputDStream
import org.apache.spark.streaming.{Seconds, StreamingContext}
import pers.pudge.spark.practices.officialApi.s.streaming.MyFileStream.MONITOR_DIR
import pers.pudge.spark.practices.utils.FLOG

import scala.collection.mutable.Buffer

class MyFileBasicStream {

  def cxxx(input: InputDStream[(LongWritable, Text)]) = {
    FLOG.log("cxxx")
    //--1.
    //                input.cogroup(new DStream)
    //                input.cogroup(new DStream, numPartitions: Int)
    //        input.cogroup(new DStream, partitioner)

    //--2.
    //reduceByKey 和 groupByKey 都是 combineByKey 的实现
    //        IndexedSeq.newBuilder[Char].

    val createComb = (t: String) => Buffer(t)
    val mergeVal = (c: Buffer[String], t: String) => c += t
    val mergeComb = (c1: Buffer[String], c2: Buffer[String]) => c1 ++= c2

    //若没有这记 map， 下面的 foreachRDD 现在不会报出 LongWritable not serializable 的错误
    //LongWritable 同一个文件内不会重复，即使两行文本相同
    val dsMapped = input.map { case (lw: LongWritable, t: Text) => (lw.get(), t.toString) }

    //partitioner：分区函数,默认为HashPartitioner
    //mapSideCombine：是否需要在Map端进行combine操作，类似于MapReduce中的combine，默认为true
    val ds = dsMapped.combineByKey(createComb, mergeVal, mergeComb, new HashPartitioner(4), true)
    input.count().foreachRDD(rdd => {
      for (long <- rdd.collect()) {
        FLOG.log("一共行数：" + long.toString)
      }
    })

    ds.foreachRDD(rdd => {
      //在这里放一个 StringBuilder 来收集字符串反而不能打印
      for (tp <- rdd) {
        FLOG.log(tp._1 + "  " + tp._2.mkString(","))
      }
    })
  }

  def countxxx(input: InputDStream[(LongWritable, Text)]) = {
    FLOG.log("cxxx")
    //-- 1.计算行数
    //        val ds = input.count()
    //        ds.foreachRDD(rdd => {
    //            FLOG.log("rdd hash:" + rdd.hashCode())
    //            for (long <- rdd.collect()) {
    //                FLOG.log(long.toString)
    //            }
    //        })

    //-- 2. ???
    //        val ds = input.countByValue().map(tp => tp._1._2 -> 1).reduceByKey(_ + _)
    //        ds.foreachRDD(rdd => {
    //            for (tp <- rdd.collect()) {
    //                FLOG.log(tp._1.toString + "," + tp._2.toString)
    //            }
    //        })
    //如果DStream的类型为K，那么返回一个新的DStream，这个新的DStream中的元素类型是(K, Long)，
    //K是原先DStream的值，Long表示这个Key有多少次
    val ds = input.countByValue()
    FLOG.log(ds.toString)
    ds.foreachRDD((rdd, time) => {
      for (tp <- rdd.collect()) {
        val tp1 = tp._1
        val tp2 = tp._2
        FLOG.log(tp1._1.toString + "," + tp1._2.toString + "_" + tp2)
      }
    })
  }


  def sxxx(input: InputDStream[(LongWritable, Text)]) = {
    FLOG.log("sxxx")
    val ds1 = input.map { case (x, y) => (y.toString, 1) }
    val ds2 = ds1.reduceByKey(_ + _)

    //        ds2.saveAsTextFiles("/home/pudgebd/tmp/spark/saveas/sxxx", "")

    ds2.saveAsNewAPIHadoopFiles("hdfs://localhost:9000/user/spark/saveas/sxxx", "",
      classOf[LongWritable], classOf[Text], classOf[TextOutputFormat[Text, IntWritable]], new JobConf())

    //以下报错，上面的 NewAPI 可以
    //ds2.saveAsHadoopFiles(...)
  }

  def rxxx(input: InputDStream[(LongWritable, Text)]) = {
    //对文本文件的每行进行 wordcount
    //x 是 LongWritable, y 是 Text
    val ds1 = input.map { case (x, y) => (y.toString, 1) }
    //-- 1.
    //        val ds2 = ds1.reduceByKey(_ + _)
    //-- 2.
    //        val ds2 = ds1.reduce((t1, t2) => (t1._1 + t2._1, t1._2 + t2._2))
    //-- 3.
    val ds2 = ds1.reduceByKeyAndWindow(_ + _, _ - _, Seconds(3)) //该场景下效率更高

    //-- print
    ds2.foreachRDD((rdd, time) => {
      for (e <- rdd.collect()) {
        FLOG.log(e._1 + "," + e._2 + ", time:" + time)
      }
    })

  }

  //内外联结的区别是内联结将去除所有不符合条件的记录，结果如下：
  //(a, (6, 3))
  //外联结则保留其中部分，外左联结与外右联结的区别在于如果用A左联结B则A中所有记录都会保留在结果中，此时B中只有符合联结条件的记录，结果可能如下：
  //(g, (19, None))
  //(a, (6, Some(3)))
  // 而右联结相反，结果可能如下：
  //(vh, (None, 1))
  //(a, (Some(6), 3))
  //fullOuterJoin 列出全部可能：
  //(a, (None, Some(3)))
  //(u, (Some(5), None))
  def jxxx(sc: StreamingContext, txtInput: InputDStream[(LongWritable, Text)]) = {
    FLOG.log("jxxx")
    val logInput = sc.fileStream[LongWritable, Text, TextInputFormat](
      MONITOR_DIR, myLogFilter(_), true)

    val dsText = txtInput.map { case (x, y) => (y.toString, 1) }.reduceByKey(_ + _)
    val dsLog = logInput.map { case (x, y) => (y.toString, 1) }.reduceByKey(_ + _)
    val retDs = dsText.fullOuterJoin(dsLog)
    retDs.foreachRDD(rdd => {
      for (tp <- rdd) {
        FLOG.log("(" + tp._1 + ", (" + tp._2._1 + ", " + tp._2._2 + "))")
      }
    })
  }

  def myLogFilter(path: Path): Boolean = {
    if (path.toString.endsWith(".log")) {
      true
    } else {
      false
    }
  }

  def uxxx(input: InputDStream[(LongWritable, Text)]) = {
    //input.updateStateByKey() //更新状态，如网页热度，此处场景不合适该方法
    //可参考 http://blog.csdn.net/stark_summer/article/details/47666337
  }

  def dealRDD(spark: SparkSession, input: InputDStream[(LongWritable, Text)]) = {
    import spark.implicits._
    //可行
    spark.createDataset(Seq(1, 2, 3)).show()

    //不行 scala.reflect.internal.Symbols$CyclicReference: illegal cyclic reference involving object InterfaceAudience
    input.foreachRDD(rdd => {
      val ds = spark.createDataset(rdd)
      ds.collect().mkString(",")
    })
  }

  //Path 不能用 String 代替
  //val myPathFilter = new Function[Path, Boolean] {...} 若用此种方式，则会报出 serializable 错误
  def myTextFilter(path: Path): Boolean = {
    //        FLOG.log(s"path:$path")
    //        if (path.toString.endsWith(".txt")) {
    //            true
    //        } else {
    //            false
    //        }
    return true
  }


}
