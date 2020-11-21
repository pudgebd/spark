package pers.pudge.spark.practices.officialApi.p.parquet

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import pers.pudge.spark.practices.utils.constants.MT

object ReadParquet {

  val APP_NAME = "ReadParquet"

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
      .setMaster(MT.LOCAL_MASTER)
      .setAppName(APP_NAME)
    val spark = SparkSession.builder().config(conf).getOrCreate()

    //val path = "hdfs://localhost:8020/usr/pudgebd/avro/result/counts/parquet_1527049231493"
    val path = "file:///Users/pudgebd/part-00002-66e623c0-100c-4ba1-8cb2-19661de2f96e-c000.snappy.parquet"
    val df = spark.read.parquet(path)
    df.show(false)
    println(df.count())

    spark.stop()
  }

}
