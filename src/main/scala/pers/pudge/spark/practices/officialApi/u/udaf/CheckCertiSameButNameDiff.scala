package pers.pudge.spark.practices.officialApi.u.udaf

import org.apache.spark.sql.Row
import org.apache.spark.sql.expressions.{MutableAggregationBuffer, UserDefinedAggregateFunction}
import org.apache.spark.sql.types._


class CheckCertiSameButNameDiff extends UserDefinedAggregateFunction {


  override def inputSchema: StructType =
    new StructType().add("a", StringType).add("b", IntegerType)
      .add("c", StringType)


  override def bufferSchema: StructType =
    new StructType().add("arr", ArrayType(ArrayType(StringType)))

  override def dataType: DataType = MapType(StringType, IntegerType)

  override def deterministic: Boolean = true

  override def initialize(buffer: MutableAggregationBuffer): Unit = {
    buffer.update(0, Seq.empty[Seq[String]])
  }

  override def update(buffer: MutableAggregationBuffer, input: Row): Unit = {
    var seq = buffer.getSeq[Seq[String]](0)
    val dsId = input.getString(0)
    var commid: String = null
    if (input.get(1) != null) {
      commid = input.getInt(1).toString
    }
    val csmName = input.getString(2)

    seq = seq :+ Seq(dsId, commid, csmName)
    buffer.update(0, seq)
  }

  override def merge(buffer1: MutableAggregationBuffer, buffer2: Row): Unit = {
    val newSeq = buffer1.getSeq[Seq[String]](0) ++ buffer2.getSeq[Seq[String]](0)
    buffer1.update(0, newSeq)
  }

  override def evaluate(buffer: Row): Any = {
    val seq = buffer.getSeq[Seq[String]](0)
    var resMap = Map.empty[String, Int]
    var nameSeq = Seq.empty[String]

    for (childArr <- seq if nameSeq.size < 2) {
      val curName = childArr(2)
      if (nameSeq.contains(curName)) {
        //ignore
      } else {
        nameSeq = nameSeq :+ curName
      }
    }

    if (nameSeq.size >= 2) {

      for (childSeq <- seq) {
        val dsId = childSeq.head
        val commid = childSeq(1)

        if (dsId != null && commid != null) {
          resMap = resMap.updated(dsId, commid.toInt)
        }
      }

    }
    return resMap
  }


}
