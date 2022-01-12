package pers.pudge.spark.practices.officialApi.d

import org.apache.spark.sql.{Column, SparkSession}
import pers.pudge.spark.practices.officialApi.d.dataSetOrFrame.APP_NAME
import pers.pudge.spark.practices.utils.constants.MT

object DropDuplicates {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .master(MT.LOCAL_MASTER)
      .appName("DropDuplicates")
      .getOrCreate()
    import spark.implicits._
    val srcCols = Seq("id", "name").map(new Column(_))
    val dstCols = Seq("name", "id").map(new Column(_))
    val vertexSelectSeq = Seq("idv", "namev")

    val df = spark.createDataset(
      Seq(("f1", "t1"), ("t1", "f1"), ("f2", "t2"))
    ).toDF("id", "name")

    df.select(srcCols: _*).toDF(vertexSelectSeq: _*)
      .union(
        df.select(dstCols: _*).toDF(vertexSelectSeq: _*)
      )//.dropDuplicates(vertexSelectSeq)
      .show(false)
  }

}
