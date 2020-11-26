package objects.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyDressPage {

	WebDriver driver;

	public static String BUY_DRESS_URL = "http://automationpractice.com/index.php?id_product=5&controller=product";

	@FindBy(xpath = "//i[@class='icon-plus']")
	public WebElement addQuantity;

	@FindBy(xpath = "//option[contains(text(),'M')]")
	public WebElement sizeM;

	@FindBy(id = "color_14")
	public WebElement colorBlue;

	@FindBy(xpath = "//span[contains(text(),'Add to cart')]")
	public WebElement addToCartBtn;

	@FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
	public WebElement proceedToCheckout;

	// constructor
	public BuyDressPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickAddQuantity() {
		addQuantity.click();
	}

	public void clickSizeM() {
		sizeM.click();
	}

	public void clickColorBlue() {
		colorBlue.click();
	}

	public void clickAddToCartBtn() {
		addToCartBtn.click();
	}

	public void clickProceedToCheckout() {
		proceedToCheckout.click();
	}
}
