package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import pageModel.*;

public class TestBase {

    public static WebDriver driver;

    ChromeBrowser chrome = new ChromeBrowser();
    Homepage homePage = new Homepage(chrome.driver);
    LoginPage loginPage = new LoginPage(chrome.driver);
    RegistrationPage registerPage = new RegistrationPage(chrome.driver);
    MyAccountPage MyAccount = new MyAccountPage(chrome.driver);

    @BeforeMethod
    public void beforeMethod() {
        chrome.OpenWebsite("http://www.automationpractice.com");
    }

    @AfterMethod
    public void afterMethod() {
        try {
            MyAccount.signOut();
        } catch (Exception e) {

        }
    }

    @AfterTest
    public void afterTest() {
        chrome.closeBrowser();
    }
}
