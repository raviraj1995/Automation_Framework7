import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.TestBase.TestBase4;
import com.reusable.ListenersImplementation;
@Listeners(ListenersImplementation.class)
public class ErrorVerificationTest extends TestBase4 {
	
	@Test
	public void verifyUserShouldNotBeAbleToAddMoreProductInCartThanProductAvailableInStore() {
		hPage.clickOnMobileLink();
		mPage.clickOnAddToCartBtnForSonyXperiaMobile();
		scPage.sendInputToQuantityTextbox("1000");
		scPage.clickOnUpdateBtn();
		String actualItemErrorMsg=scPage.getItemErrorMsg();
		String expectedErrorMsg= "* 1The maximum quantity allowed for purchase is 500.";
		Assert.assertEquals(actualItemErrorMsg, expectedErrorMsg);
	}
	@Test
	public void verifyShoppingCartInEmpty() {
		hPage.clickOnMobileLink();
		mPage.clickOnAddToCartBtnForSonyXperiaMobile();
		scPage.sendInputToQuantityTextbox("1000");
		scPage.clickOnUpdateBtn();
		scPage.clickOnEmptyCartLink();
		String actualTextForEmptyShoppingCart=scPage.getTextForShoppingCartIsEmpty();
		String expectedText="You have no items in your shopping cart.";
		Assert.assertEquals(actualTextForEmptyShoppingCart, expectedText);
		
	}

}
