package pers.pudge.spark.practices.oldSparkExamples.ml.features

import org.apache.spark.ml.feature.Normalizer
import org.apache.spark.ml.linalg.Vectors
import org.apache.spark.sql.SparkSession


/**
  * https://github.com/endymecy/spark-ml-source-analysis/blob/master/%E7%89%B9%E5%BE%81%E6%8A%BD%E5%8F%96%E5%92%8C%E8%BD%AC%E6%8D%A2/normalizer.md
  */
object NormalizerExample {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder
      .appName("NormalizerExample")
      .master("local[4]")
      .getOrCreate()

    val dataFrame = spark.createDataFrame(Seq(
      (0, Vectors.dense(1.0, 0.5, -1.0)),
      (1, Vectors.dense(2.0, 1.0, 1.0)),
      (2, Vectors.dense(4.0, 10.0, 2.0))
    )).toDF("id", "features")

    // Normalize each Vector using $L^1$ norm.
    val normalizer = new Normalizer()
      .setInputCol("features")
      .setOutputCol("normFeatures")
      .setP(1.0)

    val l1NormData = normalizer.transform(dataFrame)
    println("Normalized using L^1 norm")
    l1NormData.show(10, false)
    //        +---+--------------+------------------+
    //        |id |features      |normFeatures      |
    //        +---+--------------+------------------+
    //        |0  |[1.0,0.5,-1.0]|[0.4,0.2,-0.4]    |
    //        |1  |[2.0,1.0,1.0] |[0.5,0.25,0.25]   |
    //        |2  |[4.0,10.0,2.0]|[0.25,0.625,0.125]|
    //        +---+--------------+------------------+

    // Normalize each Vector using $L^\infty$ norm.
    val lInfNormData = normalizer.transform(dataFrame, normalizer.p -> Double.PositiveInfinity)
    println("Normalized using L^inf norm")
    lInfNormData.show(10, false)
    //        +---+--------------+--------------+
    //        |id |features      |normFeatures  |
    //        +---+--------------+--------------+
    //        |0  |[1.0,0.5,-1.0]|[1.0,0.5,-1.0]|
    //        |1  |[2.0,1.0,1.0] |[1.0,0.5,0.5] |
    //        |2  |[4.0,10.0,2.0]|[0.4,1.0,0.2] |
    //        +---+--------------+--------------+

    spark.stop()
  }
}
