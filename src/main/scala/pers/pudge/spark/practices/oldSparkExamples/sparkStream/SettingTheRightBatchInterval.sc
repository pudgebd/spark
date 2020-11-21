//http://spark.apache.org/docs/latest/streaming-programming-guide.html#data-serialization

//Setting the Right Batch Interval

//A good approach to figure out the right batch size for your application is to test it
// with a conservative batch interval (say, 5-10 seconds) and a low data rate. To verify
// whether the system is able to keep up with the data rate, you can check the value of
// the end-to-end delay experienced by each processed batch (either look for “Total delay”
// in Spark driver log4j logs, or use the StreamingListener interface). If the delay is maintained
// to be comparable to the batch size, then system is stable. Otherwise, if the delay is continuously
// increasing, it means that the system is unable to keep up and it therefore unstable.
// Once you have an idea of a stable configuration, you can try increasing the data rate and/or
// reducing the batch size. Note that a momentary increase in the delay due to temporary data rate
// increases may be fine as long as the delay reduces back to a low value (i.e., less than batch size).