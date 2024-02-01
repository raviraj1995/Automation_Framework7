package com.ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import com.TestBase.DriverFactory4;
import com.TestBase.TestBase4;

public class MobilePage extends TestBase4 {
	By costOfSonyXperia=By.xpath("//span[text()=\"$100.00\"]");
	By sonyXperiaMobileLink=By.xpath("//a[@title=\"Sony Xperia\"]");
	By addToCartBtnForSonyXperiaMobile=By.xpath("//a[@title=\"Xperia\"]//following-sibling::div[1]//following-sibling::button/span/span");
	
	
	
	
	public String getCostOfSonyXperiaMobile() {
		String costOfSonyXperiaMobie=DriverFactory4.getInstance().getDriver().findElement(costOfSonyXperia).getText();
		return costOfSonyXperiaMobie;
	}
	
	public void clickOnSonyXperiaMobileLink() {
		try{DriverFactory4.getInstance().getDriver().findElement(sonyXperiaMobileLink).click();;
		
		}catch(NoSuchElementException e) {
			
		}
	}
	public void clickOnAddToCartBtnForSonyXperiaMobile() {
		DriverFactory4.getInstance().getDriver().findElement(addToCartBtnForSonyXperiaMobile).click();
	}
	

}
