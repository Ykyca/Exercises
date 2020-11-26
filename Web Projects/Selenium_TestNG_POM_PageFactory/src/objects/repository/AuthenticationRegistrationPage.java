package objects.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationRegistrationPage {

	WebDriver driver;

	public static String AUTHENTICATION_REGISTRATION_URL = "http://automationpractice.com/index.php?controller=authentication&multi-shipping=0&display_guest_checkout=0&back=http%3A%2F%2Fautomationpractice.com%2Findex.php%3Fcontroller%3Dorder%26step%3D1%26multi-shipping%3D0";

	// elements
	@FindBy(xpath = "//input[@id='email_create']")
	public WebElement emailAddressField;

	@FindBy(xpath = "//form[@id='create-account_form']//span[1]")
	public WebElement createAnAccountBtn;

	@FindBy(xpath = "//input[@id='email']")
	public WebElement registeredEmailAddressField;

	@FindBy(xpath = "//input[@id='passwd']")
	public WebElement registeredPasswordField;

	@FindBy(xpath = "//p[@class='submit']//span[1]")
	public WebElement signInBtn;
	
	@FindBy(xpath = "//li[contains(text(),'Invalid password.')]")
	public WebElement invalidUserMessage;
	
	@FindBy(xpath = "//li[contains(text(),'Invalid password.')]")
	public WebElement invalidPassword;
	
	@FindBy(xpath ="//*[@id=\"authentication\"]")
	public WebElement authenticationFailed;

	// constructor
	public AuthenticationRegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// methods
	public void fillEmailAddressField(String email) {
		emailAddressField.sendKeys(email);
	}

	public void clickCreateAnAccountBtn() {
		createAnAccountBtn.click();
	}

	public void fillRegisteredEmailAddressField(String email) {
		registeredEmailAddressField.sendKeys(email);
	}

	public void fillRegisteredPasswordField(String password) {
		registeredPasswordField.sendKeys(password);
	}

	public void clickSignInBtn() {
		signInBtn.click();
	}

}
