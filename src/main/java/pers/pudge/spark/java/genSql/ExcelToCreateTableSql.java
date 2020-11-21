package pers.pudge.spark.java.genSql;


import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import pers.pudge.spark.java.po.ExcelFieldPo;
import pers.pudge.spark.java.utils.FieldUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ExcelToCreateTableSql {

//    static String filePath = "/Users/pudgebd/Downloads/农行数据表结构及字段说明（全）.xlsx";
//    static int tableIdx = 1;
//    static int tableCommentIdx = 0;
//    static int fieldIdx = 2;
//    static int fieldCommentIdx = 3;
//    static int fieldTypeIdx = 4;

//    static String filePath = "/Users/pudgebd/Downloads/卡账客_补全.xlsx";
//    static int tableIdx = 1;
//    static int tableCommentIdx = 2;
//    static int fieldIdx = 3;
//    static int fieldCommentIdx = 4;
//    static int fieldTypeIdx = 5;
//
//    public static void main(String[] args) throws Exception {
//        XSSFWorkbook book = new XSSFWorkbook(new FileInputStream(filePath));
//        XSSFSheet sheet = book.getSheetAt(0);
//
//        Map<String, String> tableCommentMap = new HashMap<>();
//        Map<String, List<ExcelFieldPo>> tableFieldsMap = new HashMap<>();
//        int unknownIdx = 1;
//
//        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
//            Row row = sheet.getRow(i);
//            if (row == null) {
//                continue;
//            }
//            String table = ExcelUtils.getCell(row.getCell(tableIdx));
//            String tableComment = ExcelUtils.getCell(row.getCell(tableCommentIdx));
//            String field = ExcelUtils.getCell(row.getCell(fieldIdx));
//            if (StringUtils.isBlank(field)) {
//                field = "A" + unknownIdx;
//                unknownIdx++;
//            }
//            String fieldComment = ExcelUtils.getCell(row.getCell(fieldCommentIdx));
//            String fieldType = ExcelUtils.getCell(row.getCell(fieldTypeIdx));
//            if (StringUtils.isBlank(fieldType)) {
//                fieldType = FieldUtils.STRING();
//            }
//
//            tableCommentMap.putIfAbsent(table, tableComment);
//            MapUtils.fill_key_listMap(tableFieldsMap, table, new ExcelFieldPo(field, fieldComment, fieldType));
//        }
//
//
//        for (Map.Entry<String, List<ExcelFieldPo>> entry : tableFieldsMap.entrySet()) {
//            String tableName = entry.getKey();
//            List<ExcelFieldPo> fields = entry.getValue();
//
//            StringBuilder sb = new StringBuilder();
//            sb.append("create table if not exists ").append(tableName).append("_DT (\n");
//
//            int sizeDecr1 = fields.size() - 1;
//            for (int i = 0; i <= sizeDecr1; i++) {
//                ExcelFieldPo ele = fields.get(i);
//                sb.append(ele.getName()).append(" ").append(FieldUtils.hiveFieldToDcKnown(ele.getType()))
//                        .append(" comment '").append(ele.getComment()).append("' ");
//                if (i != sizeDecr1) {
//                    sb.append(",\n");
//                }
//            }
//
//            sb.append(") comment '")
//                    .append(tableCommentMap.getOrDefault(tableName, ""))
//                    .append("' lifecycle 365;");
//
//            System.out.println(sb.toString());
//            System.out.println("------------------------------------------------------------");
//            System.out.println("------------------------------------------------------------");
//        }
//    }

}
