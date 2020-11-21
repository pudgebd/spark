package pers.pudge.spark.practices.sparkStream

import java.io.{BufferedReader, InputStreamReader}
import java.net.Socket
import java.nio.charset.StandardCharsets

//import com.typesafe.scalalogging.log4j.Logging
import org.apache.spark.storage.StorageLevel
import org.apache.spark.streaming.receiver.Receiver

//Using the custom receiver in a Spark Streaming application

// Assuming ssc is the StreamingContext
//val customReceiverStream = ssc.receiverStream(new CustomReceiver(host, port))
//val words = lines.flatMap(_.split(" "))

class CustomReceiver(host: String, port: Int)
  extends Receiver[String](StorageLevel.MEMORY_AND_DISK_2) {

  override def onStart(): Unit = {
    // Start the thread that receives data over a connection
    new Thread("Socket Receiver") {
      override def run() {
        receive()
      }
    }.start()
  }

  private def receive(): Unit = {
    var socket: Socket = null
    var userInput: String = null

    try {
      socket = new Socket(host, port)

      // Until stopped or connection broken continue reading
      val reader = new BufferedReader(
        new InputStreamReader(socket.getInputStream, StandardCharsets.UTF_8))

      userInput = reader.readLine()
      while (!isStopped() && userInput != null) {
        store(userInput)
        userInput = reader.readLine()
      }

      reader.close()
      socket.close()

      // Restart in an attempt to connect again when server is active again
      restart("Trying to connect again")
    } catch {
      case e: java.net.ConnectException =>
        // restart if could not connect to server
        restart("Error connecting to " + host + ":" + port, e)

      case t: Throwable =>
        // restart if there is any other error
        restart("Error receiving data", t)
    }
  }

  override def onStop(): Unit = {
    // There is nothing much to do as the thread calling receive()
    // is designed to stop by itself if isStopped() returns false
  }


}
