package pers.pudge.spark.practices.officialApi.a.aerospike

import com.aerospike.client.AerospikeClient
import org.apache.spark.sql.{Row, SaveMode, SparkSession}
import org.apache.spark.sql.types._
import pers.pudge.spark.practices.officialApi.a.aerospike.sql.{AerospikeConfig, AerospikeConnection}

object MapTest {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder()
      .appName("MapTest")
      .master("local[*]")
      .enableHiveSupport()
      .getOrCreate()

    val config = AerospikeConfig.newConfig(Globals.seedHost, Globals.port, 1000)
    val client: AerospikeClient = AerospikeConnection.getClient(config)
    val set = "maps"
    val mapBin = "map-of-things"

    val TEST_COUNT = 100

    val schema = new StructType(Array(
      StructField("key", StringType, nullable = false),
      StructField("last", StringType, nullable = true),
      StructField("first", StringType, nullable = true),
      StructField(mapBin, MapType(StringType, LongType)),
      StructField("ttl", IntegerType, nullable = true)
    ))
    val rows = Seq(
      Row("Fraser_Malcolm","Fraser", "Malcolm", Map("from" -> 1975L, "to" -> 1983L), 600),
      Row("Hawke_Bob","Hawke", "Bob", Map("from" -> 1983L, "to" -> 1991L), 600),
      Row("Keating_Paul","Keating", "Paul", Map("from" -> 1991L, "to" -> 1996L), 600),
      Row("Howard_John","Howard", "John", Map("from" -> 1996L, "to" -> 2007L), 600),
      Row("Rudd_Kevin","Rudd", "Kevin", Map("from" -> 2007L, "to" -> 2010L), 600),
      Row("Gillard_Julia","Gillard", "Julia", Map("from" -> 2010L, "to" -> 2013L), 600),
      Row("Abbott_Tony","Abbott", "Tony", Map("from" -> 2013L, "to" -> 2015L), 600),
      Row("Tunrbull_Malcom","Tunrbull", "Malcom", Map("from" -> 2015L, "to" ->  2016L), 600)
    )

    val inputRDD = spark.sparkContext.parallelize(rows)

    val newDF = spark.createDataFrame(inputRDD, schema)

    newDF.write.
      mode(SaveMode.Overwrite).
      format("pers.pudge.spark.practices.officialApi.a.aerospike.sql").
      option("aerospike.seedhost", Globals.seedHost).
      option("aerospike.port", Globals.port.toString).
      option("aerospike.namespace", Globals.namespace).
      option("aerospike.set", set).
      option("aerospike.updateByKey", "key").
//      option("aerospike.updateByDigest", "Digest").
//      option("aerospike.ttlColumn", "ttl").
      save()

//    var poliKey = new Key(Globals.namespace, set, "Fraser_Malcolm")
//    val fraser = client.get(null, poliKey)
//    assert(fraser != null)
//    val fraserMap = fraser.getMap(mapBin)
//    assert(fraserMap.get("from") == 1975L)
//
//    poliKey = new Key(Globals.namespace, set, "Gillard_Julia")
//    val gillard = client.get(null, poliKey)
//    assert(gillard != null)
//    val gillardMap = gillard.getMap(mapBin)
//    assert(gillardMap.get("to") == 2013L)
//
//    poliKey = new Key(Globals.namespace, set, "Tunrbull_Malcom")
//    val tunrbull = client.get(null, poliKey)
//    assert(tunrbull != null)
//    val tunrbullMap = tunrbull.getMap(mapBin)
//    assert(tunrbullMap.get("to") == 2016L)
  }

}
