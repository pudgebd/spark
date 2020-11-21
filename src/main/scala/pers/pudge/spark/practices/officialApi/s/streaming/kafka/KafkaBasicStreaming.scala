package pers.pudge.spark.practices.officialApi.s.streaming.kafka

import java.text.SimpleDateFormat
import java.util
import java.util.Date
import java.util.concurrent.{Executors, ScheduledExecutorService, TimeUnit}

import org.apache.kafka.clients.consumer.ConsumerRecord
import org.apache.kafka.common.TopicPartition
import org.apache.kafka.common.serialization.StringDeserializer
import org.apache.spark.SparkContext
import org.apache.spark.sql.{Row, SaveMode, SparkSession}
import org.apache.spark.sql.types.{DataTypes, StructField, StructType}
import org.apache.spark.streaming.{Seconds, StreamingContext}
import org.apache.spark.streaming.dstream.{DStream, InputDStream}
import org.apache.spark.streaming.kafka010.ConsumerStrategies.Subscribe
import org.apache.spark.streaming.kafka010.LocationStrategies.PreferConsistent
import org.apache.spark.streaming.kafka010.{CanCommitOffsets, HasOffsetRanges, KafkaUtils, OffsetRange}
import pers.pudge.spark.practices.utils.FLOG
import pers.pudge.spark.practices.utils.constants.{Key, LocalKafkaCnts}

/**
  **/
class KafkaBasicStreaming extends KafkaStreamingHelper with Serializable {

  def getKafkaParams(): Map[String, Object] = {
    //metadata.broker.list 或 bootstrap.servers 表示 Kafka broker(s), 多个用,隔开
    val kafkaParams = Map[String, Object](
      Key.BOOTSTRAP_SERVERS -> LocalKafkaCnts.BOOTSTRAP_SERVERS,
      Key.KEY_DESERIALIZER -> classOf[StringDeserializer],
      Key.VALUE_DESERIALIZER -> classOf[StringDeserializer],
      Key.GROUP_ID -> LocalKafkaCnts.GROUP_ID_0, //可修改
      Key.AUTO_OFFSET_RESET -> Key.LATEST,
      Key.ENABLE_AUTO_COMMIT -> (false: java.lang.Boolean)
    )
    return kafkaParams
  }


  /**
    * input.window(Seconds(6)) 之后不能 foreachRDD 里提交offset
    */
  def createDirectStream(sc: StreamingContext, kafkaParams: Map[String, Object]) = {
    val topics = Array(Key.MYTOPIC02)
    val input = KafkaUtils.createDirectStream[String, String](
      sc,
      PreferConsistent,
      Subscribe[String, String](topics, kafkaParams)
    )
//    saveOrcToHiveError(input, sc)
    //wordCountsForInputDS(input)
  }


  def wordCountsForInputDS(input: InputDStream[ConsumerRecord[String, String]]): Unit = {
    val ds = input.map(record => (record.key, record.value)).map(tp => tp._2 -> 1).reduceByKey(_ + _)
    //        val ds2 = input.map(cr => cr.key() -> 1).reduceByKey(_ + _)
    ds.foreachRDD(rdd => for (tp <- rdd) FLOG.log("(" + tp._1 + ", " + tp._2 + ")"))
    //        input.foreachRDD(rdd => {
    //            for (cr <- rdd) {
    //                FLOG.log("("+cr.key()+", "+cr.value()+")")
    //            }
    //        })
  }

  def createOffsetRDD(sparkContext: SparkContext, kafkaParams: Map[String, Object]) = {
    val tp = new TopicPartition(Key.MYTOPIC02 + 2, 0) //partition 从 0 开始

    val input = KafkaUtils.createRDD[String, String](
      sparkContext,
      getJUtilMap(kafkaParams),
      Array(OffsetRange.create(tp, 1, 4)), //获取的数据不包括 untilOffset
      PreferConsistent
    )
    input.foreach(record => {
      //key 为null
      FLOG.log("(key:" + record.key() + ", val:" + record.value() + ")")
      FLOG.log(record.toString)
    })
  }

  def getJUtilMap(kafkaParams: Map[String, Object]): util.HashMap[String, Object] = {
    val jutilMap = new util.HashMap[String, Object]()
    for (tp <- kafkaParams) {
      jutilMap.put(tp._1, tp._2)
    }
    return jutilMap
  }

  def wordCountsForInputDS(ds: DStream[(String, String)]): Unit = {
    //        val ds2 = ds.map(tp => tp._2 -> 1).reduceByKey(_ + _)
    ds.foreachRDD(rdd => for (tp <- rdd) FLOG.log("(" + tp._1 + ", " + tp._2 + ")"))
  }


}
