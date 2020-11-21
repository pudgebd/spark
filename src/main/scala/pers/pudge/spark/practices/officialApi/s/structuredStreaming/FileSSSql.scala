package pers.pudge.spark.practices.officialApi.s.structuredStreaming

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.streaming.OutputMode
import org.apache.spark.sql.types.StructType
import pers.pudge.spark.practices.utils.constants.{Key, MT, Punctuation}

object FileSSSql {

  val TEXT_FILE_PATH = "hdfs://localhost:8020/user/pudgebd/fs/"
  var CHECK_POINT_DIR = "hdfs://localhost:8020/user/pudgebd/checkpoint/myfs/"

  def main(args: Array[String]): Unit = {
    val ss = SparkSession.builder().appName("FileSSSql")
      .master(MT.LOCAL_MASTER)
      .getOrCreate()
    CHECK_POINT_DIR = CHECK_POINT_DIR + System.currentTimeMillis()
    val userSchema = new StructType()
      .add(Key.NAME, Key.STRING)
      .add(Key.AGE, Key.INTEGER)
      .add(Key.MONTH, Key.INTEGER)

    val df = ss.readStream
      .option(Key.SEP, Punctuation.Comma)
      .option(Key.TIMESTAMP_FORMAT, "yyyy/MM/dd HH:mm:ss ZZ") //没有这个会报 pattern 错误
      .schema(userSchema)
      .csv(TEXT_FILE_PATH) //若用text会无法按照定义的分隔符来获取数据，可以把text文件的后缀名直接改成.csv

    val query = df
      .groupBy(Key.NAME).agg(Key.AGE -> Key.SUM)
      .writeStream
      .outputMode(OutputMode.Complete())
      //                .partitionBy(Key.MONTH)
      .format(Key.CONSOLE)
      .option(Key.CHECKPOINT_LOCATION, CHECK_POINT_DIR)
      .start()

    query.awaitTermination()

  }

}
