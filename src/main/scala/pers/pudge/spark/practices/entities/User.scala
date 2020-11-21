package pers.pudge.spark.practices.entities

case class User(id: Long, name: String, ms: Long = 0L) {

}

object User {

  def copyAndSetId(u: User): User = {
    return User(u.id, u.name, u.ms)
  }

  def instanceWithAutoName(id: Long, ms: Long): User = {
    return User(id, id + "n", ms)
  }

}