package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase {
	
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='username']")
	public WebElement Username;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement Password;
	
	@FindBy(xpath="//button[@id='submit']")
	public WebElement LoginButton;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	} 
	
		
	public void LoginID(String a) throws InterruptedException {
		
		Username.click();
		Thread.sleep(5000);
		Username.sendKeys(a);
	}
	
	public void Password(String a) throws InterruptedException {
		
		Password.click();
		Thread.sleep(5000);
		Password.sendKeys(a);
	}
	
	public String title() {
		return driver.getTitle();
	}
	
public void LoginButton() throws InterruptedException {
		
	((JavascriptExecutor)driver).executeScript("arguments[0].click();" , LoginButton);

		
	}


}
