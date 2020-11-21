package pers.pudge.spark.practices.oldSparkExamples.ml.features

import java.util.Arrays

import org.apache.spark.ml.attribute.{Attribute, AttributeGroup, NumericAttribute}
import org.apache.spark.ml.feature.VectorSlicer
import org.apache.spark.ml.linalg.Vectors
import org.apache.spark.sql.types.StructType
import org.apache.spark.sql.{Row, SparkSession}


// https://github.com/endymecy/spark-ml-source-analysis/blob/master/%E7%89%B9%E5%BE%81%E6%8A%BD%E5%8F%96%E5%92%8C%E8%BD%AC%E6%8D%A2/VectorSlicer.md

object VectorSlicerExample {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder
      .appName("VectorSlicerExample")
      .master("local[4]")
      .getOrCreate()

    val data = Arrays.asList(
      Row(Vectors.sparse(3, Seq((0, -2.0), (1, 2.3)))),
      Row(Vectors.dense(-2.0, 2.3, 0.0))
    )

    val defaultAttr = NumericAttribute.defaultAttr
    val attrs = Array("f1", "f2", "f3").map(defaultAttr.withName)
    val attrGroup = new AttributeGroup("userFeatures", attrs.asInstanceOf[Array[Attribute]])

    val dataset = spark.createDataFrame(data, StructType(Array(attrGroup.toStructField())))

    val slicer = new VectorSlicer().setInputCol("userFeatures").setOutputCol("features")

    slicer.setIndices(Array(1)).setNames(Array("f3"))
    // or slicer.setIndices(Array(1, 2)), or slicer.setNames(Array("f2", "f3"))

    val output = slicer.transform(dataset)
    output.show(false)
    //        +--------------------+-------------+
    //        |userFeatures        |features     |
    //        +--------------------+-------------+
    //        |(3,[0,1],[-2.0,2.3])|(2,[0],[2.3])|
    //        |[-2.0,2.3,0.0]      |[2.3,0.0]    |
    //        +--------------------+-------------+

    spark.stop()
  }
}