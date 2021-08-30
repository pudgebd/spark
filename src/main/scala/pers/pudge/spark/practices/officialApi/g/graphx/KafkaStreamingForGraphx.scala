package pers.pudge.spark.practices.officialApi.g.graphx

import org.apache.spark.graphx.{Edge, Graph, PartitionStrategy, VertexId}
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.SparkSession
import org.apache.spark.storage.StorageLevel
import org.apache.spark.streaming.kafka010.ConsumerStrategies.Subscribe
import org.apache.spark.streaming.kafka010.KafkaUtils
import org.apache.spark.streaming.kafka010.LocationStrategies.PreferConsistent
import org.apache.spark.streaming.{Checkpoint, Seconds, StreamingContext}
import pers.pudge.spark.practices.officialApi.g.graphx.Graphx.APP_NAME
import pers.pudge.spark.practices.officialApi.s.streaming.kafka.MyKafkaStreaming.{conf, getKafkaParams}
import pers.pudge.spark.practices.utils.constants.{Key, MT}

object KafkaStreamingForGraphx extends GraphxHelper {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName("KafkaStreamingForGraphx")
      .master(MT.LOCAL_MASTER)
      .getOrCreate()

    val sc = spark.sparkContext

    //模拟读取离线存储的图的 点和边 数据
    val users: RDD[(VertexId, (String, String))] = sc.parallelize(
      Seq((3L, ("rxin", "student")), (7L, ("jgonzal", "postdoc")),
        (5L, ("franklin", "prof")), (2L, ("istoica", "prof")),
        (11L, ("pudgebd", "dotaer"))))
    //   点id    人名        职业

    var relationships: RDD[Edge[String]] = sc.parallelize(
      Seq(Edge(3L, 7L, "collab"), Edge(5L, 3L, "advisor"),
        Edge(2L, 5L, "colleague"), Edge(5L, 7L, "pi")))
    //     srcId, dstId, 边属性

    var relationshipsSwap: RDD[Edge[String]] = null

    val defaultUser = ("Who", "Missing")

    //读取实时边数据，每10秒计算一次
    val streamingContext = new StreamingContext(sc, Seconds(10))
    val topics = Array(Key.MYTOPIC02)
    val input = KafkaUtils.createDirectStream[String, String](
      streamingContext,
      PreferConsistent,
      Subscribe[String, String](topics, getKafkaParams())
    )

    input.foreachRDD(rdd => {
      val incrEdgeRdd = rdd.flatMap(record => {
        val valueStr = record.value()
        val arr = valueStr.split(",")
        val newArr = arr.filter(_.length == 3)
        if (newArr.isEmpty) {
          Seq.empty
        }
        Seq(Edge(arr(0).toLong, arr(1).toLong, arr(2)))
      })

      //合并离线和实时边数据
      relationshipsSwap = relationships.union(incrEdgeRdd).persist(StorageLevel.MEMORY_AND_DISK_SER)
      relationships.unpersist()
      relationships = relationshipsSwap

      //生成新图
      val graph = Graph(users, relationships, defaultUser)

      //打印
      val after = graph.partitionBy(PartitionStrategy.RandomVertexCut)
        .groupEdges((e1, e2) => e1 + " and " + e2)
      printTriplets(after)
    })

    streamingContext.start()
    streamingContext.awaitTermination()
  }

}
