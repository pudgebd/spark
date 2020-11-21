package pers.pudge.spark.practices.officialApi.s.streaming

import org.apache.spark.SparkConf
import org.apache.spark.streaming.dstream.ReceiverInputDStream
import org.apache.spark.streaming.{Seconds, StreamingContext}
import pers.pudge.spark.practices.utils.FLOG


object MySocketTextStream {


  var CHECK_POINT_DIR = "hdfs://localhost:9000/user/spark/ck/mysts/"

  def main(args: Array[String]) {
    //localhost  192.168.191.2
    CHECK_POINT_DIR = CHECK_POINT_DIR + System.currentTimeMillis()
    val sc = StreamingContext.getOrCreate(CHECK_POINT_DIR, () => getSc())
    sc.start()
    sc.awaitTermination()
  }

  def getSc(): StreamingContext = {
    //local[2]  spark://pudgebd-e445:7077  spark://pudgebd-pc:7077
    val conf = new SparkConf().setMaster("local[4]").setAppName("MySocketTextStream")
    val sc = new StreamingContext(conf, Seconds(1))

    val input = sc.socketTextStream("localhost", 9999)

    //        cxxx(input)
    //        rxxx(input)
    //        txxx(input)
    //        wxxx(input)

    sc
  }

  def txxx(input: ReceiverInputDStream[String]) = {
    //        input.transform()// 和 .transformWith() 改变 rdd 里的数据
  }

  def wxxx(input: ReceiverInputDStream[String]) = {
    //        input.window() //按window获取 DStream
  }

  def rxxx(input: ReceiverInputDStream[String]) = {
    input.reduce((a, b) => a + b).foreachRDD(rdd => rdd.collect().foreach(FLOG.log(_))) // reduce 每个 Duration 里的数据
    //input.reduceByWindow((a, b) => a + b, new Duration(2000L), new Duration(2000L)).foreachRDD(rdd => rdd.collect().foreach(log(_)))
  }

  def cxxx(input: ReceiverInputDStream[String]) = {
    val ds = input.countByValue() //结果同 reduceByKey
    input.countByValue().foreachRDD(rdd => {
      rdd.collect().foreach(FLOG.log(_))
    })
    //input.countByValueAndWindow()// countByValue() 增加window操作
    //input.countByWindow()//计算每个 window 里有几个元素
    //-------------------------------------------------------------------------
    //        val time = new Time(System.currentTimeMillis() - 3000)
    //        val opt = input.compute(time)
    //        if (opt != None) {
    //            log(opt.get.collect().toString)
    //        }

  }


}
