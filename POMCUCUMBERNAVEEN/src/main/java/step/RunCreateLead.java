package step;

import java.io.IOException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.SelBase;
import pages.CreateLeadPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;
import pages.MyLeadsPage;
import pages.ViewLeadsPage;

public class RunCreateLead extends SelBase{
	
	
	HomePage hp;
	CreateLeadPage cl;
	MyHomePage mhp;
	MyLeadsPage  mlp;
	CreateLeadPage clp;
	ViewLeadsPage vl;
	
	@When("click on crmsfa link")
	public void clickOnCrmsfaLink() {
		hp=new HomePage(driver);
	   hp.clickCRMSFA();
	}

	@Then("MyHome page should be displayed")
	public void myhomePageShouldBeDisplayed() {
	    mhp=new MyHomePage(driver);
		mhp.MyHomecheckTitle();
	}

	@When("click on the leads link")
	public void clickOnTheLeadsLink() {
	    mhp.clickonLeads();
	}

	@Then("My Leads should be displayed")
	public void myLeadsShouldBeDisplayed() {
		mlp=new MyLeadsPage(driver);
	   mlp.MyLeadscheckTitle();
	}

	@When("click on the create lead link")
	public void clickOnTheCreateLeadLink() {
	  
		mlp.clickCrateLead();
		
	}

	@Then("CreateLead Page should be displayed")
	public void createleadPageShouldBeDisplayed() {
	     cl=new CreateLeadPage(driver);
		 cl.clcheckTitle();
		
	}

	@Given("Enter the companyname as (.*)")
	public void enterTheCompanynameAsTCS(String cname) {
		  cl=new CreateLeadPage(driver);
		cl.enterCompanyName(cname);
	}

	@And("Enter the firstname as (.*)")
	public void enterTheFirstnameAsSachin(String fname) {
		  cl=new CreateLeadPage(driver);	
		cl.enterFirstName(fname);	

	}

	@And("Enter the lastname as (.*)")
	public void enterTheLastnameAsTendulkar(String lname) {
		  cl=new CreateLeadPage(driver);
		cl.enterLastName(lname);
		
	}

	@When("Click on the link Create Lead")
	public void clickOnTheLinkCreateLead() throws IOException {
	   cl.clickSubmitButton();
	}

	@Then("View Lead Page should be displayed")
	public void viewLeadPageShouldBeDisplayed() {
		vl=new ViewLeadsPage(driver);
		vl.vlgetTitle();
	    
	}

	

}
