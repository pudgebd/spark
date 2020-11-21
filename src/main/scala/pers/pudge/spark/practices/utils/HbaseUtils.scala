package pers.pudge.spark.practices.utils

import org.apache.hadoop.hbase.HBaseConfiguration
import org.apache.hadoop.hbase.client.{Connection, ConnectionFactory}
import pers.pudge.spark.practices.utils.constants.MT

/**
  * Created by pudgebd on 16-12-8.
  */
object HbaseUtils {

  var conn: Option[Connection] = None

  def getConn: Connection = {
    val realConn = conn match {
      case None => {
        FLOG.log("conn == null")
        val conf = HBaseConfiguration.create()
        conf.set("hbase.zookeeper.property.clientPort", "2181")
        conf.set("hbase.zookeeper.quorum", MT.ZK_HOSTS) //localhost //192.168.2.232 //slave1,slave2

        //Connection 的创建是个重量级的工作，线程安全，是操作hbase的入口
        conn = Some(ConnectionFactory.createConnection(conf))
        conn.get
      }
      case Some(oneConn) => oneConn
    }
    realConn
  }

}
