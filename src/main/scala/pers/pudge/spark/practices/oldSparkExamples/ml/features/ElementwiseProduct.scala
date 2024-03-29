package pers.pudge.spark.practices.oldSparkExamples.ml.features

import org.apache.spark.ml.feature.ElementwiseProduct
import org.apache.spark.ml.linalg.Vectors
// $example off$
import org.apache.spark.sql.SparkSession


/**
  *   ElementwiseProduct对每一个输入向量乘以一个给定的“权重”向量。换句话说，就是通过一个乘子对数据集的每一列进行缩放。
  */
object ElementwiseProductExample {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder
      .appName("ElementwiseProductExample")
      .master("local[4]")
      .getOrCreate()

    // Create some vector data; also works for sparse vectors
    val dataFrame = spark.createDataFrame(Seq(
      ("a", Vectors.dense(1.0, 2.0, 3.0)),
      ("b", Vectors.dense(4.0, 5.0, 6.0)))).toDF("id", "vector")

    val transformingVector = Vectors.dense(0.0, 1.0, 2.0)
    val transformer = new ElementwiseProduct()
      .setScalingVec(transformingVector)
      .setInputCol("vector")
      .setOutputCol("transformedVector")

    // Batch transform the vectors to create new column:
    transformer.transform(dataFrame).show(10, false)

    spark.stop()
  }
}