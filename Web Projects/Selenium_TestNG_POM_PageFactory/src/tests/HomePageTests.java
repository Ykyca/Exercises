package tests;

import org.testng.annotations.Test;
import objects.repository.HomePage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HomePageTests {

	public static WebDriver driver;
	HomePage hp;

	@BeforeSuite
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		hp = new HomePage(driver);
		driver.get(HomePage.MY_STORE_HOME_PAGE);
	}

	@Test(priority = 0)
	public void verifySummerDressesHomePageW() {
		hp.hoverOverWomenBtn();
		hp.clickSummerDressesLinkW();
		hp.verifySummerDressesStartPageW();

	}

	@Test(priority = 1)
	public void verifySummerDressesHomePageD() {
		hp.hoverOverDressesBtn();
		hp.clickSummerDressesLinkD();
		hp.verifySummerDressesStartPageD();
	}

	@Test(priority = 2)
	public void verifySummerDressesHomePage() {
		String b = driver.getCurrentUrl();
		hp.hoverOverWomenBtn();
		hp.clickSummerDressesLinkW();
		String a = driver.getCurrentUrl();

		Assert.assertEquals(a, b);

	}

	@AfterSuite
	public void quit() {
		driver.quit();
	}

}
