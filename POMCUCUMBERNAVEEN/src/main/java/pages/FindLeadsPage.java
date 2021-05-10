package pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import hooks.SelBase;



public class FindLeadsPage extends SelBase  {
	
	public FindLeadsPage(RemoteWebDriver driver) {
    	SelBase.driver=driver; 
	} 	
    	
	public FindLeadsPage clickonPhonetab() {
		driver.findElementByXPath("//span[text()='Phone']").click();
		return this;
		}
	
	public FindLeadsPage enterPhoneNumber(String number) {
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(number);
		return this;
	}

	public FindLeadsPage clickFindLeads() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		return this;
	}

	public ViewLeadsPage clickonFirstLeadnGrid(){
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		return new ViewLeadsPage(driver);
	} 
	
	public FindLeadsPage checkTitle() {
		
		System.out.println("title of the page:"+driver.getTitle());
	
		return this;
		
		
	}

}
 