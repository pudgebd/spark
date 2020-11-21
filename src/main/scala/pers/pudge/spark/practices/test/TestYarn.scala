package pers.pudge.spark.practices.test

import org.apache.spark.sql.SparkSession
import pers.pudge.spark.practices.utils.constants.{Key, MT}

object TestYarn {

  val APP_NAME = "ShowHiveTable"

  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder()
      .appName(APP_NAME)
      .enableHiveSupport()
      .getOrCreate()
    import spark.implicits._

    spark.catalog.listTables().show(false)
//    println(spark.createDataset(Seq(1, 2, 3, 4)).collect().mkString(","))

    spark.stop()
  }

}
