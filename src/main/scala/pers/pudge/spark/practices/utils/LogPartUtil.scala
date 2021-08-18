package pers.pudge.spark.practices.utils

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.expressions.Window
import org.apache.spark.sql.functions._

object LogPartUtil {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder.appName("LocalSpark")
      .master("local[*]")
      .enableHiveSupport()
      .getOrCreate()
    import spark.implicits._

    val randow = new util.Random()
    val df = spark.read.textFile("/Users/chenqian/tmp/boot_2021-08-17.log")
      .map(line => {
        (randow.nextInt(10), line)
      }).toDF("parti", "line")

    val windowSpec  = Window.partitionBy("parti").orderBy("parti")
    df.withColumn("row_number", row_number.over(windowSpec))
      .createOrReplaceTempView("tmp")

    //94053 行开始
    val startRowNum = spark
      .sql("select parti, row_number from tmp where substring(line, 0, 16) = 'INFO 21/08/17 19'")
      .collect()(0).getInt(1)

    //181950 行结束
    val endRowNum = spark
      .sql("select parti, row_number, line from tmp where substring(line, 0, 16) = 'INFO 21/08/18 00' limit 1")
      .collect()(0).getInt(1)

    //    val sql = "select substring(line, 0, 16) from tmp limit 10"
//    spark.sql(sql).show(false)

    val sql = s"select line from tmp where row_number >= $startRowNum and row_number <= $endRowNum"
    spark.sql(sql).coalesce(1)
      .write.text("/Users/chenqian/tmp/boot_2021-08-17_19dian_00dian.log")
  }

}
