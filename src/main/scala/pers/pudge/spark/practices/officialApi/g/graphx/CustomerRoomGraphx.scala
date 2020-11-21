package pers.pudge.spark.practices.officialApi.g.graphx

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.slf4j.LoggerFactory
import pers.pudge.spark.practices.entities.graph.{OpCustomerPo, OpRoomCsmPo, OpRoomPo}
import pers.pudge.spark.practices.utils.LogUtils
import pers.pudge.spark.practices.utils.constants.{Key, MT}

object CustomerRoomGraphx extends CrGraphxBasic {

  val APP_NAME = "CustomerRoomGraphx"

  def getConf(): SparkConf = {
    val conf = new SparkConf()
    conf.setAppName(APP_NAME)
//    conf.setMaster(MT.LOCAL_MASTER)
    conf.set(Key.SPARK_SQL_WAREHOUSE_DIR, MT.MASTER_WARE)
    conf.set(Key.SPARK_SERIALIZER, Key.KRYO_SERIALIZER)
    conf.registerKryoClasses(
      Array(classOf[OpCustomerPo], classOf[OpRoomPo],
        classOf[OpRoomCsmPo]
      )
    )
    return conf
  }


  def main(args: Array[String]): Unit = {
    val conf = getConf()

    val spark = SparkSession.builder()
      .config(conf)
      .enableHiveSupport()
      .getOrCreate()
    LOG.warn(LogUtils.getBeginLog(APP_NAME))

//    addTestData(spark)
    graphx(spark)

    LOG.warn(LogUtils.getEndLog(APP_NAME))
    spark.stop()
  }



}
