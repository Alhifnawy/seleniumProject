package pageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public WebDriver driver;

	public ChromeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Courses\\ITShare\\Sources\\Selenium Drivers\\windows-64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	
	public void OpenWebsite(String url) {
		driver.get(url);
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
}
