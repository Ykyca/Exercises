package tests;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tests.HomePageTests;
import objects.repository.SummerDressesPage;

public class SummerDressesPageTests{
	
	SummerDressesPage sdp;
	
	@BeforeClass
	public void setUp() {
	WebDriver driver = HomePageTests.driver;
	sdp= new SummerDressesPage(driver);
	}


	@Test(priority = 0)
	public void selectDressOne() {
		sdp.clickDressOne();
	}

}
