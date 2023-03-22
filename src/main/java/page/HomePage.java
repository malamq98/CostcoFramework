package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='search-field']") // passed
	WebElement searchField;

	@FindBy(xpath = "//a[@class ='myaccount' and @id ='header_sign_in']") // passed
	WebElement signIn;

	@FindBy(how = How.XPATH, using = "(//a[@class ='myaccount'])[1]") // passed
	WebElement ordersAndReturns;

	@FindBy(xpath = "//a[text()='Same-Day' and @id ='Home_Ancillary_1']")
	WebElement sameDay;

	@FindBy(xpath = "//a[text() ='Deals']")
	WebElement deal;

	@FindBy(xpath = "//a[@id ='Home_Ancillary_0']")
	WebElement grocery;

	public void clickOnSearchField() throws InterruptedException {// passed
		searchField.click();
		Thread.sleep(2000);
	}

	public void clickOnSignLink() { // passed
		signIn.click();
	}

	public void clickOnOrdersAndReturns() throws InterruptedException {// passed
		ordersAndReturns.click();
		Thread.sleep(2000);
	}

	public void clickOnCart() { // passed
		driver.findElement(By.id("cart-d")).click();
	}

	public void clickOnSignButton() {
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();

	}

	public void clickOnGroceryLink() { // passed
		grocery.click();
	}

	public void clickOnSameDayLink() {
		sameDay.click();
	}

	public void clickOnDealLink() {
		deal.click();
	}

}
