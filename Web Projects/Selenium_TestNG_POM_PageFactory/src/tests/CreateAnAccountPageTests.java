package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import objects.repository.CreateAnAccountPage;

public class CreateAnAccountPageTests {
	WebDriver driver;
	CreateAnAccountPage ca;

	@BeforeClass
	public void beforeClass() {
		driver = HomePageTests.driver;
		ca = new CreateAnAccountPage(driver);
	}

	@Test(priority = 0)
	public void registerOneNewUser() throws InterruptedException {
		ca.fillFirstNameField("Java");
		ca.fillLastNameField("Oop");
		ca.emailField.clear();
		ca.fillEmailField("hhhwwwaughffuuuoo44@java.com");
		ca.fillPasswordField("jamesGosling1995");
		ca.fillAddressFirstNameField("Java");
		ca.fillAddressLastNameField("Oop");
		ca.fillAddressField("Calgary Street 1955");
		ca.fillCityField("Calgary");
		ca.selectStateFieldTexas();
		ca.fillZipPostalCode("00000");
		ca.selectCountryFieldUS();
		ca.fillMobilePhoneField("00160419551995");
		ca.assignAnAddressAliasForFutureReferenceField.clear();
		ca.fillAssignAnAddressAliasForFutureReferenceField("Java Father's Address");
		ca.clickRegisterBtn();

		Assert.assertTrue(ca.signOutLink.isDisplayed());
	}

}
