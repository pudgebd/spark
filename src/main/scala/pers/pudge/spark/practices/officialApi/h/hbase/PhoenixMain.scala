package pers.pudge.spark.practices.officialApi.h.hbase

import org.apache.spark.sql.SparkSession
import pers.pudge.spark.practices.utils.FLOG

/**
  * Created by pudgebd on 17-4-17.
  */
object PhoenixMain {

  val T_UUS = "\"t_user_user_score\""

  def main(args: Array[String]): Unit = {
    val ss = SparkSession.builder().appName("PhoenixMain").master("local[4]").getOrCreate()
    val sqlContext = ss.sqlContext

    sqlContext.read.format("org.apache.phoenix.spark")
      .options(Map("table" -> T_UUS, "zkUrl" -> "localhost:2181:/hbase"))
      .load().createOrReplaceTempView("tmp")

    sqlContext.sql("select s from tmp").foreach(row => {
      FLOG.log(row.get(0).toString)
    })

    //？？？找不到方法
    //        val df = sqlContext.phoenixTableAsDataFrame(
    //            T_UUS, Array("s"), predicate = None, zkUrl = Some("localhost:2181"),
    //            conf = new Configuration
    //        )

    //        df.foreach(row => {
    //            FLOG.log(row.get(0).toString)
    //        })


    System.exit(0)
  }

}
