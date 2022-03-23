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
//    val fileName = "000000_0"
//    val fileName = "part-00000-22fdb8e3-0f9f-4a8d-baf4-ea1af1eeb255.snappy.parquet"
    val fileName = "part-00000-db4de558-ac7e-4f6c-9bcd-5465485f9147.snappy.parquet"
    val path = s"file:///Users/username/Downloads/$fileName"
    val df = spark.read.parquet(path)
    df.show(false)
    println(df.count())

    spark.stop()
  }

}
