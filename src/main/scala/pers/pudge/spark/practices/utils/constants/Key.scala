package pers.pudge.spark.practices.utils.constants

import org.apache.hadoop.hbase.util.Bytes

/**
  * Created by pudgebd on 17-1-22.
  */
object Key {
  lazy val DLOG_FILE_PATH = "/tmp/app.log" //"E:\\tmp\\app.log"
  val YARN: String = "yarn"
  val VALUE = "value"
  val KEY = "key"
  val KAFKA = "kafka"
  val SUM = "sum"
  val MAX = "max"
  val T_SSS: String = "t_sss"
  val MONTH: String = "month"
  val MS: String = "ms"
  val ID = "id"
  val PARTI: String = "parti"
  val GOODS_ID = "goods_id"
  val UID = "uid"
  val ACTION = "action"
  val INTEGER = "integer"
  val AGE = "age"
  val STRING = "string"
  val NAME: String = "name"
  val SEQ: String = "seq"
  val SEP: String = "sep"
  val SEP_ = "_"
  val FILE: String = "file"
  val T_UG = "t_ug"
  val T_UG_TEST = "t_ug_test"
  val INNER = "inner"
  val FULLOUTER = "fullouter"
  val LEFTOUTER = "leftouter"
  val RIGHTOUTER = "rightouter"
  val LEFTSEMI = "leftsemi"
  val LEFTANTI = "leftanti"
  val CROSS = "cross"
  val SUBSCRIBE = "subscribe"
  val _1 = "_1"
  val _2 = "_2"
  val CONSOLE = "console"
  val CHECKPOINT_LOCATION = "checkpointLocation"
  val TIMESTAMP_FORMAT = "timestampFormat"
  val BOOTSTRAP_SERVERS = "bootstrap.servers"
  val KAFKA_BOOTSTRAP_SERVERS = "kafka.bootstrap.servers"
  val KEY_DESERIALIZER = "key.deserializer"
  val VALUE_DESERIALIZER = "value.deserializer"
  val GROUP_ID = "group.id"
  val AUTO_OFFSET_RESET = "auto.offset.reset"
  val ENABLE_AUTO_COMMIT = "enable.auto.commit"
  val MYTOPIC02 = "mytopic02"
  val LATEST = "latest"
  val SPARK_SQL_WAREHOUSE_DIR = "spark.sql.warehouse.dir"

  val SPARK_EXCEL = "com.crealytics.spark.excel"
  val MYSQL_DRIVER = "com.mysql.jdbc.Driver"
  val SQL_SERVER_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver"
  val KRYO_SERIALIZER: String = "org.apache.spark.serializer.KryoSerializer"

  val SPARK_SERIALIZER: String = "spark.serializer"

  val SPARK_NEO4J_BOLT_URL = "spark.neo4j.bolt.url"
  val SPARK_NEO4J_BOLT_USER = "spark.neo4j.bolt.user"
  val SPARK_NEO4J_BOLT_PASSWORD = "spark.neo4j.bolt.password"
  val NEO4J_RDD_NUM_PARTITIONS_PROP = "neo4j.rdd.num.partitions"
  val NEO4J_RELATIONSHIP_COUNTS_PROP = "neo4j.relationship.counts"

  val CF = "cf"
  val CF_BYTES: Array[Byte] = Bytes.toBytes(CF)

  val DC_SQL_JOBSERVER = "dc.sql.jobserver"
  val HBASE_ZOOKEEPER_QUORUM = "hbase.zookeeper.quorum"
  val HBASE_ZOOKEEPER_PROPERTY_CLIENTPORT = "hbase.zookeeper.property.clientPort"


}
