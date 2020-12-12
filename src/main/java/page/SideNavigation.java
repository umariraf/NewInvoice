package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SideNavigation {
	
	WebDriver driver;

	// Every Page must have a constructor to invite the driver
	public SideNavigation(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//span[text()='Sales']")
	WebElement SalesModule;
	@FindBy(how = How.LINK_TEXT, using = "New Invoice")
	WebElement NewInvoice;
		
	public void goToNewInvoicePage() throws Exception {
		Thread.sleep(3000);
		SalesModule.click();
		Thread.sleep(6000);
		NewInvoice.click();
	}
	
//	public void goToListAccountPage() throws InterruptedException {
//		ListAccountPage.click();
//	}
	
}
