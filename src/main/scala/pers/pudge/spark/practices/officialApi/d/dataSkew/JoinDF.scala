package pers.pudge.spark.practices.officialApi.d.dataSkew

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.broadcast
import pers.pudge.spark.practices.officialApi.d.dataSkew.AddHiveRightTables.T_XW_RIGHT
import pers.pudge.spark.practices.officialApi.d.dataSkew.AddHiveTablesForSkew.T_5WW_SKEW_4WW
import pers.pudge.spark.practices.utils.constants.{Key, MT}

object JoinDF {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("rightJoinDF_leftouter")
      .getOrCreate()

    val leftDF = spark.read.parquet(MT.HIVE_WARE + T_5WW_SKEW_4WW)
    val rightDF = spark.read.parquet(MT.HIVE_WARE + T_XW_RIGHT)
    //'inner', 'outer', 'full', 'fullouter', 'leftouter', 'left', 'rightouter', 'right', 'leftsemi', 'leftanti', 'cross'

    //各种问题，太慢
    val res = leftDF.join(broadcast(rightDF), Seq(Key.ID), "leftouter").collect()

    println("------------------------------")
    println(res.mkString(","))
    println("------------------------------")

    spark.stop()
  }

}
