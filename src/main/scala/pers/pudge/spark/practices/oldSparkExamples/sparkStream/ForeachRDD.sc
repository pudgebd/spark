//Design Patterns for using foreachRDD

//dstream.foreachRDD { rdd =>
//    rdd.foreachPartition { partitionOfRecords =>
//        val connection = createNewConnection()
//        partitionOfRecords.foreach(record => connection.send(record))
//        connection.close()
//    }
//}
//
//
//
//dstream.foreachRDD { rdd =>
//    rdd.foreachPartition { partitionOfRecords =>
//        // ConnectionPool is a static, lazily initialized pool of connections
//        val connection = ConnectionPool.getConnection()
//        partitionOfRecords.foreach(record => connection.send(record))
//        ConnectionPool.returnConnection(connection)  // return to the pool for future reuse
//    }
//}