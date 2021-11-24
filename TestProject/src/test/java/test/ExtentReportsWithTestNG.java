package test;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsWithTestNG {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	@BeforeSuite
	public void setup() {
		htmlReporter = new ExtentHtmlReporter("extentreport2.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	@Test
	public void test() throws IOException {
		ExtentTest test1 = extent.createTest("My 1st Test", "Sample description for 1st Test");
        test1.log(Status.INFO, "This step shows usage of log(status, details)");
        test1.info("This step shows usage of info(details)");
        test1.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test1.addScreenCaptureFromPath("screenshot.png");
	}
	@Test
	public void test2() throws IOException {
		ExtentTest test2 = extent.createTest("My 2nd Test", "Sample description for 2nd Test");
        test2.log(Status.INFO, "This step shows usage of log(status, details)");
        test2.info("This step shows usage of info(details)");
        test2.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test2.addScreenCaptureFromPath("screenshot.png");

	}
	@AfterSuite
	public void teardown() {
		 extent.flush();
	}

}
