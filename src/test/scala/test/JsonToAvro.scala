package test

import org.apache.spark.sql.SparkSession

object JsonToAvro {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder.appName("LocalSpark")
      .master("local[*]")
      .getOrCreate()

//    spark.read.json("file:///Users/chenqian/work_doc/sqls/flink_sql/debugsql/test_debug_sql_input_data.json")
//      .write.format()
    //      .printSchema()
    //.show()
  }


}
