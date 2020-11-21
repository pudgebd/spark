package pers.pudge.spark.practices.oldSparkExamples.ml.features

import org.apache.spark.ml.feature.{RegexTokenizer, Tokenizer}
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._


/**
  *   Tokenization是一个将文本(如一个句子)转换为个体单元(如词)的处理过程。 一个简单的Tokenizer类就提供了这个功能。
  * 下面的例子展示了如何将句子转换为此序列。
 * * * *  RegexTokenizer基于正则表达式匹配提供了更高级的断词(tokenization)。默认情况下,参数pattern(默认是\s+)作为分隔符,
 * * * * 用来切分输入文本。用户可以设置gaps参数为false用来表明正则参数pattern表示tokens而不是splitting gaps,
 * * * * 这个类可以找到所有匹配的事件并作为结果返回。下面是调用的例子。
  */
object TokenizerExample {


  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder
      .appName("TokenizerExample")
      .master("local[4]")
      .getOrCreate()

    // $example on$
    val sentenceDataFrame = spark.createDataFrame(Seq(
      (0, "Hi I heard about Spark"),
      (1, "I wish Java could use case classes"),
      (2, "Logistic,regression,models,are,neat")
    )).toDF("id", "sentence")

    val tokenizer = new Tokenizer().setInputCol("sentence").setOutputCol("words")
    val regexTokenizer = new RegexTokenizer() //allows more advanced tokenization based on regular expression (regex) matching
      .setInputCol("sentence")
      .setOutputCol("words")
      .setPattern("\\W+") // Alternatively, users can set parameter “gaps” to false
    //.setGaps(false) //indicating the regex “pattern” denotes “tokens” rather than splitting gaps,
    // and find all matching occurrences as the tokenization result.

    val countTokens = udf { (words: Seq[String]) => words.length }

    val tokenized = tokenizer.transform(sentenceDataFrame)
    tokenized.select("sentence", "words")
      .withColumn("tokens", countTokens(col("words"))).show(false)

    val regexTokenized = regexTokenizer.transform(sentenceDataFrame)
    regexTokenized.select("sentence", "words")
      .withColumn("tokens", countTokens(col("words"))).show(false)
    // $example off$

    spark.stop()
  }

}
