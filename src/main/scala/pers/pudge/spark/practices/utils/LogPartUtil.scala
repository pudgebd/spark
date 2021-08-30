package pers.pudge.spark.practices.utils

import org.apache.spark.sql.{SaveMode, SparkSession}
import org.apache.spark.sql.expressions.Window
import org.apache.spark.sql.functions._

object LogPartUtil {

  val logPath = "/Users/pudgebd/tmp/boot_2021-08-17.log"
  val logBegin = "INFO 21/08/17 19"
  val logEnd = "INFO 21/08/18 00"
  val savePath = "/Users/pudgebd/tmp/boot_2021-08-17_19dian_00dian.log"

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder.appName("LocalSpark")
      .master("local[*]")
      .enableHiveSupport()
      .getOrCreate()
    import spark.implicits._

    val randow = new util.Random()
    val df = spark.read.textFile(logPath)
      .map(line => {
        (randow.nextInt(10), line)
      }).toDF("parti", "line")

    val windowSpec  = Window.partitionBy("parti").orderBy("parti")
    df.withColumn("row_number", row_number.over(windowSpec))
      .createOrReplaceTempView("tmp")

    val startRowNum = spark
      .sql(s"select parti, row_number from tmp where substring(line, 0, 16) = '${logBegin}'")
      .collect()(0).getInt(1)

    val endRowNum = spark
      .sql(s"select parti, row_number, line from tmp where substring(line, 0, 16) = '${logEnd}' limit 1")
      .collect()(0).getInt(1)

    //    val sql = "select substring(line, 0, 16) from tmp limit 10"
//    spark.sql(sql).show(false)

    val sql = s"select line from tmp where row_number >= $startRowNum and row_number <= $endRowNum"
    spark.sql(sql).coalesce(1)
      .write.mode(SaveMode.Overwrite)
      .text(savePath)
  }

}
