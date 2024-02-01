package com.ObjectRepo;

import org.openqa.selenium.By;

import com.TestBase.DriverFactory4;
import com.TestBase.TestBase4;

public class SonyXperiaMobilePage extends TestBase4 {
	By textForSonyXperiaOnDetailsPage=By.xpath("//span[text()=\"Sony Xperia\"]");
	By costOfSonyXperiaOnDetailsPage=By.xpath("//span[text()=\"$100.00\"]");
	
	public String getTextForSonyXperiaOnDetailsPage() {
		String testForSonyXperia=DriverFactory4.getInstance().getDriver().findElement(textForSonyXperiaOnDetailsPage).getText();
		return testForSonyXperia;
	}
	
	public String getCostOfSonyXperiaOnDetailsPage() {
		String costOfSonyXperiaOnDetailsPagee=DriverFactory4.getInstance().getDriver().findElement(costOfSonyXperiaOnDetailsPage).getText();
		return costOfSonyXperiaOnDetailsPagee;
	}

}
