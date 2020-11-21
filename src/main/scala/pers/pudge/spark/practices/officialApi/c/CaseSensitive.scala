package pers.pudge.spark.practices.officialApi.c

import org.apache.spark.sql.SparkSession
import pers.pudge.spark.practices.utils.constants.MT

object CaseSensitive {

  val APP_MAIN = "CaseSensitive"

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .master(MT.LOCAL_MASTER)
      .appName(APP_MAIN)
      .enableHiveSupport()
      .getOrCreate()
    import spark.implicits._

    spark.createDataset(Seq((1, "aa", 1), (2, "cc", 2), (3, "DDD", 3), (4, "EEE", 4)))
      .toDF("id", "NAME", "age")
      .createOrReplaceTempView("tmp1")
    spark.createDataset(Seq((3, "ddd", 3), (4, "EEE", 4), (5, "ffff", 5), (6, "gggg", 6)))
      .toDF("id", "name", "age")
      .createOrReplaceTempView("tmp2")

//    val sql = "select * from tmp1 t1, tmp2 t2 where t1.name = t2.name"
//    val sql = "select * from tmp1 t1 join tmp2 t2 on t1.name = t2.name"
    val sql = "select * from tmp1 t1 join tmp2 t2 on t1.name = t2.name and t1.age = t2.age"
    spark.sql(sql).show()

    spark.stop()
  }


}
