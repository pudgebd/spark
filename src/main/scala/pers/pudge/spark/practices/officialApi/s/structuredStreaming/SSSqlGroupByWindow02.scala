package pers.pudge.spark.practices.officialApi.s.structuredStreaming

import java.io.FileInputStream
import java.sql.Timestamp
import java.util.{Date, Properties}

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.streaming.Trigger
import pers.pudge.spark.practices.utils.constants.{Key, MT}

object SSSqlGroupByWindow02 {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder
      .appName("SSSqlGroupByWindow02")
      .master(MT.LOCAL_MASTER)
      .config("spark.sql.shuffle.partitions", 1)
      .getOrCreate()
    import spark.implicits._

    spark.createDataset(Seq(
      SqlWinPo(1, new Timestamp(System.currentTimeMillis())),
      SqlWinPo(2,  new Timestamp(System.currentTimeMillis()))
    )).createOrReplaceTempView("tb")

    var sql = "select" +
      "  count(1) as count," +
      "  sum(total) as sum," +
      "  round(avg(total), 2) as avg " +
      "from tb" +
      "  group by window(time, '1 day', '1 day', '16 hours')"
    spark.sql(sql).show()
  }

}
