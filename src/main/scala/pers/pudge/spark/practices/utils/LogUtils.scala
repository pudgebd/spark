package pers.pudge.spark.practices.utils

object LogUtils {

//  ---------------------------------------------------
//  ${ProjectUtils.getInOrNotIn14Commid()}
  def getBeginLog(appName: String): String = {
    val log =
      s"""
         |---------------------------------------------------
         |----------------- $appName begin ------------------
         |---------------------------------------------------
       """.stripMargin
    return log
  }


//  ---------------------------------------------------
//  ${ProjectUtils.getInOrNotIn14Commid()}
  def getEndLog(appName: String): String = {
    val log =
      s"""
         |---------------------------------------------------
         |----------------- $appName end --------------------
         |---------------------------------------------------
       """.stripMargin
    return log
  }


}
