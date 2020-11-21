package pers.pudge.spark.practices.oldSparkExamples.ml.features

import org.apache.spark.ml.feature.StopWordsRemover
import org.apache.spark.sql.SparkSession


/**
  *   Stop words是那些需要从输入数据中排除掉的词。删除这些词的原因是, 这些词出现频繁,并没有携带太多有意义的信息。
  * StopWordsRemover输入一串句子,将这些输入句子中的停用词全部删掉。
  * 停用词列表是通过stopWords参数来指定的。 一些语言的默认停用词可以通过调用
  * StopWordsRemover.loadDefaultStopWords(language)来获得。可以用的语言选项有
  * danish, dutch, english, finnish, french, german, hungarian, italian, norwegian, portuguese, russian,
  * spanish, swedish以及 turkish。参数caseSensitive表示是否对大小写敏感,默认为false。
  */
object StopWordsRemoverExample {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder
      .appName("StopWordsRemoverExample")
      .master("local[4]")
      .getOrCreate()

    // $example on$
    val remover = new StopWordsRemover()
      .setInputCol("raw")
      .setOutputCol("filtered")
    //        .setStopWords()
    //        .setCaseSensitive()

    val dataSet = spark.createDataFrame(Seq(
      (0, Seq("I", "saw", "the", "red", "balloon")),
      (1, Seq("Mary", "had", "a", "little", "lamb"))
    )).toDF("id", "raw")

    remover.transform(dataSet).show(false)
    //        +---+----------------------------+--------------------+
    //        |id |raw                         |filtered            |
    //        +---+----------------------------+--------------------+
    //        |0  |[I, saw, the, red, balloon] |[saw, red, balloon] |
    //        |1  |[Mary, had, a, little, lamb]|[Mary, little, lamb]|
    //        +---+----------------------------+--------------------+

    spark.stop()
  }
}