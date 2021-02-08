package test

import org.apache.spark.sql.SparkSession
import org.apache.spark.storage.StorageLevel

object LocalSpark {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder.appName("LocalSpark")
      .master("local[*]")
      .enableHiveSupport()
      .getOrCreate()

    spark.sql("show create table ods_kafka.from_kafka_source")
      .unpersist()
//    spark.sql("drop table ods_kafka.from_kafka_source")
//    val sql =
//      s"""
//         |CREATE TABLE ods_kafka.from_kafka_source (
//         | id long,
//         | first STRING
//         |) stored as parquet
//       """.stripMargin
//    spark.sql(sql)
//    spark.sql("insert into ods_kafka.from_kafka_source values (1, 'a')")
//    spark.sql("select * from ods_kafka.from_kafka_source").show()
  }

}
