package pers.pudge.spark.practices.oldSparkExamples.ml.features

import org.apache.spark.ml.feature.{HashingTF, IDF, Tokenizer}
import org.apache.spark.sql.SparkSession


object TfIdfExample {


  def main(args: Array[String]) {
    val spark = SparkSession
      .builder
      .appName("TfIdfExample")
      .master("local[4]")
      .getOrCreate()

    // $example on$
    val sentenceData = spark.createDataFrame(Seq(
      (0.0, "Hi I heard about Spark"),
      (0.0, "I wish Java could use case classes"),
      (1.0, "Logistic regression models are neat")
    )).toDF("label", "sentence")

    val tokenizer = new Tokenizer().setInputCol("sentence").setOutputCol("words")
    val wordsData = tokenizer.transform(sentenceData)

    sentenceData.show()
    //        +-----+--------------------+
    //        |label|            sentence|
    //        +-----+--------------------+
    //        |  0.0|Hi I heard about ...|
    //        |  0.0|I wish Java could...|
    //        |  1.0|Logistic regressi...|
    //        +-----+--------------------+

    wordsData.show()
    //        +-----+--------------------+--------------------+
    //        |label|            sentence|               words|
    //        +-----+--------------------+--------------------+
    //        |  0.0|Hi I heard about ...|[hi, i, heard, ab...|
    //        |  0.0|I wish Java could...|[i, wish, java, c...|
    //        |  1.0|Logistic regressi...|[logistic, regres...|
    //        +-----+--------------------+--------------------+

    val hashingTF = new HashingTF()
      .setInputCol("words").setOutputCol("rawFeatures").setNumFeatures(20)

    val featurizedData = hashingTF.transform(wordsData)
    // alternatively, CountVectorizer can also be used to get term frequency vectors
    featurizedData.show()
    //        +-----+--------------------+--------------------+--------------------+
    //        |label|            sentence|               words|         rawFeatures|
    //        +-----+--------------------+--------------------+--------------------+
    //        |  0.0|Hi I heard about ...|[hi, i, heard, ab...|(20,[0,5,9,17],[1.0,1.0,1.0,2.0])
    //        |  0.0|I wish Java could...|[i, wish, java, c...|(20,[2,7,9,13,15],[1.0,1.0,3.0,1.0,1.0])
    //        |  1.0|Logistic regressi...|[logistic, regres...|(20,[4,6,13,15,18],[1.0,1.0,1.0,1.0,1.0])
    //        +-----+--------------------+--------------------+--------------------+

    val idf = new IDF().setInputCol("rawFeatures").setOutputCol("features")
    val idfModel = idf.fit(featurizedData)
    featurizedData.show()
    //        +-----+--------------------+--------------------+--------------------+
    //        |label|            sentence|               words|         rawFeatures|
    //        +-----+--------------------+--------------------+--------------------+
    //        |  0.0|Hi I heard about ...|[hi, i, heard, ab...|(20,[0,5,9,17],[1.0,1.0,1.0,2.0])
    //        |  0.0|I wish Java could...|[i, wish, java, c...|(20,[2,7,9,13,15],[1.0,1.0,3.0,1.0,1.0])
    //        |  1.0|Logistic regressi...|[logistic, regres...|(20,[4,6,13,15,18],[1.0,1.0,1.0,1.0,1.0])
    //        +-----+--------------------+--------------------+--------------------+

    val rescaledData = idfModel.transform(featurizedData)
    rescaledData.select("label", "features").show()
    //        +-----+--------------------+
    //        |label|            features|
    //        +-----+--------------------+
    //        |  0.0|(20,[0,5,9,17],[0.6931471805599453,0.6931471805599453,0.28768207245178085,1.3862943611198906])
    //        |  0.0|(20,[2,7,9,13,15],[0.6931471805599453,0.6931471805599453,0.8630462173553426,0.28768207245178085,0.28768207245178085])
    //        |  1.0|(20,[4,6,13,15,18],[0.6931471805599453,0.6931471805599453,0.28768207245178085,0.28768207245178085,0.6931471805599453])
    //        +-----+--------------------+

    spark.stop()
  }


}