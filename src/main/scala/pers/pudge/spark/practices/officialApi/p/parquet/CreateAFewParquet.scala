package pers.pudge.spark.practices.officialApi.p.parquet

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import pers.pudge.spark.practices.entities.PreAnalyDataVo
import pers.pudge.spark.practices.utils.constants.MT

import scala.collection.mutable.ListBuffer

object CreateAFewParquet {

  val APP_NAME = "CreateAFewParquet"

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
      .setMaster(MT.LOCAL_MASTER)
      .setAppName(APP_NAME)
    val spark = SparkSession.builder().config(conf).getOrCreate()
    import spark.implicits._

    val lb = new ListBuffer[PreAnalyDataVo]()
    for (num <- 1 to 2000) {
      lb += PreAnalyDataVo(num, num.toDouble)
    }

    spark.createDataset(lb).coalesce(20).write
      .parquet("hdfs://localhost:8020/usr/pudgebd/avro/result/counts/parquet_" + System.currentTimeMillis())

    spark.stop()
  }


}
