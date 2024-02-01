import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.TestBase.TestBase4;
import com.reusable.ListenersImplementation;
@Listeners(ListenersImplementation.class)
public class VerifyCostOfSonyXperia extends TestBase4 {
	
	
	@Test
	public void verifyCostOfSonyXperiaMobileOnListPageAndDetailsPageIsSame() {
		hPage.clickOnMobileLink();
		//mPage.clickOnSonyXperiaMobileLink();
		String costOfSonyXperiaMobileOnListPage=mPage.getCostOfSonyXperiaMobile();
		mPage.clickOnSonyXperiaMobileLink();
		String actualTextOfSonyXperiaMobileOnDetailsPage=sonyPage.getTextForSonyXperiaOnDetailsPage();
		String expectedText="SONY XPERIA";
		Assert.assertEquals(actualTextOfSonyXperiaMobileOnDetailsPage, expectedText);
		String costOfSonyXperiaMobileOnDeatilsPage=sonyPage.getCostOfSonyXperiaOnDetailsPage();
		Assert.assertEquals(costOfSonyXperiaMobileOnListPage, costOfSonyXperiaMobileOnDeatilsPage);
		
	}

}
