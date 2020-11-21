package pers.pudge.spark.practices.officialApi.s.streaming.kafka

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.streaming._

//import kafka.message.MessageAndMetadata

/**
  * Created by pudgebd on 16-11-23.
  */
object MyKafkaStreaming extends KafkaBasicStreaming {

//  var CHECK_POINT_DIR = "hdfs://svdsj03-01:8020/user/spark/ck/kafkaTest/"

  //Streaming
  def main(args: Array[String]) {
    //localhost  192.168.191.2
//    CHECK_POINT_DIR = CHECK_POINT_DIR + System.currentTimeMillis()
    val sc = StreamingContext.getActiveOrCreate(getSc)
    sc.start()
    sc.awaitTermination()
  }

  def getSc(): StreamingContext = {
    val sc = new StreamingContext(conf, Seconds(3))

    createDirectStream(sc, getKafkaParams())
    sc
  }

  //just get RDD
  def main2(args: Array[String]): Unit = {
    val spark = SparkSession.builder().config(conf).getOrCreate()
    createOffsetRDD(spark.sparkContext, getKafkaParams())
  }


  //-------------------------------------------------------------------------------------------
  //--------------------------------   以下老版本 0.8.2.1    -------------------------------
  //-------------------------------------------------------------------------------------------

  //最新版本kafka没有 createStream
  def createStream(sc: StreamingContext) = {
    val zkQuorum = "localhost:2181"
    val groupId = "0" //一个字符串用来指示一组consumer所在的组，多个group实现广播
    val topics = Map("mytopick" -> 3)

    //返回 ReceiverInputDStream extends InputDStream[T]
    //val input = KafkaUtils.createStream(sc, zkQuorum, groupId, topics)
    //input 里的 (String, String) 前一个 str 为什么是 null？
    //wordCountsForInputDS(input)
  }

  //    def createDirectStreamWithOffset(sc: StreamingContext) = {
  //        //metadata.broker.list 或 bootstrap.servers 表示 Kafka broker(s), 多个用,隔开
  //        val kafkaParams: Map[String, String] = Map("metadata.broker.list" -> "localhost:9092")
  //        val topics = Set("mytopick")
  //
  //        val input = KafkaUtils.createDirectStream[String, String, StringDecoder,
  //                StringDecoder](sc, kafkaParams, topics)
  //
  //        //// Hold a reference to the current offset ranges, so it can be used downstream
  //        var offsetRanges = Array[OffsetRange]()
  //
  //        input.transform { rdd =>
  //            offsetRanges = rdd.asInstanceOf[HasOffsetRanges].offsetRanges
  //            rdd
  //        }.foreachRDD { rdd =>
  //            for (or <- offsetRanges) {
  //                FLOG.log(s"topic:${or.topic}, partition:${or.partition}" +
  //                        s", fromOffset:${or.fromOffset}, untilOffset:${or.untilOffset}")
  //            }
  //        }
  //        //下面的 foreachRDD 无法填充 offsetRanges
  ////        //input.foreachRDD(rdd => {
  ////            //val curRanges = rdd.asInstanceOf[HasOffsetRanges].offsetRanges
  ////            //offsetRanges ++= curRanges
  ////        //})
  ////        //wordCountsForInputDS(input)
  //    }


  ////http://blog.selfup.cn/1665.html
  ////这个方法可以在启动的时候可以设置offset，但参数设置起来复杂很多，
  //// 首先是fromOffsets: Map[TopicAndPartition, Long]的设置，参考下方代码。
  //    def setOffset(): Unit = {
  //        val topic2Partitions = ZkUtils.getPartitionsForTopics(zkClient, Config.kafkaConfig.topic)
  //        var fromOffsets: Map[TopicAndPartition, Long] = Map()
  //
  //        topic2Partitions.foreach(topic2Partitions => {
  //            val topic:String = topic2Partitions._1
  //            val partitions:Seq[Int] = topic2Partitions._2
  //            val topicDirs = new ZKGroupTopicDirs(Config.kafkaConfig.kafkaGroupId, topic)
  //
  //            partitions.foreach(partition => {
  //                val zkPath = s"${topicDirs.consumerOffsetDir}/$partition"
  //                ZkUtils.makeSurePersistentPathExists(zkClient, zkPath)
  //                val untilOffset = zkClient.readData[String](zkPath)
  //
  //                val tp = TopicAndPartition(topic, partition)
  //                val offset = try {
  //                    if (untilOffset == null || untilOffset.trim == "")
  //                        getMaxOffset(tp)
  //                    else
  //                        untilOffset.toLong
  //                } catch {
  //                    case e: Exception => getMaxOffset(tp)
  //                }
  //                fromOffsets += (tp -> offset)
  //                logger.info(s"Offset init: set offset of $topic/$partition as $offset")
  //
  //            })
  //        })
  //    }

  ////其中getMaxOffset方法是用来获取最大的offset。当第一次启动spark任务或者zookeeper上的数据被删除或设置出错时，
  //// 将选取最大的offset开始消费。代码如下：
  //    private def getMaxOffset(tp:TopicAndPartition):Long = {
  //        val request = OffsetRequest(immutable.Map(tp -> PartitionOffsetRequestInfo(OffsetRequest.LatestTime, 1)))
  //
  //        ZkUtils.getLeaderForPartition(zkClient, tp.topic, tp.partition) match {
  //            case Some(brokerId) => {
  //                ZkUtils.readDataMaybeNull(zkClient, ZkUtils.BrokerIdsPath + "/" + brokerId)._1 match {
  //                    case Some(brokerInfoString) => {
  //                        Json.parseFull(brokerInfoString) match {
  //                            case Some(m) =>
  //                                val brokerInfo = m.asInstanceOf[Map[String, Any]]
  //                                val host = brokerInfo.get("host").get.asInstanceOf[String]
  //                                val port = brokerInfo.get("port").get.asInstanceOf[Int]
  //                                new SimpleConsumer(host, port, 10000, 100000, "getMaxOffset")
  //                                        .getOffsetsBefore(request)
  //                                        .partitionErrorAndOffsets(tp)
  //                                        .offsets
  //                                        .head
  //                            case None =>
  //                                throw new BrokerNotAvailableException("Broker id %d does not exist".format(brokerId))
  //                        }
  //                    }
  //                    case None =>
  //                        throw new BrokerNotAvailableException("Broker id %d does not exist".format(brokerId))
  //                }
  //            }
  //            case None =>
  //                throw new Exception("No broker for partition %s - %s".format(tp.topic, tp.partition))
  //        }
  //    }

  ////然后是参数messageHandler的设置，为了后续处理中能获取到topic，这里形成(topic, message)的tuple：
  //    var offsetRanges = Array[OffsetRange]()
  //    messages.transform { rdd =>
  //        offsetRanges = rdd.asInstanceOf[HasOffsetRanges].offsetRanges
  //        rdd
  //    }.foreachRDD(rdd => {
  //        rdd.foreachPartition(HBasePuter.batchSave)
  //        offsetRanges.foreach(o => {
  //            val topicDirs = new ZKGroupTopicDirs(Config.kafkaConfig.kafkaGroupId, o.topic)
  //            val zkPath = s"${topicDirs.consumerOffsetDir}/${o.partition}"
  //            ZkUtils.updatePersistentPath(zkClient, zkPath, o.untilOffset.toString)
  //            logger.info(s"Offset update: set offset of ${o.topic}/${o.partition} as ${o.untilOffset.toString}")
  //        })
  //    })

  //最后附上batchSave的示例：
  //    def batchSave(iter:Iterator[(String,String)]):Unit = {
  //        iter.foreach(item => {
  //            val topic = item._1
  //            val message = item._2
  //        })
  //    }

}
