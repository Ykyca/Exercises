package objects.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummerDressesPage {

	WebDriver driver;

	public static String SUMMER_DRESSES_URL = "http://automationpractice.com/index.php?id_category=11&controller=category";

	// elements
	@FindBy(xpath = "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line']//a[@class='product-name'][contains(text(),'Printed Summer Dress')]")
	public WebElement dressOne;

	// constructor
	public SummerDressesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// methods
	public void clickDressOne() {
		dressOne.click();
	}
}