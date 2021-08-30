package pers.pudge.spark.practices.officialApi.s.structuredStreaming

import java.sql.Timestamp
import java.text.SimpleDateFormat
import java.util.{Calendar, Date}
import java.util.concurrent.{ExecutorService, Executors, TimeUnit}

import org.apache.spark.sql.{SaveMode, SparkSession}
import org.apache.spark.sql.streaming.{OutputMode, Trigger}
import pers.pudge.spark.practices.utils.constants.{Key, LocalKafkaCnts, MT}
import org.apache.spark.sql.functions._

/**
  * CDH 环境下 kafka 版本出问题，standalone 可以
  * spark-submit 必须加上下面的参数
  * --packages org.apache.spark:spark-sql-kafka-0-10_2.11:2.2.0
  */
object KafkaSSSql {

  val pool = Executors.newSingleThreadScheduledExecutor()

  var CHECK_POINT_DIR = "hdfs://localhost:8020/user/pudgebd/checkpoint/structuredStreaming/kafkaSSSql/"
  val HDFS_OUTPUT_PATH = "hdfs://localhost:8020/user/pudgebd/output/kafkaSSSql"
  ///Users/pudgebd/tmp/kafkaSSSql
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
    val bro = spark.sparkContext.broadcast(sdf)
    val df2 = df.selectExpr("CAST(key AS STRING) as key", "CAST(value AS STRING) as value")
      .map(row => {
        val sdf = bro.value
        val secondTs = row.getString(1)
        (row.getString(0), secondTs, 1,
          new Timestamp(secondTs.toLong * 1000), sdf.format(new Date()))
      })
      .toDF("key", "value", "num", "ts", "dt")
    //column's expression must only refer to attributes supplied by this Dataset.
    //      .withColumn("ts", col("cast(unix_timestamp() as timestamp)"))

    val query = df2
      .writeStream
      .outputMode(OutputMode.Append())

      .format("parquet")
      .option("path", HDFS_OUTPUT_PATH)
//      .partitionBy("dt")

//      .format(Key.CONSOLE)
//      .option("truncate", "false")

      .option(Key.CHECKPOINT_LOCATION, CHECK_POINT_DIR)
      .trigger(Trigger.ProcessingTime(60, TimeUnit.SECONDS)) //多久触发一次，会改变的window计算频率，详见官网
      .start()

    query.awaitTermination()
  }


}
