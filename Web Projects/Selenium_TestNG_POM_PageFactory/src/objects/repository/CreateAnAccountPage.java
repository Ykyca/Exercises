package objects.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAnAccountPage {

	WebDriver driver;

	public static String CREATE_AN_ACCOUNT_URL = "http://automationpractice.com/index.php?controller=authentication&multi-shipping=0&display_guest_checkout=0&back=http%3A%2F%2Fautomationpractice.com%2Findex.php%3Fcontroller%3Dorder%26step%3D1%26multi-shipping%3D0#account-creation";

	// elements
	@FindBy(xpath = "//input[@id='customer_firstname']")
	public WebElement firstNameField;

	@FindBy(xpath = "//input[@id='customer_lastname']")
	public WebElement lastNameField;

	@FindBy(xpath = "//input[@id='email']")
	public WebElement emailField;

	@FindBy(xpath = "//input[@id='passwd']")
	public WebElement passwordField;

	@FindBy(xpath = "//input[@id='firstname']")
	public WebElement addressFirstNameField;

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement addressLastNameField;

	@FindBy(xpath = "//input[@id='address1']")
	public WebElement addressField;

	@FindBy(xpath = "//input[@id='city']")
	public WebElement cityField;

	@FindBy(xpath = "//option[contains(text(),'Texas')]")
	public WebElement stateFieldTexas;

	@FindBy(xpath = "//input[@id='postcode']")
	public WebElement zipPostalCodeField;

	@FindBy(xpath = "//option[contains(text(),'United States')]")
	public WebElement countryFieldUS;

	@FindBy(xpath = "//input[@id='phone_mobile']")
	public WebElement mobilePhoneField;

	@FindBy(xpath = "//input[@id='alias']")
	public WebElement assignAnAddressAliasForFutureReferenceField;

	@FindBy(id = "submitAccount")
	public WebElement registerBtn;

	@FindBy(xpath = "//a[@class='logout']")
	public WebElement signOutLink;

	// constructor
	public CreateAnAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// methods
	public void fillFirstNameField(String firstName) {
		firstNameField.sendKeys(firstName);
	}

	public void fillLastNameField(String lastName) {
		lastNameField.sendKeys(lastName);
	}

	public void fillEmailField(String email) {
		emailField.sendKeys(email);
	}

	public void fillPasswordField(String password) {
		passwordField.sendKeys(password);
	}

	public void fillAddressFirstNameField(String addressFirstName) {
		addressFirstNameField.sendKeys(addressFirstName);
	}

	public void fillAddressLastNameField(String addressLastName) {
		addressLastNameField.sendKeys(addressLastName);
	}

	public void fillAddressField(String address) {
		addressField.sendKeys(address);
	}

	public void fillCityField(String city) {
		cityField.sendKeys(city);
	}

	public void selectStateFieldTexas() {
		stateFieldTexas.click();
	}

	public void fillZipPostalCode(String zipCode) {
		zipPostalCodeField.sendKeys(zipCode);
	}

	public void selectCountryFieldUS() {
		countryFieldUS.click();
	}

	public void fillMobilePhoneField(String mobilePhone) {
		mobilePhoneField.sendKeys(mobilePhone);
	}

	public void fillAssignAnAddressAliasForFutureReferenceField(String addressAlias) {
		assignAnAddressAliasForFutureReferenceField.sendKeys(addressAlias);
	}

	public void clickRegisterBtn() {
		registerBtn.click();
	}

	public void clickSignOutLink() {
		signOutLink.click();
	}
}
