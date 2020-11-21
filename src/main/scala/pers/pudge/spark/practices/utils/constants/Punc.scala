package pers.pudge.spark.practices.utils.constants

object Punc {
  val Dot = "."
  val COMMA = ","
  val EXCLAMATORY_MARK = "!"
  val SEMICOLON = ";"
  val SEMICOLON_CN = "；"
  val BLANK = " "
  val TAB = "\t"

  val SLASH = "/"
  val SLASH_CN = "／"
  val REVERSE_SLASH = "\\"
  /**
    * 包含空格
    */
  val CONTRACT_SLASH_REPLACER = "[:：;；,，／、 ]"

  /**
    * 不包含空格，另外处理，如：
    *
    * 勾 容，王德胜，王若君
    * 杨志勇 肖璐
    * 高利 何中会
    * 潘茂;CLARKCOLIN BARRY
    */
  val CSM_NAME_SEMICOLON_REPLACER = "[:：;；/／、,，]"

  val REGEX_KICK_BRACKET = "[()（）]"
  val SPLITER_LEFT_BRACKET = "\\("
  val SPLITER_LEFT_BRACKET_CN = "\\（"

  val LEFT_BRACKET = "("
  val RIGHT_BRACKET = ")"

  val LEFT_BRACKET_CN = "（"
  val RIGHT_BRACKET_CN = "）"

  val LEFT_MID_BRACKET_CN = "【"
  val RIGHT_MID_BRACKET_CN = "】"

  val WHIPPLE_TREE = "-"

}
