package pers.pudge.spark.practices.oldSparkExamples.ml.features

// $example on$
// $example off$


// $example on$
import org.apache.spark.ml.feature.{CountVectorizer, CountVectorizerModel}
// $example off$
import org.apache.spark.sql.SparkSession


/**
  *   CountVectorizer和CountVectorizerModel的目的是帮助我们将文本文档集转换为词频(token counts)向量。 当
  * 事先没有可用的词典时,CountVectorizer可以被当做一个Estimator去抽取词汇,并且生成CountVectorizerModel。
  * 这个模型通过词汇集为文档生成一个稀疏的表示,这个表示可以作为其它算法的输入,比如LDA。   
  * 在训练的过程中,CountVectorizer将会选择使用语料中词频个数前vocabSize的词。
  * 一个可选的参数minDF也 会影响训练过程。这个参数表示可以包含在词典中的词的最小个数(如果该参数小于1,则表示比例)。
  * 另外一个可选的boolean参数控制着输出向量。 如果将它设置为true,那么所有的非0词频都会赋值为1。这对离散的概率模型非常有用。
  */
object CountVectorizerExample {
  def main(args: Array[String]) {
    val spark = SparkSession
      .builder
      .appName("CountVectorizerExample")
      .master("local[4]")
      .getOrCreate()

    // $example on$
    val df = spark.createDataFrame(Seq(
      (0, Array("a", "b", "c")),
      (1, Array("a", "b", "b", "c", "a"))
    )).toDF("id", "words")

    // fit a CountVectorizerModel from the corpus
    val cvModel: CountVectorizerModel = new CountVectorizer()
      .setInputCol("words")
      .setOutputCol("features")
      .setVocabSize(3) //select the top vocabSize words ordered by term frequency across the corpus
      .setMinDF(2) //specifying the minimum number (or fraction if < 1.0) of documents a term must appear in to be included in the vocabulary
      //.setBinary(true) //controls the output vector. If set to true all nonzero counts are set to 1. This is especially useful for discrete probabilistic models that model binary, rather than integer, counts.
      .fit(df)

    // alternatively, define CountVectorizerModel with a-priori vocabulary
    val cvm = new CountVectorizerModel(Array("a", "b", "c"))
      .setInputCol("words")
      .setOutputCol("features")

    val df2 = cvModel.transform(df)
    df2.select("features").show(false) //Each vector represents the token counts of the document over the vocabulary.
    //        +---+---------------+-------------------------+
    //        |id |words          |features                 |
    //        +---+---------------+-------------------------+
    //        |0  |[a, b, c]      |(3,[0,1,2],[1.0,1.0,1.0])|
    //        |1  |[a, b, b, c, a]|(3,[0,1,2],[2.0,2.0,1.0])|
    //        +---+---------------+-------------------------+

    spark.stop()
  }
}

// scalastyle:on println
