package pers.pudge.spark.practices.oldSparkExamples.ml.features

import org.apache.spark.ml.feature.MaxAbsScaler
import org.apache.spark.ml.linalg.Vectors
// $example off$
import org.apache.spark.sql.SparkSession


/**
  *   MaxAbsScaler转换由向量列组成的数据集,将每个特征调整到[-1,1]的范围,它通过每个特征内的最大绝对值来划分。
  * 它不会移动和聚集数据,因此不会破坏任何的稀疏性。
  * MaxAbsScaler计算数据集上的统计数据,生成MaxAbsScalerModel,然后使用生成的模型分别的转换特征到范围[-1,1]。
  * 下面是程序调用的例子。
  */
object MaxAbsScalerExample {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder
      .appName("MaxAbsScalerExample")
      .master("local[4]")
      .getOrCreate()

    // $example on$
    val dataFrame = spark.createDataFrame(Seq(
      (0, Vectors.dense(1.0, 0.1, -8.0)),
      (1, Vectors.dense(2.0, 1.0, -4.0)),
      (2, Vectors.dense(4.0, 10.0, 8.0))
    )).toDF("id", "features")

    val scaler = new MaxAbsScaler()
      .setInputCol("features")
      .setOutputCol("scaledFeatures")

    // Compute summary statistics and generate MaxAbsScalerModel
    val scalerModel = scaler.fit(dataFrame)

    // rescale each feature to range [-1, 1]
    val scaledData = scalerModel.transform(dataFrame)
    scaledData.select("features", "scaledFeatures").show(10, false)
    //        +--------------+----------------+
    //        |features      |scaledFeatures  |
    //        +--------------+----------------+
    //        |[1.0,0.1,-8.0]|[0.25,0.01,-1.0]|
    //        |[2.0,1.0,-4.0]|[0.5,0.1,-0.5]  |
    //        |[4.0,10.0,8.0]|[1.0,1.0,1.0]   |
    //        +--------------+----------------+

    spark.stop()
  }
}