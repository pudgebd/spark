package pers.pudge.spark.practices.utils

import java.io.File
import java.nio.charset.Charset
import java.text.SimpleDateFormat
import java.util

import com.google.common.io.Files
import pers.pudge.spark.practices.utils.constants.Key

/**
  * 其他 excuter 无法通过 SystemPropUtils.initPropFile(confPath) 初始化日志路径，
  * 如果一开始就确定了一个路径，则是可以的
  */
object FLOG {

  val minDataFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
  val logFile = new File(Key.DLOG_FILE_PATH)
  //"/tmp/log.log"   Key.DLOG_FILE_PATH
  val errLogFile = new File(Key.DLOG_FILE_PATH + ".error")
  val NEW_LINE = "\n"


  def log(tuple: (String, Long)): Unit = {
    val str = s"${minDataFormat.format(new util.Date())}   ${tuple._1}_${tuple._2}\n"
    Files.append(str, logFile, Charset.defaultCharset())
  }

  def info(str: String): Unit = {
    log(str)
  }

  def info(str: String, e: Exception): Unit = {
//    log(GeneralUtils.getAllStackTraceFromExp(e))
  }

  def log(str: String): Unit = {
    Files.append(s"${minDataFormat.format(new util.Date())}   $str\n", logFile, Charset.defaultCharset())
  }

  def error(str: String): Unit = {
    errLog(str)
  }

  def error(str: String, e: Exception): Unit = {
//    errLog(GeneralUtils.getAllStackTraceFromExp(e))
  }

  def errLog(str: String): Unit = {
    Files.append(s"${minDataFormat.format(new util.Date())}   $str\n", errLogFile, Charset.defaultCharset())
  }

}
