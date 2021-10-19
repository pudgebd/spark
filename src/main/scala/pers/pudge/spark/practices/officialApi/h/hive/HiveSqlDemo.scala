package pers.pudge.spark.practices.officialApi.h.hive

import org.apache.spark.sql.SparkSession
import pers.pudge.spark.practices.utils.constants.{Key, MT}

object HiveSqlDemo {

  val APP_NAME = "HiveSqlDemo"

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName(APP_NAME)
      .master(MT.LOCAL_MASTER)
//      .config(Key.SPARK_SQL_WAREHOUSE_DIR, MT.HIVE_WARE)
      .enableHiveSupport()
      .getOrCreate()

    spark.sharedState

    val sql101 = "select clt_nbr from graph_cmb_test.tv_user limit 2"
    val sql102 = "select clt_nbr from graph_cmb_test.tv_user where object_key = 'C75AB31882527CB8FF22480BC0762A21'"
    val sql103 = "select object_key from graph_cmb_test.tv_user where clt_nbr in ('1000000001', '1000000002')"
    val sql202 = "select * from graph_cmb_test.tv_n_user limit 2"
    val sql303 = "select from_key from graph_cmb_test.te_email_dm limit 1"
    val df = spark.sql(sql102)
    df.show(false)
//    df.collect().foreach(row => {
//      println(row.get(0))
//    })
//    println(s"------------------------- df: $df")
    spark.stop()
  }

}
