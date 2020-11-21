package pers.pudge.spark.practices.oldSparkExamples.basicRddCases.wordCount

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by pudgebd on 16-8-4.
  */
object RunWordCount {

  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("Spark Word Count")
      .setMaster("spark://localhost:7077")
      .setJars(List("/home/pudgebd/scala/ideaprojects/spark-study/out/artifacts/spark_study_jar/spark-study.jar"))

    val context = new SparkContext(conf)
    context.stop()
  }


}
