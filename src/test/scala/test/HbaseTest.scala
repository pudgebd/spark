package test

import org.apache.hadoop.hbase.TableName
import org.apache.hadoop.hbase.client.Get
import org.apache.hadoop.hbase.util.Bytes
import pers.pudge.spark.practices.utils.HbaseUtils

/**
  * Created by pudgebd on 17-2-28.
  */
object HbaseTest {


  def main(args: Array[String]): Unit = {
    val conn = HbaseUtils.getConn

    //        conn.getAdmin.createTable()

    val table = conn.getTable(TableName.valueOf("jmbi:ga_country"))
    val res = table.get(new Get(Bytes.toBytes("1")))
    println(new String(res.value()))
    println()
  }


}
