package pers.pudge.spark.practices.utils

import org.apache.spark.sql.catalyst.encoders.RowEncoder
import org.apache.spark.sql.{Row, SaveMode, SparkSession}
import pers.pudge.spark.practices.officialApi.h.hive.HiveSqlDemo.APP_NAME
import pers.pudge.spark.practices.utils.constants.MT

object MultiHiveData {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName(APP_NAME)
//      .master(MT.LOCAL_MASTER)
      .enableHiveSupport()
      .getOrCreate()
    import spark.implicits._

    val typee = args(0)
    val readTarget = args(1)
    val writeTarget = args(2)
    val repartiNum = args(3).toInt
    val multiNum = args(4).toInt

    //hive graph_cmb_test.te_email_dm graph_cmb_test.cq_te_email_dm 2 5
    if ("hive".equalsIgnoreCase(typee)) {
      val df = spark.table(readTarget)
      //    println(df.count())
      val newDf = df.repartition(repartiNum)
        .flatMap(row => {
          val seq = row.toSeq
          val range = 0 to multiNum
          val arr = range.toArray
          arr.map(idx => Row.fromSeq(seq))
        })(RowEncoder.apply(df.schema))
      //      .show(false)
      //    println(newDf.count())
      newDf.write.mode(SaveMode.Overwrite).saveAsTable(writeTarget)

    } else if ("hdfs".equalsIgnoreCase(typee)) {

      //hdfs hdfs://cdh601:8020/user/cmb_gp/offline_graph_search/new_input_param/BATCH_INNER_PATH/433_start_vertices hdfs://cdh601:8020//user/chenqian/433_start_vertices 2 5
      val ds = spark.read.textFile(readTarget)
      val newDs = ds.repartition(repartiNum)
        .flatMap(line => {
          val range = 0 to multiNum
          val arr = range.toArray
          arr.map(idx => line + "")
        }).coalesce(1)
      newDs.write.mode(SaveMode.Overwrite).text(writeTarget)
    }

  }

}
