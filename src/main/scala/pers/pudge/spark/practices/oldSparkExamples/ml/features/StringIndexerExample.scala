package pers.pudge.spark.practices.oldSparkExamples.ml.features

import org.apache.spark.ml.feature.StringIndexer
import org.apache.spark.sql.SparkSession

/**
  *   StringIndexer将标签列的字符串编码为标签索引。这些索引是[0,numLabels),
  * 通过标签频率排序,所以频率最高的标签的索引为0。 如果输入列是数字,我们把它强转为字符串然后在编码。
  */
object StringIndexerExample {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder
      .appName("StringIndexerExample")
      .master("local[4]")
      .getOrCreate()

    // $example on$
    val df = spark.createDataFrame(
      Seq((0, "a"), (1, "b"), (2, "c"), (3, "a"), (4, "a"), (5, "c"))
    ).toDF("id", "category")

    val indexer = new StringIndexer()
      .setInputCol("category")
      .setOutputCol("categoryIndex")

    val indexed = indexer.fit(df).transform(df)
    indexed.show()
    // $example off$

    spark.stop()
  }
}