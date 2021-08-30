package pers.pudge.spark.practices.officialApi.g.graphx

import org.apache.spark.graphx._
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.{SaveMode, SparkSession}
import org.slf4j.LoggerFactory
import pers.pudge.spark.practices.entities
import pers.pudge.spark.practices.entities.graph.{OpCustomerPo, OpRoomCsmPo, OpRoomPo}
import pers.pudge.spark.practices.utils.FLOG
import pers.pudge.spark.practices.utils.constants.{Fields, Table}

class CrGraphxBasic extends CrGraphxHelper with Serializable {

  val LOG = LoggerFactory.getLogger(classOf[CrGraphxBasic])


  def addTestData(spark: SparkSession) = {
    import spark.implicits._
    spark.createDataset(Seq(OpCustomerPo("c1", 0, 1), OpCustomerPo("c2", 0, 2), OpCustomerPo("c3", 1, 3)))
      .write.mode(SaveMode.Overwrite).saveAsTable(Table.OP_CUSTOMER)

    spark.createDataset(Seq(OpRoomPo("r1", 1), OpRoomPo("r2", 2)))
      .write.mode(SaveMode.Overwrite).saveAsTable(Table.OP_ROOM)

    spark.createDataset(
      Seq(
        OpRoomCsmPo(1, 1, "1", 1), OpRoomCsmPo(1, 2, "2", 2),
        OpRoomCsmPo(1, 3, "1", 3), OpRoomCsmPo(2, 3, "2", 4)
      )
    )
      .write.mode(SaveMode.Overwrite).saveAsTable(Table.OP_ROOM_CUSTOMER)
  }



  def graphx(spark: SparkSession) = {
    import spark.implicits._
    val csmRdd = spark.table(Table.OP_CUSTOMER).as[OpCustomerPo].map(mapCsmToVertex(_)).rdd
    val roomRdd = spark.table(Table.OP_ROOM).as[OpRoomPo].map(mapRoomToVertex(_)).rdd
    val csmRoomRdd = spark.table(Table.OP_ROOM_CUSTOMER).as[OpRoomCsmPo].map(mapCsmRoomToRelations(_)).rdd

    val vertics = csmRdd.union(roomRdd)
//    vertics.collect().foreach(println(_))
    val graph = Graph(vertics, csmRoomRdd)

//    graph.printTriplets.collect().foreach(triplet => {
//      println(triplet.srcId + " is the " + triplet.attr + " of " + triplet.dstId)
//    })

    val vertexRdd = graph.aggregateMessages[Double](
      triplet => {
//        val srcId = triplet.srcId
//        val dstId = triplet.dstId
//        val vdMap = triplet.srcAttr
        val roomCustType = triplet.attr
        if (roomCustType == null || roomCustType.isEmpty) {
          triplet.sendToSrc(0D)
        } else {
          triplet.sendToSrc(roomCustType.toDouble)
        }
      },
      (tp1, tp2) => {
        (tp1 + tp2) / 2
      },
      TripletFields.All  //这个真的有效？
    )

//    println("vertexRdd.count(): " + vertexRdd.count())
//    vertexRdd.collect().foreach(println(_))
    vertexRdd.take(10).foreach(println(_))

//    val avgRctVRdd = vertexRdd.mapValues(
//      (vid, tp) => {
//        val counts = tp._1
//        val totalRct = tp._2
//        if (counts == 0) {
//          0D
//        } else {
//          totalRct / counts
//        }
//      }
//    )
//    avgRctVRdd.collect().foreach(println(_))
//    println(avgRctVRdd.first().toString())
  }




}
