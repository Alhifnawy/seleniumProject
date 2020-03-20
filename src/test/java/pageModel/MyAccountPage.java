package pageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

	public WebDriver driver;

	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "info-account")
	WebElement WelcomeText;
	
	@FindBy(className = "logout")
	WebElement signout;
	
	public String getWelcomeText() {
		
		return WelcomeText.getText();
	}
	
	public void signOut() {
		signout.click();
	}
}
