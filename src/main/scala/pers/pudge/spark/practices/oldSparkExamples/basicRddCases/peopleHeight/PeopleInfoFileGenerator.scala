package pers.pudge.spark.practices.oldSparkExamples.basicRddCases.peopleHeight

import java.io.{File, FileWriter}
import java.util.Random

/**
  * Created by pudgebd on 16-8-4.
  */
object PeopleInfoFileGenerator {

  def main(args: Array[String]) {
    val writer = new FileWriter(new File("/home/pudgebd/peopleHeight.txt"))
    val random = new Random()

    for (i <- 1 to 100000) {
      writer.append(i.toString).append(" ")

      if (i % 2 == 0) {
        writer.append("F")
      } else {
        writer.append("M")
      }
      writer.append(" ")
      writer.append(random.nextInt(200).toString).append(System.getProperty("line.separator"))
    }

    writer.flush()
    writer.close()
  }

}
