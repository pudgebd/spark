package pers.pudge.spark.practices.officialApi.g.graphx

import org.apache.spark.SparkContext
import org.apache.spark.graphx._
import org.apache.spark.graphx.util.GraphGenerators
import org.apache.spark.rdd.RDD

class GraphxHelper {


  /**
    * 打印谁是谁的什么（一个完整关系）
    */
  def printTriplets(graph: Graph[(String, String), String]) = {
    //           EdgeTriplet 就是边属性带上头尾两个点属性
    val tls: RDD[EdgeTriplet[(String, String), String]] = graph.triplets

    tls.collect().foreach(triplet => {
      println(triplet.srcAttr._1 + " is the " + triplet.attr + " of " + triplet.dstAttr._1)
    })

    println("-------------------------------------------------------")
  }


  def collectEdges(ops: GraphOps[(String, String), String]) = {
    val edgesRdd = ops.collectEdges(EdgeDirection.Either) // in out
    edgesRdd.collect().foreach(tp => {
      val vid = tp._1
      val arr = tp._2

      println(
        s"""
           |vid: $vid,
           |arr: ${arr.mkString(",")}
         """.stripMargin
      )
    })
  }


  def collectNeighborIds(ops: GraphOps[(String, String), String]) = {
    val vidRdd = ops.collectNeighborIds(EdgeDirection.Either)
    vidRdd.collect().foreach(tp => {
      val vid = tp._1
      val arr = tp._2

      println(
        s"""
           |vid: $vid,
           |arr: ${arr.mkString(",")}
         """.stripMargin
      ) //邻居ids包含重复vid
    })
  }


  /**
    * 强制 srcId < dstId
    * 然后合并相同的 srcId -> dstId，边属性合并可自定义
    */
  def convertToCanonicalEdges(ops: GraphOps[(String, String), String]) = {
    val newGraph = ops.convertToCanonicalEdges((ed1, ed2) => ed1 + " and " + ed2)
    printTriplets(newGraph)
  }


  /**
    * 返回的是 (id, 多少个度)
    */
  def degrees(graph: Graph[(String, String), String]) = {
    graph.inDegrees.collect().foreach(e => println(e.toString))
    graph.outDegrees.collect().foreach(e => println(e.toString))
  }

  val toJoinVertexSeq = Seq((3L, 30), (7L, 70), (5L, 50), (2L, 20), (1L, 110))

  /**
    * 源码内，joinVertices使用的是下面的 outerJoinVertices
    * 可以理解为，在改变vertex属性时，这个是 inner join，左边的点join不上右边的点时，左点属性不变
    */
  def joinVertices(sc: SparkContext, graph: Graph[(String, String), String]) = {
    val userAgeRDD: RDD[(VertexId, Int)] = sc.parallelize(toJoinVertexSeq)

    val newGraph = graph.joinVertices(userAgeRDD)((vid, vp1, vp2) => (vp1._1 + "_" + vp2, vp1._2))
    printTriplets(newGraph)
  }


  //摘自上下两个方法文档
  //This function is used to update the vertices with new values based on external data.
  // For example we could add the out degree to each vertex record

  /**
    * 可以理解为，在改变vertex属性时，这个是 left outer join，左边的点join不上右边的点时，左点属性改变时使用一个默认值
    */
  def outerJoinVertices(sc: SparkContext, graph: Graph[(String, String), String]) = {
    //FLOG.info(graph.outDegrees.count().toString) == 3

    val userAgeRDD: RDD[(VertexId, Int)] = sc.parallelize(toJoinVertexSeq)

    val newGraph =
      graph.outerJoinVertices[Int, (String, String)](userAgeRDD)(
        (vid, vp1, optVp2) => {
          (vp1._1 + "_" + optVp2.getOrElse(0), vp1._2)
        }
      )
    printTriplets(newGraph)
  }


  /**
    * 计算最短路径
    */
  def pregel(sc: SparkContext, graph: Graph[(String, String), String]) = {
    // Initialize the graph such that all vertices except the root (vid 7) have distance infinity.
    val graph2 = graph.mapVertices((vid, tp2) => {
      if (vid == 7) {
        (tp2._1, 0)
      } else {
        (tp2._1, Int.MaxValue)
      }
    })

    val pregelGraph = graph2.pregel(Int.MaxValue, 5) (
      (vid, vAtrr, msg) => {
        val vname = vAtrr._1
        val vdist = vAtrr._2
        vname -> math.min(vdist, msg)
      },

      //pregel算法类似于一个循环，在这个循环中，必须有打破循环一直执行的变量的改变，
      // 这个变量的改变就是sendMsg中发送到某个顶点的信息。该方法应该只在适当的条件下对邻居节点产生影响。
      // 而不应该一直变动。否则这个图是不会消停的。
      edgeTriplet => {
        val srcVid = edgeTriplet.srcId
        val srcDist = edgeTriplet.srcAttr._2
        val dstVid = edgeTriplet.dstId
        val dstDist = edgeTriplet.dstAttr._2
        if (srcDist < dstDist) {
          Iterator((dstVid, srcDist + 1))

        } else if (dstDist < srcDist) {
          Iterator(srcVid -> (dstDist + 1))

        } else {
          Iterator.empty
        }
      },

      //要注意区别mergeMsg和vprog的区别。mergeMsg仅仅是针对顶点收到的信息进行处理，
      // 而vprog是对收到的信息与顶点原有属性进行计算。
      // 他们常常很像是原因是顶点的原有属性跟收到的信息的数据类型是一样的。
      // 但要明白他们的作用的区别。
      (a, b) => {
        math.min(a, b)
      }
    )

    pregelGraph.triplets.collect().foreach(println(_))
    println()
  }


  /**
    * PageRank是Google专有的算法，用于衡量特定网页相对于搜索引擎索引中的其他网页而言的重要程度。
    * 一个页面的“得票数”由所有链向它的页面的重要性来决定，到一个页面的超链接相当于对该页投一票。
    * 一个页面的PageRank是由所有链向它的页面（“链入页面”）的重要性经过递归算法得到的。
    * 一个有较多链入的页面会有较高的得分，相反如果一个页面没有任何链入页面，那么它没有得分。
    *
    * 第一种：（静态）在调用时提供一个参数number，用于指定迭代次数，即无论结果如何，
    *   该算法在迭代number次后停止计算，返回图结果。
    * 第二种：（动态）在调用时提供一个参数tol，用于指定前后两次迭代的结果差值应小于tol，
    *   以达到最终收敛的效果时才停止计算，返回图结果。
    *
    * ---------------------
    * 原文：https://blog.csdn.net/lsshlsw/article/details/41176093
    */
  def pageRank(sc: SparkContext, ops: GraphOps[(String, String), String]) = {
    // Load the edges as a graph
    val graph = GraphLoader.edgeListFile(sc, "src/main/resources/data/graphx/followers.txt")
    // Run PageRank
    //参数值越小得到的结果越有说服力。
    val ranks = graph.pageRank(0.0001).vertices
    // Join the ranks with the usernames
    val users = sc.textFile("src/main/resources/data/graphx/users.txt").map { line =>
      val fields = line.split(",")
      (fields(0).toLong, fields(1))
    }
    val ranksByUsername = users.join(ranks).map {
      case (id, (username, rank)) => (username, rank)
    }
    // Print the result
    println(ranksByUsername.collect().mkString("\n"))
  }


  /**
    * 必须是三个点互连，具体方向不影响。
    */
  def triangleCount(sc: SparkContext) = {
    // Load the edges in canonical order and partition the graph for triangle count
    val graph = GraphLoader.edgeListFile(sc, "src/main/resources/data/graphx/followers.txt", true)
      .partitionBy(PartitionStrategy.RandomVertexCut)
    // Find the triangle count for each vertex
    val triCounts = graph.triangleCount().vertices
    // Join the triangle counts with the usernames
    val users = sc.textFile("src/main/resources/data/graphx/users.txt").map { line =>
      val fields = line.split(",")
      (fields(0).toLong, fields(1))
    }
    val triCountByUsername = users.join(triCounts).map { case (id, (username, tc)) =>
      (id, tc)
    }
    // Print the result
    println(triCountByUsername.collect().mkString("\n"))
  }


}
