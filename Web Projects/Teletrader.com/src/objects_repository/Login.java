package objects_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	// Methods and elements
	static WebElement element = null;

	public static WebElement mainMenu(WebDriver driver) {
		element = driver.findElement(By.id("headerMenuSelector"));
		return element;
	}

	public static WebElement loginLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		return element;
	}

	public static WebElement usernameField(WebDriver driver) {
		element = driver.findElement(By.id("Username"));
		return element;
	}

	public static WebElement passwordField(WebDriver driver) {
		element = driver.findElement(By.id("Password"));
		return element;
	}

	public static WebElement eulaCheckBox(WebDriver driver) {
		element = driver.findElement(By.id("LoginTermsAccepted"));
		return element;
	}

	public static WebElement loginButton(WebDriver driver) {
		element = driver.findElement(By.id("LoginButton"));
		return element;
	}

	public static void fillUsernameField(WebDriver driver, String username) {
		element = usernameField(driver);
		element.sendKeys(username);
	}

	public static void fillPasswordField(WebDriver driver, String password) {
		element = passwordField(driver);
		element.sendKeys(password);
	}

	public static void acceptEULAcheckBox(WebDriver driver) {
		element = eulaCheckBox(driver);
		element.click();
	}

	public static void clickLoginButton(WebDriver driver) {
		element = loginButton(driver);
		element.click();
	}

}
