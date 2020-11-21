package pers.pudge.spark.practices.oldSparkExamples.ml.features

import org.apache.spark.ml.feature.Binarizer
// $example off$
import org.apache.spark.sql.SparkSession

/**
  *   Binarization是一个将数值特征转换为二值特征的处理过程。threshold参数表示决定二值化的阈值。
  * 值大于阈值的特征二值化为1,否则二值化为0。下面是代码调用的例子。
  */
object BinarizerExample {


  def main(args: Array[String]): Unit = {

    val spark = SparkSession
      .builder
      .appName("BinarizerExample")
      .master("local[4]")
      .getOrCreate()

    // $example on$
    val data = Array((0, 0.1), (1, 0.8), (2, 0.2))
    val dataFrame = spark.createDataFrame(data).toDF("id", "feature")

    val binarizer: Binarizer = new Binarizer()
      .setInputCol("feature")
      .setOutputCol("binarized_feature")
      .setThreshold(0.8)
    // Feature values greater than the threshold are binarized to 1.0; values equal to or less than
    // the threshold are binarized to 0.0. Both Vector and Double types are supported for inputCol.

    val binarizedDataFrame = binarizer.transform(dataFrame)

    println(s"Binarizer output with Threshold = ${binarizer.getThreshold}")
    binarizedDataFrame.show()
    //        +---+-------+-----------------+
    //        | id|feature|binarized_feature|
    //        +---+-------+-----------------+
    //        |  0|    0.1|              0.0|
    //        |  1|    0.8|              1.0|
    //        |  2|    0.2|              0.0|
    //        +---+-------+-----------------+

    spark.stop()
  }
}