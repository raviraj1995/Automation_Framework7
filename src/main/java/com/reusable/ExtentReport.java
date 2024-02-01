package com.reusable;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReport {
	public static ExtentReports report;
	public static ExtentTest test;
	
	public static ExtentReports getExtentReport() {
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yy HH-mm-ss");
		Date date=new Date();
		String actualDate=format.format(date);
		String path="C:\\Users\\Raviraj\\eclipse-workspace\\Framework4\\Reports\\report_"+actualDate+".html";
		report=new ExtentReports(path,true);
		return report;
	}
	
	public static void startTest(String testName) {
		test=report.startTest(testName);
	}
	
	public static void endReport() {
		report.endTest(test);
		report.flush();
	}

}
