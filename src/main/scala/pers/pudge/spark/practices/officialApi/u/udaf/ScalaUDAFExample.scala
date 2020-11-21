package pers.pudge.spark.practices.officialApi.u.udaf

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.{Row, SQLContext, SparkSession}
import org.apache.spark.sql.expressions.{MutableAggregationBuffer, UserDefinedAggregateFunction}
import org.apache.spark.sql.types.{DataType, DoubleType, LongType, StructType}
import pers.pudge.spark.practices.utils.constants.{Key, MT}

object ScalaUDAFExample {

  private class SumProductAggregateFunction extends UserDefinedAggregateFunction {

    override def inputSchema: StructType =
      new StructType().add("price", DoubleType).add("quantity", LongType)

    override def bufferSchema: StructType =
      new StructType().add("total", DoubleType)

    override def dataType: DataType = DoubleType

    // true: our UDAF's output given an input is deterministic(确定性; 确定的; 决定性的)
    override def deterministic: Boolean = true

    override def initialize(buffer: MutableAggregationBuffer): Unit = {
      buffer.update(0, 0.0)           // Initialize the result to 0.0
    }

    override def update(buffer: MutableAggregationBuffer, input: Row): Unit = {
      val sum   = buffer.getDouble(0) // Intermediate result to be updated
      val price = input.getDouble(0)  // First input parameter
      val qty   = input.getLong(1)    // Second input parameter
      buffer.update(0, sum + (price * qty))   // Update the intermediate result
    }

    override def merge(buffer1: MutableAggregationBuffer, buffer2: Row): Unit = {
      buffer1.update(0, buffer1.getDouble(0) + buffer2.getDouble(0))
    }

    override def evaluate(buffer: Row): Any = {
      buffer.getDouble(0)
    }
  }

  def main (args: Array[String]) {
    val spark = SparkSession.builder()
      .master("local[*]")
      .appName("ScalaUDAFExample")
      .enableHiveSupport()
      .config(Key.SPARK_SQL_WAREHOUSE_DIR, MT.HIVE_WARE)
      .getOrCreate()

    // /Users/pudgebd/scala/ideaprojects/spark_s/
    val testDF = spark.read
      .option("timestampFormat", "yyyy/MM/dd HH:mm:ss ZZ")
      .json("src/main/resources/json/inventory.json")

    testDF.createOrReplaceTempView("inventory")
    spark.udf.register("SUMPRODUCT", new SumProductAggregateFunction)

    spark.sql("SELECT Make, SUMPRODUCT(RetailValue,Stock) as InventoryValuePerMake FROM inventory GROUP BY Make").show()
  }

}
