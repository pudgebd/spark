package pers.pudge.spark.practices.officialApi.j

import org.apache.spark.sql.SparkSession
import pers.pudge.spark.practices.entities.User
import pers.pudge.spark.practices.utils.constants.{Key, MT}

object JoinType {


  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("JoinType")
      .master(MT.LOCAL_MASTER)
      .getOrCreate()
    import spark.implicits._

    val leftData = Seq(User.instanceWithAutoName(1, 11), User.instanceWithAutoName(2, 21),
      User.instanceWithAutoName(3, 31), User.instanceWithAutoName(4, 41))

    val rightData = Seq(User.instanceWithAutoName(3, 32), User.instanceWithAutoName(4, 42),
      User.instanceWithAutoName(5, 52), User.instanceWithAutoName(6, 62))

    val leftDS = spark.createDataset(leftData)
    val rightDS = spark.createDataset(rightData)

    //        leftDS.crossJoin(rightDS).show() //笛卡尔积
            leftDS.join(rightDS, Key.ID).show()
    //        leftDS.join(rightDS, Seq(Key.ID, Key.NAME)).show() //没join的列并排显示

    //        leftDS.join(rightDS, Seq(Key.ID), "fullouter").show()

    //        leftDS.join(rightDS, Seq(Key.ID, Key.NAME), "leftsemi").show() //只返回左边有 join 的数据，不返回右边的

    //        leftDS.join(rightDS, Seq(Key.ID), "leftanti").show() //返回左边没有 join 的数据，不返回右边的

    spark.stop()
  }


}
