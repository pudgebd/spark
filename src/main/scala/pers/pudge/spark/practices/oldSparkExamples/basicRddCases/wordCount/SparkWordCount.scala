package pers.pudge.spark.practices.oldSparkExamples.basicRddCases.wordCount

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by pudgebd on 16-8-3.
  */
object SparkWordCount {

  def main(args: Array[String]) {
    //        if (args.isEmpty) {
    //            println("Usage:SparkWordCount FileName")
    //            System.exit(1)
    //        }
    args(0) = "hdfs://localhost:9000/user/spark/practices/pudgebd_tmp.txt";
    println(args(0))

    val conf = new SparkConf().setAppName("Spark Exercise: Spark Version Word Count Program")
    val sc = new SparkContext(conf)
    val textFile = sc.textFile(args(0))

    val rdd1 = textFile.flatMap(line => line.split(" "))
    val rdd2 = rdd1.map(word => (word, 1))
    val wordCounts = rdd2.reduceByKey((a, b) => a + b)

    println("Word Count program running results:")
    wordCounts.collect().foreach(
      e => {
        val (k, v) = e
        println(k + "=" + v)
      }
    )

    wordCounts.saveAsTextFile(FILE_NAME + System.currentTimeMillis())
    println("Word Count program running results are successfully saved.")
  }

  def FILE_NAME: String = "word_count_results_"

}
