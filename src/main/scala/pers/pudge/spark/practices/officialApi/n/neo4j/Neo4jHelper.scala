package pers.pudge.spark.practices.officialApi.n.neo4j

import org.apache.spark.rdd.RDD
import org.apache.spark.sql.Row
import org.neo4j.driver.internal.InternalNode
import org.neo4j.spark.Neo4j

class Neo4jHelper extends Serializable {

  //TODO No relationship query provided either as pattern or with rels()
  def loadRelRdd(neo4j: Neo4j) = {
//    val cypher = "MATCH (people:Person)-[relatedTo]-(:Movie {title: \"Cloud Atlas\"}) RETURN people.name, Type(relatedTo), relatedTo"
    val cypher = "MATCH (tom {name: \"Tom Hanks\"}) RETURN tom"
    val relRdd = neo4j.cypher(cypher).loadRelRdd
    relRdd.collect().foreach(row => {
      println(row.toSeq.mkString(", "))
    })
  }


  def loadRowRdd(neo4j: Neo4j) = {
    val cypher = "MATCH (tom {name: \"Tom Hanks\"}) RETURN tom"
    val rowRdd = neo4j.cypher(cypher).partitions(1).batch(1).loadRowRdd

    rowRdd.collect().foreach(row => {
      println(row.toSeq.mkString(", ")) //node<71>
      //row 是 InternalNode
    })
  }


  def loadNodeRdds(neo4j: Neo4j) = {
    val cypher = "MATCH (tom {name: \"Tom Hanks\"}) RETURN tom"
    val query = neo4j.cypher(cypher)

    query.loadNodeRdds.collect().foreach(node => {
      val interNode = node.get(0).asInstanceOf[InternalNode]
      val asVal = interNode.asValue()
      println(asVal.asMap()) //{born=1956, name=Tom Hanks}
      println(asVal.`type`().name()) //NODE
//      println(asVal.asBoolean()) //Cannot coerce NODE to Java boolea
//      println(asVal.asIsoDuration()) //Cannot coerce NODE to Duration
//      println(asVal.asList()) //Cannot coerce NODE to Java List
      println(asVal.asObject()) //node<71>
//      println(asVal.get(0) + "_" + asVal.get(1)) //NODE is not an indexed collection
      println(asVal.get("born") + "_" + asVal.get("name"))
    })
  }




}
