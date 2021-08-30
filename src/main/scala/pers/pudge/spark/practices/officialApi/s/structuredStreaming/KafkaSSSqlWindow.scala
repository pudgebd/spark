package pers.pudge.spark.practices.officialApi.s.structuredStreaming

import java.sql.Timestamp
import java.text.SimpleDateFormat
import java.util.concurrent.{Executors, TimeUnit}
import java.util.{Calendar, Date}

import org.apache.spark.sql.catalyst.encoders.RowEncoder
import org.apache.spark.sql.{Row, SparkSession, functions}
import org.apache.spark.sql.streaming.{OutputMode, Trigger}
import pers.pudge.spark.practices.utils.constants.{Key, LocalKafkaCnts, MT}
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types.{DataTypes, StructField, StructType}

/**
  * 调试结束可以使用，本地跑存在延迟，是否因为需要处理时间？
  *
  * CDH 环境下 kafka 版本出问题，standalone 可以
  * spark-submit 必须加上下面的参数
  * --packages org.apache.spark:spark-sql-kafka-0-10_2.11:2.2.0
  */
object KafkaSSSqlWindow {

  val pool = Executors.newSingleThreadScheduledExecutor()

  var CHECK_POINT_DIR = "hdfs://localhost:8020/user/pudgebd/checkpoint/structuredStreaming/kafkaSSSqlWindow_" + System.currentTimeMillis()
  val HDFS_OUTPUT_PATH = "hdfs://localhost:8020/user/pudgebd/output/kafkaSSSqlWindow"
  ///Users/pudgebd/tmp/kafkaSSSql
  val LOCAL_HIVE_TABLE = "local_hive_table"

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("kafkaSSSqlWindow")
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
      .option("failOnDataLoss", "false")
      .load()

    val schema = new StructType(Array(
      new StructField("key", DataTypes.StringType),
      new StructField("value", DataTypes.StringType),
      new StructField("num", DataTypes.IntegerType),
      new StructField("ts", DataTypes.TimestampType),
      new StructField("dt", DataTypes.StringType)
    ))

    val sdf = new SimpleDateFormat("yyyyMMddHHmm")
    val bro = spark.sparkContext.broadcast(sdf)
    val df2 = df.selectExpr("CAST(key AS STRING) as key", "CAST(value AS STRING) as value")
      .map(row => {
        try {
          val sdf = bro.value
          val secondTs = row.getString(1)
          Row.fromSeq(Seq(row.getString(0), secondTs, 1,
            new Timestamp(System.currentTimeMillis()), sdf.format(new Date())))
        } catch {
          case e: Exception => {
            Row.fromSeq(Seq(row.getString(0), 0, 1,
              new Timestamp(System.currentTimeMillis()), sdf.format(new Date())))
          }
        }
      })(RowEncoder.apply(schema))
    //column's expression must only refer to attributes supplied by this Dataset.
    //      .withColumn("ts", col("cast(unix_timestamp() as timestamp)"))

    val query = df2
      .withWatermark("ts", "1 seconds")
      .groupBy(
        window($"ts", "10 seconds")
      )
//      .agg(Map(
//        "num" -> "count",
//        "dt" -> "count"
//      ))
      .agg(
        functions.count("num").as("num_count"),
        functions.approx_count_distinct("dt").as("dt_count_dis")
      )
      .writeStream
      .outputMode(OutputMode.Append())
//
//      .format("parquet")
//      .option("path", HDFS_OUTPUT_PATH)
//      .partitionBy("dt")

      .format(Key.CONSOLE)
      .option("truncate", "false")

      .option(Key.CHECKPOINT_LOCATION, CHECK_POINT_DIR)
      .start()

    query.awaitTermination()

  }


}
