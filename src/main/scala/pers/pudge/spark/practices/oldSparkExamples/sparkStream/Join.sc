// 1.Stream-stream joins

//val stream1: DStream[String, String] = ...
//val stream2: DStream[String, String] = ...
//val joinedStream = stream1.join(stream2)

//it is often very useful to do joins over windows of the streams

//val windowedStream1 = stream1.window(Seconds(20))
//val windowedStream2 = stream2.window(Minutes(1))
//val joinedStream = windowedStream1.join(windowedStream2)


// 2.Stream-dataset joins

//val dataset: RDD[String, String] = ...
//val windowedStream = stream.window(Seconds(20))...
//val joinedStream = windowedStream.transform { rdd => rdd.join(dataset) }

