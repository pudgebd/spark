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
    val sql401 = "select object_key,from_key,to_key,'te_email_dm' schema from graph_cmb_test.te_email_dm  where  from_key is not null and to_key is not null"
    val sql402 = "show create table graph_cmb_test.te_qs_score_dm"
    val sql403 = "select * from graph_cmb_test.te_transfer_dm_v1"
    val sql501 = "select * from default.test_spark_orc"
    val sql601 = "insert into default.zhouyin_te_email_dm select * from graph_cmb_test.te_email_dm"
    val sql602 = "select object_key, clt_ctf_nbr from graph_cmb_test.tv_user"
    val sql603 = "select object_key, usr_id from graph_cmb_test.tv_n_user"
    val sql701 = "select object_key, from_key, to_key, 'te_xw_score_dm' edge_schema from graph_cmb_test.te_xw_score_dm where from_key is not null and to_key is not null and date_day = '20211112' union all select object_key, from_key, to_key, 'te_transfer_dm_v1' edge_schema from graph_cmb_test.te_transfer_dm_v1 where from_key is not null and to_key is not null union all select object_key, from_key, to_key, 'te_qs_score_dm' edge_schema from graph_cmb_test.te_qs_score_dm where from_key is not null and to_key is not null and date_day = '20211112' union all select object_key, from_key, to_key, 'te_fx_score_dm' edge_schema from graph_cmb_test.te_fx_score_dm where from_key is not null and to_key is not null and date_day = '20211112' union all select object_key, from_key, to_key, 'te_login_dm' edge_schema from graph_cmb_test.te_login_dm where from_key is not null and to_key is not null"
    val sql801 = "select * from hangzhou_graph.cq_1kw_te_qs_score_dm limit 1"
    val sql802 = "select * from hangzhou_graph.cq_200w_tv_user where object_key in ('70DDEE91DD2E4B8F909BA7F9B66877D2', '4F9E5AE5A7054109B7786AE7C2ECBD52')"

    val df = spark.sql(sql802)
//    println(df.count())
    df.show(false)
//    df.collect().foreach(row => {
//      println(row.get(0))
//    })
//    println(s"------------------------- df: $df")
    spark.stop()
  }

}
