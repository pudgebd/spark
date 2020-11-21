package pers.pudge.spark.practices.oldSparkExamples.others.official

import org.apache.spark.sql.SparkSession

import scala.collection.mutable
import scala.util.Random

/**
  * Transitive closure on a graph.
  */
object SparkTC {
  val numEdges = 200
  val numVertices = 100
  val rand = new Random(42)

  def main(args: Array[String]) {
    val spark = SparkSession
      .builder
      .appName("SparkTC")
      .getOrCreate()
    val slices = if (args.length > 0) args(0).toInt else 2
    var tc = spark.sparkContext.parallelize(generateGraph, slices).cache()

    // Linear transitive closure: each round grows paths by one edge,
    // by joining the graph's edges with the already-discovered paths.
    // e.g. joinVertices the path (y, z) from the TC with the edge (x, y) from
    // the graph to obtain the path (x, z).

    // Because joinVertices() joins on keys, the edges are stored in reversed order.
    val edges = tc.map(x => (x._2, x._1))

    // This joinVertices is iterated until a fixed point is reached.
    var oldCount = 0L
    var nextCount = tc.count()
    do {
      oldCount = nextCount
      // Perform the joinVertices, obtaining an RDD of (y, (z, x)) pairs,
      // then project the result to obtain the new (x, z) paths.
      tc = tc.union(tc.join(edges).map(x => (x._2._2, x._2._1))).distinct().cache()
      nextCount = tc.count()
    } while (nextCount != oldCount)

    println("TC has " + tc.count() + " edges.")
    spark.stop()
  }

  def generateGraph: Seq[(Int, Int)] = {
    val edges: mutable.Set[(Int, Int)] = mutable.Set.empty
    while (edges.size < numEdges) {
      val from = rand.nextInt(numVertices)
      val to = rand.nextInt(numVertices)
      if (from != to) edges += ((from, to))
    }
    edges.toSeq
  }
}