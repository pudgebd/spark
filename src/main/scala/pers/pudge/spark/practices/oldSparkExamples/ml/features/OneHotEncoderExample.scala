package pers.pudge.spark.practices.oldSparkExamples.ml.features

import org.apache.spark.ml.feature.{OneHotEncoder, StringIndexer}
import org.apache.spark.sql.SparkSession


/**
  *   One-hot encoding将标签索引列映射为二值向量,这个向量至多有一个1值。
  * 这个编码允许要求连续特征的算法(如逻辑回归)使用类别特征。下面是程序调用的例子。
  */
object OneHotEncoderExample {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder
      .appName("OneHotEncoderExample")
      .master("local[4]")
      .getOrCreate()

    val df = spark.createDataFrame(Seq(
      (0, "a"),
      (1, "b"),
      (2, "c"),
      (3, "a"),
      (4, "a"),
      (5, "c")
    )).toDF("id", "category")

    val indexer = new StringIndexer()
      .setInputCol("category")
      .setOutputCol("categoryIndex")
      .fit(df)
    val indexed = indexer.transform(df)
    indexed.show(false)
    //        +---+--------+-------------+
    //        |id |category|categoryIndex|
    //        +---+--------+-------------+
    //        |0  |a       |0.0          |
    //        |1  |b       |2.0          |
    //        |2  |c       |1.0          |
    //        |3  |a       |0.0          |
    //        |4  |a       |0.0          |
    //        |5  |c       |1.0          |
    //        +---+--------+-------------+

    val encoder = new OneHotEncoder()
      .setInputCol("categoryIndex")
      .setOutputCol("categoryVec")

    val encoded = encoder.transform(indexed)
    encoded.show(false)
    //        +---+--------+-------------+-------------+
    //        |id |category|categoryIndex|categoryVec  |
    //        +---+--------+-------------+-------------+
    //        |0  |a       |0.0          |(2,[0],[1.0])|
    //        |1  |b       |2.0          |(2,[],[])    |
    //        |2  |c       |1.0          |(2,[1],[1.0])|
    //        |3  |a       |0.0          |(2,[0],[1.0])|
    //        |4  |a       |0.0          |(2,[0],[1.0])|
    //        |5  |c       |1.0          |(2,[1],[1.0])|
    //        +---+--------+-------------+-------------+

    spark.stop()
  }

}