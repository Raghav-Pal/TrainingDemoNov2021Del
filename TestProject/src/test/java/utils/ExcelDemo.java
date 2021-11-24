package utils;

public class ExcelDemo {
	
	public static void main(String[] args) {
		
		ExcelRead excel = new ExcelRead("./data/test_data1.xlsx", "Sheet1");
		excel.getCellValueString(1, 0);
		excel.getCellValueNumber(1, 1);
		excel.getCellValue(1, 0);
		excel.getCellValue(1, 1);
	}

}
