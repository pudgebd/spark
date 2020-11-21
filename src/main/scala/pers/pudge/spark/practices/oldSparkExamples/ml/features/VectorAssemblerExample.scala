package pers.pudge.spark.practices.oldSparkExamples.ml.features

import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.linalg.Vectors
import org.apache.spark.sql.SparkSession


object VectorAssemblerExample {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder
      .appName("VectorAssemblerExample")
      .master("local[4]")
      .getOrCreate()

    val dataset = spark.createDataFrame(
      Seq((0, 18, 1.0, Vectors.dense(0.0, 10.0, 0.5), 1.0))
    ).toDF("id", "hour", "mobile", "userFeatures", "clicked")

    val assembler = new VectorAssembler()
      .setInputCols(Array("hour", "mobile", "userFeatures"))
      .setOutputCol("features")

    val output = assembler.transform(dataset)
    println("Assembled columns 'hour', 'mobile', 'userFeatures' to vector column 'features'")
    output.select("features", "clicked").show(10, false)

    spark.stop()
  }
}