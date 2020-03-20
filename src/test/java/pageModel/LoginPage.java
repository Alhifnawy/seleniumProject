package pageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email_create")
	WebElement EmailAddress;

	@FindBy(xpath = "//i[@class='icon-user left']")
	WebElement CreateAnAccountBTN;

	public void enterEmailAddress(String email) {
		EmailAddress.sendKeys(email);

	}

	public void clickonCreateAnAccountBTN() throws InterruptedException {
		CreateAnAccountBTN.click();
		Thread.sleep(3000);
	}

}