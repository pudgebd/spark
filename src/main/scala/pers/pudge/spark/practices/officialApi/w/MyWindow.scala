package pers.pudge.spark.practices.officialApi.w

import breeze.linalg.rank
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.expressions.Window
import pers.pudge.spark.practices.officialApi.d.dataSetOrFrame.APP_NAME
import pers.pudge.spark.practices.utils.constants.MT

object MyWindow {

  val APP_NAME = "MyWindow"

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .master(MT.LOCAL_MASTER)
      .appName(APP_NAME)
      .enableHiveSupport()
      //.config(Key.SPARK_SQL_WAREHOUSE_DIR, MT.HIVE_WARE)
      .getOrCreate()
    import spark.implicits._

    val df = spark.read.json("src/main/resources/json/for_window.json")
    df.createOrReplaceTempView("tmp")

    // SQL语句
//    val sql = "select".
//      concat(" name,lesson,score, ").
//      concat(" ntile(2) over (partition by lesson order by score desc ) as ntile_2,").
//      concat(" ntile(3) over (partition by lesson order by score desc ) as ntile_3,").
//      concat(" row_number() over (partition by lesson order by score desc ) as row_number,").
//      concat(" rank() over (partition by lesson order by score desc ) as rank, ").
//      concat(" dense_rank() over (partition by lesson order by score desc ) as dense_rank, ").
//      concat(" percent_rank() over (partition by lesson order by score desc ) as percent_rank ").
//      concat(" from tmp ").
//      concat(" order by lesson,name,score")

    val sql =
      s"""
         |select name,lesson,score, ntile(2) over (partition by lesson order by score desc ) as ntile_2
         |from tmp
       """.stripMargin

    spark.sql(sql).show()

     //此处博客报错：用DataFrame API的方式完成相同的功能。
//    val window_spec = Window.partitionBy("lesson").orderBy(df("score").desc) // 窗口函数中公用的子句
//
//    df.select(df("name"), df("lesson"), df("score"),
//      ntile(2).over(window_spec).as("ntile_2"),
//      ntile(3).over(window_spec).as("ntile_3"),
//      row_number().over(window_spec).as("row_number"),
//      rank().over(window_spec).as("rank"),
//      dense_rank().over(window_spec).as("dense_rank"),
//      percent_rank().over(window_spec).as("percent_rank")
//    ).orderBy("lesson", "name", "score").show

    spark.stop()
  }

}
