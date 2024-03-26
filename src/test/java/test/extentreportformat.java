package test;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentreportformat {
	public static void main(String[] args) {
		ExtentReports extent = new ExtentReports();
		File file = new File(System.getProperty("user.dir")+"\\Extentsbold\\report.html");
		ExtentSparkReporter sparkreporter = new ExtentSparkReporter(file);
		extent.attachReporter(sparkreporter);
		ExtentTest eTest1 = extent.createTest("Testone");
		eTest1.log(Status.INFO, "<b>TestOne started</b>");
		extent.flush();
		try {
			Desktop.getDesktop().browse(file.toURI());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
}
