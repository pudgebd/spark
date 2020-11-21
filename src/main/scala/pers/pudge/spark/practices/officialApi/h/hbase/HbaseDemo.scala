package pers.pudge.spark.practices.officialApi.h.hbase

import org.apache.hadoop.hbase.TableName
import pers.pudge.spark.practices.utils.HbaseUtils

/**
  * Created by pudgebd on 16-12-8.
  */
object HbaseDemo extends HbaseBasicDemo {

  def main(args: Array[String]): Unit = {
    val conn = HbaseUtils.getConn
    val admin = conn.getAdmin
    val tableName = TableName.valueOf("t_user_recommend")
    val table = conn.getTable(tableName)

    cxxx(admin, tableName)
    //        computeRecMemeryForRedis(conn, table)
    //        gxxx(conn, admin, table)
    //        mxxx(conn, admin, tableName, table);
    //        pxxx(conn, admin, table)
    //        mpxxx(conn, admin, table)
    //        sxxx(conn, admin, table)

  }


}
