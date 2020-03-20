package pageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

	public WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='alert alert-danger']")
	WebElement alert;
	
	@FindBy(id = "id_gender1")
	WebElement Male;
	
	@FindBy(id = "id_gender2")
	WebElement Female;
	
	@FindBy(xpath = "//input[@id='customer_firstname']")
	WebElement FirstName;
	
	@FindBy(xpath = "//input[@id='customer_lastname']")
	WebElement LastName;
	
	@FindBy(id = "email")
	WebElement Email;
	
	@FindBy(id = "passwd")
	WebElement Password;
	
	@FindBy(id = "days")
	WebElement Day;
	
	@FindBy(id = "months")
	WebElement Month;
	
	@FindBy(id = "years")
	WebElement Year;
	
	@FindBy(id = "firstname")
	WebElement firstName;
	
	@FindBy(id = "lastname")
	WebElement lastName;
	
	@FindBy(id = "company")
	WebElement Company;
	
	@FindBy(id = "address1")
	WebElement Address;
	
	@FindBy(id = "address2")
	WebElement Address2;
	
	@FindBy(id = "city")
	WebElement City;
	
	@FindBy(id = "id_state")
	WebElement State;
	
	@FindBy(id = "postcode")
	WebElement PostalCode;
	
	@FindBy(id = "id_country")
	WebElement Country;
	
	@FindBy(id = "other")
	WebElement AdditionalInformation;
	
	@FindBy(id = "phone")
	WebElement HomePhone;
	
	@FindBy(id = "phone_mobile")
	WebElement MobilePhone;
	
	@FindBy(id = "alias")
	WebElement AssignAnAddress;
	
	@FindBy(id = "submitAccount")
	WebElement Register;
	
	public void ChooseGender(String Gender) {
		if(Gender == "Male") {
			Male.click();
		}
		else if(Gender == "Female") {
			Female.click();
		}
	}
	
	public void setFirstName(String Name) {
		FirstName.sendKeys(Name);
	}
	public void setLastName(String Name) {
		LastName.sendKeys(Name);
	}
	public void setPassword(String Pass) {
		Password.sendKeys(Pass);
	}
	public void setDate(String day,String month,String year) {
		Select days = new Select(Day);
		days.selectByValue(day);
		
		Select months = new Select(Month);
		months.selectByValue(month);
		
		Select years = new Select(Year);
		years.selectByValue(year);
	}
	public void setfirstName(String Name) {
		firstName.sendKeys(Name);
	}
	public void setlastName(String Name) {
		lastName.sendKeys(Name);
	}
	public void setCompany(String CompanyName) {
		Company.sendKeys(CompanyName);
	}
	public void setPrimaryAddress(String Address1) {
		Address.sendKeys(Address1);
	}
	public void setSecondaryAddress(String secondAddress) {
		Address2.sendKeys(secondAddress);
	}
	public void setCity(String CityName) {
		City.sendKeys(CityName);
	}
	public void setState(String State){
		Select state = new Select(this.State);
		state.selectByValue(State);
	}
	public void setPostalCode(String postcode) {
		PostalCode.sendKeys(postcode);
	}
	public void setCountry(){
		Select country = new Select(this.Country);
		country.selectByVisibleText("United States");
	}
	public void AdditionalInformation(String info) {
		AdditionalInformation.sendKeys(info);
	}
	public void SetHomePhone(String homephone) {
		HomePhone.sendKeys(homephone);
	}
	public void SetMobilePhone(String mobilephone) {
		MobilePhone.sendKeys(mobilephone);
	}
	public void AssignAnAddressAlias(String add) {
		AssignAnAddress.sendKeys(add);
	}
	public void ClickOnRegisterBTN() throws InterruptedException {
		Register.click();
		Thread.sleep(3000);
	}
	
	public String GetAlert() {
		return alert.getText();
	}

}
