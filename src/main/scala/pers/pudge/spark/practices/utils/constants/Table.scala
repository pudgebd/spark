package pers.pudge.spark.practices.utils.constants

import pers.pudge.spark.practices.utils.ProjectUtils.tableSuffix

/**
  * hive table and spark temp view
  */
object Table {

  //bd_xx，千丁表
  val BD_REGION = "bd_region"
  val BD_BUILDING = "bd_building"
  val BD_ROOM = "bd_room"
  val BD_ROOM_ACCNO = "bd_room_accno"
  val BD_PERSON = "bd_person"
  val BD_PERSON_CONTACT = "bd_person_contact"
  val BD_PERSON_ADDR = "bd_person_addr"
  val BD_ADMIN_AREA = "bd_admin_area"


  val TS_SYS_ORGAN = "TS_Sys_Organ"
  val VM_RENOCUST_FILTER = "VM_RenoCust_Filter"
  val V_RENAME_BUILDING: String = "v_rename_building"
  val PM_FEESDEBTSCUTSEARCH_DET_LINSHICUSTOMER = "PM_FeesDebtsCutSearch_Det_LinshiCustomer"

  val PM_TM_ROOM = "PM_TM_Room"
  /**
    * 前台收费，带commid
    */
  val TM_CUSTOMER = "TM_Customer"
  val TP_PARKING = "TP_Parking"

  val GEN_ID_TM_CUSTOMER = "gen_id_tm_customer"
  val GEN_ID_T_ROOMOWNER_RELATION = "gen_id_t_roomowner_relation"
  val GEN_ID_T_ROOM_OWNER = "gen_id_t_room_owner"
  val GEN_ID_TM_CONTACT_PHONE = "gen_id_tm_contact_phone"
  val GEN_ID_T_ROOM = "gen_id_t_room"
  val GEN_ID_TP_PARKING = "gen_id_tp_parking"

  val T_ROOMOWNER_RELATION = "T_ROOMOWNER_RELATION"
  val T_ROOM_OWNER = "T_ROOM_OWNER"
  val TM_CONTACT_PHONE = "TM_Contact_Phone"
  val TT_ROOM_EXT = "TT_ROOM_EXT"
  val VM_ROOM_FILTER_PM = "VM_Room_Filter_PM"
  val T_ROOM = "T_ROOM"
  val PM_T_ROOM = "PM_T_ROOM"
  val CRM_T_CUSTOMER = "CRM_T_CUSTOMER"
  val PM_TM_CUSTOMER = "PM_TM_Customer"
  val CRM_T_ROOM = "CRM_T_ROOM"
  val CRM_T_PROJECT = "CRM_T_PROJECT"
  val CRM_T_BUILD = "CRM_T_BUILD"
  val PM_TM_COMMUNITY = "PM_TM_Community"
  val PM_T_COMPANY = "PM_T_Company"
  val MID_COMMUNITY_BUILDING = "MID_Community_Building"
  val TP_PARKING_CARPARK = "TP_Parking_Carpark"

  val T_BUILDING = "T_BUILDING"
  val TM_COMMUNITY_BUILDING = "TM_Community_Building"
  val TM_ROOM = "TM_Room"
  val T_COMPANY = "T_COMPANY"

  val TS_SYS_DEPARTMENT = "TS_Sys_Department"
  val TM_COMMUNITY = "TM_Community"
  val T_PROJECT = "T_PROJECT"

  //--------------------------------------------------------------

  val INCR_DOT = "incr."
  val DEFAULT_DOT = "default."

  //现在一般都false，除非需要比较两次ID差异
//  val addSuffix = !ProjectUtils.ifIn14Commid()
  val addSuffix = false

  val MORE_OP_CSM_CONTRACT = tableSuffix("more_op_csm_contract", addSuffix)

  val RELATE_OP_CSM_ID_TO_NEW_ID = tableSuffix("relate_op_csm_id_to_new_id", addSuffix)
  val T_OP_CSMID_FIRST_OP_ROOMID_BEFORE_CLEAN = tableSuffix("t_op_csmid_first_op_roomid_before_clean", addSuffix)
  val T_OP_CSMID_FIRST_OP_ROOMID = tableSuffix("t_op_csmid_first_op_roomid", addSuffix)
  val T_OP_CSMID_FIRST_CONTRACT_NO = tableSuffix("t_op_csmid_first_contract_no", addSuffix)

  /**
    * 存储过程处理的都是临时客户（无房产）
    */
  val T_STORAGE_PROC_EVER_HAVE_Y_OTHER_WISE_N = tableSuffix("t_storage_proc_ever_have_y_other_wise_n", addSuffix)
  val TEMP_LSKH_FEES = tableSuffix("temp_lskh_fees", addSuffix)

  /**
    * 没有关联房间、车位的客户（临时），并且无账单客户（没有收费信息）
    */
  val T_TMP_CSMID_NO_FEE = tableSuffix("t_tmp_csmid_no_fee", addSuffix)

  val C_REPEAT_BUILDING_ALL_ROOM_SAME = tableSuffix("c_repeat_building_all_room_same", addSuffix)
  val C_REPEAT_BUILDING_HAS_ROOM_DIF = tableSuffix("c_repeat_building_has_room_dif", addSuffix)

  val OP_COMPANY = "op_company"
  val OP_PROJECT = "op_project"
  val ALL_TEMP_LSKH_FEES = "all_temp_lskh_fees"

  val OP_CUSTOMER_BEFORE_CLEAN = tableSuffix("op_customer_before_clean", addSuffix)
  val OP_CUSTOMER_UPDATE_MOBILE_TEL = tableSuffix("op_customer_update_mobile_tel", addSuffix)
  val OP_CUSTOMER_SPLIT_NAME = tableSuffix("op_customer_split_name", addSuffix)
  /** 还未去除证件类型+证件号码+姓名相同的数据 */
  val OP_CUSTOMER_INCLUDE_REPEAT = tableSuffix("op_customer_include_repeat", addSuffix)
  /** 只有ID */
  val OP_CUSTOMER_ID_RESERVED = tableSuffix("op_customer_id_reserved", addSuffix)
  /**
    * 清洗后，有房或车的客户，也就是非临时客户，并且肯定有账单或余额。
    */
  val OP_CUSTOMER = tableSuffix("op_customer", addSuffix)
  /**
    * mig 开头的是日志表，异常数据都在这里
    */
  val MIG_OP_CUSTOMER  = tableSuffix("mig_op_customer", addSuffix)

  val OP_BUILDING_WITHOUT_GRP_NAME = tableSuffix("op_building_without_grp_name", addSuffix)
  val OP_BUILDING = tableSuffix("op_building", addSuffix)
  val OP_ROOM = tableSuffix("op_room", addSuffix)
  val OP_TAG = tableSuffix("op_tag", addSuffix)
  val OP_ROOM_TAG = tableSuffix("op_room_tag", addSuffix)
  val OP_ROOM_EXT = tableSuffix("op_room_ext", addSuffix)

  val V_TMP_CAR_ROOM_ID_NEW_PARKNAME = "v_tmp_car_room_id_new_parkname"
  val V_TMP_CITY_AREA_CODE = "v_tmp_city_area_code"
  val T_TMP_OPCSM_ID_CSMID_DSID_IMN = "t_tmp_opcsm_id_csmid_dsid_imn"

  val T_TMP_ORM_CSM = "t_tmp_orm_csm"
  val OP_ROOM_CUSTOMER_BEFORE_CLEAN = tableSuffix("op_room_customer_before_clean", addSuffix)
  val OP_ROOM_CUSTOMER_AFTER_SPLIT_CSM_NAME = tableSuffix("op_room_customer_after_split_csm_name", addSuffix)
  val OP_ROOM_CUSTOMER_BEFORE_KICK_UNNECESSARY = tableSuffix("op_room_customer_before_kick_unnecessary", addSuffix)
  val OP_ROOM_CUSTOMER = tableSuffix("op_room_customer", addSuffix)
  val MIG_OP_ROOM_CUSTOMER = tableSuffix("mig_op_room_customer", addSuffix)

  val OP_CUSTOMER_CONTRACT_BEFORE_CLEAN = tableSuffix("op_customer_contract_before_clean", addSuffix)
  val OP_CUSTOMER_CONTRACT_UPDATE_MOBILE_TEL = tableSuffix("op_customer_contract_update_mobile_tel", addSuffix)
  val OP_CUSTOMER_CONTRACT_AFTER_SPLIT_CSM_NAME = tableSuffix("op_customer_contract_after_split_csm_name", addSuffix)
  val OP_CUSTOMER_CONTRACT_BEFORE_KICK_REPEAT = tableSuffix("op_customer_contract_before_kick_repeat", addSuffix)
  val OP_CUSTOMER_CONTRACT = tableSuffix("op_customer_contract", addSuffix)
  val MIG_OP_CUSTOMER_CONTRACT = tableSuffix("mig_op_customer_contract", addSuffix)

  val OP_CUSTOMER_ADDRESS_BEFORE_CLEAN = tableSuffix("op_customer_address_before_clean", addSuffix)
  val OP_CUSTOMER_ADDRESS_AFTER_SPLIT_CSM_NAME = tableSuffix("op_customer_address_after_split_csm_name", addSuffix)
  val OP_CUSTOMER_ADDRESS = tableSuffix("op_customer_address", addSuffix)
  val MIG_OP_CUSTOMER_ADDRESS = tableSuffix("mig_op_customer_address", addSuffix)
}
