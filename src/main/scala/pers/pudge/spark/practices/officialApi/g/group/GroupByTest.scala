package pers.pudge.spark.practices.officialApi.g.group

import org.apache.spark.sql.SparkSession
import pers.pudge.spark.practices.utils.constants.{Key, MT}

object GroupByTest {


  val appName = "GroupByTest_7"

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName(appName)
//                      .master(MT.LOCAL_MASTER)
      .config(Key.SPARK_SQL_WAREHOUSE_DIR, MT.HIVE_WARE)
      .enableHiveSupport().getOrCreate()

    val table = Key.T_UG_TEST
    val parquetDf = spark.read.parquet(MT.HIVE_WARE + table)

    //        parquetDf.createOrReplaceTempView(table)
    //        val df = spark.sql(s"select * from $table limit 1");
    //        df.foreach(row => println(row.getString(0)+row.getString(1)))

    //        val rgd = parquetDf.rdd.groupBy(_.getString(1))
    //        println(s"---------  ${rgd.count()}  ---------------")

    parquetDf.cube(Key.UID, Key.GOODS_ID).avg().foreach(row => {
      println("----------------------")
      println(row)
    })

    spark.stop()
  }


}
