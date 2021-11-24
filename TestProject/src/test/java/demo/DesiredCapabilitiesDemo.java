package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilitiesDemo {

	public static void main(String[] args) {
		
//		DesiredCapabilities caps = new DesiredCapabilities();
//		caps.setCapability("ignoreProtectedModeSettings", true);
		
		InternetExplorerOptions options = new InternetExplorerOptions();
		options.introduceFlakinessByIgnoringSecurityDomains();
		WebDriverManager.iedriver().setup();
		WebDriver driver = new RemoteWebDriver(options);
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium"+Keys.ENTER);
		driver.close();
		driver.quit();
	}

}
