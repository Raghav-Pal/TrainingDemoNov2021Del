package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropFileDemo;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest2 {

	WebDriver driver;
	public static String browserName = null;
	@BeforeTest
	public void setup() throws Exception {
		PropFileDemo.getProperties();
		if(browserName.equalsIgnoreCase("chrome")) {
			System.out.println("Browser is set to chrome");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("ff")) {
			System.out.println("Browser is set to firefox");
		}
		else {
			System.out.println("Not Set");
		}
		
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
