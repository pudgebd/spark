package pers.pudge.spark.practices.oldSparkExamples.ml.features

import org.apache.spark.ml.feature.Bucketizer
// $example off$
import org.apache.spark.sql.SparkSession


/**
  *
  * Bucketizer将连续的特征列转换成特征桶(buckets)列。这些桶由用户指定。它拥有一个splits参数。
  * *
  * splits:如果有n+1个splits,那么将有n个桶。桶将由split x和split y共同确定,它的值范围为[x,y),
  * 如果是最后 一个桶,范围将是[x,y]。splits应该严格递增。负无穷和正无穷必须明确的提供用来覆盖所有的双精度值,
  * 否则,超出splits的值将会被 认为是一个错误。splits的两个例子是
  * Array(Double.NegativeInfinity, 0.0, 1.0, Double.PositiveInfinity) 和 Array(0.0, 1.0, 2.0)。
  *   注意,如果你并不知道目标列的上界和下界,你应该添加Double.NegativeInfinity和Double.PositiveInfinity
  * 作为边界从而防止潜在的 超过边界的异常。下面是程序调用的例子。
  */
object BucketizerExample {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder
      .appName("BucketizerExample")
      .master("local[4]")
      .getOrCreate()

    val splits = Array(Double.NegativeInfinity, -0.5, 0.0, 0.5, Double.PositiveInfinity)

    val data = Array(-999.9, -0.5, -0.3, 0.0, 0.2, 999.9)
    val dataFrame = spark.createDataFrame(data.map(Tuple1.apply)).toDF("features")

    val bucketizer = new Bucketizer()
      .setInputCol("features")
      .setOutputCol("bucketedFeatures")
      .setSplits(splits)

    // Transform original data into its bucket index.
    val bucketedData = bucketizer.transform(dataFrame)

    println(s"Bucketizer output with ${bucketizer.getSplits.length - 1} buckets")
    bucketedData.show(10, false)
    //        +--------+----------------+
    //        |features|bucketedFeatures|
    //        +--------+----------------+
    //        |-999.9  |0.0             |
    //        |-0.5    |1.0             |
    //        |-0.3    |1.0             |
    //        |0.0     |2.0             |
    //        |0.2     |2.0             |
    //        |999.9   |3.0             |
    //        +--------+----------------+

    spark.stop()
  }
}