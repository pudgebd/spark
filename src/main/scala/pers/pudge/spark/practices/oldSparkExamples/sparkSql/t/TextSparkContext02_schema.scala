package pers.pudge.spark.practices.sparkSql.t

import java.io.{BufferedWriter, FileWriter}

import org.apache.spark.sql.types.{StringType, StructField, StructType}
import org.apache.spark.sql.{Row, SparkSession}

import scala.collection.mutable.StringBuilder

object TextSparkContext02_schema {

  val tmpDir = "/home/pudgebd/tmp/"

  def main(args: Array[String]) {
    val ss = SparkSession.builder().appName("Spark SQL Example")
      .master("local[4]").getOrCreate()

    // Create an RDD
    val peopleRDD = ss.sparkContext.textFile("src/main/resources/text/name_age.txt")

    // The schema is encoded in a string
    val schemaStr = "name age"

    // Generate the schema based on the string of schema
    val fields = schemaStr.split(" ")
      .map(fieldName => StructField(fieldName, StringType, nullable = true))
    val schema = StructType(fields)

    // Convert records of the RDD (people) to Rows
    val rowRDD = peopleRDD
      .map(_.split(" "))
      .map(attr => Row(attr(0), attr(1).trim))

    // Apply the schema to the RDD
    val peopleDF = ss.createDataFrame(rowRDD, schema)
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

}
