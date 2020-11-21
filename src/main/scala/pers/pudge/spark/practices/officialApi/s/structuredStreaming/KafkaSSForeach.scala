package pers.pudge.spark.practices.officialApi.s.structuredStreaming

import java.sql.Timestamp
import java.text.SimpleDateFormat
import java.util.Date
import java.util.concurrent.{Executors, TimeUnit}

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.streaming.{OutputMode, Trigger}
import pers.pudge.spark.practices.utils.constants.{Key, LocalKafkaCnts, MT}


object KafkaSSForeach {

  val pool = Executors.newSingleThreadScheduledExecutor()

  var CHECK_POINT_DIR = "hdfs://localhost:8020/user/pudgebd/checkpoint/structuredStreaming/kafkaSSSql/"
  val HDFS_OUTPUT_PATH = "hdfs://localhost:8020/user/pudgebd/output/kafkaSSSql"
  ///Users/chenqian/tmp/kafkaSSSql
  val LOCAL_HIVE_TABLE = "local_hive_table"

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("KafkaSSSql")
      .master(MT.LOCAL_MASTER)
      .enableHiveSupport()
      .getOrCreate()
    import spark.implicits._
//    CHECK_POINT_DIR = CHECK_POINT_DIR + System.currentTimeMillis()

    val df = spark
      .readStream
      .format(Key.KAFKA)
      .option(Key.KAFKA_BOOTSTRAP_SERVERS, LocalKafkaCnts.BOOTSTRAP_SERVERS)
      .option(Key.SUBSCRIBE, Key.MYTOPIC02)
      .load()

    val sdf = new SimpleDateFormat("yyyyMMddHHmm")
    val df2 = df.selectExpr("CAST(value AS STRING) as value")

    val query = df2
      .writeStream
      .outputMode(OutputMode.Append())

//      .format("parquet")
//      .option("path", HDFS_OUTPUT_PATH)
//      .partitionBy("dt")

      .format(Key.CONSOLE)
      .option("truncate", "false")

      .option(Key.CHECKPOINT_LOCATION, CHECK_POINT_DIR)
      .trigger(Trigger.ProcessingTime(5, TimeUnit.SECONDS)) //多久触发一次，会改变的window计算频率，详见官网
      .start()

    query.awaitTermination()
  }


}
