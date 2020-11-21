package pers.pudge.spark.practices.sparkSql.t

import java.io.{BufferedWriter, FileWriter}

import org.apache.spark.sql.{Row, SparkSession}

import scala.collection.mutable.StringBuilder

object TextSparkContext01 {

  val tmpDir = "/home/pudgebd/tmp/"

  def main(args: Array[String]) {
    val ss = SparkSession.builder().appName("Spark SQL Example")
      .config("spark.some.config.option", "some-value").getOrCreate()
    import ss.implicits._

    val peopleDF = ss.sparkContext.textFile("src/main/resources/json/name_age.txt")
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
