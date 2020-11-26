package tests;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import objects.repository.ShoppingCartSummaryPage;

public class ShoppingCartSummaryPageTests {


	ShoppingCartSummaryPage scs;


	@BeforeClass
	public void beforeClass() {
		WebDriver driver = HomePageTests.driver;
		scs = new ShoppingCartSummaryPage(driver);
	}
	

	
	@Test(priority=0)
	public void verifyShoppingCartSummary() {
		scs.verifyShoppingCartSummary();
	}

	@Test(priority = 1)
	public void verifyProceedAndSignUp() {
		scs.clickProceedToCheckout();
	
	}

}