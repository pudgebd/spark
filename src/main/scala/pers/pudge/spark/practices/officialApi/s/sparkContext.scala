package pers.pudge.spark.practices.officialApi.s

import org.apache.spark.sql.SparkSession

/**
  * Created by pudgebd on 16-9-26.
  */
object sparkContext {


  def main(args: Array[String]) {
    val ss = SparkSession.builder().appName("sparkContext")
      .master("local[4]").getOrCreate()
    val sc = ss.sparkContext

    print()
  }


}
