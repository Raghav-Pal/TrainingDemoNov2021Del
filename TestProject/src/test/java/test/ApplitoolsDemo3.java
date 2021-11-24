package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.EyesRunner;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.TestResultsSummary;
import com.applitools.eyes.selenium.ClassicRunner;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.visualgrid.services.RunnerOptions;
import com.applitools.eyes.visualgrid.services.VisualGridRunner;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ApplitoolsDemo3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Eyes eyes = new Eyes();
		eyes.setApiKey("80CHSeJ0sQ5nsZ4KMqi101hl3PiUpzeKzeX4e4B7Ts4T8110");
		eyes.open(driver, "MyApp", "MyTest");
		driver.get("https://google.com");
		try {
		eyes.checkWindow("Check1");
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			eyes.close();
			driver.close();
			driver.quit();
		}
		finally {
			eyes.close();
			driver.close();
			driver.quit();
		}
		
	}
}