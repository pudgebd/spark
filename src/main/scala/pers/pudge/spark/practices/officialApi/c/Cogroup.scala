package pers.pudge.spark.practices.officialApi.c

import org.apache.spark.sql.SparkSession

/**
  * Created by pudgebd on 17-4-7.
  */
object Cogroup {


  def main(args: Array[String]): Unit = {
    val sparkSession = SparkSession.builder().appName("Cogroup")
      .master("local[4]").getOrCreate()

    val maps1 = Seq(1 -> "a", 2 -> "b", 3 -> "c")
    val maps2 = Seq(4 -> "d", 5 -> "e", 6 -> "f")

    val rdd1 = sparkSession.sparkContext.parallelize(maps1)
    val rdd2 = sparkSession.sparkContext.parallelize(maps2)

    val rdd3 = rdd1.cogroup(rdd2)
    rdd3.collect().foreach(tp => {
      println(tp._1 + "__" + tp._2._1.mkString(",") + "__" + tp._2._2.mkString(","))
    })
  }


}
