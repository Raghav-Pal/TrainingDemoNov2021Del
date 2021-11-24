package utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	@Test(dataProvider = "LoginTestData")
	public void loginTest(Object username, Object password) {
		System.out.println(username+" | "+password);
	}

	
	@Test(dataProvider = "TestData")
	public void test1(Object firstName, Object lastName, Object age) {
		System.out.println(firstName+" | "+lastName+" | "+age);
	}

	
	@DataProvider(name="LoginTestData")
	public Object[][] getLoginData() {
		String excelPath = "./data/test_data1.xlsx";
		String sheetName = "LoginTestData";
		Object data[][] = testData(excelPath, sheetName);
		return data;
	}
	
	@DataProvider(name="TestData")
	public Object[][] getData() {
		String excelPath = "./data/test_data1.xlsx";
		String sheetName = "Sheet1";
		Object data[][] = testData(excelPath, sheetName);
		return data;
	}
	
	public Object[][] testData(String excelPath, String sheetName) {
		ExcelRead excel = new ExcelRead(excelPath, sheetName);
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		System.out.println();
		
		Object data[][] = new Object[rowCount-1][colCount];
		
		for(int i=1; i<rowCount; i++) {
			for(int j=0; j<colCount; j++) {
				Object testData = excel.getCellValue(i, j);
				data[i-1][j] = testData;
				System.out.println(" => "+data[i-1][j]);
			}
			System.out.println("----------------------");
		}
		return data;
	}

}
