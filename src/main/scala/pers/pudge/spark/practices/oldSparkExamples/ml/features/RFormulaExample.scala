package pers.pudge.spark.practices.oldSparkExamples.ml.features

import org.apache.spark.ml.feature.RFormula
import org.apache.spark.sql.SparkSession

// https://github.com/endymecy/spark-ml-source-analysis/blob/master/%E7%89%B9%E5%BE%81%E6%8A%BD%E5%8F%96%E5%92%8C%E8%BD%AC%E6%8D%A2/RFormula.md

object RFormulaExample {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder
      .appName("RFormulaExample")
      .master("local[4]")
      .getOrCreate()

    // $example on$
    val dataset = spark.createDataFrame(Seq(
      (7, "US", 18, 1.0),
      (8, "CA", 12, 0.0),
      (9, "NZ", 15, 0.0)
    )).toDF("id", "country", "hour", "clicked")

    val formula = new RFormula()
      .setFormula("clicked ~ country + hour")
      .setFeaturesCol("features")
      .setLabelCol("label")

    val output = formula.fit(dataset).transform(dataset)
    output.select("features", "label").show(false)
    //        +--------------+-----+
    //        |features      |label|
    //        +--------------+-----+
    //        |[0.0,0.0,18.0]|1.0  |
    //        |[1.0,0.0,12.0]|0.0  |
    //        |[0.0,1.0,15.0]|0.0  |
    //        +--------------+-----+


    spark.stop()
  }
}