package pers.pudge.spark.practices.utils

import java.util
import java.util.{Date, Properties}

import org.apache.spark.sql.{SaveMode, SparkSession}
import pers.pudge.spark.practices.entities.CqDimMysql
import pers.pudge.spark.practices.utils.constants.MT

import scala.collection.mutable.ArrayBuffer

object BatchInsertMysqlData {

  private val TOTAL_BATCH = 9
  private val BATCH_SIZE = 10000
  private val PARTITION_COUNTS = 9
  private val random = new util.Random

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("BatchInsertMysqlData")
      .master("local[1]")
      .enableHiveSupport()
      .getOrCreate()
    import spark.implicits._

    //        spark.sparkContext.parallelize()
    val ds = spark.createDataset(1 to TOTAL_BATCH).repartition(PARTITION_COUNTS)
    val flatMapped = ds.flatMap(mapIdToIdMs)

    val prop = new Properties()
    prop.put("user", "stream_dev")
    prop.put("password", "stream_dev")
    flatMapped.write.mode(SaveMode.Append).jdbc(
      "jdbc:mysql://192.168.1.59:3306/stream_dev?charset=utf8",
      "cq_dim_mysql_9w",
      prop
    )
    spark.stop()
  }


  def mapIdToIdMs(batchIdx: Int): ArrayBuffer[CqDimMysql] = {
    val idStart = (batchIdx - 1) * BATCH_SIZE + 1
    val idEnd = batchIdx * BATCH_SIZE
    var ab = new ArrayBuffer[CqDimMysql](BATCH_SIZE)

    for (i <- idStart to idEnd) {
      ab += CqDimMysql(i, i.toString, s"name_$i", i + random.nextDouble())
    }
    return ab
  }


}
