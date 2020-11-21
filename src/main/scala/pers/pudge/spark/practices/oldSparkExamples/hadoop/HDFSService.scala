package pers.pudge.spark.practices.oldSparkExamples.hadoop

import java.io.{BufferedInputStream, FileInputStream}

import org.apache.hadoop.conf._
import org.apache.hadoop.fs._

/**
  * Created by pudgebd on 16-9-9.
  */
object HDFSService {

  private val conf = new Configuration()
  private val CORE_SITE_CONF = new Path("/home/pudgebd/scala/ideaprojects/spark-s/src/main/resources/hadoop/core-site.xml")
  private val HDFS_SITE_CONF = new Path("/home/pudgebd/scala/ideaprojects/spark-s/src/main/resources/hadoop/hdfs-site.xml")

  //没有这步会读写到本地
  conf.addResource(CORE_SITE_CONF)
  conf.addResource(HDFS_SITE_CONF)

  private val fileSystem = FileSystem.get(conf)

  def instance(): FileSystem = {
    fileSystem
  }

  def main(args: Array[String]) {
    //以下两种 path 都可以
    val hdfsPath = "hdfs://localhost:9000/user/pudgebd/tmp/approve.xlsx"
    //        val hdfsPath = "/user/pudgebd/tmp/taskref.txt"

    HDFSService.mySaveFile(
      "/home/pudgebd/taskref.txt", hdfsPath)
  }

  def mySaveFile(localFilePath: String, hdfsPath: String) = {
    val input = new BufferedInputStream(new FileInputStream(localFilePath))
    val path = new Path(hdfsPath)
    val out = fileSystem.create(path, true)

    val buffer = new Array[Byte](1024)
    var readCount = input.read(buffer)

    while (readCount > 0) {
      out.write(buffer)
      readCount = input.read(buffer)
    }

    out.close()
    input.close()

    //same as below
    //        fileSystem.copyFromLocalFile(false, true, new Path(localFilePath), new Path(hdfsPath))
  }

}
