package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
public static ExtentReports extent;
public static ExtentReports getReport()
{
	String path="C:\\Users\\Dell\\eclipse-workspace\\Automation_Framework\\Reports";
	ExtentSparkReporter reporter=new ExtentSparkReporter(path);
	reporter.config().setDocumentTitle("Automation Test Report");
	reporter.config().setReportName("Automation Framework Report");
	reporter.config().setTheme(Theme.DARK);
	
	extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Project Name","Automation Project");
	extent.setSystemInfo("O.S.","Windows");
	extent.setSystemInfo("Tool","Selenium WebDriver");
	extent.setSystemInfo("QA","XYZ");
	return extent;
}
}
