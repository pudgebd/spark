package pers.pudge.spark.practices.oldSparkExamples.ml.features

import org.apache.spark.ml.feature.{Interaction, VectorAssembler}
// $example off$
import org.apache.spark.sql.SparkSession

object InteractionExample {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder
      .appName("InteractionExample")
      .master("local[4]")
      .getOrCreate()

    // $example on$
    val df = spark.createDataFrame(Seq(
      (1, 1, 2, 3, 8, 4, 5),
      (2, 4, 3, 8, 7, 9, 8),
      (3, 6, 1, 9, 2, 3, 6),
      (4, 10, 8, 6, 9, 4, 5),
      (5, 9, 2, 7, 10, 7, 3),
      (6, 1, 1, 4, 2, 8, 4)
    )).toDF("id1", "id2", "id3", "id4", "id5", "id6", "id7")

    val assembler1 = new VectorAssembler().
      setInputCols(Array("id2", "id3", "id4")).
      setOutputCol("vec1")

    val assembled1 = assembler1.transform(df)
    //        assembled1.show(10, false)
    //        +---+---+---+---+---+---+---+--------------+
    //        |id1|id2|id3|id4|id5|id6|id7|vec1          |
    //        +---+---+---+---+---+---+---+--------------+
    //        |1  |1  |2  |3  |8  |4  |5  |[1.0,2.0,3.0] |
    //        |2  |4  |3  |8  |7  |9  |8  |[4.0,3.0,8.0] |
    //        |3  |6  |1  |9  |2  |3  |6  |[6.0,1.0,9.0] |
    //        |4  |10 |8  |6  |9  |4  |5  |[10.0,8.0,6.0]|
    //        |5  |9  |2  |7  |10 |7  |3  |[9.0,2.0,7.0] |
    //        |6  |1  |1  |4  |2  |8  |4  |[1.0,1.0,4.0] |
    //        +---+---+---+---+---+---+---+--------------+

    val assembler2 = new VectorAssembler().
      setInputCols(Array("id5", "id6", "id7")).
      setOutputCol("vec2")

    val assembled2 = assembler2.transform(assembled1).select("id1", "vec1", "vec2")
    //        assembled2.show(10, false)
    //        +---+--------------+--------------+
    //        |id1|vec1          |vec2          |
    //        +---+--------------+--------------+
    //        |1  |[1.0,2.0,3.0] |[8.0,4.0,5.0] |
    //        |2  |[4.0,3.0,8.0] |[7.0,9.0,8.0] |
    //        |3  |[6.0,1.0,9.0] |[2.0,3.0,6.0] |
    //        |4  |[10.0,8.0,6.0]|[9.0,4.0,5.0] |
    //        |5  |[9.0,2.0,7.0] |[10.0,7.0,3.0]|
    //        |6  |[1.0,1.0,4.0] |[2.0,8.0,4.0] |
    //        +---+--------------+--------------+

    val interaction = new Interaction()
      .setInputCols(Array("id1", "vec1", "vec2"))
      .setOutputCol("interactedCol")

    val interacted = interaction.transform(assembled2)

    interacted.show(10, truncate = false)
    //vec1的元素 分别去乘 vec2 的元素，得到 interactedCol
    //        +---+--------------+--------------+------------------------------------------------------+
    //        |id1|vec1          |vec2          |interactedCol                                         |
    //        +---+--------------+--------------+------------------------------------------------------+
    //        |1  |[1.0,2.0,3.0] |[8.0,4.0,5.0] |[8.0,4.0,5.0,16.0,8.0,10.0,24.0,12.0,15.0]            |
    //        |2  |[4.0,3.0,8.0] |[7.0,9.0,8.0] |[56.0,72.0,64.0,42.0,54.0,48.0,112.0,144.0,128.0]     |
    //        |3  |[6.0,1.0,9.0] |[2.0,3.0,6.0] |[36.0,54.0,108.0,6.0,9.0,18.0,54.0,81.0,162.0]        |
    //        |4  |[10.0,8.0,6.0]|[9.0,4.0,5.0] |[360.0,160.0,200.0,288.0,128.0,160.0,216.0,96.0,120.0]|
    //        |5  |[9.0,2.0,7.0] |[10.0,7.0,3.0]|[450.0,315.0,135.0,100.0,70.0,30.0,350.0,245.0,105.0] |
    //        |6  |[1.0,1.0,4.0] |[2.0,8.0,4.0] |[12.0,48.0,24.0,12.0,48.0,24.0,48.0,192.0,96.0]       |
    //        +---+--------------+--------------+------------------------------------------------------+

    spark.stop()
  }
}