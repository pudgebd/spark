package pers.pudge.spark.practices.oldSparkExamples.ml.features

import org.apache.spark.ml.feature.NGram
import org.apache.spark.sql.SparkSession

/**
  *   一个n-gram是一个包含n个tokens(如词)的序列。NGram可以将输入特征 转换为n-grams。
  * *
  *   NGram输入一系列的序列,参数n用来决定每个n-gram的词个数。输出包含一个n-grams序列,每个n-gram表示一个划定空间的连续词序列。 如果输入序列包含的词少于n,将不会有输出。
  */
object NGramExample {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder
      .appName("NGramExample")
      .master("local[4]")
      .getOrCreate()

    val wordDataFrame = spark.createDataFrame(Seq(
      (0, Array("Hi", "I", "heard", "about", "Spark")),
      (1, Array("I", "wish", "Java", "could", "use", "case", "classes")),
      (2, Array("Logistic", "regression", "models", "are", "neat"))
    )).toDF("id", "words")

    val ngram = new NGram() //n元语法指文本中连续出现的n个语词。

      .setN(3) //An n-gram is a sequence of nn tokens (typically words) for some integer nn.
      // The NGram class can be used to transform input features into nn-grams.

      .setInputCol("words") // If the input sequence contains fewer than n strings, no output is produced.

      .setOutputCol("ngrams") //An n-gram is a sequence of nn tokens (typically words) for some integer nn.
    // The NGram class can be used to transform input features into nn-grams.

    val ngramDataFrame = ngram.transform(wordDataFrame)
    ngramDataFrame.select("ngrams").show(false)
    //        +------------------------------------------------------------------+
    //        |ngrams                                                            |
    //        +------------------------------------------------------------------+
    //        |[Hi I, I heard, heard about, about Spark]                         |
    //        |[I wish, wish Java, Java could, could use, use case, case classes]|
    //        |[Logistic regression, regression models, models are, are neat]    |
    //        +------------------------------------------------------------------+

    spark.stop()
  }
}