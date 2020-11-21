package pers.pudge.spark.practices.sparkSql

import org.apache.spark.sql.SparkSession

/**
  * Created by pudgebd on 16-9-19.
  */
object SQLDataSourceExample {


  def main(args: Array[String]) {
    val spark = SparkSession
      .builder()
      .appName("Spark SQL data sources example")
      .master("local[4]")
      .getOrCreate()

    //        runBasicDataSourceExample(spark)
    //        runBasicParquetExample(spark)
    //        runParquetSchemaMergingExample(spark)
    //        runJsonDatasetExample(spark)
    runJdbcDatasetExample(spark)

    spark.stop()
  }

  private def runJdbcDatasetExample(spark: SparkSession): Unit = {
    // $example on:jdbc_dataset$
    val jdbcDF = spark.read
      .format("jdbc")
      .option("url", "jdbc:mysql://localhost:3306/study?useUnicode=true&amp;autoReconnect=true&amp;characterEncoding=UTF-8")
      .option("dbtable", "people")
      .option("user", "root")
      .option("password", "shinemo123")
      .load()
    //$example off:jdbc_dataset$

    jdbcDF.select("name").collect().foreach(println)

    //        val jdbcDF = spark.read.format("jdbc").options(
    //            Map("url" -> "jdbc:postgresql:dbserver",
    //                "dbtable" -> "schema.tablename")).load()

    println("")
  }

  private def runBasicDataSourceExample(spark: SparkSession): Unit = {
    // $example on:generic_load_save_functions$
    val usersDF = spark.read.load("src/main/resources/parquet/users.parquet")
    usersDF.select("name", "favorite_color").write.save("/home/pudgebd/tmp/spark/namesAndFavColors.parquet")

    // $example off:generic_load_save_functions$
    // $example on:manual_load_options$
    val peopleDF = spark.read.json("src/main/resources/json/people.json")
    peopleDF.select("name", "age").write.parquet("/home/pudgebd/tmp/spark/namesAndAges.parquet")

    // $example off:manual_load_options$
    // $example on:direct_sql$
    val sqlDF = spark.sql("SELECT * FROM parquet.`src/main/resources/parquet/users.parquet`")
    // $example off:direct_sql$
  }


  private def runBasicParquetExample(spark: SparkSession): Unit = {
    // $example on:basic_parquet_example$
    // Encoders for most common types are automatically provided by importing spark.implicits._
    import spark.implicits._

    val peopleDF = spark.read.json("src/main/resources/json/people.json")

    val peoplePqPath = "/home/pudgebd/tmp/spark/people.parquet"
    peopleDF.write.parquet(peoplePqPath)

    // Read in the parquet file created above
    // Parquet files are self-describing so the schema is preserved
    // The result of loading a Parquet file is also a DataFrame
    val peopleParquetDF = spark.read.parquet(peoplePqPath)

    // Parquet files can also be used to create a temporary view and then used in SQL statements
    peopleParquetDF.createOrReplaceTempView("peopleParquet")

    val namesDF = spark.sql("SELECT name FROM peopleParquet WHERE age BETWEEN 13 AND 19")
    namesDF.map(attributes => "Name: " + attributes(0)).show()
    // +------------+
    // |       value|
    // +------------+
    // |Name: Justin|
    // +------------+
    // $example off:basic_parquet_example$
    println(" ")
  }


  private def runParquetSchemaMergingExample(spark: SparkSession): Unit = {
    // $example on:schema_merging$
    // This is used to implicitly convert an RDD to a DataFrame.
    import spark.implicits._

    // Create a simple DataFrame, store into a partition directory
    val squaresDF = spark.sparkContext.makeRDD(1 to 5).map(i => (i, i * i)).toDF
    squaresDF.write.parquet("data/test_table/key=1")

    // Create another DataFrame in a new partition directory,
    // adding a new column and dropping an existing column
    val cubesDF = spark.sparkContext.makeRDD(6 to 10).map(i => (i, i * i * i)).toDF("value", "cube")
    cubesDF.write.parquet("data/test_table/key=2")

    // Read the partitioned table
    val mergedDF = spark.read.option("mergeSchema", "true").parquet("data/test_table")
    mergedDF.printSchema()

    // The final schema consists of all 3 columns in the Parquet files together
    // with the partitioning column appeared in the partition directory paths
    // root
    //  |-- value: int (nullable = true)
    //  |-- square: int (nullable = true)
    //  |-- cube: int (nullable = true)
    //  |-- key: int (nullable = true)
    // $example off:schema_merging$
  }


  private def runJsonDatasetExample(spark: SparkSession): Unit = {
    // $example on:json_dataset$
    // A JSON dataset is pointed to by path.
    // The path can be either a single text file or a directory storing text files
    val peopleJsonPath = "src/main/resources/json/people.json"
    val peopleDF = spark.read.json(peopleJsonPath)

    // The inferred schema can be visualized using the printSchema() method
    peopleDF.printSchema()
    // root
    //  |-- age: long (nullable = true)
    //  |-- name: string (nullable = true)

    // Creates a temporary view using the DataFrame
    peopleDF.createOrReplaceTempView("people")

    val teenagerNamesDF = spark.sql("SELECT name FROM people WHERE age BETWEEN 13 AND 19")
    teenagerNamesDF.show()
    // +------+
    // |  name|
    // +------+
    // |Justin|
    // +------+


    // Alternatively, a DataFrame can be created for a JSON dataset represented by
    // an RDD[String] storing one JSON object per string
    val otherPeopleRDD = spark.sparkContext.makeRDD(
      """{"name":"Yin","address":{"city":"Columbus","state":"Ohio"}}""" :: Nil)
    val otherPeople = spark.read.json(otherPeopleRDD)
    otherPeople.show()
    // +---------------+----+
    // |        address|name|
    // +---------------+----+
    // |[Columbus,Ohio]| Yin|
    // +---------------+----+
    // $example off:json_dataset$
  }

  case class Person(name: String, age: Long)

}
