package stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;

public class LoginSD extends TestBase {
	
	@Given("Navigate to Login Page")
	public void navigate() throws IOException {
		OpenBrowser();
		OpenURL();
		
	    
	}

	@Then("Enter Username {string} and Password {string}")
	public void usernameAndPassword(String username, String password) throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.LoginID(username);
		lp.Password(password);
	   
	} 
	
/*	@Then("^Enter Username \"([^\"])\" and Password \"([^\"])\"$")
	public void usernameAndPassword(String username, String password) throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.LoginID(username);
		lp.Password(password);
	   
	}*/
/*	@Then("Enter Username (.*) and Password (.*)")
	public void usernameAndPassword(String username, String password) throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.LoginID(username);
		lp.Password(password);
	} */
	

	@Then("Login Page Title is verified")
	public void TitleVerified() {
		LoginPage lp = new LoginPage(driver);
		String Actual = lp.title();
		String Expected = "Test Login | Practice Test Automation";
		Assert.assertEquals(Expected, Actual); 
		
	    
	}

	@Then("Click on Login Button")
	public void click_on_login_button() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.LoginButton();
	    
	}
	
	@And("Close Browser")
    public void QuitBrowser() {
		CloseBrowser();
	}
	

	



}
