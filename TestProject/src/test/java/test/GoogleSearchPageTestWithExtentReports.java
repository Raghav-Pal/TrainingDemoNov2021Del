package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTestWithExtentReports {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public void googleSearchTest() {
		GoogleSearchPageObjects searchObj = new GoogleSearchPageObjects(driver);
		driver.get("https://google.com");
		searchObj.setTextInSearchBox("Selenum");
		searchObj.clickSearchButton();
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}
}
