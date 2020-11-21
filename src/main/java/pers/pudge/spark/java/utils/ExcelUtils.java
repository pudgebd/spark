package pers.pudge.spark.java.utils;

import org.apache.commons.io.IOUtils;
import org.apache.poi.POIDocument;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExcelUtils {
	
	private static final Logger LOG = LoggerFactory.getLogger(ExcelUtils.class);
	private static final SimpleDateFormat fullFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	

	public static String getCell(Cell cell) {
		if (null == cell)
			return "";
		switch (cell.getCellType()) {
		case HSSFCell.CELL_TYPE_NUMERIC:
			if (HSSFDateUtil.isCellDateFormatted(cell)) {
				Date d = cell.getDateCellValue();
				return fullFormat.format(d);
			} else {
				return new BigDecimal(cell.getNumericCellValue()).toString();
			}
		case HSSFCell.CELL_TYPE_STRING:
			String value = cell.getStringCellValue();
			if (value.isEmpty()) {
				return "";
			}
			if (value != null && !value.isEmpty()) {
				value = value.replaceAll("\u0000", "");
				return value.trim();
			}
		case HSSFCell.CELL_TYPE_FORMULA:
			return cell.getCellFormula();
		case HSSFCell.CELL_TYPE_BLANK:
			return "";
		case HSSFCell.CELL_TYPE_BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());
		case HSSFCell.CELL_TYPE_ERROR:
			return String.valueOf(cell.getErrorCellValue());
		}
		return "";
	}
	
	
	public static byte[] getBytsFromWorkbook(POIDocument workbook) {
		ByteArrayOutputStream output = null;
		byte[] bytes = null;
		try {
			output = new ByteArrayOutputStream();
			workbook.write(output);
			output.flush();
			bytes = output.toByteArray();
		} catch (Exception e) {
			LOG.error("", e);
		} finally {
			IOUtils.closeQuietly(output);
		}
		return bytes;
	}
	
	
}
