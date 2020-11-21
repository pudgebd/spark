package pers.pudge.spark.practices.officialApi.i

import org.apache.spark.sql.SparkSession
import pers.pudge.spark.practices.utils.constants.MT

object InsertSelect {

  val APP_MAIN = "InsertSelect"

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .master(MT.LOCAL_MASTER)
      .appName(APP_MAIN)
      .enableHiveSupport()
      .getOrCreate()
    import spark.implicits._

    spark.sql("drop table tmp1")

    val createTable =
      s"""
         |CREATE TABLE tmp1 (
         |id bigint,
         |name string,
         |age int)
       """.stripMargin
    spark.sql(createTable)//.show()

    spark.createDataset(Seq((3, "ddd", 33), (4, "EEE", 44), (5, "ffff", 55), (6, "gggg", 66)))
      .toDF("id", "name", "age")
      .createOrReplaceTempView("tmp2")

    //下面两个sql效果一样
//    val sql = "insert into tmp1 select age as id, name, id as age from tmp2"
    val sql = "insert into tmp1 select age, name, id from tmp2"
    spark.sql(sql)
    spark.table("tmp1").show()

    spark.stop()
  }

}
