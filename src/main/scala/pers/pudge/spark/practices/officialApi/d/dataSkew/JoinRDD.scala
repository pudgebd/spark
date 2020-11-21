package pers.pudge.spark.practices.officialApi.d.dataSkew

import org.apache.spark.Partitioner
import org.apache.spark.sql.SparkSession
import pers.pudge.spark.practices.entities.User
import pers.pudge.spark.practices.officialApi.d.dataSkew.AddHiveRightTables.T_XW_RIGHT
import pers.pudge.spark.practices.officialApi.d.dataSkew.AddHiveTablesForSkew.{SKEW_IDS, T_5WW_SKEW_4WW}
import pers.pudge.spark.practices.utils.constants.MT

object JoinRDD {


  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("JoinRDD")
      .getOrCreate()

    import spark.implicits._

    val leftRDD = spark.read.parquet(MT.HIVE_WARE + T_5WW_SKEW_4WW).as[User].rdd.keyBy(_.id)
    val rightRDD = spark.read.parquet(MT.HIVE_WARE + T_XW_RIGHT).as[User].rdd.keyBy(_.id)

    val numParti = 30 + SKEW_IDS.size * 2;
    //最快 5.5 min
    val res = leftRDD.join(rightRDD, new MyPartitioner(numParti)).keys
    //2994795
    //2997551
    //2990234
    //3002410

    //最快 5.4 min
    //        val res = leftRDD.leftOuterJoin(rightRDD, new MyPartitioner(numParti))

    //最快 5.5 min
    //        val res = leftRDD.rightOuterJoin(rightRDD, new MyPartitioner(numParti))

    //最快 1.2 min
    //        val res = rightRDD.reduceByKey(new MyPartitioner(numParti), (u1: User, u2: User) => u1)

    println("------------------------------")
    println(res.count())
    println("------------------------------")

    spark.stop()
  }


  class MyPartitioner(partitions: Int) extends Partitioner {

    val random = new java.util.Random()
    val skewIdsSize = SKEW_IDS.size
    val doubSkewIdsSize = skewIdsSize * 2
    val skewIdList = SKEW_IDS.toList

    override def numPartitions: Int = partitions

    override def getPartition(keyAny: Any): Int = keyAny match {
      case key: Long => {
        if (SKEW_IDS.contains(key)) {
          return ((key + random.nextInt(partitions)) % partitions).toInt

        } else {
          return (key % partitions).toInt
        }
      }
      case _ => 0
    }

  }

}
