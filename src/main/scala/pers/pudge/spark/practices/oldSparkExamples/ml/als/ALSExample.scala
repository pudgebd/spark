package pers.pudge.spark.practices.oldSparkExamples.ml.als

import org.apache.spark.ml.evaluation.RegressionEvaluator
import org.apache.spark.ml.recommendation.ALS
import org.apache.spark.sql.{DataFrame, Row, SparkSession}
import pers.pudge.spark.practices.utils.FLOG
import pers.pudge.spark.practices.oldSparkExamples.ml.blog.ALSBasic

/**
  * An example demonstrating ALS.
  * Run with
  * {{{
  * bin/run-example ml.ALSExample
  * }}}
  */
object ALSExample extends ALSBasic {

  val forLargeData = true

  def main(args: Array[String]) {
    val spark = SparkSession
      .builder
      .appName("ALS_DF_Example")
      //                .master("local[4]")
      .getOrCreate()
    import spark.implicits._

    //      val csvPath = "E:\\tmp\\ml-20m\\ratings.csv"
    val csvPath = "/tmp/spark/ratings.csv"
    val ratings = spark.read.csv(csvPath)
      .map(parseRating)
      .filter(_.userId != 0)
      .toDF()
    val Array(training, test) = ratings.randomSplit(Array(0.8, 0.2))

    // Build the recommendation model using ALS on the training data
    val als = new ALS()
      .setMaxIter(5)
      .setRegParam(0.01)
      .setUserCol("userId")
      .setItemCol("movieId")
      .setRatingCol("rating")
    val model = als.fit(training)

    // Evaluate the model by computing the RMSE on the test data
    val predictions = model.transform(test)

    val evaluator = new RegressionEvaluator()
      .setMetricName("rmse")
      .setLabelCol("rating")
      .setPredictionCol("prediction")
    val rmse = evaluator.evaluate(predictions)
    //predictions.show(10, false)
    //        +------+-------+------+----------+------------+
    //        |userId|movieId|rating|timestamp |prediction  |
    //        +------+-------+------+----------+------------+
    //        |0     |31     |1.0   |1424380312|0.6385212   |
    //        |1     |85     |3.0   |1424380312|0.95178723  |


    //Root-mean-square error = 1.7493575563491788
    //        val userRecDF = recommendForAll(model.userFactors, model.itemFactors, model.getUserCol, model.getItemCol, 10, 12)
    //                val movieRecDF = recommendForAll(model.itemFactors, model.userFactors, $(model.itemCol), $(model.userCol), 10, 12)
    //
    //        userRecDF.show(false)
    //        movieRecDF.show(false)
    //        showResult(rmse, userRecDF)

    spark.stop()
  }

  def parseRating(row: Row): Rating = {
    try {
      var rowStr = row.toString()
      rowStr = rowStr.substring(1, rowStr.length - 1)
      var fields = rowStr.split(",")

      Rating(fields(0).toInt, fields(1).toInt, fields(2).toFloat, fields(3).toLong)
    } catch {
      case e: Exception => {
        Rating(0, 0, 0, 0)
      }
    }
  }

  def showResult(rmse: Double, userRecDF: DataFrame) = {
    if (forLargeData) {
      userRecDF.select("userId").foreachPartition(it => {
        for (row <- it) {
          println(row.toString())
        }
      })
      FLOG.log(s"Root-mean-square error = $rmse")
    } else {
      println(s"Root-mean-square error = $rmse")
    }
  }

  case class Rating(userId: Int, movieId: Int, rating: Float, timestamp: Long)


}