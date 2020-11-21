package pers.pudge.spark.practices.officialApi.s.streaming

import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}

import scala.collection.mutable.Queue

/**
  * Created by pudgebd on 16-11-9.
  */
object MyQueueStream {

  var CHECK_POINT_DIR = "hdfs://localhost:9000/user/spark/ck/myqs/"

  def main(args: Array[String]) {
    //localhost  192.168.191.2
    CHECK_POINT_DIR = CHECK_POINT_DIR + System.currentTimeMillis()
    val sc = StreamingContext.getOrCreate(CHECK_POINT_DIR, () => getSc())
    sc.start()
    sc.awaitTermination()
  }


  def getSc(): StreamingContext = {
    //local[2]  spark://pudgebd-e445:7077  spark://pudgebd-pc:7077
    val conf = new SparkConf().setMaster("local[4]").setAppName("MyQueueStream")
    val sc = new StreamingContext(conf, Seconds(1))

    val rdd = sc.sparkContext.makeRDD(Seq(1, 2, 3))
    val queue = Queue(rdd)
    val input = sc.queueStream(queue) //基于RDD队列的流数据, 方法与 fileStream 等重复

    sc
  }


}
