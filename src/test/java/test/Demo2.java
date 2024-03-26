package test;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Demo2 {


public static void main(String[] args) throws IOException {
	ExtentReports extent = new ExtentReports();
	File file = new File(System.getProperty("user.dir")+"\\ExtentRepots\\Ereportstest2.html");
	ExtentSparkReporter  sparkrepoter = new ExtentSparkReporter(file);
	extent.attachReporter(sparkrepoter);
	ExtentTest eTest1 = extent.createTest("TestOne");
	
	eTest1.log(Status.INFO,"TestOne started");
	eTest1.log(Status.WARNING,"button can be better aligned");
	eTest1.log(Status.PASS,"TestOnepassed");
	eTest1.log(Status.SKIP,"TestOne skipped");
	eTest1.log(Status.FAIL,"Test one failed");
	extent.flush();
	Desktop.getDesktop().browse(file.toURI());
}
}
