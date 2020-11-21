package pers.pudge.spark.practices.officialApi.h.hbase

import org.apache.hadoop.hbase.client._
import org.apache.hadoop.hbase.filter.CompareFilter.CompareOp
import org.apache.hadoop.hbase.filter.{FilterList, RegexStringComparator, RowFilter, SingleColumnValueFilter}
import org.apache.hadoop.hbase.{HColumnDescriptor, HTableDescriptor, TableName}
import org.codehaus.jettison.json.JSONArray

/**
  * Created by pudgebd on 16-12-8.
  */
class HbaseDemoHelper {

  val ROW0 = getBytes("row0")
  val ROW1 = getBytes("row1")
  val ROW2 = getBytes("row2")
  val C = getBytes("c")
  val CF0 = getBytes("cf0")
  val CF1 = getBytes("cf1")
  val A0 = getBytes("a0")
  val A1 = getBytes("a1")
  val STORY = getBytes("story")
  val STORY_JSON = getBytes("story_json")


  def createTable(admin: Admin, tableName: TableName) = {
    val tableDesc = new HTableDescriptor(tableName)

    tableDesc.addFamily(new HColumnDescriptor(CF0))
    if (admin.tableExists(tableName)) {
      admin.disableTable(tableName)
      admin.deleteTable(tableName)
    }

    admin.createTable(tableDesc, getBytes("0"), getBytes("9"), 10)
  }

  def coprocessor(admin: Admin, tableName: TableName) = {

  }

  def resultGetColumnCells(result: Result, cf: Array[Byte], c: Array[Byte]) = {
    val it = result.getColumnCells(cf, c).iterator()
    while (it.hasNext) {
      val cell = it.next()
//      println(StringUtils.getUtf8Str(cell.getFamilyArray))
//      println(StringUtils.getUtf8Str(cell.getQualifierArray))
//      println(StringUtils.getUtf8Str(cell.getRowArray))
//      println(StringUtils.getUtf8Str(cell.getTagsArray))
//      println(StringUtils.getUtf8Str(cell.getValueArray))
      println(cell.getSequenceId)
      println(cell.getTimestamp)
      println("-------------------------------------------------------")
    }
  }

  def resultGetValueAsByteBuffer(result: Result, cf: Array[Byte], a: Array[Byte]) = {
    val byteBuffer = result.getValueAsByteBuffer(cf, a)
    //        byteBuffer.
  }

  def getMap(result: Result) = {
    //             一般只有一条
    val map = result.getMap //[cf, [column, [ms, val]]]
    val it = map.get(map.firstKey()).entrySet().iterator()
    while (it.hasNext) {
      val en = it.next()
      println(getStr(en.getKey))

      val it2 = en.getValue.entrySet().iterator()
      while (it2.hasNext) {
        val en2 = it2.next()
//        println(StringUtils.joinStr(en2.getKey, "->", getStr(en2.getValue)))
      }
      println("-----------------------------")
    }
  }

  def getStr(bytes: Array[Byte]): String = {
//    StringUtils.getUtf8Str(bytes)
    ""
  }

  def getNoVersionMap(result: Result) = {
    val map = result.getNoVersionMap //[cf, [column, val]]
    val it = map.get(map.firstKey()).entrySet().iterator()
    while (it.hasNext) {
      val en = it.next()
//      println(StringUtils.getUtf8Str(en.getKey))
//      println(StringUtils.getUtf8Str(en.getValue))
    }
  }

  def cellScanner(result: Result) = {
    //
    var as = result.cellScanner()
    println(as.advance()) //true if the next cell is found and current() will return a valid Cell
    println(as.current())

    //结果一样
    val as2 = result.cellScanner()
    println(as2.advance())
    println(as2.current())
  }


  def familyMap(g: Get) = {
    val it = g.getFamilyMap().entrySet().iterator() // empty?
    println()
    while (it.hasNext) {
      val en = it.next()
      println(getStr(en.getKey) + " -> ")
      val it2 = en.getValue.iterator()
      while (it2.hasNext) {
        println(getStr(it2.next()))
      }
    }
  }

  def familySet(g: Get) = {
    val it = g.familySet().iterator() // empty?
    while (it.hasNext) {
      println(getStr(it.next()))
    }
  }

  def rowFilter(table: Table) = {
    val scan = new Scan()
    val filter = new RowFilter(CompareOp.EQUAL, new RegexStringComparator(".*790")) //*前面必须有.
    scan.setFilter(filter)
    scanAndPrint(table, scan)
  }

  def rowfilters(table: Table) = {
    val filters = new FilterList(FilterList.Operator.MUST_PASS_ALL)

    val filter1 = new SingleColumnValueFilter(CF0, getBytes("apply_id"),
      CompareOp.EQUAL, getBytes("QJ1464745300081"))
    val filter2 = new SingleColumnValueFilter(CF0, getBytes("org_id"),
      CompareOp.EQUAL, getBytes("57171554250"))

    filters.addFilter(filter1)
    filters.addFilter(filter2)

    val scan = new Scan()
    scan.setFilter(filters)
    scanAndPrint(table, scan)
  }

  def getBytes(str: String): Array[Byte] = {
//    StringUtils.getUtf8Bytes(str)
    null
  }

  def scanAndPrint(table: Table, scan: Scan) = {
    val scanner = table.getScanner(scan)
    var res = scanner.next()
    while (res != null) {
      println(res.toString)
      res = scanner.next()
    }
  }

  def computeRecMemeryForRedis(conn: Connection, table: Table) = {
    val scan = new Scan()
    scan.setCaching(10000)

    val redisPrefix = 14
    var bytesLen: Double = 0D
    var totalRow = 0
    var totalRecom = 0

    val res = table.getScanner(scan)
    val it = res.iterator()
    while (it.hasNext) {
      totalRow = totalRow + 1
      val row = it.next()
      val rowKey = row.getRow
      val jsonBytes = row.getValue(C, STORY_JSON)
      val jsonArr = new JSONArray(new String(jsonBytes, "utf8"))
      val jsonArrLen = jsonArr.length()
      totalRecom = totalRecom + jsonArrLen

      for (idx <- 0 to jsonArrLen - 1) {
        val jsonObj = jsonArr.getJSONObject(idx)
        val storyId = jsonObj.optString("storyId")
        bytesLen = bytesLen + storyId.length
      }

      bytesLen = bytesLen + redisPrefix + rowKey.length
    }

    println("==================================")
    println(totalRow)
    println(totalRecom / 511985)
    println(bytesLen / 1024 / 1024)
    println()
  }

}
