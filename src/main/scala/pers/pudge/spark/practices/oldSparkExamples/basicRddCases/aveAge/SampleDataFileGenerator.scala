package pers.pudge.spark.practices.oldSparkExamples.basicRddCases.aveAge

import java.io.{File, FileWriter}
import java.util.Random


/**
  * Created by pudgebd on 16-8-3.
  */
object SampleDataFileGenerator {

  def main(args: Array[String]) {
    val writer = new FileWriter(new File("/home/pudgebd/sample_age_data.txt"))
    val random = new Random()

    for (i <- 1 to 100000) {
      writer.write(i + " " + random.nextInt(100))
      writer.write(System.getProperty("line.separator"))
    }
    writer.flush()
    writer.close()
  }

}
