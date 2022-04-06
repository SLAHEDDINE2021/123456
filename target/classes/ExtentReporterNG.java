package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	
	
	static ExtentReports extent;
	
	public static ExtentReports getReport() {
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		
		reporter.config().setDocumentTitle("tests results");
		reporter.config().setReportName("results");
		
		extent = new ExtentReports ();
		
	extent.attachReporter(reporter);
	extent.setSystemInfo("tester", "slaheddine jeder");
	
	return extent;
	
		
		
		
		
	}
	
	
	
		
		
	}
	

