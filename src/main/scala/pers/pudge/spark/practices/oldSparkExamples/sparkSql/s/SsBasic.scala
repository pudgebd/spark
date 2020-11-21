package pers.pudge.spark.practices.sparkSql.s

import java.io.FileOutputStream

import org.apache.commons.io.IOUtils
import org.apache.spark.sql._

/**
  * Created by pudgebd on 16-8-17.
  */
trait SsBasic {

  val tmpDir = "/home/pudgebd/tmp/"

  def collect(df: DataFrame): Unit = {
    val rows = df.select("type_", "name_").collect()
    var i: Int = 0
    for (row <- rows) {
      val v = row.get(0)
      writeStr(v.toString, i.toString)
      i = i + 1
    }
  }

  def writeStr(result: String, resName: String): Unit = {
    val output = new FileOutputStream(tmpDir + resName + ".txt")
    IOUtils.write(result, output, "utf8")
    output.flush()
    IOUtils.closeQuietly(output)
  }

}








