package pers.pudge.spark.practices.officialApi.g.graphx

import org.apache.spark.SparkContext
import org.apache.spark.graphx._
import org.apache.spark.graphx.lib.{ConnectedComponents, ShortestPaths}
import org.apache.spark.graphx.util.GraphGenerators
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.SparkSession
import pers.pudge.spark.practices.officialApi.g.graphx.Graphx.{joinVertices, outerJoinVertices, pregel}

import scala.collection.mutable.ArrayBuffer

class GraphxBasic extends GraphxHelper {

  //                         点属性tuple     边属性
  def filter(graph: Graph[(String, String), String]) = {
    // Count all users which are postdocs
    graph.vertices.filter { case (id, (name, pos)) => pos == "postdoc" }.count
    // Count all the edges where src > dst
    graph.edges.filter(e => e.srcId > e.dstId).count

    graph.edges.filter { case Edge(src, dst, prop) => src > dst }.count
  }

  def map(graph: Graph[(String, String), String]) = {
//    val newGraph1 = graph.mapVertices[String]((vid, data) => data._2)
//
//    val newGraph2 = graph.mapEdges(edge => {
//      val attr = edge.attr
//      attr -> attr.length
//    })
//
//    val newGraph3 = graph.mapEdges[Int]((pid: PartitionID, it: Iterator[Edge[String]]) => {
//      val ab = new ArrayBuffer[Int]()
//      for (e <- it) {
//        ab += e.attr.length
//      }
//      ab.toIterator
//    })

    //                                EdgeTriplet 就是边属性带上头尾两个点属性
    val newGraph4 = graph.mapTriplets(edgeTriplet => {
//      val multi = edgeTriplet.dstId * edgeTriplet.srcId
//      multi

      //若某个vid不是3，此处报错，otherVertexId、vertexAttr都这样
//      val otherV = edgeTriplet.otherVertexAttr(3L)
//      println(otherV._1 + "_" + otherV._2)
//      otherV._1.length
    })

    println("numEdges:" + newGraph4.numEdges)
  }

  /**
    * 摘自：https://blog.csdn.net/zryowen123/article/details/77386992
    *
    * Connected Components即连通体算法用id标注图中每个连通体，
    * 将连通体中序号最小的顶点的id作为连通体的id。
    * 如果在图G中，任意2个顶点之间都存在路径，那么称G为连通图，否则称该图为非连通图，
    * (https://img-blog.csdn.net/20170818200351914)
    * 则其中的极大连通子图称为连通体，如下图所示，该图中有两个连通体：
    *
    * 此处的 (11L, ("pudgebd", "dotaer")) 不会打印
    * @param graph
    */
  def connectedComponents(graph: Graph[(String, String), String]) = {
    //TODO maxIterations 填小了会不会出问题？
    ConnectedComponents.run(graph)
    val cc = graph.connectedComponents()
    //srcAttr打印出来并不是正确的数据
    cc.triplets.collect().foreach(triplet => {
      println(triplet.srcId + " is the " + triplet.attr + " of " + triplet.dstId)
    })
  }



  def logNormalGraph(sc: SparkContext) = {
    val lng = GraphGenerators.logNormalGraph(sc, numVertices = 100)
    lng.triplets.collect().foreach(triplet => {
      println(triplet.srcAttr + " is the " + triplet.attr + " of " + triplet.dstAttr)
    })
  }


  /**
    * Inner joins this EdgeRDD with another EdgeRDD,
    * assuming both are partitioned using the same PartitionStrategy.
    * You are going to need to create and use a PartitionStrategy
    */
  def mask(sc: SparkContext, graph: Graph[(String, String), String]) = {
//    val userAgeRDD: RDD[(VertexId, Int)] = spark.sparkContext.parallelize(
//      Seq((7L, 31), (1L, 42)))
//
//    val relationships: RDD[Edge[String]] = spark.sparkContext.parallelize(
//      Seq(Edge(7L, 1L, "neighbor")))

    val users2: RDD[(VertexId, (String, String))] = sc.parallelize(
      Seq((5L, ("franklin", "prof")), (2L, ("istoica", "prof"))))
    //    点id    人名        职业

    val relationships2: RDD[Edge[String]] = sc.parallelize(
      Seq(Edge(2L, 5L, "colleague")))

    val otherGraph = Graph(users2, relationships2).partitionBy(PartitionStrategy.CanonicalRandomVertexCut)

    val maskedGraph = graph.partitionBy(PartitionStrategy.CanonicalRandomVertexCut).mask(otherGraph)
    printTriplets(maskedGraph)
  }


  def aggregateMessages(spark: SparkSession) = {
    // Create a graph with "age" as the vertex property.
    // Here we use a random graph for simplicity.
    //              点属性   边属性
    val graph: Graph[Double, Int] =
      GraphGenerators.logNormalGraph(spark.sparkContext, numVertices = 100).mapVertices((id, _) => id.toDouble)

    // Compute the number of older followers and their total age
    val olderFollowers: VertexRDD[(Int, Double)] = graph.aggregateMessages[(Int, Double)](

      //                                    A 一个tuple (graphx.VertexId, VD)
      //                       VD     ED    也就是上面的 VertexRDD[(Int, Double)]
      //triplet: EdgeContext[Double, Int, (Int, Double)]
      triplet => { // sendMsg: Map Function
        if (triplet.srcAttr > triplet.dstAttr) {
          // Send message to destination vertex containing counter and age
          triplet.sendToDst((1, triplet.srcAttr))
        }
      },
      // Add counter and age
      (a, b) => (a._1 + b._1, a._2 + b._2) // mergeMsg: Reduce Function
    )

    // Divide total age by number of older followers to get average age of older followers
    val avgAgeOfOlderFollowers: VertexRDD[Double] =
      olderFollowers.mapValues((id, value) =>
        value match {
          case (count, totalAge) => totalAge / count
        })
    // Display the results
    avgAgeOfOlderFollowers.collect.foreach(println(_))
  }

  /**
    * 不是streaming的checkpoint，慎用
    */
  def checkpoint(graph: Graph[(String, String), String]) = {
    graph.checkpoint()
  }


  /**
    * Edge(3,7,collab)
    * Edge(5,3,advisor)
    * Edge(2,5,colleague)
    * Edge(5,7,pi)
    */
  def edges(graph: Graph[(String, String), String]) = {
    graph.edges.collect().foreach(e => println(e.toString))
  }


  /**
    * merge两点间的多条边为一条, 所以两个点要处于同一个分区内。
    * 必须先 partitionBy
    * CanonicalRandomVertexCut：使所有 srcId < dstId
    */
  def groupEdges(graph: Graph[(String, String), String]) = {
    val grp = graph.partitionBy(PartitionStrategy.RandomVertexCut)
      .groupEdges((e1, e2) => e1 + " and " + e2)
    printTriplets(grp)
  }


  /**
    * graph 追加函数
    */
  def ops(sc: SparkContext, graph: Graph[(String, String), String]) = {
    val ops = graph.ops

//    collectEdges(ops)
//    collectNeighborIds(ops)
//    ops.collectNeighbors() 略
//    convertToCanonicalEdges(ops)
//    degrees(graph)
//    joinVertices(sc, graph)
//    outerJoinVertices(sc, graph)
    pregel(sc, graph)
//    pageRank(sc, ops)
//    triangleCount(sc)

  }


  def shortestPaths(graph: Graph[(String, String), String]) = {
    val landmarks = Seq(2L)
    val spg = ShortestPaths.run(graph, landmarks)
    spg.vertices.collect().foreach(v => println(v))
  }


  /**
    * 假设我想从一些文本文件中构建图形，将图形限制为重要的关系和用户，
    * 在 sub-graph 上运行 page-rank ，然后返回与顶级用户关联的属性。
    * 我可以用 GraphX 在几行内完成所有这些：
    */
  def example(sc: SparkContext) = {
    // Load blog user data and parse into tuples of user id and attribute list
    val users = (sc.textFile("src/main/resources/data/graphx/users.txt")
      .map(line => line.split(",")).map( parts => (parts.head.toLong, parts.tail) ))

    // Parse the edge data which is already in userId -> userId format
    val followerGraph = GraphLoader.edgeListFile(sc, "src/main/resources/data/graphx/followers.txt")

    // Attach the user attributes
    val graph = followerGraph.outerJoinVertices(users) {
      case (uid, deg, Some(attrList)) => attrList
      // Some users may not have attributes so we set them as empty
      case (uid, deg, None) => Array.empty[String]
    }

    // Restrict the graph to users with usernames and names
    val subgraph = graph.subgraph(vpred = (vid, attr) => attr.size == 2)

    // Compute the PageRank
    val pagerankGraph = subgraph.pageRank(0.001)

    // Get the attributes of the top pagerank users
    val userInfoWithPageRank = subgraph.outerJoinVertices(pagerankGraph.vertices) {
      case (uid, attrList, Some(pr)) => (pr, attrList.toList)
      case (uid, attrList, None) => (0.0, attrList.toList)
    }

    println(userInfoWithPageRank.vertices.top(5)(Ordering.by(_._2._1)).mkString("\n"))
  }


}
