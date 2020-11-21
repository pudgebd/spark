package pers.pudge.spark.practices.officialApi.s.structuredStreaming

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._
import org.apache.spark.sql.streaming.OutputMode
import org.apache.spark.sql.types.StructType
import pers.pudge.spark.practices.utils.constants.{Key, MT, Punctuation}

/**
  * 只能监控新文件
  * 若要用类似 "month=1" 这样的分区，则第一上传文件到监控目录时就要按照这个规则来，临时加分区会报错，
  * 下次重新启动才会按照分区来
  * Append() 和 Update() 第一次运行会读取所有数据
  */
object FileStructedS2 {

  val TEXT_FILE_PATH = "hdfs://svdsj03-01:8020/user/spark/fs/"
  var CHECK_POINT_DIR = "hdfs://svdsj03-01:8020/user/spark/checkpoint/myfs/"

  def main(args: Array[String]): Unit = {
    val ss = SparkSession.builder().appName("FileStructedS2")
      .master(MT.LOCAL_MASTER)
      .getOrCreate()
    import ss.implicits._
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

    //window 相关写法
    val windowDF = df
      .withWatermark("timestamp", "10 minutes") //Complete 不能使用，它需要所有聚合数据都保存
      .dropDuplicates("guid", "eventTime") //去重，可组合 withWatermark 使用
      .groupBy(
      window($"timestamp", "10 minutes", "5 minutes"),
      $"word"
    )
    //        The aggregation must have either the event-time column, or a window on the event-time column.
    //        withWatermark must be called on the same column as the timestamp column used in the aggregate. For example, df.withWatermark("time", "1 min").groupBy("time2").count() is invalid in Append output mode, as watermark is defined on a different column from the aggregation column.
    //        withWatermark must be called before the aggregation for the watermark details to be used. For example, df.groupBy("time").count().withWatermark("time", "1 min") is invalid in Append output mode.

    val query = df.writeStream
      .outputMode(OutputMode.Append())
      .format(Key.CONSOLE) //可以输出为其他格式
      .option(Key.CHECKPOINT_LOCATION, CHECK_POINT_DIR)
      //                .format("memory")//这两个用于debug，存到driver中
      //                .queryName("tableName")
      .start()


    query.awaitTermination()
  }

}
