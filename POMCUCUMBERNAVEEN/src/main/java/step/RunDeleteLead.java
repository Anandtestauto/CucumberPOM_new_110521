package step;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.SelBase;
import pages.FindLeadsPage;
import pages.MyLeadsPage;
import pages.ViewLeadsPage;

public class RunDeleteLead extends SelBase {
	
	FindLeadsPage flp;
	MyLeadsPage mlp;
	ViewLeadsPage vlp;
	
	
	@When("click on the link find leads")
	public void clickOnTheLinkFindLeads() {
		
		mlp=new MyLeadsPage(driver);
		
	 
	}
	
	

	@Then("Find Lead page should be displayed")
	public void findLeadPageShouldBeDisplayed() {
	   
		flp=new FindLeadsPage(driver);
		flp.checkTitle();
		
	}

	@When("Click on the link phone")
	public void clickOnTheLinkPhone() {
	   
		flp.clickonPhonetab();
	}

	@Given("Enter the phone number as (.*)")
	public void enterThePhoneNumberAs(String int1) {
	    
		flp.enterPhoneNumber(int1);
	}

	@When("click on the button FindLeads")
	public void clickOnTheButtonFindLeads() throws InterruptedException {
	    flp.clickFindLeads();
	}

	@When("click on the first lead link from the displayed")
	public void clickOnTheFirstLeadLinkFromTheDisplayed() {
	      vlp=new ViewLeadsPage(driver);
	     
	}

	@When("Click on the button delete")
	public void clickOnTheButtonDelete() {
	
	
	}

	@When("Give the LeadID as {int}")
	public void giveTheLeadIDAs(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


}
