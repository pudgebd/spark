package pers.pudge.spark.practices.oldSparkExamples.ml.features

import org.apache.spark.ml.feature.PolynomialExpansion
import org.apache.spark.ml.linalg.Vectors
import org.apache.spark.sql.SparkSession


/**
  *   Polynomial expansion是一个将特征展开到多元空间的处理过程。 它通过n-degree结合原始的维度来定义。
  * 比如设置degree为2就可以将(x, y)转化为(x, x x, y, x y, y y)。
  * PolynomialExpansion提供了这个功能。 下面的例子展示了如何将特征展开为一个3-degree多项式空间。
  */
object PolynomialExpansionExample {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder
      .appName("PolynomialExpansionExample")
      .master("local[4]")
      .getOrCreate()

    val data = Array(
      Vectors.dense(2.0, 1.0),
      Vectors.dense(0.0, 0.0),
      Vectors.dense(3.0, -1.0)
    )
    val df = spark.createDataFrame(data.map(Tuple1.apply)).toDF("features")

    val polyExpansion = new PolynomialExpansion()
      .setInputCol("features")
      .setOutputCol("polyFeatures")
      .setDegree(3)

    val polyDF = polyExpansion.transform(df)
    polyDF.show(false)
    //        +----------+------------------------------------------+
    //        |features  |polyFeatures                              |
    //        +----------+------------------------------------------+
    //        |[2.0,1.0] |[2.0,4.0,8.0,1.0,2.0,4.0,1.0,2.0,1.0]     |
    //        |[0.0,0.0] |[0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0]     |
    //        |[3.0,-1.0]|[3.0,9.0,27.0,-1.0,-3.0,-9.0,1.0,3.0,-1.0]|
    //        +----------+------------------------------------------+

    spark.stop()
  }
}