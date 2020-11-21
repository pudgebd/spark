package pers.pudge.spark.practices.officialApi.s.streaming

import java.io.EOFException

import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}
import pers.pudge.spark.practices.utils.FLOG

/**
  * Created by pudgebd on 16-11-7.
  */
object MyBinaryRecordsStream {

  val MONITOR_DIR = "hdfs://localhost:9000/user/spark/brs"
  var CHECK_POINT_DIR = "hdfs://localhost:9000/user/spark/ck/mybrs/"

  def main(args: Array[String]) {
    //localhost  192.168.191.2
    CHECK_POINT_DIR = CHECK_POINT_DIR + System.currentTimeMillis()
    val sc = StreamingContext.getOrCreate(CHECK_POINT_DIR, () => getSc())
    sc.start()
    sc.awaitTermination()
  }

  def getSc(): StreamingContext = {
    val conf = new SparkConf().setMaster("local[4]").setAppName("MyBinaryRecordsStream")
    val sc = new StreamingContext(conf, Seconds(2))

    val input = sc.binaryRecordsStream(MONITOR_DIR, 5)

    input.foreachRDD(rdd => {
      try {
        val a = rdd.filter(_.length > 0)
        val b = a.foreach( //文件大小一定要等于 recordLength，否则foreach报 EOFException
          arr => {
            FLOG.log(arr.length.toString)
            try {
            } catch {
              case eof: EOFException => FLOG.log(eof.getMessage)
            }
          }
        )
      } catch {
        case eof: EOFException => FLOG.log(eof.getMessage)
      }
    })

    sc
  }


}
