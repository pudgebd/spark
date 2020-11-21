package pers.pudge.spark.practices.officialApi.t.transformation

import org.apache.spark.rdd.RDD
import org.apache.spark.sql.SparkSession
import org.apache.spark.{HashPartitioner, SparkConf, SparkContext}

/**
  * Created by pudgebd on 16-9-29.
  */
object keyValTrans {


  def mapValues(sc: SparkContext): Unit = {
    val a = sc.parallelize(List("dog", "tiger", "lion", "cat", "panther", "eagle"))
    val b = a.map(x => (x.length, x))
    printColl(b.mapValues("x" + _ + "x"))
  }

  def combineByKey(sc: SparkContext): Unit = {
    val a = sc.parallelize(List("dog", "cat", "gnu", "salmon", "rabbit", "turkey", "wolf", "bear", "bee"))
    val b = sc.parallelize(List(1, 1, 2, 2, 2, 1, 2, 2, 2))
    val c = b.zip(a)
    printColl(c)

    val d = c.combineByKey(List(_), (x: List[String], y: String) => y :: x, (x: List[String], y: List[String]) => x ::: y)
    printColl(d)
  }

  def reduceByKey(sc: SparkContext): Unit = {
    val a = sc.parallelize(List("dog", "cat", "owl", "gnu", "ant"))
    val b = a.map(x => (x.length, x))
    val c = b.reduceByKey(_ + _)
    //        b.groupByKey(1)
    printColl(c)
  }

  def printColl[T](rdd: RDD[T]): Unit = {
    println(rdd.collect().mkString(","))
    println()
  }

  def partitionBy(sc: SparkContext): Unit = {
    val a = sc.parallelize(List("dog", "tiger", "lion", "cat", "panther", "eagle"))
    //        a.par
  }

  def cogroup(sc: SparkContext): Unit = {
    val a1 = sc.parallelize(List(1, 2, 1, 3))
    val a2 = sc.parallelize(List(0, 4, 1, 3))

    val b = a1.map((_, "b"))
    val c = a2.map((_, "c"))
    printColl(b.cogroup(c))
  }

  def join(sc: SparkContext): Unit = {
    val a = sc.parallelize(List("dog", "salmon", "salmon", "rat", "elephant"), 3)
    val b = a.keyBy(_.length)
    val c = sc.parallelize(List("dog", "cat", "gnu", "salmon", "rabbit", "turkey", "wolf", "bear", "bee"), 3)
    val d = c.keyBy(_.length)

    printColl(b.join(d))
  }

  def leftOutJoin(sc: SparkContext): Unit = {
    val a = sc.parallelize(List("dog", "salmon", "salmon", "rat", "elephant"), 3)
    val b = a.keyBy(_.length)
    val c = sc.parallelize(List("dog", "cat", "gnu", "salmon", "rabbit", "turkey", "wolf", "bear", "bee"), 3)
    val d = c.keyBy(_.length)
    printColl(b.leftOuterJoin(d))
  }

  def rightOutJoin(sc: SparkContext): Unit = {
    val a = sc.parallelize(List("dog", "salmon", "salmon", "rat", "elephant"), 3)
    val b = a.keyBy(_.length)
    val c = sc.parallelize(List("dog", "cat", "gnu", "salmon", "rabbit", "turkey", "wolf", "bear", "bee"), 3)
    val d = c.keyBy(_.length)
    printColl(b.rightOuterJoin(d))
  }

  def aggregateByKey(sc: SparkContext): Unit = {
    val rdd1 = sc.parallelize(Seq("dog", "cat", "gnu", "salmon", "rabbit", "turkey", "wolf", "bear", "bee"))
    val rdd2 = rdd1.map(str => str -> str.length)
    val set = Set(-1)
    val rdd3 = rdd2.aggregateByKey(set)((set, ani) => {
      set + ani
    }, (set1, set2) => set1 ++ set2)
//    		rdd2.aggregate()
    //		rdd2.treeAggregate()
    val as = rdd3.collect()
    println()
  }

  def main(args: Array[String]) {
    val conf = new SparkConf()
    val ss = SparkSession.builder().appName("keyValTrans").master("local[4]").getOrCreate()
    val sc = ss.sparkContext

    repartitionAndSortWithinPartitions(sc)
    //		aggregateByKey(sc)
    //        mapValues(sc)
    //        combineByKey(sc)
    //        reduceByKey(sc)
    //        partitionBy(sc)
    //		cogroup(sc)
    //        joinVertices(sc)
    //        leftOutJoin(sc)
    //        rightOutJoin(sc)

  }

  def repartitionAndSortWithinPartitions(sc: SparkContext): Unit = {
    val rdd1 = sc.parallelize(Seq("dog", "cat", "gnu", "salmon", "rabbit", "turkey", "wolf", "bear", "bee"))
    val rdd2 = rdd1.map(str => str -> str.length)
    val asd = sc.defaultMinPartitions
    val fsd = sc.defaultParallelism

    val rdd2NumParti = rdd2.partitioner.get.numPartitions
    val rdd3 = rdd2.repartitionAndSortWithinPartitions(new HashPartitioner(rdd2NumParti / 2))
    val rdd3NumParti = rdd3.partitioner.get.numPartitions
    println()
  }

}
