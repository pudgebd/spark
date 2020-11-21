package pers.pudge.spark.practices.officialApi.t.typee

import scala.reflect.runtime.universe._

/**
  * https://blog.csdn.net/bluishglc/article/details/52596696
  */
object TypeTagWeekTTClassT {


  def paramInfo1[T](x: T)(implicit tag: TypeTag[T]): Unit = {
    val targs = tag.tpe match { case TypeRef(_, _, args) => args }
    println(s"type of $x has type arguments $targs")
  }

  def paramInfo2[T: TypeTag](x: T): Unit = {
    val targs = typeOf[T] match { case TypeRef(_, _, args) => args }
    println(s"type of $x has type arguments $targs")
  }

  def weakParamInfo[T](x: T)(implicit tag: WeakTypeTag[T]): Unit = {
    val targs = tag.tpe match { case TypeRef(_, _, args) => args }
    println(s"type of $x has type arguments $targs")
  }

  def main(args: Array[String]): Unit = {
    val list = List(1, 2)
    paramInfo1(list)
    paramInfo2(list)
    weakParamInfo(list)
  }

}
