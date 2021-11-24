package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo {
	
	@Test
	public void test1() {
		System.out.println(" i am inside test1");
	}
	
	@Test
	public void test2() {
		System.out.println(" i am inside test2");
//		Assert.assertTrue(false);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("ABCD"+Keys.ENTER);
		driver.findElement(By.name("q123")).sendKeys("ABCD"+Keys.ENTER);
		
		driver.quit();
	}
	
	@Test
	public void test3() {
		System.out.println(" i am inside test3");
		throw new SkipException("SKipping this");
	}
	

}
