package pers.pudge.spark.practices.officialApi.a.aerospike

import com.aerospike.client.Value.StringValue
import com.aerospike.client.util.Crypto
import com.aerospike.client.{AerospikeClient, Key}
import org.apache.spark.sql.SparkSession
import pers.pudge.spark.practices.utils.constants.MT

object As {

  val APP_NAME = "as"

  /**
    * 通过 digest get
    */
  def main(args: Array[String]): Unit = {
    val client = new AerospikeClient("10.58.11.39", 3000)
    val key = new Key("ns1",
      Crypto.computeDigest("maps", new StringValue("Fraser_Malcolm")),
      "maps", null)
    val record = client.get(null, key)
    println(record.bins)
  }

  def main1(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .master(MT.LOCAL_MASTER)
      .appName(APP_NAME)
      .enableHiveSupport()
      //.config(Key.SPARK_SQL_WAREHOUSE_DIR, MT.HIVE_WARE)
      .getOrCreate()
    import spark.implicits._

    val df = spark.createDataset(Seq("c" -> 3, "d" -> 4, "cde" -> 5)).toDF("name", "id")

    val df2 = df.mapPartitions(it => {
      val client = new AerospikeClient("10.58.11.39", 3000)
//      client.
      Seq.empty[String].iterator
    })

    spark.stop()
  }

}
