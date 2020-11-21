package pers.pudge.spark.practices.officialApi.t.transformation

import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.SparkSession

/**
  * Created by pudgebd on 16-9-26.
  */
object valueTrans {


  def map(sc: SparkContext): Unit = {
    val a = sc.parallelize(List("dog", "salmon", "salmon", "rat", "elephant"))
    val b = a.map(_.length)
    val c = a.zip(b)
    println(c.collect().mkString(","))
    println()
  }

  def flatMap(sc: SparkContext): Unit = {
    val a = sc.parallelize(1 to 3)
    val c = a.flatMap(1 to _)
    println(c.collect().mkString(","))
    println()
  }

  def mapPartiions(sc: SparkContext): Unit = {
    val x = sc.parallelize(1 to 10, 3)
    x.flatMap(List.fill(scala.util.Random.nextInt(10))(_)).collect.foreach(println)
  }

  def glom(sc: SparkContext): Unit = {
    //形成一个Array数组
    val a = sc.parallelize(1 to 100)
    val b = a.glom
    println(b.collect.foreach(println))
  }

  def union(sc: SparkContext): Unit = {
    val a = sc.parallelize(1 to 3, 3)
    val b = sc.parallelize(5 to 7, 2)
    println((a ++ b).distinct().collect.
      sortWith((a, b) => a < b).mkString(","))
    println()
  }

  def cartesian(sc: SparkContext): Unit = {
    //笛卡尔操作
    val x = sc.parallelize(List(1, 2, 3, 4, 5))
    val y = sc.parallelize(List(6, 7, 8, 9, 10))
    println(x.cartesian(y).collect.sortWith(
      (a, b) => a._1 < b._1
    ).mkString(","))
    println()
  }

  def groupBy(sc: SparkContext): Unit = {
    val x = sc.parallelize(1 to 9)
    val z = x.groupBy(v => if (v % 2 == 0) "even" else "odd")
    println(z.collect().mkString(","))
    println()
  }

  def filter(sc: SparkContext): Unit = {
    val a = sc.parallelize(1 to 10, 3)
    val b = a.filter(_ % 2 == 0)
    b.collect
  }

  def distinct(sc: SparkContext): Unit = {
    val c = sc.parallelize(List("Gnu", "Cat", "Rat", "Dog", "Gnu", "Rat"), 2)
    c.distinct.collect
  }

  def subtract(sc: SparkContext): Unit = {
    val a = sc.parallelize(1 to 10)
    val b = sc.parallelize(1 to 4)
    println(a.subtract(b).collect().mkString(","))

    println()
  }

  def sample(sc: SparkContext): Unit = {
    val a = sc.parallelize(1 to 10000)
    val b = a.sample(false, 0.1, 0)
    printColl(b)
  }

  def printColl[T](rdd: RDD[T]): Unit = {
    println(rdd.collect().mkString(","))
    println()
  }

  def cacheAndPersist(sc: SparkContext): Unit = {
    val c = sc.parallelize(List("Gnu", "Cat", "Rat", "Dog", "Gnu", "Rat"))
    println(c.getStorageLevel)
    println(c.cache)
    println()
  }

  //    (1) aggregate在combine上的操作，复杂度为O(n). treeAggregate的时间复杂度为O(lg n)。n为分区数。
  //    (2) aggregate把数据全部拿到driver端，存在内存溢出的风险。treeAggregate则不会，它在 excutor 里进行了 aggregate。
  //    (3) Don't trigger TreeAggregation when it doesn't save wall-clock time
  //    系统时间(wall clock time, elapsed time). 是指一段程序从运行到终止，系统时钟走过的时间
  def treeAgg(sc: SparkContext) = {
    val c = sc.parallelize(1 to 10000)
    val np = c.getNumPartitions
    val res = c.treeAggregate(0)(_ + _, _ + _)
    println(res) //50005000
    println()
  }

  def main(args: Array[String]) {
    val ss = SparkSession.builder().appName("valueTransa").master("local[4]").getOrCreate()
    val sc = ss.sparkContext

    //        map(sc)
    //        flatMap(sc)
    //                mapPartiions(sc)
    //                glom(sc)
    //                union(sc)
    //        cartesian(sc)
    //                groupBy(sc)
    //        filter(sc)
    //        distinct(sc)
    //        subtract(sc)
    //        sample(sc)
    //        cacheAndPersist(sc)
    //        treeAgg(sc)
  }

}
