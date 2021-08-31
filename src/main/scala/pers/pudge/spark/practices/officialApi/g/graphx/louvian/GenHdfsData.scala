package pers.pudge.spark.practices.officialApi.g.graphx.louvian

import org.apache.spark.sql.{SaveMode, SparkSession}
import pers.pudge.spark.practices.utils.constants.MT

import scala.collection.mutable.ArrayBuffer

object GenHdfsData {

  val EDGE_TEST_DATA_PATH = "hdfs://cdh601:8020/user/chenqian/test/data/edges.txt"

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("GenHdfsData")
      .master(MT.LOCAL_MASTER)
      .getOrCreate()
    import spark.implicits._

    val rand = new util.Random()
    val ab = new ArrayBuffer[String]()
    for (idx <- 0 until 100) {
      ab += rand.nextInt(10).toString + "," + rand.nextInt(10).toString
    }
    val df = spark.createDataset(ab)

    df.coalesce(1)
      .write.mode(SaveMode.Overwrite)
      .text(EDGE_TEST_DATA_PATH)
  }

}
