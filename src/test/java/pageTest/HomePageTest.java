package pageTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test(enabled = false) // passed

	public void clickOnSearchFieldTest() throws InterruptedException {
		homePage.clickOnSearchField();
	}

	@Test(enabled = false) // passed
	public void clickOnSignTest() {
		homePage.clickOnSignLink();
	}

	@Test(enabled = false) // passed

	public void clickOnOrderlinkTest() throws InterruptedException {
		homePage.clickOnOrdersAndReturns();
	}

	@Test(enabled = false) // passed
	public void clickOnCartTest() {
		homePage.clickOnCart();
	}

	@Test(enabled = false)
	public void clickOnSignButtonTest() {
		homePage.clickOnSignButton();
	}

	@Test(enabled = false) // passed

	public void clickOnGroceryLinkTest() {
		homePage.clickOnGroceryLink();
	}

	@Test(enabled = true)
	public void clickOnSameDayLinkTest() {
		homePage.clickOnSameDayLink();
	}

	@Test(enabled = true)
	public void clickOnDealLinkTest() {
		homePage.clickOnDealLink();
	}

}