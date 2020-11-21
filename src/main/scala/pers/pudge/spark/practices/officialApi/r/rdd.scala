package pers.pudge.spark.practices.officialApi.r

import org.apache.spark.{SparkConf, SparkContext}
import pers.pudge.spark.practices.utils.FLOG

import scala.collection.mutable

/**
  * Created by pudgebd on 16-11-15.
  */
object rdd {



  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
    conf.setMaster("local").setAppName("rdd")
    val sc = SparkContext.getOrCreate(conf)

//    val rdd = sc.parallelize(Seq(("a", 1), ("a", 2), ("a", 8), ("b", 5), ("c", 7)))
//    cxxx(sc)
//    partition(sc)
    rxxx(sc)
  }

  def cxxx(sc: SparkContext) = {
    val rdd1 = sc.parallelize(1 to 10, 4)
//    rdd1.coalesce()
    //    rdd1.repartition()
    //        val rdd2 = rdd1.
    //        rdd2.group
    //        rdd2.comb
  }

  def partition(sc: SparkContext) = {
    val rdd = sc.textFile("/Users/pudgebd/Documents/xxx/latest_dim/dim_hotel_01221100.txt")
//    val rdd2 = rdd.mapPartitions(it => Seq(it.size).toIterator)
//    val count = rdd2.count()
//    println(s"count: $count ------------------" + rdd.getNumPartitions)
  }

  def rxxx(sc: SparkContext) = {
    val rdd = sc.parallelize(1 to 30, 4) //若改为 1，则输出有序
    val rdd2 = rdd.mapPartitions(mapParFunc)
    //mapPartitions还有些变种，比如mapPartitionsWithContext，它能把处理过程中的一些状态信息传递给用户指定的输入函数。
    // 还有mapPartitionsWithIndex，它能把分区的index传递给用户指定的输入函数。

    val tp2RDD = rdd2.map(str => (str.length, str))
    val keyRDD = rdd2.keyBy(_.length)
//    for (r <- rdd2) {
//      FLOG.log(r)
//    }
  }

  def mapParFunc(origin: Iterator[Int]): Iterator[String] = {
    val list = mutable.MutableList.empty[String]

    for (i <- origin) {
      list += (i + 1).toString
    }
    list.toIterator
  }

}
