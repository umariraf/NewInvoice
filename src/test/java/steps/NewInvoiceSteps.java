package steps;

import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.DashboardPage;
import page.LoginPage;
import page.NewInvoicePage;
import page.SideNavigation;
import util.BrowserFactory;

public class NewInvoiceSteps {
	WebDriver driver;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	NewInvoicePage newInvoicePage;
	SideNavigation sideNavigation;
	
	
	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		loginPage = PageFactory.initElements(driver,LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		newInvoicePage = PageFactory.initElements(driver, NewInvoicePage.class);
		sideNavigation = PageFactory.initElements(driver, SideNavigation.class);
	}
	
	@Given("^a user with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void a_user_with_username_and_password(String userName, String password) throws InterruptedException {
		loginPage.login(userName, password);
		Thread.sleep(2000);
		dashboardPage.waitForPage();
	}
	@When("^user navigates to New Invoice Page$")
	public void user_navigates_to_New_Invoice_Page() throws Exception {
		sideNavigation.goToNewInvoicePage();
	}
	@Then("^New Invoice page should display$")
	public void new_Invoice_page_should_display() {
	  Assert.assertTrue("Page not found", newInvoicePage.isPanelHeaderDisplayed());
	  newInvoicePage.addNewCustomer();
	}
	@When("^user creates a new invoice using Full Name \"([^\"]*)\" Company Name \"([^\"]*)"
			+ "\" Email \"([^\"]*)\" Phone \"([^\"]*)\" Address \"([^\"]*)\" City \"([^\"]*)"
			+ "\" State/Region \"([^\"]*)\" ZIP/Postal Code \"([^\"]*)\"$")
	public void user_creates_a_new_invoice_using_Full_Name_Company_Name_Email_Phone_Address_City_State_Region_ZIP_Postal_Code
	(String Name, String company, String email, String phone, String address,
			String city, String state, String zip) throws InterruptedException {
		Thread.sleep(4000);
		newInvoicePage.inputInvoiceTitle(new Random().nextInt(999)+ Name);
		newInvoicePage.inputCompanyTitle(company);
		newInvoicePage.inputEmailTitle(email);
		newInvoicePage.inputPhoneTitle(phone);
		newInvoicePage.inputAddressTitle(address);
		newInvoicePage.inputCityTitle(city);
		newInvoicePage.inputStateTitle(state);
		newInvoicePage.inputZipCode(zip);
		newInvoicePage.clickOnSubmitButton();
		Thread.sleep(3000);
	}



	@After
	public void close() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}


}
