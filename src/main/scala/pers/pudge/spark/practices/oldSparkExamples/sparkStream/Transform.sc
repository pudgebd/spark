//The transform operation (along with its variations like transformWith)
// allows arbitrary RDD-to-RDD functions to be applied on a DStream.
// It can be used to apply any RDD operation that is not exposed in the DStream API.
// For example, the functionality of joining every batch in a data stream with
// another dataset is not directly exposed in the DStream API.
// However, you can easily use transform to do this. This enables very powerful possibilities.
// For example, one can do real-time data cleaning by joining the input data stream with precomputed
// spam information (maybe generated with Spark as well) and then filtering based on it.

//http://www.jianshu.com/p/4ff6afbbafe4

//val spamInfoRDD = ssc.sparkContext.newAPIHadoopRDD(...) // RDD containing spam information
//
//val cleanedDStream = wordCounts.transform(rdd => {
//    rdd.joinVertices(spamInfoRDD).filter(...) // joinVertices data stream with spam information to do data cleaning
//    ...
//})
