package pers.pudge.spark.practices.officialApi.g.graphx

import org.apache.log4j.{Level, Logger}
import org.apache.spark.SparkContext
import org.apache.spark.graphx.util.GraphGenerators
import org.apache.spark.graphx.{Edge, Graph, GraphLoader, VertexId}
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.SparkSession
import pers.pudge.spark.practices.utils.constants.MT

object Graphx extends GraphxBasic {

  val APP_NAME = "Graphx"

  Logger.getLogger("org.apache.spark").setLevel(Level.WARN)
  Logger.getLogger("org.eclipse.jetty.server").setLevel(Level.OFF)


  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder().appName(APP_NAME)
      .master(MT.LOCAL_MASTER)
      .getOrCreate()

    val sc = spark.sparkContext
    val users: RDD[(VertexId, (String, String))] = sc.parallelize(
      Seq((3L, ("rxin", "student")), (7L, ("jgonzal", "postdoc")),
        (5L, ("franklin", "prof")), (2L, ("istoica", "prof")),
        (11L, ("pudgebd", "dotaer"))))
    //   点id    人名        职业

    val relationships: RDD[Edge[String]] = sc.parallelize(
      Seq(Edge(3L, 7L, "collab"), Edge(5L, 3L, "advisor"),
        Edge(2L, 5L, "colleague"), Edge(5L, 7L, "pi")))
    //     srcId, dstId, 边属性

    val defaultUser = ("Who", "Missing")

    // Build the initial Graph
    val graph = Graph(users, relationships, defaultUser)

//    aggregateMessages(spark)
//    checkpoint(graph)
//    connectedComponents(graph)
//    edges(graph)
//    filter(graph)
//    groupEdges(graph)
//    logNormalGraph(sc)
//    map(graph)
//    mask(sc, graph)
    ops(sc, graph)
//    printTriplets(graph)
//    printTriplets(graph.subgraph(et => true, (vid, vp) => true))

//    example(sc)

    //下面两个不好用，所有点边属性都为1
//    GraphLoader.edgeListFile
    //Graph.fromEdges/fromEdgeTuples

    spark.stop()
  }

}
