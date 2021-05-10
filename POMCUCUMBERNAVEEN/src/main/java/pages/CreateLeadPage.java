package pages;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


import hooks.SelBase;

public class CreateLeadPage extends SelBase {
	
	public CreateLeadPage(RemoteWebDriver driver) {
		SelBase.driver = driver;

	}
	
	
		public CreateLeadPage clcheckTitle() {
		
		String title2 = driver.getTitle();
		System.out.println("The page title="+title2);
	      return this;
		}
	

	public CreateLeadPage enterCompanyName(String cname) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
		return this;
	}

	public CreateLeadPage enterFirstName(String fname) {

		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		return this;
	}

	public CreateLeadPage enterLastName(String lname) {

		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
		return this;
	}

	public ViewLeadsPage clickSubmitButton() throws IOException {

		driver.findElementByName("submitButton").click();
		return new ViewLeadsPage((ChromeDriver) driver);
	}


	

	
		
	
	
	
}
