package tests;

import org.testng.annotations.Test;
import objects.repository.AuthenticationRegistrationPage;
import objects.repository.CreateAnAccountPage;
import test.data.FakerTestDataGenerator;
import test.data.ReadFakeData;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class RegisterNewRandomUsers extends ReadFakeData {
	WebDriver driver;
	AuthenticationRegistrationPage ar;
	CreateAnAccountPage ca;
	ReadFakeData rfd;
	FakerTestDataGenerator fdg;

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ar = new AuthenticationRegistrationPage(driver);
		ca = new CreateAnAccountPage(driver);
		rfd = new ReadFakeData();
		fdg = new FakerTestDataGenerator();
		driver.get(AuthenticationRegistrationPage.AUTHENTICATION_REGISTRATION_URL);
	}

	@Test
	public void register30newUsers() throws IOException, InterruptedException {
		fdg.generateData();
		for (int i = 0; i < 30; i++) {
			Thread.sleep(3000);
			ar.fillEmailAddressField(rfd.getData(i, 2));
			ar.clickCreateAnAccountBtn();
			ca.fillFirstNameField(rfd.getData(i, 0));
			ca.fillLastNameField(rfd.getData(i, 1));
			ca.emailField.clear();
			ca.fillEmailField(rfd.getData(i, 2));
			ca.fillPasswordField(rfd.getData(i, 3));
			ca.fillAddressFirstNameField(rfd.getData(i, 4));
			ca.fillAddressLastNameField(rfd.getData(i, 5));
			ca.fillAddressField(rfd.getData(i, 6));
			ca.fillCityField(rfd.getData(i, 7));
			ca.selectStateFieldTexas();
			ca.fillZipPostalCode(rfd.getData(i, 8));
			ca.selectCountryFieldUS();
			ca.fillMobilePhoneField(rfd.getData(i, 9));
			ca.assignAnAddressAliasForFutureReferenceField.clear();
			ca.fillAssignAnAddressAliasForFutureReferenceField(rfd.getData(i, 10));
			ca.clickRegisterBtn();

			Assert.assertTrue(ca.signOutLink.isDisplayed());
			ca.clickSignOutLink();
			driver.get(AuthenticationRegistrationPage.AUTHENTICATION_REGISTRATION_URL);
			Thread.sleep(3000);
		}
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
