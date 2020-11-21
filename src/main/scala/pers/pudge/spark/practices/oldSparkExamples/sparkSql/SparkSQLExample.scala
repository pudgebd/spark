package pers.pudge.spark.practices.sparkSql

// $example on:schema_inferring$
// $example off:schema_inferring$
import org.apache.spark.sql.Row
// $example on:init_session$
import org.apache.spark.sql.SparkSession
// $example off:init_session$
// $example on:programmatic_schema$
// $example on:data_types$
import org.apache.spark.sql.types._
// $example off:data_types$
// $example off:programmatic_schema$


object SparkSQLExample {

  def main(args: Array[String]) {
    // $example on:init_session$
    val spark = SparkSession
      .builder()
      .config("spark.sql.warehouse.dir", "file:///D:/scala/ideaprojects/spark-study/spark-warehouse")
      .appName("Spark SQL basic example")
      .master("local[4]")
      .getOrCreate()

    // For implicit conversions like converting RDDs to DataFrames
    // $example off:init_session$

    runBasicDataFrameExample(spark)
    //        runDatasetCreationExample(spark)
    //        runInferSchemaExample(spark)
    //        runProgrammaticSchemaExample(spark)

    spark.stop()
  }

  // $example off:create_ds$

  private def runBasicDataFrameExample(spark: SparkSession): Unit = {
    val df = spark.read.json("src/main/resources/json/people.json")

    import spark.implicits._

    df.printSchema()
    df.select($"name", $"age" + 1)

    df.filter($"age" > 21).show()

    df.select($"name", $"age" + 1).show()

    df.groupBy("age").count().show()

    df.createOrReplaceTempView("people")
    val sqlDF = spark.sql("SELECT * FROM people")
    sqlDF.show()
  }

  private def runDatasetCreationExample(spark: SparkSession): Unit = {
    import spark.implicits._

    val caseClassDs = Seq(Person("pudgebd", 27)).toDS()
    caseClassDs.show()

    // Encoders for most common types are automatically provided by importing spark.implicits._
    val primitiveDs = Seq(1, 2, 3).toDS()
    primitiveDs.map(_ + 1).collect()
  }

  private def runInferSchemaExample(spark: SparkSession): Unit = {
    // $example on:schema_inferring$
    // For implicit conversions from RDDs to DataFrames
    import spark.implicits._

    // Create an RDD of Person objects from a text file, convert it to a Dataframe
    val peopleDF = spark.read.textFile("src/main/resources/text/people.txt")
      .map(_.split(","))
      .map(att => Person(att(0), att(1).trim.toInt))
      .toDF()

    peopleDF.createOrReplaceTempView("people")

    spark.sql("select * from people").show()

    val teenagersDF = spark.sql("SELECT name, age FROM people WHERE age BETWEEN 13 AND 19")

    //results of the below lines are same
    teenagersDF.map(teenager => "name: " + teenager(0)).show()
    teenagersDF.map(teenager => "name: " + teenager.getString(0)).show()
    teenagersDF.map(teenager => "name: " + teenager.getAs[String]("name")).show()


    // No pre-defined encoders for Dataset[Map[K,V]], define explicitly
    implicit val mapEncoder = org.apache.spark.sql.Encoders.kryo[Map[String, Any]]
    // Primitive types and case classes can be also defined as
    // implicit val stringIntMapEncoder: Encoder[Map[String, Any]] = ExpressionEncoder()

    // row.getValuesMap[T] retrieves multiple columns at once into a Map[String, T]
    teenagersDF.map(teenager => teenager.getValuesMap[Any](List("name", "age"))).show()
    // Array(Map("name" -> "Justin", "age" -> 19))
    // $example off:schema_inferring$
    print()
  }

  private def runProgrammaticSchemaExample(spark: SparkSession): Unit = {
    import spark.implicits._
    // $example on:programmatic_schema$
    // Create an RDD
    val peopleRDD = spark.read.textFile("src/main/resources/text/people.txt")

    // The schema is encoded in a string
    val schemaStr = "name age"

    // Generate the schema based on the string of schema
    val fields = schemaStr.split(" ")
      .map(fieldName => StructField(fieldName, StringType, nullable = true))
    val schema = StructType(fields)

    implicit val mapEncoder = org.apache.spark.sql.Encoders.kryo[Row]

    val rowRDD = peopleRDD
      .map(_.split(","))
      .map(att => Row(att(0), att(1).trim)).rdd

    // Apply the schema to the RDD
    val peopleDF = spark.createDataFrame(rowRDD, schema)
    peopleDF.createOrReplaceTempView("people")
    peopleDF.select("select * from people").show()
    print()
  }

  // $example on:create_ds$
  // Note: Case classes in Scala 2.10 can support only up to 22 fields. To work around this limit,
  // you can use custom classes that implement the Product interface
  case class Person(name: String, age: Long)

}
