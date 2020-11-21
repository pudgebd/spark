package pers.pudge.spark.practices.oldSparkExamples.basicRddCases.searchKey

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by pudgebd on 16-8-4.
  */
object TopKSearchKeyWords {

  def main(args: Array[String]) {
    if (args.length < 2) {
      println("Usage:TopKSearchKeyWords KeyWordsFile K");
      System.exit(1)
    }
    val conf = new SparkConf().setAppName("Spark Exercise:Top K Searching Key Words")
    val sc = new SparkContext(conf)
    val srcData = sc.textFile(args(0))

    val countedData = srcData.map(line => (line.toLowerCase(), 1)).reduceByKey((a, b) => a + b)
    val sortedData = countedData.map { case (k, v) => (v, k) }.sortByKey(false)
    val topKeyData = sortedData.take(10).map { case (v, k) => (k, v) }

    topKeyData.foreach(println)
  }

}
