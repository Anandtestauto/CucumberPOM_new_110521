package pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import hooks.SelBase;



public class ViewLeadsPage extends SelBase {
	
	
	public ViewLeadsPage(RemoteWebDriver driver) {
    	SelBase.driver=driver; 
	}
	
	public EditLeadPage clickEditButton() {
		driver.findElementByLinkText("Edit").click();
		return new EditLeadPage((ChromeDriver) driver);
	}
	
	
	public ViewLeadsPage vlgetTitle() {
		
		String title2 = driver.getTitle();
		System.out.println("The page title="+title2);
	      return this;
		
	}
	
	
	
}
