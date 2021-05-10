package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import hooks.SelBase;



public class EditLeadPage extends SelBase {
	
	
	public EditLeadPage(ChromeDriver driver) {
    	SelBase.driver=driver; 
	}

	public EditLeadPage enterUcompanyname(){
	  driver.findElementById("updateLeadForm_companyName").sendKeys("TCS");
	  return this;
	}
	
	public ViewLeadsPage clickSubmitButtoninEL() {
		driver.findElementByName("submitButton").click();
		return new ViewLeadsPage(driver);
	}
	
	
}
