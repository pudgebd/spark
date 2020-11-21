package pers.pudge.spark.practices.officialApi.s.streaming

import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}
import pers.pudge.spark.practices.sparkStream.CustomReceiver

/**
  * Created by pudgebd on 16-11-23.
  */
object MyReceiverStream {

  var CHECK_POINT_DIR = "hdfs://localhost:9000/user/spark/ck/myrs/"

  def main(args: Array[String]) {
    //localhost  192.168.191.2
    CHECK_POINT_DIR = CHECK_POINT_DIR + System.currentTimeMillis()
    val sc = StreamingContext.getOrCreate(CHECK_POINT_DIR, () => getSc())
    sc.start()
    sc.awaitTermination()
  }

  def getSc(): StreamingContext = {
    //local[2]  spark://pudgebd-e445:7077  spark://pudgebd-pc:7077
    val conf = new SparkConf().setMaster("local[4]").setAppName("MyReceiverStream")
    val sc = new StreamingContext(conf, Seconds(3))

    val input = sc.receiverStream(new CustomReceiver("localhost", 9999))

    sc
  }

}
