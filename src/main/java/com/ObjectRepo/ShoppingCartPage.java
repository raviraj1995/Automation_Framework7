package com.ObjectRepo;

import org.openqa.selenium.By;

import com.TestBase.DriverFactory4;
import com.TestBase.TestBase4;

public class ShoppingCartPage extends TestBase4 {
	By quantityTextox=By.xpath("(//input[@type=\"text\"])[1]");
	By updateButton=By.xpath("//span[text()=\"Update\"]");
	By itemErrorMsg=By.xpath("//p[@class=\"item-msg error\"]");
	By emptyCartLink=By.xpath("//span[text()=\"Empty Cart\"]");
	By shoppingCartIsEmptyMsg=By.xpath("(//p[text()=\"You have no items in your shopping cart.\"])[2]");
	
	public void sendInputToQuantityTextbox(String quantity) {
		DriverFactory4.getInstance().getDriver().findElement(quantityTextox).clear();
		DriverFactory4.getInstance().getDriver().findElement(quantityTextox).sendKeys(quantity);
	}
	public void clickOnUpdateBtn() {
		DriverFactory4.getInstance().getDriver().findElement(updateButton).click();
	}
	public String getItemErrorMsg() {
		String itemErroeMsg=DriverFactory4.getInstance().getDriver().findElement(itemErrorMsg).getText();
		return itemErroeMsg;
	}
	public void clickOnEmptyCartLink() {
		DriverFactory4.getInstance().getDriver().findElement(emptyCartLink).click();
	}
	public String getTextForShoppingCartIsEmpty() {
		String textForShoppingCartEmpty=DriverFactory4.getInstance().getDriver().findElement(shoppingCartIsEmptyMsg).getText();
		return textForShoppingCartEmpty;
	}

}
