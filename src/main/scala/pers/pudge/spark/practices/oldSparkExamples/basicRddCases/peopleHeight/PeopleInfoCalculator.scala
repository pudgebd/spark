package pers.pudge.spark.practices.oldSparkExamples.basicRddCases.peopleHeight

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by pudgebd on 16-8-4.
  */
object PeopleInfoCalculator {

  val parseLine = (line: String) => {
    val arr = line.split(" ")
    arr(1) + " " + arr(2)
  }

  def main(args: Array[String]) {
    if (args.length < 1) {
      println("Usage:PeopleInfoCalculator datafile")
      System.exit(1)
    }

    val conf = new SparkConf().setAppName("Spark Exercise:People Info(Gender & Height) Calculator")
    val sc = new SparkContext(conf)
    val dataFile = sc.textFile(args(0));

    val maleData = dataFile.filter(line => line.contains("M")).map(parseLine)
    val femaleData = dataFile.filter(line => line.contains("F")).map(parseLine)

    val maleHeightData = maleData.map(line => line.split(" ")(1).toInt)
    val femaleHeightData = femaleData.map(line => line.split(" ")(1).toInt)

    //        maleHeightData.foreach(println(_))
    val lowestMale = maleHeightData.sortBy(x => x, true).first()
    val lowestFemale = femaleHeightData.sortBy(x => x, true).first()
    val highestMale = maleHeightData.sortBy(x => x, false).first()
    val highestFemale = femaleHeightData.sortBy(x => x, false).first()

    println("------------------------------------------------------------------------")
    println("------------------------------------------------------------------------")
    println("------------------------------------------------------------------------")
    println("Number of Male Peole:" + maleData.count())
    println("Number of Female Peole:" + femaleData.count())
    println("Lowest Male:" + lowestMale)
    println("Lowest Female:" + lowestFemale)
    println("Highest Male:" + highestMale)
    println("Highest Female:" + highestFemale)
  }

}