package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class GoogleSearchTest {
	static WebDriver driver = null;
	
public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//go to website
		//GoogleSearchPage searchPage = new GoogleSearchPage();
		driver.get("https://google.com");
		//driver.findElement(By.name("q")).sendKeys("Selenium");
		//searchPage.searchText(driver).sendKeys("Selenium");
		GoogleSearchPage.searchText(driver).sendKeys("Selenium");
		//driver.findElement(By.name("btnK")).click();
		//searchPage.searchButton(driver).click();
		GoogleSearchPage.searchButton(driver).click();
		
		
		//close browser
		driver.close();
	}

}
