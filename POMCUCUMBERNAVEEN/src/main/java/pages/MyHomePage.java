package pages;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import hooks.SelBase;

public class MyHomePage extends SelBase {
	
	
	public MyHomePage(RemoteWebDriver driver) {
    	SelBase.driver=driver;
	}
	
	
	 
	
	public MyLeadsPage clickonLeads() {
		driver.findElementByLinkText("Leads").click();
		return new MyLeadsPage((ChromeDriver) driver);
		
		
	}	
	
	
	
	
	public MyHomePage MyHomecheckTitle() {
		
		String title1 = driver.getTitle();
		System.out.println("The page title="+title1);
	      return this;
		}
}
