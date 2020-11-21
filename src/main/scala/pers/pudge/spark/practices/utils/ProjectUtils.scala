package pers.pudge.spark.practices.utils

import pers.pudge.spark.practices.utils.constants.{Fields, Punc}

object ProjectUtils {

  val suffix = "_rest_300s"

  //第一批导mdm 14项目
  val commid14 = "100059,100325,100550,100287,100488,100500,100501,100380,100069,100253,100502,100506,100060,100549"
  //所有北京项目+14项目 去重
  //  val commid14 = "100009,100046,100047,100048,100059,100060,100069,100071,100091,100210,100249,100250,100253,100262,100273,100287,100312,100325,100326,100359,100380,100381,100412,100430,100442,100474,100488,100499,100583,100500,100501,100502,100506,100549,100550"
  //14项目排除北京的
//  val commid14 = "100500,100501,100502,100506,100549,100550"
  //所有北京项目
//  val commid14 = "100009,100046,100047,100048,100059,100060,100069,100071,100091,100210,100249,100250,100253,100262,100273,100287,100312,100325,100326,100359,100380,100381,100412,100430,100442,100474,100488,100499,100583"
  private val inOrNotIn14Commid = s"in ($commid14)"

  def ifIn14Commid(): Boolean = {
    return inOrNotIn14Commid.startsWith("in")
  }

  val PARTI_NUM_1 = 1
  val PARTI_NUM_100 = 100

  /**
    *
    */
  def tableSuffix(table: String, addSuffix: Boolean): String = {
    if (addSuffix) {
      return table + suffix
    } else {
      return table
    }
  }

  //原18个项目排除4个预接管的项目
  def getInOrNotIn14Commid(alias: String = ""): String = {
    var realAlia = ""
    if (alias.nonEmpty) {
      realAlia = alias + Punc.Dot
    }

    if (ifIn14Commid()) {
      return s"$realAlia${Fields.COMM_ID} $inOrNotIn14Commid"
    } else {
      return s"($realAlia${Fields.COMM_ID} $inOrNotIn14Commid or $realAlia${Fields.COMM_ID} is null)"
    }
  }

}
