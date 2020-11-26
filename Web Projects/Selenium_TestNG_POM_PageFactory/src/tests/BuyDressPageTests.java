package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import objects.repository.BuyDressPage;
import org.openqa.selenium.WebDriver;

public class BuyDressPageTests {

	BuyDressPage bd;

	@BeforeClass
	public void beforeClass() {
		WebDriver driver = HomePageTests.driver;
		bd = new BuyDressPage(driver);
	}

	@Test(priority = 0)
	public void buyDressOne() {
		bd.clickAddQuantity();
		bd.clickSizeM();
		bd.clickColorBlue();
		bd.clickAddToCartBtn();
		bd.clickProceedToCheckout();
	}

}