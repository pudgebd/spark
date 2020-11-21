package pers.pudge.spark.practices.officialApi.d.dataSkew

import org.apache.spark.sql.SparkSession
import pers.pudge.spark.practices.entities.User
import pers.pudge.spark.practices.officialApi.d.dataSkew.AddHiveRightTables.T_XW_RIGHT
import pers.pudge.spark.practices.officialApi.d.dataSkew.AddHiveTablesForSkew.T_5WW_SKEW_4WW
import pers.pudge.spark.practices.officialApi.d.dataSkew.JoinRDDAndCartesian.{addPrefix, addPrefixForId, cartesian, partiNum}
import pers.pudge.spark.practices.utils.constants.{Key, MT}

object JoinAndCartesianAndSplit2 {

  val T_LEFT = "t_left"
  val T_LEFT_SAMPLE = "t_left_sample"

  def main(args: Array[String]): Unit = {
    val beginMs = System.currentTimeMillis()
    val spark = SparkSession.builder()
      .appName("JoinSql&RDDAndCartesianAndSplit2")
      //.master(MT.LOCAL_MASTER)
      .getOrCreate()

    import spark.implicits._

    val leftDF = spark.read.parquet(MT.HIVE_WARE + T_5WW_SKEW_4WW).as[User]
    leftDF.createOrReplaceTempView(T_LEFT)
    leftDF.sample(false, 0.0001).createOrReplaceTempView(T_LEFT_SAMPLE) //有了这步，执行sql就不需要对 df cache

    val skewIdDF = spark.sql(s"select id from $T_LEFT_SAMPLE group by id having count(id) > 100")
    val skewKeys = skewIdDF.map(_.getLong(0)).collect()
    val inCondi = skewKeys.mkString("(", ",", ")")

    //计算倾斜占比
    //val skewDataSize = spark.sql(s"select count(*) as skew from $T_LEFT_SAMPLE where id in $inCondi")
    //.first().getLong(0).toDouble
    //val totalDataSize = spark.sql(s"select count(*) as skew from $T_LEFT_SAMPLE")
    //.first().getLong(0).toDouble
    //println(skewDataSize / totalDataSize)
    //println(s"spend ${System.currentTimeMillis() - beginMs} ms") //27410

    val leftSkewDS = spark.sql(s"select * from $T_LEFT where id in $inCondi").as[User]
    val leftRestDS = spark.sql(s"select * from $T_LEFT where id not in $inCondi").as[User]

    val leftSkewRDD = leftSkewDS.rdd.keyBy(u => addPrefixForId(u.id))

    val rightDS = spark.read.parquet(MT.HIVE_WARE + T_XW_RIGHT).as[User].cache()
    val rightCartRDD = rightDS.rdd.keyBy(_.id).flatMap(tp => {
      for (i <- 0 until cartesian) yield (addPrefix(i, tp._1), tp._2)
    })

    //最快 4.7 min
    val skewCounts = leftSkewRDD.leftOuterJoin(rightCartRDD, partiNum).keys.count()
    val restCounts = leftRestDS.join(rightDS, Seq(Key.ID), Key.LEFTOUTER).count()

    println("------------------------------")
    println(skewCounts + restCounts) //499600000
    println("------------------------------")

    spark.stop()
  }

}
