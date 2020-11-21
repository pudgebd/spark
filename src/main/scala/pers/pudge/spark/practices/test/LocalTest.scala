package pers.pudge.spark.practices.test

import java.text.SimpleDateFormat
import java.util
import java.util.{Calendar, Date}

import com.alibaba.fastjson.{JSON, JSONObject}
import org.apache.spark.sql.{SaveMode, SparkSession}
import pers.pudge.spark.practices.officialApi.s.structuredStreaming.KafkaSSSql
import pers.pudge.spark.practices.utils.constants.MT
import org.apache.spark.sql.functions._
import pers.pudge.spark.practices.officialApi.s.structuredStreaming.KafkaSSSql.{HDFS_OUTPUT_PATH, LOCAL_HIVE_TABLE}

object LocalTest {

  val APP_MAIN = "LocalTest"


  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .master(MT.LOCAL_MASTER)
      .appName(APP_MAIN)
      .enableHiveSupport()
      .getOrCreate()
    import spark.implicits._

//    spark.read.parquet(KafkaSSSql.HDFS_OUTPUT_PATH)
//      .createOrReplaceTempView("tmp")
//    val dt = "202003241612"
//    val sql = s"select * from $LOCAL_HIVE_TABLE where dt=$dt order by cast(value as int) asc"
//    val sql = s"select count(1) from $LOCAL_HIVE_TABLE where dt=$dt"
        val sql =
          s"""
             |CREATE TABLE `kafka_to_hive`(`data` string)
             |PARTITIONED BY (`pt` string)
             |stored as orc
             """.stripMargin
    spark.sql(sql)
      .show(100, false)

    //写到hdfs
//    spark.sql("set spark.sql.adaptive.enabled=true")
//    spark.sql(sql).write.mode(SaveMode.Overwrite)
//      .parquet(s"hdfs://localhost:8020/user/pudgebd/output/tmp_$dt")

    //建表
//    val dtCondi = s"dt=$dt"
//    val preDtPath = HDFS_OUTPUT_PATH + "/" + dtCondi
//    spark.read.parquet(preDtPath).coalesce(10)
//      .createOrReplaceTempView("tmp")
//    spark.sql("select *, 202003241612 as dt from tmp")
//        .write.mode(SaveMode.Overwrite).partitionBy("dt").saveAsTable(LOCAL_HIVE_TABLE)
  }

  def main3(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .master(MT.LOCAL_MASTER)
      .appName(APP_MAIN)
      .enableHiveSupport()
      .getOrCreate()
    import spark.implicits._

//      spark.sql(s"select cast(unix_timestamp() as timestamp) as ts").printSchema()
    spark.sql("show tables").show()

    spark.stop()
  }

  def main1(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .master(MT.LOCAL_MASTER)
      .appName(APP_MAIN)
      .enableHiveSupport()
      .getOrCreate()

    val catalog = spark.catalog
    catalog.createTable("tmp", "", new util.HashMap[String, String]())
        .show()

    //        val df = spark.read.parquet("hdfs://localhost:8020/usr/hive/warehouse/t_30w_right")
//    val df = spark.table(T_XW_RIGHT)
//    val counts1 = df.rdd.getNumPartitions
//
//    println("------------- df.rdd.getNumPartitions ----------")
//    println(counts1)
//    println("-------------------------------------")
//
//    val counts2 = df.mapPartitions(row => Seq(1).toIterator)
//    println("------------- df.rdd.getNumPartitions ----------")
//    println(counts2.count())
//    println("-------------------------------------")
//
//    val rdd1 = spark.sparkContext.parallelize(Seq("asd", "sd", "f"))
//    val rdd2 = rdd1.map(str => str -> str.length)

    spark.stop
  }

}
