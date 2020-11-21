package pers.pudge.spark.practices.officialApi.u.udf

import org.apache.hadoop.hbase.KeyValue
import org.apache.hadoop.hbase.io.ImmutableBytesWritable
import org.apache.hadoop.hbase.util.Bytes
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.types.BinaryType
import org.codehaus.jettison.json.JSONObject
import pers.pudge.spark.practices.utils.constants.MT

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object MyUdf {

  val APP_MAIN = "MyUdf"
  val CF = "cf"
  val CF_BYTES: Array[Byte] = Bytes.toBytes(CF)

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .master(MT.LOCAL_MASTER)
      .appName(APP_MAIN)
      .enableHiveSupport()
      .getOrCreate()
    import spark.implicits._

    def printEles(eles: Any*) = {
      println(eles.mkString(", "))
    }
    printEles(1, "a", 1.2, "g")

    spark.udf.register("parseRow", func _)
    def func(eles: mutable.WrappedArray[Any]): Array[Any] = {
      val lb = new ListBuffer[Any]
      val rowkey = Bytes.toBytes(eles.head.asInstanceOf[Double])
      lb += new ImmutableBytesWritable(rowkey)
      val kv = new KeyValue(rowkey, CF_BYTES, Bytes.toBytes("name"), Bytes.toBytes(eles(1).asInstanceOf[String]))
      lb += kv
      return lb.toArray
    }

    val df = spark.createDataset(Seq((1.1, "aa", 1), (2.2, "cc", 2), (3.3, "DDD", 3), (4.4, "EEE", 4)))
      .toDF("id", "name", "age")
      .createOrReplaceTempView("v_tmp")

    val jobj = new JSONObject()
    jobj.append("a", "1")
    spark.sql(s"select parseRow(array(*, '${jobj.toString}')) from v_tmp")
      .show(false)
  }

}
