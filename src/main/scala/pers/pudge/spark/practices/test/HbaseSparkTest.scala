package pers.pudge.spark.practices.test

import java.util

import com.alibaba.fastjson.JSONObject
import org.apache.commons.io.IOUtils
import org.apache.hadoop.hbase.TableName
import org.apache.hadoop.hbase.client._
import org.apache.hadoop.hbase.util.Bytes
import org.apache.spark.sql.SparkSession
import pers.pudge.spark.practices.utils.HbaseUtil
import pers.pudge.spark.practices.utils.constants.ConfigKey

object HbaseSparkTest {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .master("local[*]")
      .appName("LocalTest")
      .enableHiveSupport()
      .getOrCreate()
    import spark.implicits._

    val df = spark.createDataset(1 to 5)
      .toDF("rowkey")

    df.foreachPartition(it => {
      var conn: Connection = null
      try {
        val jobj = new JSONObject()
        jobj.put(ConfigKey.HBASE_ZOOKEEPER_QUORUM, "cdh217,cdh219,cdh218")
        conn = HbaseUtil.getConnection(jobj.toJSONString)

        //分批删除
        val seqs = it.sliding(200, 200)
        for (seq <- seqs) {
          val table = conn.getBufferedMutator(TableName.valueOf("hbase_demo", "xxx_hbase_01"))
          val mutations = new util.ArrayList[Mutation](seq.size)
          for (row <- seq) {
            //防止 row.get(0) 不是 string，一般不可能发生，建表时就限制必须 string
            val rowkeyStr = row.get(0).toString
            val delete = new Delete(Bytes.toBytes(rowkeyStr))
            mutations.add(delete)
          }

          table.mutate(mutations)
          table.flush()
          IOUtils.closeQuietly(table)
        }
      } finally {
        IOUtils.closeQuietly(conn)
      }
      Seq.empty[String].iterator
    })
  }

}
