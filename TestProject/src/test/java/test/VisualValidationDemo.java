package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.TestResults;
import com.applitools.eyes.selenium.Eyes;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VisualValidationDemo {

	static WebDriver driver=null;
	static Eyes eyes;
	public static void main(String[] args) {
		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			// Initialize the eyes SDK and set your private API key.
			eyes = new Eyes();

			// Set the API key from the env variable. Please read the "Important Note"
			// section above.
			eyes.setApiKey("x98ITG6Y8EjdSjxIhxVfo4cCuwJYgt6YgUNh0ghCsl1g110");

			eyes.open(driver, "Demo App", "Smoke Test", new RectangleSize(600, 800));

			driver.get("https://demo.applitools.com");

			//To see visual bugs, change the above URL to:
			//https://demo.applitools.com/index_v2.html and run the test again

			// Visual checkpoint #1 - Check the login page.
			eyes.checkWindow("Login Window");

			// This will create a test with two test steps.
			driver.findElement(By.id("log-in")).click();

			// Visual checkpoint #2 - Check the app page.
			eyes.checkWindow("App Window");

			// End the test.
			TestResults results = eyes.close();
			System.out.println(results);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		} finally {
			// Close the browser.
			driver.quit();

			// If the test was aborted before eyes.close was called, ends the test as
			// aborted.
			eyes.abortIfNotClosed();

			// End main test
			System.exit(0);
		}

	}

}
