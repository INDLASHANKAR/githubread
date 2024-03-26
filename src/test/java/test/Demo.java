
package test;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Demo {
public static void main(String[] args) throws IOException {
	//ExtentReports extent = new ExtentReports();
	File file = new File(System.getProperty("user.dir")+"\\ExtentReports\\eReport.html");

	ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(sparkReporter);
	ExtentTest eTest = extent.createTest("TestOne");
	//eTest.pass("TestOne got passed");
	eTest.log(Status.PASS, "TestOne got passed");
	ExtentTest eTest2 = extent.createTest("TestTwo");
	eTest2.fail("Test2  got failed");
	 ExtentTest eTest3 = extent.createTest("TestThree");
	 eTest3.skip("TestThree got skipped");
	  Desktop.getDesktop().browse(file.toURI());
	
	extent.flush();
}
}
