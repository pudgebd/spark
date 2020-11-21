package pers.pudge.spark.practices.sparkStream

import java.io.File
import java.nio.charset.Charset

import com.google.common.io.Files
import org.apache.spark.SparkConf
import org.apache.spark.rdd.RDD
import org.apache.spark.streaming.{Seconds, StreamingContext, Time}


object MyRecoverableNetworkWordCount {


  def myCreateContext(ip: String, port: Int, outputPath: String, checkpointDirectory: String): StreamingContext = {

    // If you do not see this printed, that means the StreamingContext has been loaded
    // from the new checkpoint
    println("Creating new context")
    val outputFile = new File(outputPath)
    if (outputFile.exists()) outputFile.delete()

    //.setMaster("lcoal[2]")
    val sparkConf = new SparkConf().setAppName("MyRecoverableNetworkWordCount")

    // Create the context with a 1 second batch size
    val sc = new StreamingContext(sparkConf, Seconds(3))
    //        sc.checkpoint(checkpointDirectory)

    val lines = sc.socketTextStream(ip, port)
    val linesStr = lines.flatMap(_ + "")
    //        val words = lines.flatMap(_.split(" "))
    //        val wordCounts = words.map((_, 1)).reduceByKey(_ + _)

    linesStr.foreachRDD { (rdd: RDD[Char], time: Time) =>
      val line = rdd.collect().mkString("[", ",", "]")
      Files.append(line + "\n", outputFile, Charset.defaultCharset())
    }
    //        wordCounts.foreachRDD{ (rdd: RDD[(String, Int)], time: Time) =>
    //            val line = rdd.collect().mkString("[", ",", "]")
    //            Files.append(line + "\n", outputFile, Charset.defaultCharset())
    //        }

    sc
  }


  //    def main(args: Array[String]) {
  ////        if (args.length != 4) {
  ////            System.err.println("Your arguments were " + args.mkString("[", ", ", "]"))
  ////            System.exit(1)
  ////        }
  //
  ////        localhost 9999 /home/pudgebd/tmp/sparkstream.txt hdfs://localhost:9000/user/spark/ck_myrec/
  //
  //        val Array(ip, port, outputPath, checkpointDirectory) = args
  //
  //        val ssc = StreamingContext.getOrCreate(checkpointDirectory,
  //            () => myCreateContext(ip, port.toInt, outputPath, checkpointDirectory))
  //        ssc.start()
  //        ssc.awaitTermination()
  //
  ////        val outputPath = "/home/pudgebd/tmp/sparkstream.txt"
  ////        val checkpointDir = "hdfs://localhost:9000/user/spark/ck_myrec/" //hdfs 必须启动
  ////
  ////        val ssc = StreamingContext.getOrCreate(checkpointDir,
  ////            () => myCreateContext("localhost", 9999, outputPath, checkpointDir))
  ////        ssc.start()
  ////        ssc.awaitTermination()
  //    }


}