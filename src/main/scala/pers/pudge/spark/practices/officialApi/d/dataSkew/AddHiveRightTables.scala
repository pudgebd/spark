package pers.pudge.spark.practices.officialApi.d.dataSkew

import org.apache.spark.sql.{SaveMode, SparkSession}
import pers.pudge.spark.practices.officialApi.d.dataSkew.AddHiveTablesForSkew.{SKEW_IDS, crtNewUser}
import pers.pudge.spark.practices.utils.constants.MT

object AddHiveRightTables {

  val T_XW_RIGHT = "t_30w_right"
  private val ID_TOTAL_COUNTS = 300000L
  private val PARTITION_COUNTS = 100

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName(T_XW_RIGHT)
      .master(MT.LOCAL_MASTER)
      .enableHiveSupport()
      .getOrCreate()

    import spark.implicits._

    val range = 1L to ID_TOTAL_COUNTS
    val set = range.toSet ++ SKEW_IDS
    spark.createDataset(set.toSeq).repartition(PARTITION_COUNTS)
      .map(crtNewUser(_)).write.mode(SaveMode.Overwrite).saveAsTable(T_XW_RIGHT)


    spark.stop()
  }

}
