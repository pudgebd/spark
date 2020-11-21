import java.io.{BufferedWriter, File, FileWriter}

import scala.io.Source


val utf8 = "UTF8"
val fileName = "20160727-日程"
val txtSuffix = ".txt"
val parsed = "-parsed"
val rootPath = "/home/pudgebd/"
val tmpPath = "tmp/"
val filePath = new File(rootPath + fileName + txtSuffix)
val src = Source.fromFile(filePath, utf8)

val lineHead = "content: "
val lines = src.getLines()

val br = new BufferedWriter(new FileWriter(
  rootPath + tmpPath + fileName + parsed + txtSuffix))

var idx: Int = 1
while (lines.hasNext) {
  val line = lines.next()
  if (line.startsWith(lineHead)) {
    val decoded = DigestUtils.decodeBase64(line.substring(9))
    br.append(idx + "、")
    br.append(decoded)
    br.newLine()

    idx = idx + 1
  }
}

br.flush()
br.close()

