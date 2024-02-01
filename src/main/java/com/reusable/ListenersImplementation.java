package com.reusable;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.TestBase.ExtentTestFactory4;
import com.TestBase.TestBase4;
import com.relevantcodes.extentreports.LogStatus;

public class ListenersImplementation extends TestBase4 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		ExtentReport.startTest(result.getMethod().getMethodName());
		ExtentTestFactory4.getInstance().setExtentTest(ExtentReport.test);
		ExtentTestFactory4.getInstance().getExtentTest();
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		ExtentTestFactory4.getInstance().getExtentTest().log(LogStatus.PASS, "test case passed");
		ExtentTestFactory4.getInstance().teardownExtentTest();
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ExtentTestFactory4.getInstance().getExtentTest().log(LogStatus.FAIL, "test case failed");
		ExtentTestFactory4.getInstance().getExtentTest().log(LogStatus.INFO, "name of failed test case is "+result.getMethod().getMethodName());
		ExtentTestFactory4.getInstance().getExtentTest().log(LogStatus.INFO, "reason of failure is "+result.getThrowable());
		ExtentTestFactory4.getInstance().getExtentTest().log(LogStatus.INFO, ExtentTestFactory4.getInstance().getExtentTest().addScreenCapture(Utility.takeScreenshot(result.getMethod().getMethodName())));
		ExtentTestFactory4.getInstance().teardownExtentTest();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ExtentTestFactory4.getInstance().getExtentTest().log(LogStatus.SKIP, "test case skipped");
		ExtentTestFactory4.getInstance().teardownExtentTest();
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		ExtentReport.getExtentReport();
	}

	@Override
	public void onFinish(ITestContext context) {
		ExtentReport.endReport();
	}

}
