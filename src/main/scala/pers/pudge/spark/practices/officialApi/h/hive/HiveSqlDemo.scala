package pers.pudge.spark.practices.officialApi.h.hive

import org.apache.spark.sql.SparkSession
import pers.pudge.spark.practices.utils.constants.{Key, MT}

object HiveSqlDemo {

  val APP_NAME = "HiveSqlDemo2"

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName(APP_NAME)
      .master(MT.LOCAL_MASTER)
      .config(Key.SPARK_SQL_WAREHOUSE_DIR, MT.HIVE_WARE)
      .enableHiveSupport()
      .getOrCreate()

    val df = spark.sql("select count(*) from jmbi_trade_company")
    df.collect().foreach(row => {
      println(row.get(0))
    })
    println(s"------------------------- df: $df")
    spark.stop()
  }

}
