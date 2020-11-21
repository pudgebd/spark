package pers.pudge.spark.practices.officialApi.c

import java.io.{BufferedWriter, FileWriter}

import org.apache.spark.sql.{Row, SparkSession}

import scala.collection.mutable.StringBuilder


object CaseClassDealText {

  val tmpDir = "/home/pudgebd/tmp/"

  //    val tmpDir = "D:\\tmp\\"

  def main(args: Array[String]) {
    val ss = SparkSession.builder().appName("Spark SQL Example")
      .master("local[4]").getOrCreate()
    import ss.implicits._

    val sc = ss.sparkContext
    sc.setLogLevel("OFF")
    val peopleDF = sc.textFile("src/main/resources/text/name_age.txt")
      .map(_.split(" "))
      .map(attr => Person(attr(0), attr(1).toInt))
      .toDF()

    peopleDF.createOrReplaceTempView("people")

    val burdenDF = ss.sql("SELECT name, age FROM people WHERE age BETWEEN 28 AND 30");
    val sb = new StringBuilder
    burdenDF.collect().foreach(writeAllFields(_, sb))

    val writer = new BufferedWriter(new FileWriter(tmpDir + "people.txt"));
    writer.write(sb.toString())
    writer.flush()
    writer.close()
  }

  def writeAllFields(row: Row, sb: StringBuilder): Unit = {
    val line = row.mkString(",")
    sb.append(line).append("\r\n")
  }

  case class Person(name: String, age: Long)

}
