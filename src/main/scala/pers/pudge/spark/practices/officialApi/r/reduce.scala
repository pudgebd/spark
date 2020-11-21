package pers.pudge.spark.practices.officialApi.r

import org.apache.spark.sql.SparkSession

object reduce {


  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .master("local[4]").appName("dataSetOrFrame").getOrCreate()

    val rdd = spark.sparkContext.parallelize(1 to 10)
    //        rdd.agg

  }

}
