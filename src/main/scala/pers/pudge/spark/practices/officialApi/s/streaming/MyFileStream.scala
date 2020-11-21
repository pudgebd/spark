package pers.pudge.spark.practices.officialApi.s.streaming

import org.apache.hadoop.io.{LongWritable, Text}
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat
import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}
import pers.pudge.spark.practices.officialApi.s.streaming.basic.MyFileBasicStream

/**
  * Created by pudgebd on 16-11-8.
  */
object MyFileStream extends MyFileBasicStream {

  //无法监控子目录
  val MONITOR_DIR = "hdfs://svdsj03-01:8020/user/spark/fs"
  var CHECK_POINT_DIR = "hdfs://svdsj03-01:8020/user/spark/checkpoint/myfs/"

  def main(args: Array[String]) {
    //localhost  192.168.191.2
    CHECK_POINT_DIR = CHECK_POINT_DIR + System.currentTimeMillis()
    val sc = StreamingContext.getOrCreate(CHECK_POINT_DIR, () => getSc())
    sc.start()
    sc.awaitTermination()
  }


  def getSc(): StreamingContext = {
    //local[4]  spark://pudgebd-e445:7077  spark://pudgebd-pc:7077
    val conf = new SparkConf().setMaster("local[4]").setAppName("MyFileStream")
    val sc = new StreamingContext(conf, Seconds(3))
    sc.checkpoint(CHECK_POINT_DIR)

    //当 newFilesOnly 为false时，即使 -put -f 一个老文件，应用不会重新读一遍文件
    val input = sc.fileStream[LongWritable, Text, TextInputFormat](
      MONITOR_DIR, myTextFilter(_), true)

//    input.win
//    cxxx(input)
    //        countxxx(input)
    //        sxxx(input)
            rxxx(input)
    //        jxxx(sc, input)
    //        uxxx(input)

    //        val spark = SparkSession.builder().getOrCreate() //可以获得
    //        dealRDD(spark, input) //Spark Streaming 内部 RDD 没有直接使用 spark sql 的接口

    //        input.updateStateByKey()
    sc
  }


}
