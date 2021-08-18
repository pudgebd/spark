package test

import org.apache.spark.sql.SparkSession

object LocalSpark {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder.appName("LocalSpark")
      .master("local[*]")
      .enableHiveSupport()
      .getOrCreate()

    val dbName = "bdp"
    spark.sql(s"CREATE DATABASE IF NOT EXISTS $dbName LOCATION 'hdfs://127.0.0.1:8020/user/hive/warehouse/bdp.db'").show()
    spark.sql(s"USE $dbName").show()

//    for (sql <- sqls) {
//      spark.sql(sql)
//    }
//    spark.sql("select count(1) from MyHiveDimTable").show()

    //测试修改执行计划
    //    spark.sql("select * from MyHiveDimTable where substring(dt, 9, 2) = '16'").show()
//    spark.sql("select * from MyHiveDimTable where dt in ('2020-11-16')").show()
    //    spark.sql("select substring(dt, 9, 2) from MyHiveDimTable").show()
  }

  val sqls = Seq(
    s"""
       |CREATE TABLE MyHiveDimTable (
       |    channel STRING,
       |    name STRING
       |) PARTITIONED BY (dt String) STORED AS parquet
       """.stripMargin,

    s"""
       |insert into MyHiveDimTable partition(dt='2020-11-16') values ('p1', 'hvie_a16'), ('p2', 'hive_b16')
     """.stripMargin,

    s"""
       |insert into MyHiveDimTable partition(dt='2020-11-17') values  ('p1', 'hive_a17'), ('p2', 'hive_b17')
     """.stripMargin,

    s"""
       |insert into MyHiveDimTable partition(dt='2020-11-18') values  ('p1', 'hive_a18'), ('p2', 'hive_b18')
     """.stripMargin
  )

}
