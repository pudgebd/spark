package pers.pudge.spark.practices.oldSparkExamples.ml.features

import org.apache.spark.ml.feature.DCT
import org.apache.spark.ml.linalg.Vectors
import org.apache.spark.sql.SparkSession

/**
  * 离散余弦变换（英语：DCT for Discrete Cosine Transform）是与傅里叶变换相关的一种变换，
  * 类似于离散傅里叶变换，但是只使用实数。
  *   DCT将一个在时间域(time domain)内长度为N的实值序列转换为另外一个
  * 在频率域(frequency domain)内的长度为N的实值序列。下面是程序调用的例子。
  */
object DCTExample {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder
      .appName("DCTExample")
      .master("local[4]")
      .getOrCreate()

    val data = Seq(
      Vectors.dense(0.0, 1.0, -2.0, 3.0),
      Vectors.dense(-1.0, 2.0, 4.0, -7.0),
      Vectors.dense(14.0, -2.0, -5.0, 1.0))

    val df = spark.createDataFrame(data.map(Tuple1.apply)).toDF("features")

    val dct = new DCT()
      .setInputCol("features")
      .setOutputCol("featuresDCT")
      .setInverse(false)

    val dctDf = dct.transform(df)
    dctDf.select("featuresDCT").show(false)
    //        +---------------------------------------------------------------------+
    //        |featuresDCT                                                          |
    //        +---------------------------------------------------------------------+
    //        |[1.0,  -1.1480502970952693, 2.0000000000000004, -2.7716385975338604] |
    //        |[-1.0, 3.378492794482933,   -7.000000000000001, 2.9301512653149677]  |
    //        |[4.0,  9.304453421915744,   11.000000000000002, 1.5579302036357163]  |
    //        +---------------------------------------------------------------------+
    //结果分析：
    //http://www.cnblogs.com/lzhen/p/3947600.html

    spark.stop()
  }
}
