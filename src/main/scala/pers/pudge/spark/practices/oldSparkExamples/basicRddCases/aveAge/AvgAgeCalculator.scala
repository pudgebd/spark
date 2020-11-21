package pers.pudge.spark.practices.oldSparkExamples.basicRddCases.aveAge

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by pudgebd on 16-8-3.
  */
object AvgAgeCalculator {

  def main(args: Array[String]) {
    if (args.isEmpty) {
      println("Usage:AvgAgeCalculator datafile")
      System.exit(1)
    }

    val conf = new SparkConf().setAppName("Spark Exercise:Average Age Calculator")
    val sc = new SparkContext(conf)
    val dataFile = sc.textFile(args(0), 5)
    val count = dataFile.count()
    val ageData = dataFile.map(line => line.split(" ")(1))
    val totalAgeMap = ageData.map(age => age.toInt)
    val totalAgeArr = totalAgeMap.collect()
    val totalAge = totalAgeArr.reduce((a, b) => a + b)

    println("Total Age:" + totalAge + ";Number of People:" + count)
    val avgAge: Double = totalAge.toDouble / count.toDouble
    println("Average Age is " + avgAge)
    println("finished")
  }

}
