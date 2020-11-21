package pers.pudge.spark.practices.officialApi.d.dataSkew

import org.apache.spark.sql.SparkSession
import pers.pudge.spark.practices.entities.User
import pers.pudge.spark.practices.officialApi.d.dataSkew.AddHiveRightTables.T_XW_RIGHT
import pers.pudge.spark.practices.officialApi.d.dataSkew.AddHiveTablesForSkew.T_5WW_SKEW_4WW
import pers.pudge.spark.practices.utils.constants.MT


object JoinRDDAndCartesian {

  val random = new java.util.Random()
  val partiNum = 24 * 20
  val cartesian = 100

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("JoinRDDAndCartesian")
      .getOrCreate()

    import spark.implicits._

    val leftRDD = spark.read.parquet(MT.HIVE_WARE + T_5WW_SKEW_4WW).as[User].rdd.keyBy(u => addPrefixForId(u.id))
    val rightRDD = spark.read.parquet(MT.HIVE_WARE + T_XW_RIGHT).as[User].rdd.keyBy(_.id).flatMap(tp => {
      for (i <- 0 until cartesian) yield (addPrefix(i, tp._1), tp._2)
    })

    //最快 4.6 min - 499600000
    val res = leftRDD.leftOuterJoin(rightRDD, partiNum).keys

    println("------------------------------")
    println(res.count())
    println("------------------------------")

    spark.stop()
  }


  def addPrefixForId(id: Long): String = {
    return addPrefix(random.nextInt(cartesian), id)
  }

  def addPrefix(prefix: Int, id: Long): String = {
    return s"${prefix}_$id"
  }


}
