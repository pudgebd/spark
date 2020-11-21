package pers.pudge.spark.practices.officialApi.d.dataSkew

import org.apache.spark.sql.SparkSession
import pers.pudge.spark.practices.entities.User
import pers.pudge.spark.practices.officialApi.d.dataSkew.AddHiveTablesForSkew.T_5WW_SKEW_4WW
import pers.pudge.spark.practices.utils.constants.MT


object JoinAndCartesianAndSplit {


  def main(args: Array[String]): Unit = {
    val beginMs = System.currentTimeMillis()
    val spark = SparkSession.builder()
      .appName("JoinRDDAndCartesian")
      .master(MT.LOCAL_MASTER)
      .getOrCreate()

    import spark.implicits._

    val leftDF = spark.read.parquet(MT.HIVE_WARE + T_5WW_SKEW_4WW).as[User]

    val sampleDS = leftDF.sample(false, 0.0001).cache()
    val keyCountsDS = sampleDS.groupByKey(_.id).flatMapGroups((id, it) => Seq(id -> it.length))
    val skewDS = keyCountsDS.filter($"_2" > 100).cache() //样本中就算倾斜的key对应的数据也不会太多
    val skewKeys = skewDS.map(_._1).collect()

    val skewDataSize = skewDS.reduce((tp1, tp2) => 1L -> (tp1._2 + tp2._2))._2.toDouble
    val totalDataSize = sampleDS.count().toDouble

    println(skewDataSize / totalDataSize)
    println(s"spend ${System.currentTimeMillis() - beginMs} ms") //45226
    //        val leftRDD = leftDF.rdd.keyBy(u => addPrefixForId(u.id))

    //        val rightRDD = spark.read.parquet(MT.HIVE_WARE + T_10W_RIGHT).as[User].rdd.keyBy(_.id).flatMap(tp => {
    //            for (i <- 0 until cartesian) yield (addPrefix(i, tp._1), tp._2)
    //        })

    //最快 4.6 min - 399700018
    //        val res = leftRDD.join(rightRDD, partiNum).keys

    println("------------------------------")
    //        println(res.count())
    println("------------------------------")

    spark.stop()
  }


}
