package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.selenium.Eyes;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ApplitoolsDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Eyes eyes = new Eyes();
		eyes.setApiKey("80CHSeJ0sQ5nsZ4KMqi101hl3PiUpzeKzeX4e4B7Ts4T8110");
		eyes.open(driver, "MyApp2", "MyTest2");
		try {
		driver.get("https://applitools.com/helloworld/?diff1");
		eyes.checkWindow("Test1");
		driver.get("https://applitools.com/helloworld/?diff2");
		eyes.checkWindow("Test2");
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
