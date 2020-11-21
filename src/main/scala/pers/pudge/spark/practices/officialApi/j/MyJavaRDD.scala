package pers.pudge.spark.practices.officialApi.j

import org.apache.spark.api.java.JavaRDD
import org.apache.spark.sql.SparkSession


object MyJavaRDD {


  def main(args: Array[String]) {
    val spark = SparkSession.builder().appName("asd").getOrCreate()
    import spark.implicits._

    implicit val mapEncoder = org.apache.spark.sql.Encoders.kryo[Person]

    val tmpRDD = spark.createDataset(
      List(new Person("k", 1), new Person("m", 2), new Person("j", 3))).rdd
    val javaRDD = new JavaRDD[Person](tmpRDD)
    val peopleDF = spark.createDataFrame(javaRDD, classOf[Person])

    peopleDF.createOrReplaceTempView("people")

    peopleDF.select($"name", $"age" + 1).where($"age" > 1).orderBy("name").show()

    print()
    spark.stop()
  }
}
