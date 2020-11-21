package pers.pudge.spark.practices.oldSparkExamples.ml.features

import org.apache.spark.ml.attribute.Attribute
import org.apache.spark.ml.feature.{IndexToString, StringIndexer}
import org.apache.spark.sql.SparkSession


/**
  * 与StringIndexer相对的是,IndexToString将标签索引列映射回原来的字符串标签。
  * 一个通用的使用案例是使用 StringIndexer将标签转换为索引,然后通过索引训练模型,
  * 最后通过IndexToString将预测的标签索引恢复成字符串标签。
  */
object IndexToStringExample {

  def main(args: Array[String]) {
    val spark = SparkSession
      .builder
      .appName("IndexToStringExample")
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

    println(s"Transformed string column '${indexer.getInputCol}' " +
      s"to indexed column '${indexer.getOutputCol}'")
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

    val inputColSchema = indexed.schema(indexer.getOutputCol)
    println(s"StringIndexer will store labels in output column metadata: " +
      s"${Attribute.fromStructField(inputColSchema).toString}\n")

    val converter = new IndexToString()
      .setInputCol("categoryIndex")
      .setOutputCol("originalCategory")

    val converted = converter.transform(indexed)

    println(s"Transformed indexed column '${converter.getInputCol}' back to original string " +
      s"column '${converter.getOutputCol}' using labels in metadata")
    converted.select("id", "categoryIndex", "originalCategory").show(false)
    //        +---+-------------+----------------+
    //        |id |categoryIndex|originalCategory|
    //        +---+-------------+----------------+
    //        |0  |0.0          |a               |
    //        |1  |2.0          |b               |
    //        |2  |1.0          |c               |
    //        |3  |0.0          |a               |
    //        |4  |0.0          |a               |
    //        |5  |1.0          |c               |
    //        +---+-------------+----------------+

    spark.stop()
  }
}
