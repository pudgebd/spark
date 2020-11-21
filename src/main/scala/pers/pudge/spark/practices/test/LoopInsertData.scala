package pers.pudge.spark.practices.test

import java.util.Random

import org.apache.spark.sql.{Row, SaveMode, SparkSession}

object LoopInsertData {

  val APP_NAME = "LoopInsertData"

  val T_TEST_DT = "t_test_dt"
  val T_TEST_DT2 = "t_test_dt2"

  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder()
      .appName(APP_NAME)
      .enableHiveSupport()
      .getOrCreate()

//    insertData(spark)
    multiData(spark)
//    join(spark)

    spark.stop()
  }


  def insertData(spark: SparkSession) = {
    val strs = (1 to 99999).mkString("('", "'), ('", "')")
    while (true) {
      spark.sql(s"insert into $T_TEST_DT values $strs")

      println("begin to sleep")
      Thread.sleep(10000)
    }
  }

  def multiData(spark: SparkSession) = {
    import spark.implicits._
    val rand = new java.util.Random()

    try {
      spark.sql(s"drop table $T_TEST_DT2")
    } catch {
      case e: Exception => {}
    }
    val ds1 = spark.table(T_TEST_DT)

    val ds2 = ds1.rdd.flatMap(flatMapFunc(_, rand))

    ds2.toDF("a", "b").write.mode(SaveMode.Overwrite)
      .parquet(s"hdfs://tdhdfs/user/hive/warehouse/$T_TEST_DT2")
  }


  def join(spark: SparkSession) = {
    import spark.implicits._
    val rand = new java.util.Random()

    while (true) {
      val kvRdd1 = spark.table(T_TEST_DT)
        .rdd.flatMap(flatMapFunc(_, rand))

      val kvRdd2 = spark.table(T_TEST_DT)
        .rdd.flatMap(flatMapFunc(_, rand))

      val count =  kvRdd1.join(kvRdd2).count()
      println(s"current count: $count")
    }
  }


  def flatMapFunc(row: Row, rand: Random): TraversableOnce[(Int, String)] = {
    val arr = new Array[(Int, String)](2000)
    for (idx <- 0 to 1999) {
      arr(idx) = rand.nextInt(999999999) -> row.getString(0)
    }
    return arr
  }


}











