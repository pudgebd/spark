//cache 的一种使用方式

//Instead of using dstream.cache I would recommend to use dstream.foreachRDD or dstream.transform to
// gain direct access to the underlying RDD and apply the persist operation.
// We use matching persist and unpersist around the iterative code to clean up memory as soon as possible:

//dstream.foreachRDD{rdd =>
//    rdd.cache()
//    col.foreach{id => rdd.filter(elem => elem.id == id).map(...).saveAs...}
//    rdd.unpersist(true)
//}