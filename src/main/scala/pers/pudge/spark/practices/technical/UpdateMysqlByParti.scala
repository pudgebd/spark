package pers.pudge.spark.practices.technical

import org.apache.spark.sql.execution.datasources.jdbc.JdbcUtils
import org.apache.spark.sql.{DataFrame, SaveMode, SparkSession}
import pers.pudge.spark.practices.entities.IdNameVo
import pers.pudge.spark.practices.utils.{FLOG, ProjectUtils}

import scala.collection.mutable

/**
  *   --num-executor 2, --executor-cores 1 就行了
  * 或--num-executor 1, --executor-cores 2
  */
class UpdateMysqlByParti {

  def dealWithLargeSqls(spark: SparkSession, resultTable: String, sqls: String*) = {
    var resDF: DataFrame = null

    for (sql <- sqls) {
      val df = spark.sql(sql)
      if (resDF == null) {
        resDF = df
      } else {
        resDF = resDF.unionByName(df)
      }
    }

    import spark.implicits._
    val ds1 = resDF.repartition(100)
    val ds2 = ds1.map(row => IdNameVo(row.getLong(0), row.getString(3)))

    //累加器不能在mapPartitions里使用
    //    val accumulator = spark.sparkContext.longAccumulator("partiIdxAccu")
    //    val ds3 = ds2.mapPartitions(it => {
    //      val lb = new ListBuffer[(IdNameVo, Long)]
    //      for (row <- it) {
    //        lb += row -> accumulator.sum
    //      }
    //      accumulator.add(1L)
    //      lb.toIterator
    //    })
    //    println("partiIdxAccu sum: " + accumulator.sum)

    ds2.rdd.zipWithIndex().foreachPartition(it => {
//      val conn = JdbcUtils.getStaticConn(null)
//      val stmt = conn.createStatement()
//
//      val sb = new mutable.StringBuilder(s"insert into fsdf (id, dfgsd) values ")
//      var idxMin = Long.MaxValue
//
//      for (tp <- it) {
//        val row = tp._1
//        if (tp._2 < idxMin) {
//          idxMin = tp._2
//        }
//        val id = row.id
//        val bn = row.name
//        sb.append(s"($id, '$bn'),")
//      }
//      val sql = sb.substring(0, sb.length - 1)
//      val sleepMs = idxMin / 130 * 50
//      FLOG.info(s"idxMin: $idxMin, sleepMs: $sleepMs")
//      Thread.sleep(sleepMs)
//      stmt.execute(sql)
    })

//        resDF.repartition(ProjectUtils.PARTI_NUM_100)
//          .write.format("").mode(SaveMode.Overwrite).saveAsTable(resultTable)
  }

}
