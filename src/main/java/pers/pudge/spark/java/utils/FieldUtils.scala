package pers.pudge.spark.java.utils

import java.text.SimpleDateFormat

import org.apache.spark.sql.types._
import org.slf4j.LoggerFactory

object FieldUtils {

  val LOG = LoggerFactory.getLogger(FieldUtils.getClass)

  //Numeric Types
  val TINYINT = "tinyint"
  val SMALLINT = "smallint"
  val INT = "int"
  val INTEGER = "integer"
  val BIGINT = "bigint"
  val FLOAT = "float"
  val DOUBLE = "double"
  val DOUBLE_PRECISION = "double precision"
  val DECIMAL = "decimal"
  val NUMERIC = "numeric"

  val HIVE_NUMERIC_TYPES = Set(TINYINT, SMALLINT, INT, INTEGER, BIGINT,
    FLOAT, DOUBLE, DOUBLE_PRECISION, DECIMAL, NUMERIC)

  //Date/Time Types
  val TIMESTAMP = "timestamp"
  val DATE = "date"
  val INTERVAL = "interval"

  //String Types
  val STRING = "string"
  val VARCHAR = "varchar"
  val CHAR = "char"

  //Misc Types
  val BOOLEAN = "boolean"
  val BINARY = "binary"

  //Complex Types
  val ARRAYS = "arrays"
  val MAPS = "maps"
  val STRUCTS = "structs"
  val UNION = "union"


  /**
   * 遇到[[TIMESTAMP]]类型的，先保留为[[STRING]]，后续用sql的cast(xx as timestamp) 方法来转换，
   * 如果在 [[convert]] 里直接转换为 [[java.sql.Timestamp]]，会报出
   * java.lang.RuntimeException: java.sql.Timestamp is not a valid external type for schema of string
   */
  def getSparkDataTypeByHiveField(hiveFieldName: String): DataType = {
    return hiveFieldName.toLowerCase match {
      case STRING => return DataTypes.StringType
      case INT => return DataTypes.IntegerType
      case INTEGER => return DataTypes.IntegerType
      case BIGINT => return DataTypes.LongType
      case DOUBLE => return DataTypes.DoubleType
      case BOOLEAN => return DataTypes.BooleanType
      case TIMESTAMP => return DataTypes.StringType
      case _ => return DataTypes.StringType
    }
  }

  def hiveFieldToDcKnown(hiveFieldName: String): String = {
    return hiveFieldName.toLowerCase match {
      case CHAR => return STRING
      case VARCHAR => return STRING
      case STRING => return STRING
      case SMALLINT => return INT
      case INT => return INT
      case INTEGER => return INT
      case BIGINT => return BIGINT
      case DECIMAL => return DOUBLE
      case DOUBLE => return DOUBLE
      case BOOLEAN => return BOOLEAN
      case TIMESTAMP => return TIMESTAMP
      case _ => return STRING
    }
  }

  @inline
  val DATE_FORMATS = Seq("yyyyMMdd", "yyyy-MM-dd", "yyyy-MM-dd HH",
    "yyyy-MM-dd HH:mm", "yyyy-MM-dd HH:mm:ss")

  @inline
  val DATE_FORMATS_MK_STR = DATE_FORMATS.mkString("'", "', '", "'")

  @inline
  val DATE_FORMATS_LEN_MAP = DATE_FORMATS.map(df => df.length -> df).toMap

  /**
   * 转换为 timestamp 时，返回 java.sql/util.Date 都会报错
   */
  @inline
  def convert(eleVal: String, fromField: String, toType: String): Any = {
    try {
      if (eleVal == null || eleVal.isEmpty) {
        return eleVal
      }
      return toType.toLowerCase match {
        case STRING => return eleVal.toString
        case INT => return eleVal.toInt
        case INTEGER => return eleVal.toInt
        case BIGINT => return eleVal.toLong
        case DOUBLE => return eleVal.toDouble
        case BOOLEAN => return eleVal.toBoolean
        case TIMESTAMP => {
          if (DATE_FORMATS_LEN_MAP.contains(eleVal.length)) {
            val dateFormat = DATE_FORMATS_LEN_MAP.get(eleVal.length)
              .get
            val sdf = new SimpleDateFormat(dateFormat)
            val date = sdf.parse(eleVal)
            //val ts = new Timestamp(date.getTime)

            return sdf.format(date)
          } else {
            throw new Exception(s"字段：$fromField 的值为：'$eleVal'，不能转换为 $toType，仅支持 $DATE_FORMATS_MK_STR")
          }
        } case _ => {
          return eleVal
        }
      }
    } catch {
      case e: Exception => {
        LOG.error("", e)
        throw new Exception(s"字段：$fromField 的值为：'$eleVal'，不能转换为 $toType （原始错误：${e.getMessage}）")
      }
    }
  }

}
