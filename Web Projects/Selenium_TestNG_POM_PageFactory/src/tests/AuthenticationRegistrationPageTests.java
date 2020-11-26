package tests;

import org.testng.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import objects.repository.AuthenticationRegistrationPage;
import objects.repository.CreateAnAccountPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationRegistrationPageTests {


	WebDriver driver;
	AuthenticationRegistrationPage ar;
	CreateAnAccountPage ca;

	
	@BeforeClass
	public void beforeClass() {
		driver = HomePageTests.driver;
		ar = new AuthenticationRegistrationPage(driver);
		ca = new CreateAnAccountPage(driver);

	}
	

	@Test(priority = 0)
	public void createNewAccount() {
		ar.fillEmailAddressField("james.gosling@java.com");
		ar.clickCreateAnAccountBtn();
	}

	@Test(priority = 1)
	public void logInExistingUser() {
		WebDriver driver = new ChromeDriver();
		ar = new AuthenticationRegistrationPage(driver);
		driver.get(AuthenticationRegistrationPage.AUTHENTICATION_REGISTRATION_URL);
		ar.fillRegisteredEmailAddressField("james.gosling@java.com");
		ar.fillRegisteredPasswordField("jamesGosling1995");
		ar.clickSignInBtn();

		Assert.assertTrue(ca.signOutLink.isDisplayed());
		driver.close();
	}
	
	@Test(priority = 2)
	public void logInNonExistingUser() {
		WebDriver driver = new ChromeDriver();
		ar = new AuthenticationRegistrationPage(driver);
		driver.get(AuthenticationRegistrationPage.AUTHENTICATION_REGISTRATION_URL);
		ar.fillRegisteredEmailAddressField("jabuka@java.com");
		ar.fillRegisteredPasswordField("jabucica555");
		ar.clickSignInBtn();

		Assert.assertTrue(ar.authenticationFailed.isDisplayed());
		driver.close();
	}
	
	@Test(priority = 3)
	public void logInWithWrongPassword() {
		WebDriver driver = new ChromeDriver();
		ar = new AuthenticationRegistrationPage(driver);
		driver.get(AuthenticationRegistrationPage.AUTHENTICATION_REGISTRATION_URL);
		ar.fillRegisteredEmailAddressField("james.gosling@java.com");
		ar.fillRegisteredPasswordField("111");
		ar.clickSignInBtn();

		Assert.assertTrue(ar.invalidPassword.isDisplayed());
		driver.close();
	}
	
}
