package pers.pudge.spark.practices.officialApi.t.transformation

import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.SparkSession

/**
  * Created by pudgebd on 16-9-29.
  */
object ActionsTrans {


  def foreach(sc: SparkContext): Unit = {
    val c = sc.parallelize(List("cat", "dog", "tiger", "lion", "gnu", "crocodile", "ant", "whale", "dolphin", "spider"), 3)
    c.foreach(x => println(x + "s are yummy"))
  }


  def saveAsTextFile(sc: SparkContext): Unit = {
    val a = sc.parallelize(1 to 10000, 3)
    a.saveAsTextFile("mydata_a")
  }

  def saveAsObjectFile(sc: SparkContext): Unit = {
    val x = sc.parallelize(1 to 100, 3)
    x.saveAsObjectFile("objFile")
    val y = sc.objectFile[Int]("objFile")

    myPrint(y)
  }

  def myPrint[T](any: Any): Unit = {
    if (any.isInstanceOf[RDD[T]]) {
      println(any.asInstanceOf[RDD[T]].collect().mkString(","))
    } else {
      println(any.toString)
    }
    println()
  }

  def collectAsMap(sc: SparkContext): Unit = {
    val a = sc.parallelize(List(1, 2, 1, 3), 1)
    val b = a.zip(a)
    b.collectAsMap
  }

  def reduceByKeyLocally(sc: SparkContext): Unit = {
    val a = sc.parallelize(List("dog", "cat", "owl", "gnu", "ant"), 2)
    val b = a.map(x => (x.length, x))
    myPrint(b.reduceByKey(_ + _))
  }

  def lookup(sc: SparkContext): Unit = {
    val a = sc.parallelize(List("dog", "tiger", "lion", "cat", "panther", "eagle"), 2)
    val b = a.map(x => (x.length, x))
    myPrint(b.lookup(5).mkString(","))
  }

  def count(sc: SparkContext): Unit = {
    val c = sc.parallelize(List("Gnu", "Cat", "Rat", "Dog"), 2)
    c.count
  }

  def top(sc: SparkContext): Unit = {
    val c = sc.parallelize(Array(6, 9, 4, 7, 5, 8), 2)
    c.top(2)
  }

  def reduce(sc: SparkContext): Unit = {
    val a = sc.parallelize(1 to 100, 3)
    a.reduce(_ + _)
  }

  def fold(sc: SparkContext): Unit = {
    val a = sc.parallelize(List(1, 2, 3), 2)
    myPrint(a.fold(0)(_ + _)) //zeroValue (e.g. Nil for list concatenation or 0 for summation)
  }

  def aggregate(sc: SparkContext): Unit = {
    val z = sc.parallelize(List(1, 2, 3, 4, 5, 6), 2)

    // lets first print out the contents of the RDD with partition labels
    def myfunc(index: Int, iter: Iterator[(Int)]): Iterator[String] = {
      iter.toList.map(x => "[partID:" + index + ", val: " + x + "]").iterator
    }

    myPrint(z.partitions.length)
    myPrint(z.mapPartitionsWithIndex(myfunc))
    myPrint(z.aggregate(0)(math.max(_, _), _ + _))
  }

  def main(args: Array[String]) {
    val ss = SparkSession.builder().appName("keyValTrans").master("local[4]").getOrCreate()
    val sc = ss.sparkContext

    //        foreach(sc)
    //        saveAsTextFile(sc)
    //        saveAsObjectFile(sc)
    //        collectAsMap(sc)
    //        reduceByKeyLocally(sc)
    //        lookup(sc)
    //        count(sc)
    //        top(sc)
    //        reduce(sc)
    //        fold(sc)
    //        aggregate(sc)
    zipPatition(sc)

  }

  def zipPatition(sc: SparkContext): Unit = {
    val a = sc.parallelize(List(1, 2, 3))
    val b = sc.parallelize(List(4, 5, 6))

    def myFunc[T, B, V](itT: Iterator[T], itB: Iterator[B]): Iterator[V] = {
      //            itT.

      null
    }
    //        a.zipPartitions(b, false)
  }
}
