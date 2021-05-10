package step;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.SelBase;
import pages.HomePage;
import pages.LoginPage;

public class LoginStep extends SelBase {
	
	
	LoginPage lp;
	HomePage hp;
	
	
	@Given("Enter username as (.*)")
	public void enterUsernameAsDemosalesmanager(String uname) {
	   
		lp=new LoginPage(driver);
		lp.enterUsername(uname);
	}

	@And("Enter password as (.*)")
	public void enterPasswordAsCrmsfa(String Pass) throws InterruptedException {
	    lp.enterPassword(Pass);
	}

	@When("Click on Login button")
	public void clickOnLoginButton() {
	    lp.clickLogin();
	}

	@Then("Homepage should be displayed")
	public void homepageShouldBeDisplayed() {
	    hp=new HomePage(driver);
	    hp.checkTitle();
	}

}
