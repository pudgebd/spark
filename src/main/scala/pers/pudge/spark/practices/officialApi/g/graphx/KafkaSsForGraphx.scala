package pers.pudge.spark.practices.officialApi.g.graphx

import java.util.concurrent.TimeUnit

import org.apache.spark.graphx.{Edge, Graph, PartitionStrategy}
import org.apache.spark.sql.streaming.{OutputMode, Trigger}
import org.apache.spark.sql.{Dataset, SparkSession}
import org.apache.spark.storage.StorageLevel
import pers.pudge.spark.practices.utils.constants.{Key, LocalKafkaCnts, MT}

object KafkaSsForGraphx extends GraphxHelper {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName("KafkaSsForGraphx")
      .master(MT.LOCAL_MASTER)
      .getOrCreate()
    import spark.implicits._

    //模拟读取离线存储的图的 点和边 数据
    val users = spark.createDataset(Seq((3L, ("rxin", "student")), (7L, ("jgonzal", "postdoc")),
      (5L, ("franklin", "prof")), (2L, ("istoica", "prof")),
      (11L, ("pudgebd", "dotaer"))))
    //   点id    人名        职业

    var relationships = spark.createDataset(
      Seq(Edge(3L, 7L, "collab"), Edge(5L, 3L, "advisor"),
        Edge(2L, 5L, "colleague"), Edge(5L, 7L, "pi")))
    //     srcId, dstId, 边属性

    var relationshipsSwap: Dataset[Edge[String]] = null

    val defaultUser = ("Who", "Missing")

    //读取实时边数据，每10秒计算一次
    val ssDf = spark
      .readStream
      .format(Key.KAFKA)
      .option(Key.KAFKA_BOOTSTRAP_SERVERS, LocalKafkaCnts.BOOTSTRAP_SERVERS)
      .option(Key.SUBSCRIBE, Key.MYTOPIC02)
      .load()

    val ssDf2 = ssDf.selectExpr("CAST(value AS STRING) as value")
      .flatMap(row => {
        val valueStr = row.getString(0)
        val arr = valueStr.split(",")
        val newArr = arr.filter(_.length == 3)
        if (newArr.isEmpty) {
          Seq.empty
        }
        Seq(Edge(arr(0).toLong, arr(1).toLong, arr(2)))
      })

    val query = ssDf2.writeStream
      .outputMode(OutputMode.Append())
      .trigger(Trigger.ProcessingTime(10, TimeUnit.SECONDS)) //多久触发一次
      .foreachBatch((ds, _) => {

      //合并离线和实时边数据
      relationshipsSwap = relationships.union(ds).persist(StorageLevel.MEMORY_AND_DISK_SER)
      relationships.unpersist()
      relationships = relationshipsSwap

      //生成新图
      val graph = Graph(users.rdd, relationships.rdd, defaultUser)

      //打印
      val after = graph.partitionBy(PartitionStrategy.RandomVertexCut)
        .groupEdges((e1, e2) => e1 + " and " + e2)
      triplets(after)
      graph.unpersist()
    })
    .start()

    query.awaitTermination()
  }

}
