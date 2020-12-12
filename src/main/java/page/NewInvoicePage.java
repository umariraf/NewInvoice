package page;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewInvoicePage extends BasePage{
	WebDriver driver;
	
	public NewInvoicePage(WebDriver driver) {
		this.driver=driver;
	}
	//Element Library
	@FindBy(how = How.XPATH, using = "//h5[contains(text(), 'Create New Invoice')]")
	WebElement PanelHeaderElement;
	@FindBy(how = How.XPATH, using = "//span[@class='help-block']/a")
	WebElement AddNewCustomer;
	@FindBy(how=How.ID,  using = "account")
	WebElement AccountField;
	@FindBy(how=How.ID,  using = "company")
	WebElement CompanyField;
	@FindBy(how=How.ID,  using = "email")
	WebElement EmailField;
	@FindBy(how=How.ID,  using = "phone")
	WebElement PhoneNo;
	@FindBy(how=How.ID,  using = "address")
	WebElement AddressField;
	@FindBy(how=How.ID,  using = "city")
	WebElement CityField;
	@FindBy(how=How.ID,  using = "state")
	WebElement StateADD;
	@FindBy(how=How.ID,  using = "zip")
	WebElement ZipCode;
	@FindBy(how=How.XPATH,  using = "//button[@id='contact_submit']")
	WebElement SubmitButton;
	
	public void fillInTheAddContactForm(String Name, String company, String email, String phone,
			String address, String city, String state, String zip) throws InterruptedException {
	
	AccountField.sendKeys(Name);
	Thread.sleep(2000);
	CompanyField.sendKeys(company);
	EmailField.sendKeys(email);
	PhoneNo.sendKeys(phone);
	AddressField.sendKeys(address);
	CityField.sendKeys(city);
	StateADD.sendKeys(state);
	ZipCode.sendKeys(zip);
	Thread.sleep(3000);
	SubmitButton.click();
	Thread.sleep(4000);
}
	public void waitForPage() {
		waitForElement(PanelHeaderElement,driver);
	}
	public void addNewCustomer() {
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(AddNewCustomer)).click();
	}
	public boolean isPanelHeaderDisplayed() {
		try {
			return PanelHeaderElement.isDisplayed();
		}
		catch(NoSuchElementException e) {
		
			return false;
		}
	}
	public void inputInvoiceTitle(String Name) throws InterruptedException {
		Thread.sleep(6000);
		AccountField.sendKeys(Name);
	}
	public void inputCompanyTitle(String company) {
		CompanyField.sendKeys(company);
	}
	public void inputEmailTitle(String email) {
		EmailField.sendKeys(email);
		}
	public void inputPhoneTitle(String phone) {
		PhoneNo.sendKeys(phone);
	}
	public void inputAddressTitle(String address) {
		AddressField.sendKeys(address);
	}
	public void inputCityTitle(String city) {
		CityField.sendKeys(city);
	}
	public void inputStateTitle(String state) {
		StateADD.sendKeys(state);
	}
	public void inputZipCode(String zip) {
		ZipCode.sendKeys(zip);
	}
	public void clickOnSubmitButton() {
		SubmitButton.click();
	}
	
	
	
	
	
	
	
	

}

	

