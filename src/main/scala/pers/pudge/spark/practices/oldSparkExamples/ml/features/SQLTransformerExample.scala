package pers.pudge.spark.practices.oldSparkExamples.ml.features

import org.apache.spark.ml.feature.SQLTransformer
// $example off$
import org.apache.spark.sql.SparkSession

object SQLTransformerExample {
  def main(args: Array[String]) {
    val spark = SparkSession
      .builder
      .appName("SQLTransformerExample")
      .master("local[4]")
      .getOrCreate()

    val df = spark.createDataFrame(
      Seq((0, 1.0, 3.0), (2, 2.0, 5.0))).toDF("id", "v1", "v2")

    val sqlTrans = new SQLTransformer().setStatement(
      "SELECT *, (v1 + v2) AS v3, (v1 * v2) AS v4 FROM __THIS__")

    sqlTrans.transform(df).show(10, false)
    //        +---+---+---+---+----+
    //        |id |v1 |v2 |v3 |v4  |
    //        +---+---+---+---+----+
    //        |0  |1.0|3.0|4.0|3.0 |
    //        |2  |2.0|5.0|7.0|10.0|
    //        +---+---+---+---+----+

    spark.stop()
  }

}