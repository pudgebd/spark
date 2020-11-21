package pers.pudge.spark.practices.oldSparkExamples.ml.blog

import org.apache.spark.mllib.recommendation.{MatrixFactorizationModel, Rating}
import org.apache.spark.rdd.RDD

import scala.io.Source

class ALSBasic {


  /** 校验集预测数据和实际数据之间的均方根误差 **/
  def computeRmse(model: MatrixFactorizationModel, validation: RDD[Rating], numValidation: Long): Double = {

    val predictions: RDD[Rating] = model.predict((validation.map(x => (x.user, x.product))))

    val map1 = predictions.map(x => ((x.user, x.product), x.rating))
    val map2 = validation.map(x => ((x.user, x.product), x.rating))
    val predictionsAndRatings = map1.join(map2).values

    //reduce(_+_) / numValidation
    math.sqrt(predictionsAndRatings.map(x => (x._1 - x._2) * (x._1 - x._2)).mean())
  }

  /** 装载用户评分文件 personalRatings.txt **/
  def loadRatings(path: String): Seq[Rating] = {
    val lines = Source.fromFile(path).getLines()
    val ratings = lines.map {
      line =>
        val fields = line.split("::")
        Rating(fields(0).toInt, fields(1).toInt, fields(2).toDouble)
    }.filter(_.rating > 0.0)
    if (ratings.isEmpty) {
      sys.error("No ratings provided.")
    } else {
      ratings.toSeq
    }
  }


}
