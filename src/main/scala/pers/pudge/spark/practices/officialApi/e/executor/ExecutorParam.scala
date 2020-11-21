package pers.pudge.spark.practices.officialApi.e.executor

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

object ExecutorParam {


  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
      .setExecutorEnv("filePath", "xxx") //只是用来设置 Executor 的环境变量
      .setAppName("ExecutorParam")

    val ss = SparkSession.builder().config(conf)
      .getOrCreate()

    val rdd = ss.sparkContext.parallelize(1 to 1000, 100)

    rdd.foreach(ele => {
    })
  }


}
