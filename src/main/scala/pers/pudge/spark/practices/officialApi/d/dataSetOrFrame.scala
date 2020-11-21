package pers.pudge.spark.practices.officialApi.d

import org.apache.spark.sql.{Dataset, SparkSession}
import pers.pudge.spark.practices.entities.PageView
import pers.pudge.spark.practices.utils.constants.{Key, MT}

/**
  * Created by Administrator on 2016/10/30.
  */
object dataSetOrFrame extends dsOrDfBasic {

  val APP_NAME = "dataSetOrFrame"

  def main(args: Array[String]) {
    val spark = SparkSession.builder()
      .master(MT.LOCAL_MASTER)
      .appName(APP_NAME)
      .enableHiveSupport()
      //.config(Key.SPARK_SQL_WAREHOUSE_DIR, MT.HIVE_WARE)
      .getOrCreate()
    import spark.implicits._

    val ds = spark.read.textFile("src/main/resources/text/bs_0.txt")
    val ds2 = ds.map(_.split(","))
      .map(row => PageView(row(0), row(1), row(2).toInt, row(3), row(4).toLong))

    val ds3 = ds2.map(pv => pv.id -> pv)
    val as = ds3.groupByKey(_._1)
    val dsfa = as.mapGroups((str, it) => str.length)
//    ds3.reduce()
//    ds2.repartition()
//    ds2.coalesce()
//    ds2.unpersist()
//    ds2.write.save()

//    val keyed = ds2.map(po => po.id -> po)
//    keyed.grou

//    tmp(spark, ds2)
    //        agg(ds2)
    //        as(ds2)
    //        cube(ds2)
    //        rollup(ds2)
    //        dxxx(ds2)
    //        fxxx(spark, ds2)
    //        gxxx(spark, ds2)
    //        ixxx(ds2)
//            jxxx(ds2)
//            lxxx(ds2)
//    metadata(spark)
//    partition(spark)
    //        persist(ds2)
            pivot(spark, ds2)
//            rxxx(spark, ds2)
    //        sxxx(ds2)
//    sqlSelect(spark, ds2)
//            sqlInsert(spark, ds2)
//    sqlInsert(spark)
//    sort(spark)
//            wxxx(spark, ds2)
    println()

    spark.stop()
  }


}
