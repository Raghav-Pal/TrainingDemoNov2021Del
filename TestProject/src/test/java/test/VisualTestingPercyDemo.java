package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
//import io.percy.selenium.Percy;

public class VisualTestingPercyDemo {
	private static WebDriver driver;
//	private static Percy percy;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		//FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
		driver = new ChromeDriver(options);
//		driver = new FirefoxDriver(options);
//		percy = new Percy(driver);
//
//		driver.get("https://example.com");
//		percy.snapshot("Java example");
	}

}
