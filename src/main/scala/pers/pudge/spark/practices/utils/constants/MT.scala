package pers.pudge.spark.practices.utils.constants

import pers.pudge.spark.practices.utils.ProjectUtils

/**
  * blog test
  */
object MT {

  val HDFS_REL_DIR = "hdfs://svdsj03-01:8020/tmp/spark/rel_1kw/"
  //    val HIVE_WARE = "hdfs://svdsj03-01:8020/user/hive/warehouse/"
  val HIVE_WARE = "hdfs://master:8020/usr/hive/warehouse/"

  val HDFS_HOST_PORT = "svdsj03-01:8020"
  val ZK_HOSTS = "svdsj03-01,svdsj03-02,svdsj03-03"

  val LOCAL_MASTER = "local[*]"
  val INNER_STAND_ALONE = "spark://dn6:7077"


  val HDFS_HOST = "master"
  val HDFS_ROOT = s"hdfs://$HDFS_HOST:8020/"
  val MASTER_WARE = s"hdfs://$HDFS_HOST:8020/usr/hive/warehouse/"
  val CSVS_DIR = {
    if (ProjectUtils.ifIn14Commid()) {
      s"hdfs://$HDFS_HOST:8020/tmp/excel_14_project/" //excel_14_project //all_project_by_area
    } else {
      s"hdfs://$HDFS_HOST:8020/tmp/excel_rest_300s_project/"
    }
  }

  val QD_COMPARE_DIR = s"hdfs://$HDFS_HOST:8020/tmp/qd_compare/"

  /**
    * 末尾不能加 /
    */
  val ALL_PROJ_BY_GRADE = ""
  val IMPORT_EXCEL_DIR_PATH = "/lhdata/jobs/excels/"

  //scp car_room_id_new_parkname_modified.xlsx root@master:/lhdata/jobs/excels/

  val CW_NEW_CODE_EXCEL = IMPORT_EXCEL_DIR_PATH + "car_room_id_new_parkname_modified.xlsx"
  val CITY_AREA_CODE = IMPORT_EXCEL_DIR_PATH + "city_area_code.xlsx"


}
