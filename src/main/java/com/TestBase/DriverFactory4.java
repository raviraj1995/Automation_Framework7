package com.TestBase;

import org.openqa.selenium.WebDriver;

public class DriverFactory4 {
	
	private DriverFactory4() {
		
	}
	
	private static DriverFactory4 instance=new DriverFactory4();
	
	public static DriverFactory4 getInstance() {
		return instance;
	}
	
	ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();
	
	public void setDriver(WebDriver driverParameter) {
		driver.set(driverParameter);
	}
	public WebDriver getDriver() {
		return driver.get();
	}
	
	public void tearDown() {
		driver.get().close();
		driver.remove();
	}

}
