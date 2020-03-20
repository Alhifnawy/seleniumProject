package test;

import org.testng.annotations.Test;

import pageModel.ChromeBrowser;
import pageModel.Homepage;
import pageModel.LoginPage;
import pageModel.MyAccountPage;
import pageModel.RegistrationPage;

import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class Registration extends TestBase{

	@Test(priority = 1)
	public void RegisterWithMandatoryFieldsOnly() throws InterruptedException {

		homePage.GoToLoginPage();
		loginPage.enterEmailAddress("abnnaahbm@abc.com");
		loginPage.clickonCreateAnAccountBTN();

		registerPage.setFirstName("Abdurahman");
		registerPage.setLastName("Alhifnawy");
		registerPage.setPassword("qwertyasdfgh");
		registerPage.setfirstName("Abdurahman");
		registerPage.setlastName("Alhifnawy");
		registerPage.setPrimaryAddress("32fdsadfa");
		registerPage.setCity("Cairo");
		registerPage.setState("2");
		registerPage.setPostalCode("12324");
		registerPage.setCountry();
		registerPage.SetMobilePhone("012312411234");
		registerPage.AssignAnAddressAlias("12413asfasdf");
		registerPage.ClickOnRegisterBTN();

		Assert.assertTrue(MyAccount.getWelcomeText().contains("Welcome to your account"));
	}

	@Test(priority = 2)
	public void InvalidRegisterOne() throws InterruptedException {

		homePage.GoToLoginPage();
		loginPage.enterEmailAddress("abnman@abc.com");
		loginPage.clickonCreateAnAccountBTN();

		registerPage.setLastName("Alhifnawy");
		registerPage.setPassword("qwertyasdfgh");
		registerPage.setfirstName("Abdurahman");
		registerPage.setlastName("Alhifnawy");
		registerPage.setPrimaryAddress("32fdsadfa");
		registerPage.setCity("Cairo");
		registerPage.setState("2");
		registerPage.setPostalCode("12324");
		registerPage.setCountry();
		registerPage.SetMobilePhone("012312411234");
		registerPage.AssignAnAddressAlias("12413asfasdf");
		registerPage.ClickOnRegisterBTN();

		Assert.assertTrue(registerPage.GetAlert().toLowerCase().contains("firstname is required"));
	}
}
