package pers.pudge.spark.practices.oldSparkExamples.ml.features

import org.apache.spark.ml.feature.MinMaxScaler
import org.apache.spark.ml.linalg.Vectors
import org.apache.spark.sql.SparkSession

/**
  * https://github.com/endymecy/spark-ml-source-analysis/blob/master/%E7%89%B9%E5%BE%81%E6%8A%BD%E5%8F%96%E5%92%8C%E8%BD%AC%E6%8D%A2/MinMaxScaler.md
  */
object MinMaxScalerExample {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder
      .appName("MinMaxScalerExample")
      .master("local[4]")
      .getOrCreate()

    // $example on$
    val dataFrame = spark.createDataFrame(Seq(
      (0, Vectors.dense(1.0, 0.1, -1.0)),
      (1, Vectors.dense(2.0, 1.1, 1.0)),
      (2, Vectors.dense(3.0, 10.1, 3.0))
    )).toDF("id", "features")

    val scaler = new MinMaxScaler()
      .setInputCol("features")
      .setOutputCol("scaledFeatures")

    // Compute summary statistics and generate MinMaxScalerModel
    val scalerModel = scaler.fit(dataFrame)

    // rescale each feature to range [min, max].
    val scaledData = scalerModel.transform(dataFrame)
    println(s"Features scaled to range: [${scaler.getMin}, ${scaler.getMax}]")
    scaledData.select("features", "scaledFeatures").show(10, false)
    //        +--------------+--------------+
    //        |features      |scaledFeatures|
    //        +--------------+--------------+
    //        |[1.0,0.1,-1.0]|[0.0,0.0,0.0] |
    //        |[2.0,1.1,1.0] |[0.5,0.1,0.5] |
    //        |[3.0,10.1,3.0]|[1.0,1.0,1.0] |
    //        +--------------+--------------+

    spark.stop()
  }
}
