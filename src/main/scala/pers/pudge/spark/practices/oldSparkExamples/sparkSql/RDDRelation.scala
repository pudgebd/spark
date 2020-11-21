package pers.pudge.spark.practices.sparkSql

import org.apache.spark.sql.SaveMode
// $example on:init_session$
import org.apache.spark.sql.SparkSession
// $example off:init_session$

// One method for defining the schema of an RDD is to make a case class with the desired column
// names and types.


object RDDRelation {

  def main(args: Array[String]) {
    val spark = SparkSession.builder().master("local[4]")
      .config("spark.sql.warehouse.dir", "file:///D:/scala/ideaprojects/spark-study/spark-warehouse")
      .appName("RDDRelation").getOrCreate()

    val df = spark.createDataFrame((1 to 100).map(i => Record(i, s"val_$i")))
    df.createOrReplaceTempView("records")

    // Once tables have been registered, you can run SQL queries over them.
    println("Result of SELECT *:")
    spark.sql("select * from records").collect().foreach(println)

    // Aggregation queries are also supported.
    val count = spark.sql("select count(*) from records").collect()(0).getLong(0)
    println(s"count(*) is $count")

    // The results of SQL queries are themselves RDDs and support all normal RDD functions. The
    // items in the RDD are of typee Row, which allows you to access each column by ordinal.
    val rddFromSql = spark.sql("SELECT key, value FROM records WHERE key < 10")

    println("Result of RDD.map:")
    rddFromSql.rdd.map(row => s"Key: ${row(0)}, Value: ${row(1)}").collect().foreach(println)

    // Queries can also be written using a LINQ-like Scala DSL.
    //        df.where($"key" === 1).orderBy($"value".asc).select($"key").collect().foreach(println)

    // Write out an RDD as a parquet file with overwrite mode.
    df.write.mode(SaveMode.Overwrite).parquet("pair.parquet")

    // Read in parquet file.  Parquet files are self-describing so the schema is preserved.
    val parquetFile = spark.read.parquet("pair.parquet")

    // Queries can be run using the DSL on parquet files just like the original RDD.
    //        parquetFile.where($"key" === 1).select($"value".as("a")).collect().foreach(println)


    // These files can also be used to create a temporary view.
    parquetFile.createOrReplaceTempView("parquetFile")
    spark.sql("SELECT * FROM parquetFile").collect().foreach(println)

    spark.stop()
  }

  case class Record(key: Int, value: String)


}
