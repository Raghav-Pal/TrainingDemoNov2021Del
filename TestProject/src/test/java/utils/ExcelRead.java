package utils;

import java.io.File;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelRead {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelRead(String excelPath, String sheetName) {
		try {
		workbook =  new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetName);
		}catch(Exception exp) {
			System.out.println("EXP - "+exp.getMessage());
		}
	}

	public static int getRowCount() {
		int rowCount=0;
		try {
			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Row Count = "+rowCount);
			return rowCount;

		}catch(Exception exp) {
			System.out.println("EXP - "+exp.getMessage());
		}
		return rowCount;
	}
	
	public static int getColCount() {
		int colCount=0;
		try {
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Col Count = "+colCount);
			return colCount;

		}catch(Exception exp) {
			System.out.println("EXP - "+exp.getMessage());
		}
		return colCount;
	}
	
	public static Object getCellValue(int rowNum, int colNum) {
		Object value=null;
		try {
			
			DataFormatter formatter = new DataFormatter();
			 value = formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
			System.out.println(value);

		}catch(Exception exp) {
			System.out.println("EXP - "+exp.getMessage());
		}
		return value;
	}

	public static void getCellValueString(int rowNum, int colNum) {
		try {
			String value = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(value);

		}catch(Exception exp) {
			System.out.println("EXP - "+exp.getMessage());
		}
	}
	
	public static void getCellValueNumber(int rowNum, int colNum) {
		try {
			Double value = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(value);

		}catch(Exception exp) {
			System.out.println("EXP - "+exp.getMessage());
		}

	}
}
