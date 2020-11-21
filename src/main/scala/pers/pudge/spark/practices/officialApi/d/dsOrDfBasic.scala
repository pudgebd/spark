package pers.pudge.spark.practices.officialApi.d

import java.util

import org.apache.spark.sql.types.{MetadataBuilder, _}
import org.apache.spark.sql.{Dataset, Row, SparkSession}
import org.codehaus.jettison.json.{JSONArray, JSONObject}
import pers.pudge.spark.practices.entities.PageView
import pers.pudge.spark.practices.utils.FLOG
import pers.pudge.spark.practices.utils.constants.Key

import scala.collection.JavaConverters._
import scala.collection.mutable.ListBuffer

/**
  **/
class dsOrDfBasic {


  def tmp(spark: SparkSession, ds2: Dataset[PageView]) = {
    ds2.rdd
    //		val ds3 = ds2.map(pv => pv.id -> pv).rdd
    //        ds3.reduceByKey((pv1, pv2) => {
    //
    //        })

  }


  //由于本地hive是2.3.3，所以需要spark2.2.0 ??
  def wxxx(spark: SparkSession, ds2: Dataset[PageView]): Unit = {
    //        val df = spark.sql("select * from tmp_mc_t0")
    //        df.write.mode(SaveMode.Overwrite).saveAsTable("t_o2")
//    spark.catalog.cacheTable()
    val df = spark.sql("select * from t_30w_right limit 1")
    var schema = df.schema
    schema = schema.add("seq", "Long", false)
    val rdd = df.rdd.zipWithIndex()
    rdd.foreach(tp => {
      println(tp._1.getAs("name"))
    })
    //        val newRdd = rdd.map(tp => {
    //            Row.merge(tp._1, Row.fromSeq(Seq(tp._2)))
    //        })

    //        spark.createDataFrame(newRdd, schema)
    //                .write.mode(SaveMode.Overwrite).saveAsTable("t_new_rdd")
  }

  def sxxx(ds2: Dataset[PageView]) = {
    ds2.sample(true, 1, 1).show() // ???
    ds2.show(1, true) //这个 boolean：是否缩短 str 到 20
    println()
  }

  def sqlSelect(spark: SparkSession, ds2: Dataset[PageView]) = {
    import spark.implicits._
    ds2.createOrReplaceTempView("t_pv1")
//    val df = spark.sql("select id,  collect_list(concat_ws('_', name, vtm)) from t_pv1 group by id")
    val df = spark.sql("select id, collect_list(concat_ws('_', name, vtm)) from t_pv1 group by id")

    val mapped = df.map(row => {
      val id = row.getString(0)
      val seq = row.getSeq[String](1)
      val ab = new ListBuffer[Map[String, String]]

      for (eles <- seq) {
        val arr = eles.toString.split("_")
        ab += Map("name" -> arr(0), "vtm" -> arr(1))
      }

      (id, ab)
    })

    mapped.show(100, false)
  }


  def sqlInsert(spark: SparkSession, ds2: Dataset[PageView]) = {
    ds2.createOrReplaceTempView("t_pv")
    spark.sql(
      s"""
         |CREATE TABLE t_hive_pv (
         |id string,
         |name string)
         |STORED AS PARQUET
       """.stripMargin)
    val df = spark.sql("insert into t_hive_pv select id, name from t_pv where vtm > 10")
    df.show()
  }

  def sqlInsert(spark: SparkSession) = {

  }

  def sort(spark: SparkSession) = {
    spark.sql("")
  }

  def persist(ds2: Dataset[PageView]): Unit = {
    //ds2.persist() //https://endymecy.gitbooks.io/spark-programming-guide-zh-cn/content/programming-guide/rdds/rdd-persistences.html

  }

  //透视可以视为一个聚合操作，通过该操作可以将一个(实际当中也可能是多个)具有不同值的分组列转置为各个独立的列。
  // 透视表在数据分析和报告中占有十分重要的地位，许多流行的数据操纵工具(如pandas、reshape2和Excel)和
  // 数据库(如MS SQL和Oracle 11g)都具有透视数据的能力。
  def pivot(spark: SparkSession, ds2: Dataset[PageView]) = {
    val df = ds2.groupBy("id").pivot("name", Seq("user1", "user2")).sum("vtm")

    //若指定 Seq("user1", "user2"，则下面的结果只有 "user1", "user2" 两列
    df.show(false)
    //user1, user2被转换为列
//    +---+-----+-----+
//    |id |user1|user2|
//    +---+-----+-----+
//    |id3|null |null |
//    |id1|104  |null |
//    |id2|null |4    |
//    |id4|null |null |
//    +---+-----+-----+
  }

  def rxxx(spark: SparkSession, ds2: Dataset[PageView]): Unit = {
    import spark.implicits._
    //概念同 scala 的 reduce
    val r = ds2.reduce((a, b) => new PageView(b.id, b.name, a.vtm + b.vtm, b.url, 0L))

    val keyedDs = ds2.map(p => (p.id, p.ms))

    ds2.groupBy("id").agg("ms" -> "count")

    ds2.rdd.keyBy(_.id).countByKey()

    println(r)
  }

  def jxxx(ds2: Dataset[PageView]): Unit = {
    //        ds2.join(ds3) //不带其他参数 就是 求笛卡尔积，非常耗性能
//    ds2.join()
  }

  def lxxx(ds2: Dataset[PageView]): Unit = {
    ds2.limit(1) //head(x) 返回前几行，limit 返回新的 dataset
  }

  def metadata(spark: SparkSession) = {
    import spark.implicits._
    val st = new StructType(Array(
      StructField(Key.ID, IntegerType, false),
      StructField(Key.NAME, StringType, false, new MetadataBuilder().putString("sec", "a").build()),
      StructField(Key.AGE, IntegerType, true)
    ))

    val df = spark.createDataFrame(
      util.Arrays.asList(Row(1, "a", 11), Row(2, "b", 12), Row(3, "c", 13)), st)
//    df.show()
    df.createOrReplaceTempView("awd")
    spark.sql("show create table awd").show()
  }

  def partition(spark: SparkSession) = {
    import spark.implicits._
    val df = spark.read.text("/Users/pudgebd/Documents/xx/latest_dim/*")
    val df2 = df.mapPartitions(it => Seq(it.length).toIterator).summary()
    df2.show(false)

    println("------------------" + df.rdd.getNumPartitions)
  }


  def ixxx(ds2: Dataset[PageView]) = {
    println(ds2.inputFiles.foreach(println))
    //        ds2.intersect()//求两个 DataSet 的交集
    println()
  }

  def gxxx(spark: SparkSession, ds2: Dataset[PageView]): Unit = {
    import spark.implicits._
    val kvgDs = ds2.groupByKey(row => row.vtm + 1)
    //        kvgDs.
    //        kvgDs.agg()

    for (bool <- kvgDs.keys) {
      FLOG.log(bool + "")
    }
    println()
  }

  def fxxx(spark: SparkSession, ds2: Dataset[PageView]) = {
    import spark.implicits._
    ds2.filter("vtm > 10").show()
    ds2.filter($"vtm" > 20).show()
    //        ds2.foreachPartition() ????
    println()
  }

  //描述数字字段（可全部），包括 count, mean, stddev(标准差Standard Deviation ，中文环境中又常称均方差，是方差的平方根),
  // min, and max
  def dxxx(ds: Dataset[PageView]): Unit = {
    ds.describe("vtm").show()
    ds.dropDuplicates(Array("url")).show()
    println()
  }

  def cube(ds: Dataset[PageView]): Unit = {
    val col = ds.apply("id")
    ds("id")
    //以上效果相同
    //cube 和 groupBy 的区别：cube 会拿出一个字段有值，另一个是null 的情况，而 groupBy 不会，详见下面
    //http://stackoverflow.com/questions/37975227/what-is-the-difference-between-cube-and-groupby-operators
    ds.cube("vtm", "ms").max().show(false)
  }

  //    +----+----+--------+-------+
  //    |vtm |ms  |max(vtm)|max(ms)|
  //    +----+----+--------+-------+
  //    |3   |null|3       |543    | //只按照vtm=3是分组，不考虑ms
  //    |null|215 |2       |215    |
  //    |2   |123 |2       |123    | //按照vtm=3，ms=123 分组
  //    |1   |null|1       |6521   |
  //    +----+----+--------+-------+
  //    ...

  //A similar function to cube is rollup which computes hierarchical subtotals from left to right:
  //注意是相似的
  def rollup(ds: Dataset[PageView]): Unit = {
    ds.rollup("vtm", "ms").max().show(false)
  }

  def as(ds: Dataset[PageView]): Unit = {
    ds.as("dss")
  }

  def agg(ds: Dataset[PageView]): Unit = {
    //        ds.createOrReplaceTempView("default")

    //不加groupby 就无法区分 id，可用的方法只有 avg, max, min, sum, count
    ds.groupBy("id").agg("id" -> "count", "url" -> "count").show()
    //        +---+---------+----------+
    //        | id|count(id)|count(url)|
    //        +---+---------+----------+
    //        |id3|        1|         1|
    //        |id1|        3|         3|
    //        |id2|        2|         2|
    //        |id4|        2|         2|
    //        +---+---------+----------+
  }

}
