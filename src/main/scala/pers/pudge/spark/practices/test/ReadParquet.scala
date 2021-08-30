package pers.pudge.spark.practices.test

import java.sql.Timestamp

import org.apache.spark.sql.SparkSession
import pers.pudge.spark.practices.test.LocalTest.APP_MAIN
import pers.pudge.spark.practices.utils.constants.MT

object ReadParquet {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .master(MT.LOCAL_MASTER)
      .appName(APP_MAIN)
      .getOrCreate()
    import spark.implicits._

//    val path = "/Users/pudgebd/tmp/part-594402d2-9363-4bc6-af5e-26d5933c8913-0-6-15-58"
//    val path = "/Users/pudgebd/tmp/part-594402d2-9363-4bc6-af5e-26d5933c8913-2-8-16-00"
    val path = "/Users/pudgebd/tmp/part-21fa7dbf-6633-4e00-b6eb-89382114cb46-1-8-17-49"
    spark.read.parquet(path)
      .select("ts").map(row => new Timestamp(row.getLong(0)))
      .show(100, false)
  }

}
