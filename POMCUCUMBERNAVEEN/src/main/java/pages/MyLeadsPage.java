package pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import hooks.SelBase;



public class MyLeadsPage extends SelBase {
	
	public MyLeadsPage(RemoteWebDriver driver) {
    	SelBase.driver=driver; 
	}
	
	
	public CreateLeadPage clickCrateLead() {
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage((ChromeDriver) driver);
	}
	
	public FindLeadsPage clickFindLeads() {
		driver.findElementByLinkText("Find Leads").click();
		return new FindLeadsPage((ChromeDriver) driver);
	}
	
	
	public MyLeadsPage MyLeadscheckTitle() {
		
		String title1 = driver.getTitle();
		System.out.println("The page title="+title1);
	      return this;
		}
	
}

