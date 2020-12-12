package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	//Element Library
	@FindBy(how=How.ID, using = "username")
	WebElement UserName;
	@FindBy(how=How.ID, using = "password")
	WebElement Password;
	@FindBy(how=How.NAME, using = "login")
	WebElement SubmitButton;
	
	// Methods to interact with the element
	public void login(String userName, String password) throws InterruptedException {
		UserName.sendKeys(userName);
		Thread.sleep(2000);
		Password.sendKeys(password);
		Thread.sleep(2000);
		SubmitButton.click();
	}
	public String getPageTitle() {
		return driver.getTitle();
	}
	public void close() {
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	
	
	
	

}
