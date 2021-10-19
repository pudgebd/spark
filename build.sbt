name := "spark"

version := "1.0"

scalaVersion := "2.11.12"

lazy val sparkVer = "2.4.8"
lazy val kafkaVer = "1.1.0"
lazy val hadoopVer = "2.7.3"
lazy val hbaseVer = "1.2.6"
lazy val slf4jVer = "1.7.25"
lazy val hiveCdhVer = "1.1.0-cdh5.10.1"
lazy val neo4jServerVer = "3.5.3"
lazy val neo4jDriverVer = "1.7.3"
lazy val graphframesVer = "0.7.0-spark2.4-s_2.11"
lazy val antlr4Ver = "4.7.2"
lazy val esVer = "6.2.2"
lazy val asVer = "4.4.5"
lazy val nettyVer = "4.1.41.Final"

//sbt 从默认的maven仓库（如 http://repo1.maven.org/maven2）下不到才会从自定义的仓库下载
resolvers ++= Seq(
    "Spring Plugins" at "http://repo.spring.io/plugins-release/",
    "Spark Packages Repo" at "http://dl.bintray.com/spark-packages/maven", //neo4j
    "Clojars repository" at "http://clojars.org/repo/",
    "maven2 org" at "https://repo1.maven.org/maven2"
    //"Cloudera Repository" at "http://repository.cloudera.com/content/repositories/releases/"
)

libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-core" % sparkVer,
    "org.apache.spark" %% "spark-sql" % sparkVer,
    "org.apache.spark" %% "spark-hive" % sparkVer,
    "org.apache.spark" %% "spark-streaming" % sparkVer,
    "org.apache.spark" %% "spark-streaming-kafka-0-10" % sparkVer,
    "org.apache.spark" %% "spark-mllib" % sparkVer,

    "org.apache.kafka" %% "kafka" % kafkaVer,
    "org.apache.kafka" % "kafka-clients" % kafkaVer,
    "org.apache.spark" %% "spark-sql-kafka-0-10" % sparkVer,

    "org.apache.hbase" % "hbase-client" % hbaseVer,
    "org.apache.hbase" % "hbase-common" % hbaseVer,
    "org.apache.hbase" % "hbase-server" % hbaseVer,

    //打开这两个会导致 enableHiveSupport 失败
//    "org.apache.hive" % "hive-hbase-handler" % hiveCdhVer, //若hive表的数据存在hbase里，则需要这个jar
//    "org.apache.hive" % "hive-jdbc" % hiveCdhVer,

    //neo4j
    "neo4j-contrib" % "neo4j-spark-connector" % "2.4.0-M6",
    //"org.neo4j" % "neo4j" % neo4jServerVer % "provided",
    //"org.neo4j.test" % "neo4j-harness" % neo4jServerVer % "test",
    //"org.neo4j.driver" % "neo4j-java-driver" % neo4jDriverVer,
    //"graphframes" % "graphframes" % graphframesVer

    //es
    "org.elasticsearch" %% "elasticsearch-spark-20" % esVer,

    //as
    "com.aerospike" % "aerospike-client" % asVer,
    "com.aerospike" % "aerospike-helper-java" % "1.2.3"

).map(_.exclude("org.slf4j", "*"))
  .map(_.exclude("com.google.guava", "*"))
  .map(_.exclude("com.fasterxml.jackson.module", "*"))
  .map(_.exclude("net.jpountz.lz4", "*"))



//test
//libraryDependencies ++= Seq(

//).map(_.exclude("org.slf4j", "*"))//.map(_.exclude("com.fasterxml.jackson.module", "jackson-module-scala"))


//others
libraryDependencies ++= Seq(
    "org.scala-lang" % "scala-xml" % "2.11.0-M4",
    "com.google.guava" % "guava" % "16.0.1",
    "org.codehaus.jettison" % "jettison" % "1.3.8",
//    "net.jpountz.lz4" % "lz4" % "1.3.0",

    "commons-codec" % "commons-codec" % "1.10",
    "commons-io" % "commons-io" % "2.5",

    "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.9.5",
    "mysql" % "mysql-connector-java" % "5.1.43",
    "org.python" % "jython-standalone" % "2.7.1",
    "org.lz4" % "lz4-java" % "1.6.0",
    "org.apache.poi" % "poi" % "3.17",
    "org.apache.poi" % "poi-ooxml" % "3.17",
    "org.apache.xmlbeans" % "xmlbeans" % "2.6.0",
    "org.apache.commons" % "commons-collections4" % "4.2",
    "com.alibaba" % "fastjson" % "1.2.58",
    "com.github.scopt" %% "scopt" % "3.7.1"


).map(_.exclude("org.slf4j", "*"))


libraryDependencies ++= Seq(
    "org.slf4j" % "slf4j-log4j12" % slf4jVer,
    "org.slf4j" % "slf4j-api" % slf4jVer,
    "org.slf4j" % "slf4j-simple" % slf4jVer,
    "uk.org.lidalia" % "jul-to-slf4j-config" % "1.0.0",
    "org.apache.logging.log4j" % "log4j-core" % "2.8.1"
)