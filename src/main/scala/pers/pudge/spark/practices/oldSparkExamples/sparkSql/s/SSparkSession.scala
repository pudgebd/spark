package pers.pudge.spark.practices.sparkSql.s

import org.apache.spark.sql.SparkSession


object SSparkSession extends SsBasic {

  def main(args: Array[String]): Unit = {
    //        json()
  }


  def json(): Unit = {
    val ss = SparkSession.builder().appName("Spark SQL Example")
      .config("spark.some.config.option", "some-value").getOrCreate()

    val df = ss.read.json("src/main/resources/json/mc.json")

    collect(df)
  }

}
