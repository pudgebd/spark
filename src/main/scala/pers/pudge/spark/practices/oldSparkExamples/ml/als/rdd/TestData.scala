package pers.pudge.spark.practices.oldSparkExamples.ml.als.rdd

import org.apache.spark.sql.SparkSession

/**
  **/
object TestData {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder
      .appName("TestData")
      .master("local[4]").getOrCreate()
    import spark.implicits._

    val data = spark.read.csv("src/main/resources/data/jumoretradecsv.csv")
    val dataDF = data.map(row => {
      var arr = row.toString().split(",")
      if (arr.length != 3) {
        //正常情况下数据不会有问题
        arr = Seq("0", "0", "0").toArray
      }
      JumoreTrade(
        parseStrToLong(arr(0)),
        parseStrToLong(arr(1)),
        parseStrToLong(arr(2)))
    })

    dataDF.createOrReplaceTempView("test")

    val totalCounts = dataDF.count()
    //        val sql = "select product from test group by product having count(product) > 1"
    //        val sql = "select user, product from test group by user, product"
    val sql = "select count(distinct user) from test"
    //        val counts = spark.sql(sql).count()
    spark.sql(sql).show(false)

    spark.stop()
  }

  def parseStrToLong(str: String): Long = {
    val userSb = new StringBuilder()
    for (c <- str if Character.isDigit(c)) {
      userSb.append(c)
    }
    return userSb.toLong
  }

  case class JumoreTrade(user: Long, product: Long, numOrder: Long)

}
