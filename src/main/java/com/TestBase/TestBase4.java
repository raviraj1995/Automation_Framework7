package com.TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ObjectRepo.HomePage;
import com.ObjectRepo.MobilePage;
import com.ObjectRepo.ShoppingCartPage;
import com.ObjectRepo.SonyXperiaMobilePage;
import com.reusable.Objects;
import com.reusable.OperationsProperties;

public class TestBase4 extends Objects {
	public static WebDriver driver;
	
	@BeforeMethod()
	public void getBrowserAndNevigateToApp() {
		String browser=OperationsProperties.getProperty("browser");
		String url=OperationsProperties.getProperty("url");
		DriverFactory4.getInstance().setDriver(BrowserFactory4.getBrowserInstance(browser));
		DriverFactory4.getInstance().getDriver();
		DriverFactory4.getInstance().getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		DriverFactory4.getInstance().getDriver().manage().window().maximize();
		DriverFactory4.getInstance().getDriver().get(url);
		hPage=new HomePage();
		sonyPage=new SonyXperiaMobilePage();
		mPage=new MobilePage();
		scPage=new ShoppingCartPage();
	}
	
	@AfterMethod()
	public void tearDown() {
		DriverFactory4.getInstance().tearDown();
	}

}
