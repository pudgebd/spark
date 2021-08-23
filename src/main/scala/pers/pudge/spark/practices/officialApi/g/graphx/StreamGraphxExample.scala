package pers.pudge.spark.practices.officialApi.g.graphx


import org.apache.spark.SparkConf
import org.apache.spark.graphx.{Edge, EdgeDirection, Graph, VertexId}
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.SparkSession
import org.apache.spark.streaming.kafka010.ConsumerStrategies.Subscribe
import org.apache.spark.streaming.kafka010.KafkaUtils
import org.apache.spark.streaming.kafka010.LocationStrategies.PreferConsistent
import org.apache.spark.streaming.{Seconds, StreamingContext}
import pers.pudge.spark.practices.officialApi.g.graphx.Graphx.APP_NAME
import pers.pudge.spark.practices.officialApi.s.streaming.kafka.MyKafkaStreaming.{conf, getKafkaParams}
import pers.pudge.spark.practices.utils.constants.{Key, MT}


object StreamGraphxExample {

  def main(args: Array[String]): Unit = {
    //System.setProperty("hadoop.home.dir", "E:\\software\\hadoop-2.5.2");
    //StreamingExamples.setStreamingLogLevels()
    val brokers = "101.271.251.121:9092"
    val topics = "page_visits"
    if (args.length < 2) {
      System.err.println("Continue")
    }else{
      val Array(brokers, topics) = args
    }

    // Create context with 2 second batch interval
    val sparkConf = new SparkConf().setAppName("DirectKafkaWordCount")
    val ssc = new StreamingContext(sparkConf, Seconds(10))
    //ssc.checkpoint(".")
    val topicsSet = topics.split(",").toSet
    val messages = KafkaUtils.createDirectStream[String, String](
      ssc,
      PreferConsistent,
      Subscribe[String, String](topicsSet, getKafkaParams())
    )
    val lines = messages.map(_.value())
    val words = lines.map(_.split(","))
    val cleanedDStream = words.transform(rdd=>{
      rdd.map(x=>Edge(x(1).toInt,x(2).toInt,1))
    })
    cleanedDStream.print()
    val graphDStream=cleanedDStream.transform(rdd=>
      Graph.fromEdges(rdd,"a").collectNeighborIds(EdgeDirection.Out).map(e=>(e._1,e._2.toSet))
    )
    graphDStream.print()

    ssc.start()
    ssc.awaitTermination()
  }

}
