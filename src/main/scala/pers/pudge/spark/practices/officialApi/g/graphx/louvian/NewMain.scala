package pers.pudge.spark.practices.officialApi.g.graphx.louvian

import java.util.concurrent.TimeUnit

import org.apache.spark.graphx.{Edge, Graph, PartitionStrategy}
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.{Dataset, SparkSession}
import org.apache.spark.sql.streaming.{OutputMode, Trigger}
import org.apache.spark.storage.StorageLevel
import pers.pudge.spark.practices.officialApi.g.graphx.KafkaSsForGraphx.printTriplets
import pers.pudge.spark.practices.utils.constants.{Key, LocalKafkaCnts, MT}

object NewMain {

  //  val input:String = ""
  //  val output: String = ""
  ////  val master:String="local"
  //  val appName:String="graphX analytic"
  ////  val jars:String=""
  ////  val sparkHome:String=""
  //  val parallelism:Int = -1
  //  val edgedelimiter:String = ","
  //  val minProgress:Int = 2000
  //  val progressCounter:Int = 1
  //  val ipaddress: Boolean = false
  //  val properties:Seq[(String,String)]= Seq.empty[(String,String)]

  def main(args: Array[String]): Unit = {

    // Parse Command line options
    val parser = new scopt.OptionParser[Config](this.getClass().toString()) {
      opt[String]('i', "input") action { (x, c) => c.copy(input = x) } text ("input file or path  Required.")
      opt[String]('o', "output") action { (x, c) => c.copy(output = x) } text ("output path Required")
      opt[String]('m', "master") action { (x, c) => c.copy(master = x) } text ("spark master, local[N] or spark://host:port default=local")
      opt[String]('h', "sparkhome") action { (x, c) => c.copy(sparkHome = x) } text ("SPARK_HOME Required to run on cluster")
      opt[String]('n', "jobname") action { (x, c) => c.copy(appName = x) } text ("job name")
      opt[Int]('p', "parallelism") action { (x, c) => c.copy(parallelism = x) } text ("sets spark.default.parallelism and minSplits on the edge file. default=based on input partitions")
      opt[Int]('x', "minprogress") action { (x, c) => c.copy(minProgress = x) } text ("Number of vertices that must change communites for the algorithm to consider progress. default=2000")
      opt[Int]('y', "progresscounter") action { (x, c) => c.copy(progressCounter = x) } text ("Number of times the algorithm can fail to make progress before exiting. default=1")
      opt[String]('d', "edgedelimiter") action { (x, c) => c.copy(edgedelimiter = x) } text ("specify input file edge delimiter. default=\",\"")
      opt[String]('j', "jars") action { (x, c) => c.copy(jars = x) } text ("comma seperated list of jars")
      opt[Boolean]('z', "ipaddress") action { (x, c) => c.copy(ipaddress = x) } text ("Set to true to convert ipaddresses to Long ids. Defaults to false")
      arg[(String, String)]("<property>=<value>....") unbounded() optional() action { case ((k, v), c) => c.copy(properties = c.properties :+ (k, v)) }
    }
    var edgeFile, outputdir, master, jobname, jars, sparkhome, edgedelimiter = ""
    var properties: Seq[(String, String)] = Seq.empty[(String, String)]
    var parallelism, minProgress, progressCounter = -1
    var ipaddress = false
    parser.parse(args, Config()) map {
      config =>
        edgeFile = config.input
        outputdir = config.output
        master = config.master
        jobname = config.appName
        jars = config.jars
        sparkhome = config.sparkHome
        properties = config.properties
        parallelism = config.parallelism
        edgedelimiter = config.edgedelimiter
        minProgress = config.minProgress
        progressCounter = config.progressCounter
        ipaddress = config.ipaddress
        if (edgeFile == "" || outputdir == "") {
          println(parser.usage)
          sys.exit(1)
        }
    } getOrElse {
      sys.exit(1)
    }

    val spark = SparkSession.builder()
      .appName("graphX analytic")
      .master(MT.LOCAL_MASTER)
      .getOrCreate()
    import spark.implicits._
    val sc = spark.sparkContext

    // read the input into a distributed edge list
    val inputHashFunc = if (ipaddress) (id: String) => IpAddress.toLong(id) else (id: String) => id.toLong
    var offlineEdgeRDD = sc.textFile(edgeFile).map(row => {
      val tokens = row.split(edgedelimiter).map(_.trim())
      tokens.length match {
        case 2 => {
          new Edge(inputHashFunc(tokens(0)), inputHashFunc(tokens(1)), 1L)
        }
        case 3 => {
          new Edge(inputHashFunc(tokens(0)), inputHashFunc(tokens(1)), tokens(2).toLong)
        }
        case _ => {
          throw new IllegalArgumentException("invalid input line: " + row)
        }
      }
    })

    // if the parallelism option was set map the input to the correct number of partitions,
    // otherwise parallelism will be based off number of HDFS blocks
    if (parallelism != -1) offlineEdgeRDD = offlineEdgeRDD.coalesce(parallelism, shuffle = true)
    offlineEdgeRDD.setName("offlineEdgeRDD first load")
    offlineEdgeRDD.persist(StorageLevel.MEMORY_AND_DISK_SER)

    //读取实时边数据，每10秒计算一次
    val ssDf = spark
      .readStream
      .format(Key.KAFKA)
      .option(Key.KAFKA_BOOTSTRAP_SERVERS, LocalKafkaCnts.BOOTSTRAP_SERVERS)
      .option(Key.SUBSCRIBE, Key.MYTOPIC02)
      .load()

    val ssDf2 = ssDf.selectExpr("CAST(value AS STRING) as value")
      .flatMap(row => {
        val valueStr = row.getString(0)
        val arr = valueStr.split(",")
        val newArr = arr.filter(_.length == 3)
        if (newArr.isEmpty) {
          Seq.empty
        }
        Seq(Edge(arr(0).toLong, arr(1).toLong, arr(2).toLong))
      })

    var offlineEdgeRddVer = 0
    var kafkaEdgeRdd: RDD[Edge[Long]] = null
    var mergeKafkaToOfflineCounter = 0

    val query = ssDf2.writeStream
      .outputMode(OutputMode.Append())
      .trigger(Trigger.ProcessingTime(10, TimeUnit.SECONDS)) //多久触发一次
      .foreachBatch((ds, _) => {

      //合并后离线和实时边数据
      var allEdgeRDD: RDD[Edge[Long]] = null
      var needUpdateOfflineRdd = false

      if (kafkaEdgeRdd == null) {
        kafkaEdgeRdd = ds.rdd
        kafkaEdgeRdd.setName("kafkaEdgeRdd == null")
        kafkaEdgeRdd.persist(StorageLevel.MEMORY_AND_DISK_SER)
        allEdgeRDD = offlineEdgeRDD.union(kafkaEdgeRdd)
        allEdgeRDD.setName("allEdgeRDD (kafkaEdgeRdd == null)")

      } else {
        val newBatchEdgeRdd = kafkaEdgeRdd.union(ds.rdd)
        kafkaEdgeRdd.unpersist()
        kafkaEdgeRdd = newBatchEdgeRdd
        kafkaEdgeRdd.setName(s"kafkaEdgeRdd mergeKafkaToOfflineCounter: $mergeKafkaToOfflineCounter")

        mergeKafkaToOfflineCounter += 1

        if (mergeKafkaToOfflineCounter == 3) {
          needUpdateOfflineRdd = true
          mergeKafkaToOfflineCounter = 0

        } else {
          kafkaEdgeRdd.persist(StorageLevel.MEMORY_AND_DISK_SER)
        }

        allEdgeRDD = offlineEdgeRDD.union(kafkaEdgeRdd)
        allEdgeRDD.setName("allEdgeRDD (kafkaEdgeRdd != null)")
        if (needUpdateOfflineRdd) {
          offlineEdgeRDD.unpersist()
          allEdgeRDD.persist(StorageLevel.MEMORY_AND_DISK_SER)
          offlineEdgeRDD = allEdgeRDD
          offlineEdgeRDD.setName(s"offlineEdgeRDD ver: $offlineEdgeRddVer")
          offlineEdgeRddVer += 1

          kafkaEdgeRdd.unpersist()
          kafkaEdgeRdd = null
        }
      }

      // create the graph
      val graph = Graph.fromEdges(allEdgeRDD, None,
        StorageLevel.MEMORY_AND_DISK_SER, StorageLevel.MEMORY_AND_DISK_SER)
      if (!needUpdateOfflineRdd) {
        allEdgeRDD.unpersist()
      }

      // use a helper class to execute the louvain
      // algorithm and save the output.
      // to change the outputs you can extend LouvainRunner.scala
      val runner = new HDFSLouvainRunner(minProgress, progressCounter, outputdir)
      graph.persist(StorageLevel.MEMORY_AND_DISK_SER)
      runner.run(sc, graph)
      graph.unpersist()
    })
      .start()

    query.awaitTermination()

  }

}
