package pers.pudge.spark.practices.technical

import org.apache.spark.sql.SparkSession
import org.python.core.{PyFunction, PyInteger, PyObject}
import org.python.util.PythonInterpreter
import pers.pudge.spark.practices.utils.constants.MT

object RunWithPython {

  val APP_NAME = "RunWithPython"

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .master(MT.LOCAL_MASTER)
      .appName(APP_NAME)
      .enableHiveSupport()
      //.config(Key.SPARK_SQL_WAREHOUSE_DIR, MT.HIVE_WARE)
      .getOrCreate()
    import spark.implicits._

    val df1 = spark.createDataFrame(Seq((1, 2), (31, 25), (1, 72), (21, 2), (14, 92))).toDF("id", "age")
    val pyFunc = "add"
    val python = "def add(a,b):\n    return a + b"

    val df2 = df1.map(row => {
      val id = row.getInt(0)
      val age = row.getInt(1)

      val interpreter = new PythonInterpreter
      interpreter.exec(python)

      val pyFunction = interpreter.get(pyFunc, classOf[PyFunction])
      val pyobj = pyFunction.__call__(new PyInteger(id), new PyInteger(age))
      pyobj.toString.toInt
    })

    df2.toDF("res").show(false)

    spark.stop()
  }

}
