package pers.pudge.spark.practices.oldSparkExamples.hadoop

import java.io.File

import org.apache.hadoop.fs.Path
import org.apache.spark.sql.SparkSession

import scala.io.Source._

/**
  * Simple test for reading and writing to a distributed
  * file system.  This example does the following:
  *
  *   1. Reads local file
  *   2. Computes word count on local file
  *   3. Writes local file to a DFS
  *   4. Reads the file back from the DFS
  *   5. Computes word count on the file using Spark
  *   6. Compares the word count results
  */
object DFSReadWriteTest {
  // main method params: localFilePath dfsDirPath

  private val NPARAMS = 2
  private var localFilePath: File = new File(".")
  private var dfsDirPath: String = ""

  def main(args: Array[String]): Unit = {
    parseArgs(args)

    println("Performing local word count")
    val fileContents = readFile(localFilePath.toString())
    val localWordCount = runLocalWordCount(fileContents)

    println("Creating SparkSession")
    val spark = SparkSession
      .builder
      .appName("DFS Read Write TestArrayInit")
      .getOrCreate()

    val sc = spark.sparkContext

    println("Writing local file to DFS")
    val dfsWholeDirName = dfsDirPath + "/dfs_read_write_test"
    HDFSService.instance().delete(new Path(dfsWholeDirName), true)

    val fileRDD = sc.parallelize(fileContents)
    fileRDD.saveAsTextFile(dfsWholeDirName)

    println("Reading file from DFS and running Word Count")
    val readFileRDD = sc.textFile(dfsWholeDirName)

    val afterMap = readFileRDD
      .flatMap(_.split(" "))
      .flatMap(_.split("\t"))
      .filter(_.nonEmpty)
      .map(w => (w, 1))

    val afterCbk = afterMap.countByKey()
    //        afterCbk.
    val dfsWordCount = afterCbk.values.sum

    spark.stop()

    if (localWordCount == dfsWordCount) {
      println(s"Success! Local Word Count ($localWordCount) " +
        s"and DFS Word Count ($dfsWordCount) agree.")
    } else {
      println(s"Failure! Local Word Count ($localWordCount) " +
        s"and DFS Word Count ($dfsWordCount) disagree.")
    }

  }

  private def readFile(filename: String): List[String] = {
    val lineIter: Iterator[String] = fromFile(filename).getLines()
    val lineList: List[String] = lineIter.toList
    lineList
  }

  private def parseArgs(args: Array[String]): Unit = {
    if (args.length != NPARAMS) {
      printUsage()
      System.exit(1)
    }

    var i = 0

    localFilePath = new File(args(i))
    if (!localFilePath.exists) {
      System.err.println("Given path (" + args(i) + ") does not exist.\n")
      printUsage()
      System.exit(1)
    }

    if (!localFilePath.isFile) {
      System.err.println("Given path (" + args(i) + ") is not a file.\n")
      printUsage()
      System.exit(1)
    }

    i += 1
    dfsDirPath = args(i)
  }

  private def printUsage(): Unit = {
    val usage: String = "DFS Read-Write TestArrayInit\n" +
      "\n" +
      "Usage: localFile dfsDir\n" +
      "\n" +
      "localFile - (string) local file to use in test\n" +
      "dfsDir - (string) DFS directory for read/write tests\n"

    println(usage)
  }

  def runLocalWordCount(fileContents: List[String]): Int = {
    fileContents.flatMap(_.split(" "))
      .flatMap(_.split("\t"))
      .filter(_.nonEmpty)
      .groupBy(k => k)
      .mapValues(_.size)
      .values
      .sum
  }
}

// scalastyle:on println
