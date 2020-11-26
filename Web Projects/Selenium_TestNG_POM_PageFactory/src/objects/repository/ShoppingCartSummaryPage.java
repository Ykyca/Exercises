package objects.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ShoppingCartSummaryPage {

	WebDriver driver;

	public static String SHOPPING_CART_SUMMARY_URL = "http://automationpractice.com/index.php?controller=order";

	@FindBy(xpath = "//td[@class='cart_description']//a[contains(text(),'Printed Summer Dress')]")
	public WebElement product;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[5]/input[2]")
	public WebElement quantity;

	@FindBy(xpath = "//td[@class='cart_description']//a[contains(text(),'Color : Blue, Size : M')]")
	public WebElement colorAndSize;

	@FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")
	public WebElement proceedToCheckOut;

	// constructor
	public ShoppingCartSummaryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void verifyShoppingCartSummary() {
		Assert.assertEquals(product.getText(), "Printed Summer Dress");
		Assert.assertEquals(colorAndSize.getText(), "Color : Blue, Size : M");
		Assert.assertEquals(quantity.getAttribute("size"), "2");
	}

	public void clickProceedToCheckout() {
		proceedToCheckOut.click();
	}

}