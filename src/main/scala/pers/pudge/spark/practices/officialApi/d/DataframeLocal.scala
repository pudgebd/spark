package pers.pudge.spark.practices.officialApi.d

import java.sql.Timestamp

import org.apache.spark.sql.SparkSession
import pers.pudge.spark.practices.officialApi.d.dataSetOrFrame.APP_NAME
import pers.pudge.spark.practices.officialApi.s.structuredStreaming.SqlWinPo
import pers.pudge.spark.practices.utils.constants.MT
import org.apache.spark.sql.functions._

object DataframeLocal {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .master(MT.LOCAL_MASTER)
      .appName(APP_NAME)
      .enableHiveSupport()
      //.config(Key.SPARK_SQL_WAREHOUSE_DIR, MT.HIVE_WARE)
      .getOrCreate()
    import spark.implicits._

    val df = spark.createDataset(Seq(
      SqlWinPo(1, new Timestamp(System.currentTimeMillis())),
      SqlWinPo(2, new Timestamp(System.currentTimeMillis()))
    )).toDF()

//    df.groupBy(window())
  }

}
