package pers.pudge.spark.practices.officialApi.d.dataSkew

import java.util

import org.apache.spark.sql.{SaveMode, SparkSession}
import pers.pudge.spark.practices.entities.{Company, User}
import pers.pudge.spark.practices.utils.constants.{Key, MT}

import scala.collection.mutable.ArrayBuffer

object AddHiveTablesForSkew {

  val T_5WW_SKEW_4WW = "t_5ww_skew_4ww"
  val SKEW_IDS = Set(11L, 111L, 1111L, 11111L, 1111111L, 11111111L)
    .flatMap(i => for (j <- 1L to 9L) yield i * j)
  val random = new util.Random()
  private val ID_TOTAL_BATCH = 100000
  private val ID_BATCH_SIZE = 1000
  private val PARTITION_COUNTS = 100
  private val SINGLE_SKEW_COUNTS = 7400000

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName(T_5WW_SKEW_4WW)
      .config(Key.SPARK_SQL_WAREHOUSE_DIR, MT.HIVE_WARE)
      .enableHiveSupport().getOrCreate()
    import spark.implicits._

    spark.createDataset(1 to ID_TOTAL_BATCH).repartition(PARTITION_COUNTS)
      .flatMap(mapIdToUser _).write.mode(SaveMode.Overwrite)
      .save(MT.HIVE_WARE + T_5WW_SKEW_4WW)

    spark.createDataset(SKEW_IDS.toSeq).repartition(SKEW_IDS.size)
      .flatMap(mapIdToSkewUser _).write.mode(SaveMode.Append)
      .save(MT.HIVE_WARE + T_5WW_SKEW_4WW)

    spark.stop()
  }


  def mapIdToUser(batchIdx: Int): ArrayBuffer[User] = {
    val idStart = (batchIdx - 1) * ID_BATCH_SIZE + 1
    val idEnd = batchIdx * ID_BATCH_SIZE
    var ab = new ArrayBuffer[User](ID_BATCH_SIZE)

    for (i <- idStart to idEnd) {
      ab += crtNewUser(i)
    }
    return ab
  }

  def mapIdToSkewUser(skewId: Long): ArrayBuffer[User] = {
    var ab = new ArrayBuffer[User](SINGLE_SKEW_COUNTS)
    for (j <- 1 to SINGLE_SKEW_COUNTS) {
      ab += crtNewUser(skewId)
    }
    return ab
  }

  def crtNewUser(i: Long): User = User(i, i + "n", random.nextInt(14400000))

  def crtNewCompany(i: Long): Company = Company(i + "n", i + "a")

}
