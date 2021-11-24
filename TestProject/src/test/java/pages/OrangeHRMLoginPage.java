package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRMLoginPage {
	
	WebDriver driver = null;
	By textbox_username = By.id("txtUsername");
	By textbox_password = By.id("txtPassword");
	By button_login = By.id("btnLogin");
	By button_logout = By.id("btnLogin");
	
	public OrangeHRMLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setUsername(String text) {
		driver.findElement(textbox_username).sendKeys(text);
	}
	public void setPassword(String text) {
		driver.findElement(textbox_password).sendKeys(text);
	}
	public void clickLogin() {
		driver.findElement(button_login).click();
	}
	public void clickLogout() {
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
//		driver.findElement(button_logout).click();
	}

}
