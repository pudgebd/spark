package pers.pudge.spark.practices.utils

import org.apache.spark.sql.catalyst.encoders.RowEncoder
import org.apache.spark.sql.{Row, SaveMode, SparkSession}
import pers.pudge.spark.practices.officialApi.h.hive.HiveSqlDemo.APP_NAME
import pers.pudge.spark.practices.utils.constants.MT

object MultiHiveData {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName(APP_NAME)
//      .master(MT.LOCAL_MASTER)
      .enableHiveSupport()
      .getOrCreate()
    import spark.implicits._

    val readDbAndTbl = args(0)
    val writeDbAndTbl = args(1)
    val repartiNum = args(2).toInt
    val multiNum = args(3).toInt

    val df = spark.table(readDbAndTbl)
//    println(df.count())
    val newDf = df.repartition(repartiNum)
      .flatMap(row => {
        val seq = row.toSeq
        val range = 0 to multiNum
        val arr = range.toArray
        arr.map(idx => Row.fromSeq(seq))
      })(RowEncoder.apply(df.schema))
//      .show(false)
//    println(newDf.count())

    newDf.write.mode(SaveMode.Overwrite).saveAsTable(writeDbAndTbl)
  }

}
