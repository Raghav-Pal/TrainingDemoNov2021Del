package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public static void main(String[] args) {
		//getRowCount();
		getCellValueString();
		//getCellValueNumber(1, 1);
	}
	public static int getRowCount() {
		int rowCount=0;
				try {
					workbook = new XSSFWorkbook("./data/test_data1.xlsx");
					sheet = workbook.getSheet("Sheet1");
					rowCount = sheet.getPhysicalNumberOfRows();
					System.out.println("Row Count : "+rowCount);
					return rowCount;
				}catch(Exception exp) {
					System.out.println("EXP");
					return rowCount;
				}
	}

	public static void getCellValueString() {
		try {
			workbook = new XSSFWorkbook("./data/test_data1.xlsx");
			sheet = workbook.getSheet("Sheet1");
			//int rowCount = sheet.getPhysicalNumberOfRows();
			//System.out.println("Row Count : "+rowCount);
			String cellValue = sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println("Cell Value = "+cellValue);

			//		for(int i=1; i<rowCount; i++) {
			//			System.out.println(sheet.getRow(rowNum).getCell(colNum).getStringCellValue());
			//			System.out.println(sheet.getRow(rowNum).getCell(colNum).getNumericCellValue());
			//		}
		}catch(Exception exp) {
			System.out.println("EXP");
		}
	}

	public static void getCellValueNumber(int rowNum, int colNum) throws Exception {
		workbook = new XSSFWorkbook("./data/test_data1.xlsx");
		sheet = workbook.getSheet("Sheet1");
		//int rowCount = sheet.getPhysicalNumberOfRows();
		//System.out.println("Row Count : "+rowCount);
		Double cellValue = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println("Cell Value = "+cellValue);

		//		for(int i=1; i<rowCount; i++) {
		//			System.out.println(sheet.getRow(rowNum).getCell(colNum).getStringCellValue());
		//			System.out.println(sheet.getRow(rowNum).getCell(colNum).getNumericCellValue());
		//		}
	}

}
