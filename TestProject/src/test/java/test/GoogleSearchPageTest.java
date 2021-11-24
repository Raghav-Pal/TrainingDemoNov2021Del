package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	
	static WebDriver driver = null;
	
	public static void googleSearchTest() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		GoogleSearchPageObjects searchObj = new GoogleSearchPageObjects(driver);
		driver.get("https://google.com");
		searchObj.setTextInSearchBox("Selenum");
		searchObj.clickSearchButton();
		driver.close();
		
	}
	public static void main(String[] args) {
		googleSearchTest();
	}
}
