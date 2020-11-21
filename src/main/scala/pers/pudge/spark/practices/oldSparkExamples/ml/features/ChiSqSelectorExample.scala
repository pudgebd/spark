package pers.pudge.spark.practices.oldSparkExamples.ml.features

import org.apache.spark.ml.feature.ChiSqSelector
import org.apache.spark.ml.linalg.Vectors
import org.apache.spark.sql.SparkSession


object ChiSqSelectorExample {

  def main(args: Array[String]) {
    val spark = SparkSession
      .builder
      .appName("ChiSqSelectorExample")
      .master("local[4]")
      .getOrCreate()
    import spark.implicits._

    // $example on$
    val data = Seq(
      (7, Vectors.dense(0.0, 0.0, 18.0, 1.0), 1.0),
      (8, Vectors.dense(0.0, 1.0, 12.0, 0.0), 0.0),
      (9, Vectors.dense(1.0, 0.0, 15.0, 0.1), 0.0)
    )

    val df = spark.createDataset(data).toDF("id", "features", "clicked")

    val selector = new ChiSqSelector()
      .setNumTopFeatures(1) //点进去看说明
      .setFeaturesCol("features")
      .setLabelCol("clicked") //label 是干什么的？
      .setOutputCol("selectedFeatures")

    val result = selector.fit(df).transform(df)

    println(s"ChiSqSelector output with top ${selector.getNumTopFeatures} features selected")
    result.show(false)
    //        +---+------------------+-------+----------------+
    //        |id |features          |clicked|selectedFeatures|
    //        +---+------------------+-------+----------------+
    //        |7  |[0.0,0.0,18.0,1.0]|1.0    |[18.0]          |
    //        |8  |[0.0,1.0,12.0,0.0]|0.0    |[12.0]          |
    //        |9  |[1.0,0.0,15.0,0.1]|0.0    |[15.0]          |
    //        +---+------------------+-------+----------------+

    spark.stop()
  }


}
