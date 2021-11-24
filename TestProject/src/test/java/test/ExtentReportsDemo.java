package test;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemo {

	public static void main(String[] args) throws IOException {

		// start reporters
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentreports.html");
		
		// create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        
     // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
        
        ExtentTest test2 = extent.createTest("MySecondTest", "This is the 2nd test");
        test2.log(Status.INFO, "This is information");
        test2.pass("This Step is Pass");
        test2.fail("This step is Fail unfortunately");
        test2.info("Test completed");
        // calling flush writes everything to the log file
        extent.flush();
        System.out.println("Done");

	}

}
