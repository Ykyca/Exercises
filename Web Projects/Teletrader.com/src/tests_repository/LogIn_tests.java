package tests_repository;

import org.testng.annotations.Test;

import objects_repository.Login;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class LogIn_tests {

	WebDriver driver = new ChromeDriver();

	@BeforeClass
	public void beforeClass() {
		driver.get("https://www.teletrader.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login.mainMenu(driver).click();
		Login.loginLink(driver).click();

	}

	@Test(priority = 0)
	public void wrongUsername() {
		Login.fillUsernameField(driver, "kkk");
		Login.fillPasswordField(driver, "8kkk");
		Login.acceptEULAcheckBox(driver);
		Login.clickLoginButton(driver);
		Assert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'The username or password is incorrect')]"))
				.isDisplayed());
	}

	@Test(priority = 1)
	public void wrongPassword() {
		Login.fillUsernameField(driver, "kkk8@sharklasers.com");
		Login.fillPasswordField(driver, "aaa");
		Login.acceptEULAcheckBox(driver);
		Login.clickLoginButton(driver);
		Assert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'The username or password is incorrect')]"))
				.isDisplayed());
	}

	@Test(priority = 3)
	public void successfullLogIn() {
		Login.fillUsernameField(driver, "kkk8@sharklasers.com");

		WebDriverWait wait = new WebDriverWait(driver, 10);
		// wait.until(ExpectedConditions.elementToBeClickable(Login.usernameField(driver)));
		wait.until(ExpectedConditions.visibilityOf(Login.usernameField(driver)));

		Login.fillPasswordField(driver, "8kkk");
		Login.acceptEULAcheckBox(driver);
		Login.clickLoginButton(driver);

		Login.mainMenu(driver).click();
		Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Account Settings')]")).isDisplayed());

	}

	@AfterMethod
	public void afterMethod() {
		if (Login.usernameField(driver).isDisplayed() && Login.passwordField(driver).isDisplayed()
				&& Login.eulaCheckBox(driver).isDisplayed()) {
			Login.usernameField(driver).clear();
			Login.passwordField(driver).clear();
			Login.eulaCheckBox(driver).click();
		}
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
