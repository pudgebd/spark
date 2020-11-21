package pers.pudge.spark.practices.officialApi.s.streaming

import java.io.InputStream

import org.apache.commons.io.IOUtils
import org.apache.spark.SparkConf
import org.apache.spark.storage.StorageLevel
import org.apache.spark.streaming.{Seconds, StreamingContext}

/**
  * Created by pudgebd on 16-11-23.
  */
object MySocketStream {


  var CHECK_POINT_DIR = "hdfs://localhost:9000/user/spark/ck/myss/"

  def main(args: Array[String]) {
    //localhost  192.168.191.2
    CHECK_POINT_DIR = CHECK_POINT_DIR + System.currentTimeMillis()
    val sc = StreamingContext.getOrCreate(CHECK_POINT_DIR, () => getSc())
    sc.start()
    sc.awaitTermination()
  }

  def getSc(): StreamingContext = {
    //local[2]  spark://pudgebd-e445:7077  spark://pudgebd-pc:7077
    val conf = new SparkConf().setMaster("local[4]").setAppName("MySocketStream")
    val sc = new StreamingContext(conf, Seconds(1))

    //        val input = sc.rawSocketStream("localhost", 9999) //数据作为序列后的块被接收， 然后。。。，这是效率最高的接收数据方式
    val converter = (input: InputStream) => IOUtils.toByteArray(input).toIterator
    val input = sc.socketStream("localhost", 9999, converter, StorageLevel.MEMORY_AND_DISK_SER_2)

    sc
  }


}
