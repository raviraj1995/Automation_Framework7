package com.reusable;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.TestBase.TestBase4;

public class CommonMethods extends TestBase4 {
	
	
	public static void getDropDownOptions(WebElement element,String valueToBeSelected ) {
		Select select=new Select(element);
		select.selectByValue(valueToBeSelected);
	}
	
	public static void getRadioButtonsOption(List<WebElement> elements,String valueToBeSelected) {
		for(int i=0;i<elements.size();i++) {
			if(elements.get(i).getText().equalsIgnoreCase(valueToBeSelected)) {
				elements.get(i).click();
				break;
			}
		}
		
	}

}
