package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage extends BasePage {
	WebDriver driver; // Global

	// Every Page must have a constructor to invite the driver
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Dashboard')]")
	WebElement PageTitle;
	@FindBy(how = How.XPATH, using = "//span[@class='help-block']/a")
	WebElement AddNewCustomerButton;

	// Methods to interact with the elements
	public void waitForPage() {
		waitForElement(PageTitle, driver);
	}

	public void clickOnAddDepositButton() {
		AddNewCustomerButton.click();
	}

	public boolean isDashboardDisplayed() {
		try {
			waitForPage();
			return true;
		} catch (Exception e) {

		}
		return false;
	}
}
