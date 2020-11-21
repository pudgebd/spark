package pers.pudge.spark.practices.officialApi.d.dataSkew

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.broadcast
import pers.pudge.spark.practices.officialApi.d.dataSkew.AddHiveRightTables.T_XW_RIGHT
import pers.pudge.spark.practices.officialApi.d.dataSkew.AddHiveTablesForSkew.T_5WW_SKEW_4WW
import pers.pudge.spark.practices.utils.constants.MT

object JoinSql {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("JoinSql")
      .getOrCreate()

    spark.read.parquet(MT.HIVE_WARE + T_5WW_SKEW_4WW).createOrReplaceTempView(T_5WW_SKEW_4WW)
    broadcast(spark.read.parquet(MT.HIVE_WARE + T_XW_RIGHT)).createOrReplaceTempView(T_XW_RIGHT)

    //最快纪录 1.1 min - 399700018
    val res = spark.sql(s"select count(tr.id) from $T_5WW_SKEW_4WW tl, $T_XW_RIGHT tr where tl.id = tr.id")
      .collect()

    //最快纪录 1.1 min
    //        val res = spark.sql(s"select count(tl.id) from $T_5WW_SKEW_4WW tl inner join $T_10W_RIGHT tr on tl.id = tr.id")
    //                .collect()

    //        最快纪录 1.1 min
    //        val res = spark.sql(s"select count(tl.id) from $T_5WW_SKEW_4WW tl left join $T_10W_RIGHT tr on tl.id = tr.id")
    //                .collect()

    //最快纪录 2.8 min
    //        val res = spark.sql(s"select count(tl.id) from $T_5WW_SKEW_4WW tl right join $T_10W_RIGHT tr on tl.id = tr.id")
    //                .collect()

    //最快纪录 2.6 min
    //        val res = spark.sql(s"select count(tl.id) from $T_5WW_SKEW_4WW tl full outer join $T_10W_RIGHT tr on tl.id = tr.id")
    //                .collect()

    println("------------------------------")
    println(res.mkString(","))
    println("------------------------------")

    spark.stop()
  }


}
