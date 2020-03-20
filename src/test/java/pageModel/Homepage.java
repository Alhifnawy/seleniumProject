package pageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@class='login']")
	WebElement loginBtn;

	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public void GoToLoginPage() throws InterruptedException {
		loginBtn.click();
		Thread.sleep(2000);
	}
}
