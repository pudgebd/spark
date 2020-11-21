package pers.pudge.spark.practices.officialApi.s

import org.apache.spark.sql.types.{StringType, StructField, StructType}
import org.apache.spark.sql.{Row, SparkSession}

/**
  * Created by pudgebd on 16-9-23.
  */
object schema {

  def main(args: Array[String]) {
    val spark = SparkSession.builder().appName("schema").master("local[4]").getOrCreate()
    val peopleRDD = spark.sparkContext.textFile("src/main/resources/text/name_age.txt")
    //        implicit val mapEncoder = org.apache.spark.sql.Encoders.kryo[Row]

    val rowRDD = peopleRDD
      .map(_.split(" "))
      .map(att => Row(att(0), att(1).trim))

    val schemaStr = "name age"
    val fields = schemaStr.split(" ")
      .map(fieldName => StructField(fieldName, StringType, nullable = true))
    val schema = StructType(fields)

    val peopleDF = spark.createDataFrame(rowRDD, schema)
    peopleDF.createOrReplaceTempView("people")
    spark.sql("select * from people").show()
    print()
  }


}
