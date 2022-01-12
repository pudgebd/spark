package pers.pudge.spark.practices.officialApi.e.es

import org.apache.spark.sql.SparkSession
import pers.pudge.spark.practices.utils.constants.MT
import org.elasticsearch.spark.sql._

object EsSpark {

  val APP_NAME = "EsSpark"

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .master(MT.LOCAL_MASTER)
      .appName(APP_NAME)
      .enableHiveSupport()
      //.config(Key.SPARK_SQL_WAREHOUSE_DIR, MT.HIVE_WARE)
      .getOrCreate()
    import spark.implicits._

    val df = spark.createDataset(Seq("c" -> 3, "d" -> 4, "cde" -> 5)).toDF("name", "id")
    df.createOrReplaceTempView("tmp")

    df.withColumnRenamed("name", "id")
      .withColumnRenamed("id", "id2")
        .show()

//  val cfg = Map("pushdown" -> "true",
//    "es.nodes" -> "10.57.22.173,10.57.22.174,10.57.30.219",
//    "es.port" -> "9200")
//  df.saveToEs(esIndex, cfg)

    spark.stop()
  }


}
