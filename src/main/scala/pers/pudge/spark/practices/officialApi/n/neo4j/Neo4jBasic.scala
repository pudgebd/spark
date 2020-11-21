package pers.pudge.spark.practices.officialApi.n.neo4j

import org.apache.spark.rdd.RDD
import org.apache.spark.sql.{Row, SparkSession}
import org.neo4j.driver.internal.InternalNode
import org.slf4j.LoggerFactory
import pers.pudge.spark.practices.officialApi.g.graphx.CrGraphxBasic
import org.neo4j.spark.Neo4j
import pers.pudge.spark.practices.entities.graph.Person

class Neo4jBasic extends Neo4jHelper with Serializable {

  val LOG = LoggerFactory.getLogger(classOf[Neo4jBasic])


  def loadXXRdds(neo4j: Neo4j) = {
//    val rdd = neo4j.cypher(cypher).loadRdd[Long] //只能用于范型是基本类型的情况
//    loadRelRdd(neo4j)
//    loadRowRdd(neo4j)
    loadNodeRdds(neo4j)
  }


  def loadDataFrame(neo4j: Neo4j) = {
    val cypher = "MATCH (tom {name: \"Tom Hanks\"}) RETURN tom.born, tom.name"
    val df = neo4j.cypher(cypher).loadDataFrame //若返回的数据不为空，则可以没有schema (("born", "INT"), ("name", "STRING"))

    //TODO 若返回 return tom，则 tom 是一个 InternalNode，下面两种写法都会报错
    df.collect().foreach(row => {
      println(row.toSeq.mkString(", "))
      println(row.get(0).asInstanceOf[InternalNode].asValue().asMap())
    })
  }

  /**
    * 似乎只有一些简单的用法
    *
    * GraphFrame 基于 Spark SQL 的 DataFrame，继承了 DataFrame 扩展性和高性能。
    * 并且可以提供支持 Scala、Java 和 Python 等语言的统一 API。
    */
  def loadGraphFrame(neo4j: Neo4j) = {
    import org.graphframes._
    val cypher = "MATCH (tom {name: \"Tom Hanks\"}) RETURN tom"
    val graphFrame = neo4j.cypher(cypher).loadGraphFrame

    graphFrame.triplets.collect().foreach(row => {
      println(row.toSeq.mkString(", "))
    })
//    graphFrame.aggregateMessages.sendToDst("")

  }

}
