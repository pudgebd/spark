package pers.pudge.spark.practices.officialApi.g.graphx

import org.apache.spark.graphx.{Edge, VertexId}
import pers.pudge.spark.practices.entities.graph.{OpCustomerPo, OpRoomCsmPo, OpRoomPo}
import pers.pudge.spark.practices.utils.constants.Fields

class CrGraphxHelper extends Serializable {

  val roomIdAddOn = 1000000000000000000L

  def mapCsmToVertex(po: OpCustomerPo): (VertexId, Map[String, String]) = {
    val map = Map(
      Fields.ID -> po.id.toString,
      Fields.CUSTOMER_NAME -> po.customer_name.toString,
      Fields.GENDER -> po.gender.toString
    )
    return po.id -> map
  }


  def mapRoomToVertex(po: OpRoomPo): (VertexId, Map[String, String]) = {
    val newRoomId = po.id + roomIdAddOn
    val map = Map(
      Fields.ID -> newRoomId.toString,
      Fields.ROOM_NAME -> po.room_name.toString
    )
    return newRoomId -> map
  }


  def mapCsmRoomToRelations(po: OpRoomCsmPo): Edge[String] = {
    return Edge(po.customer_id, po.room_id + roomIdAddOn, po.room_cust_type)
  }


  def checkAndGetXxName(name1: String, name2: String): String = {
    if (name1.isEmpty) {
      if (name2.isEmpty) {
        return ""
      } else {
        return name2
      }
    } else {
      if (name2.isEmpty) {
        return name1
      } else {
        return name1 + " and " + name2
      }
    }
  }



}
