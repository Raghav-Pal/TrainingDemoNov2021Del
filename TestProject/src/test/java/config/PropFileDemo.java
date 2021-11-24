package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.GoogleSearchPageTest2;

public class PropFileDemo {
	static Properties prop = new Properties();
	
	public static void main(String[] args) throws Exception {
		getProperties();
		setProperties();
		getProperties();
		
	}
	
	public static void getProperties() throws Exception {
		
		InputStream input = new FileInputStream("./src/test/java/config/config.properties");
		prop.load(input);
		System.out.println(prop.getProperty("browser"));
		GoogleSearchPageTest2.browserName=prop.getProperty("browser");
		
	}
	
	public static void setProperties() throws Exception {
		OutputStream out = new FileOutputStream("./src/test/java/config/config.properties");
		prop.setProperty("browser", "chrome");
		prop.setProperty("result", "pass");
		prop.store(out, null);
	}
}
