package com.ObjectRepo;

import org.openqa.selenium.By;

import com.TestBase.DriverFactory4;
import com.TestBase.TestBase4;

public class HomePage extends TestBase4 {
	By mobileLink=By.xpath("//a[text()=\"Mobile\"]");
	
	
	
	
	public void clickOnMobileLink() {
		DriverFactory4.getInstance().getDriver().findElement(mobileLink).click();
	}

}
