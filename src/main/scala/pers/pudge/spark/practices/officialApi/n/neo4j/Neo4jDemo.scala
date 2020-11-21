package pers.pudge.spark.practices.officialApi.n.neo4j

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.neo4j.driver.internal.InternalNode
import org.neo4j.spark.Neo4j
import pers.pudge.spark.practices.entities.graph.{OpCustomerPo, OpRoomCsmPo, OpRoomPo, Person}
import pers.pudge.spark.practices.officialApi.g.graphx.CustomerRoomGraphx.APP_NAME
import pers.pudge.spark.practices.utils.LogUtils
import pers.pudge.spark.practices.utils.constants.{Key, MT}

object Neo4jDemo extends Neo4jBasic {

  val APP_NAME = "Neo4jDemo"

  def getConf(): SparkConf = {
    val conf = new SparkConf()
    conf.setAppName(APP_NAME)
    conf.setMaster(MT.LOCAL_MASTER)
    conf.set(Key.SPARK_NEO4J_BOLT_URL, "bolt://localhost:7687")
    conf.set(Key.SPARK_NEO4J_BOLT_USER, "neo4j")
    conf.set(Key.SPARK_NEO4J_BOLT_PASSWORD, "123456")
    conf.set(Key.SPARK_SERIALIZER, Key.KRYO_SERIALIZER)
    conf.registerKryoClasses(
      Array(classOf[OpCustomerPo], classOf[OpRoomPo],
        classOf[OpRoomCsmPo], classOf[Person]
      )
    )
    return conf
  }


  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .config(getConf())
      .getOrCreate()

    LOG.warn(LogUtils.getBeginLog(APP_NAME))

    val sc = spark.sparkContext
    val neo4j = Neo4j(sc)

//    loadXXRdds(neo4j)
//    loadDataFrame(neo4j)
//    loadGraphFrame(neo4j)

    LOG.warn(LogUtils.getEndLog(APP_NAME))
    spark.stop()
  }


}
