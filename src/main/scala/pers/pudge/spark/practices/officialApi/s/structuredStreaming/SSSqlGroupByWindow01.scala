package pers.pudge.spark.practices.officialApi.s.structuredStreaming

import java.io.FileInputStream
import java.util.Properties

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.streaming.Trigger
import pers.pudge.spark.practices.utils.constants.{Key, MT}

object SSSqlGroupByWindow01 {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder
      .appName("SSSqlGroupByWindow01")
      .master(MT.LOCAL_MASTER)
      .config("spark.sql.shuffle.partitions", 1)
      .getOrCreate()
    spark.sparkContext.setLogLevel("WARN")

    val properties = new Properties()
    properties.load(new FileInputStream("conf/parser.properties"))

    val timeSelectExpr = "cast(concat(current_date(), time) as timestamp) as time"
    spark.readStream
      .format("kafka")
      .option("kafka.bootstrap.servers", properties.getProperty("bootstrap.servers"))
      .option("subscribe", properties.getProperty("topic"))
      .option("failOnDataLoss", false)
      .load()
      .selectExpr("cast(value as string) as value")
      .filter("instr(value, '[query end]') != 0")
      .selectExpr("substring(value, 17, 9) as time", "from_json(substring(value, 49), 'registered int,total int') as v")
      .selectExpr(timeSelectExpr, "v['registered'] as registered", "v['total'] as total")
      .createOrReplaceTempView("tb")

    var sql = "select" +
      "  count(1) as count," +
      "  sum(total) as sum," +
      "  round(avg(total), 2) as avg " +
      "from tb" +
      "  group by window(time, '1 day', '1 day', '16 hours')"
    spark.sql(sql)
      .writeStream
      .outputMode("update")
      .option("checkpointLocation", "/Users/pudgebd/tmp/streaming/mobius_log_monitor")
      .option("baseUrl", "http://localhost:5000/data")
      .format(Key.CONSOLE)
      .trigger(Trigger.ProcessingTime("1 seconds"))
      .queryName("mobius monitor by day")
      .start()

//    sql = "select" +
//      "  window(time, '1 minutes')['start'] as start," +
//      "  round(avg(total), 2) as avg " +
//      "from tb" +
//      "  group by window(time, '1 minutes')"
//    spark.sql(sql)
//      .writeStream
//      .outputMode("update")
//      .option("checkpointLocation", "/streaming/mobius_log_monitor_min")
//      .option("baseUrl", "http://localhost:5000/data")
//      .trigger(Trigger.ProcessingTime("1 minutes"))
//      .queryName("mobius monitor 1 minute")
//      .start()

    spark.streams.awaitAnyTermination()
  }

}
