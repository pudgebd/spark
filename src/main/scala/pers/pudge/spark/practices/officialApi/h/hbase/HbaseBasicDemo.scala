package pers.pudge.spark.practices.officialApi.h.hbase

import java.util

import org.apache.hadoop.hbase.client._
import org.apache.hadoop.hbase.{HColumnDescriptor, TableName}

/**
  * Created by pudgebd on 16-12-8.
  */
class HbaseBasicDemo extends HbaseDemoHelper {


  def cxxx(admin: Admin, tableName: TableName) = {
    createTable(admin, tableName)
    coprocessor(admin, tableName)

  }


  def gxxx(conn: Connection, admin: Admin, table: Table) = {
    val g = new Get(getBytes("999"))
    //        g.setTimeStamp(1484814908319L) //有效
    //        g.setMaxVersions(5)            //无效
    //        g.addFamily()

    getxxMethods(table, g)

    //        familyMap(g)
    //        familySet(g)
    //        println(g.isCheckExistenceOnly)
  }

  def getxxMethods(table: Table, g: Get) = {
    val result = table.get(g)

    //                println(result.containsColumn(CF0, A0))//foffset flength 等参数针对 family bytes
    //        println(result.containsEmptyColumn(CF0, getBytes("a2")))
    //        println(result.containsNonEmptyColumn(CF0, A0))
    //                println(StringUtils.getUtf8Str(result.getValue(CF0, getBytes("a"))))
    //                resultGetColumnCells(result, CF0, A1)
    //        resultGetValueAsByteBuffer(result, CF0, A1)
    //        println(StringUtils.getUtf8Str(result.getColumnLatestCell(CF0, A1).getValueArray))
    //        println(result.isPartial) //是否部分数据
    //        println(result.isStale) //是否一致性出问题
    //        result.rawCells().iterator //return cell
    //                getMap(result)
    //        getNoVersionMap(result)
    //                println(getStr(result.getRow)) //第一行
    //                println(result.getStats)
    cellScanner(result)
    //        result.loadValue(CF0, A0, ByteBuffer.allocate(256))
    //        result.setExists(true)
    //        result.setStatistics()
  }

  def mxxx(conn: Connection, admin: Admin, tableName: TableName, table: Table) = {
    val newColumn = new HColumnDescriptor("cf1:a1")
    //        newColumn.

    val tableDesc = admin.getTableDescriptor(tableName)

    //        admin.mo

  }

  def pxxx(conn: Connection, admin: Admin, table: Table) = {
    //准备插入一条 key 为 id001 的数据
    val p = new Put(ROW0)
    //为put指定  列簇 列名            值
    p.addColumn(CF0, A0, getBytes("001"))

    table.put(p)
  }

  def mpxxx(conn: Connection, admin: Admin, table: Table) = {
    val list = new util.ArrayList[Put](13000)
    for (num <- 1 to 10000) {
      val numStr = num.toString
      val put = new Put(getBytes(numStr))
      put.addColumn(C, STORY, getBytes(numStr))
      list.add(put)
    }
    val t1 = System.currentTimeMillis()
    table.put(list)
    val t2 = System.currentTimeMillis()
    println(t2 - t1)
    println()
  }


  def sxxx(conn: Connection, admin: Admin, table: Table) = {
    //        rowFilter(table)
    //        rowfilters(table)


  }


}
