package com.TestBase;

import com.relevantcodes.extentreports.ExtentTest;

public class ExtentTestFactory4 {
	
	private ExtentTestFactory4() {
		
	}
	
	private static ExtentTestFactory4 instance=new ExtentTestFactory4();
	
	public static ExtentTestFactory4 getInstance() {
		return instance;
	}
	
	ThreadLocal<ExtentTest> test=new ThreadLocal<ExtentTest>();
	
	public void setExtentTest(ExtentTest testPara) {
		test.set(testPara);
	}
	public ExtentTest getExtentTest() {
		return test.get();
	}
	
	public void teardownExtentTest() {
		test.remove();
	}

}
