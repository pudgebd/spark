package pers.pudge.spark.practices.officialApi.s.structuredStreaming

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.streaming.OutputMode
import pers.pudge.spark.practices.utils.constants.MT

/**
  * 以下写法会报错
  * IllegalArgumentException: Option 'basePath' must be a directory
  *
  * textFile 不能处理子文件夹作为 partition
  */
object FileStructedS {

  val TEXT_FILE_PATH = "hdfs://svdsj03-01:8020/user/spark/fs/env.js.properties"
  var CHECK_POINT_DIR = "hdfs://svdsj03-01:8020/user/spark/checkpoint/myfs/"

  def main(args: Array[String]): Unit = {
    val ss = SparkSession.builder().appName("FileStructedS")
      .master(MT.LOCAL_MASTER)
      .getOrCreate()
    import ss.implicits._
    CHECK_POINT_DIR = CHECK_POINT_DIR + System.currentTimeMillis()
    val ds = ss.readStream.textFile(TEXT_FILE_PATH)
    //.option("check.point.path", CHECK_POINT_DIR)

    val ds2 = ds.map(_ + "")

    val query = ds2.writeStream
      .outputMode(OutputMode.Append())
      .format("console")
      .option("checkpointLocation", CHECK_POINT_DIR)
      .start()


    query.awaitTermination()
  }

}
