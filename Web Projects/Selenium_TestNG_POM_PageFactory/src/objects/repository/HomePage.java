package objects.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {

	WebDriver driver;

	public static String SUMMER_DRESSES_URL = "http://automationpractice.com/index.php?id_category=11&controller=category";
	public static String MY_STORE_HOME_PAGE = "http://automationpractice.com/index.php";

	// elements
	@FindBy(xpath = "//a[@class='sf-with-ul'][contains(text(),'Women')]")
	public WebElement womenBtn;

	@FindBy(xpath = "//ul[@class='submenu-container clearfix first-in-line-xs']//ul//li//a[contains(text(),'Summer Dresses')]")
	public WebElement summerDressesLinkW;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
	public WebElement dressesBtn;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[3]/a[1] ")
	public WebElement summerDressesLinkD;

	@FindBy(xpath = "//a[@class='login']")
	public WebElement signInLink;

	// constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// methods
	public void hoverOverWomenBtn() {
		Actions a = new Actions(driver);
		a.moveToElement(womenBtn).perform();
	}

	public void clickSummerDressesLinkW() {
		summerDressesLinkW.click();
	}

	public void verifySummerDressesStartPageW() {
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, SUMMER_DRESSES_URL);
	}

	public void verifySummerDressesStartPageD() {
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, SUMMER_DRESSES_URL);
	}

	public void hoverOverDressesBtn() {
		Actions a = new Actions(driver);
		a.moveToElement(dressesBtn).perform();
	}

	public void clickSummerDressesLinkD() {
		summerDressesLinkD.click();
	}

	public void clickSignInLink() {
		signInLink.click();
	}

}