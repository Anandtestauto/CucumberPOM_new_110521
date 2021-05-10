package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import hooks.SelBase;

public class DeleteLeadPage extends SelBase {
	
	
	public DeleteLeadPage(RemoteWebDriver driver) {
		
	   SelBase.driver=driver;
	}
	
	
	
	String text;
	public static String leadID;
	
	//System.out.println(leadID);
	
	
	
	public void getTheLeadid() {
		String leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		System.out.println(leadID);
	}

	
	public void clickOnDeleteButton() {
		driver.findElementByLinkText("Delete").click();
	}

	
	public void supplyTheLeadid(String leadID) {
		driver.findElementByXPath("//input[@name='id']").sendKeys(leadID);
	}


	public void getTheMessage() {
		text = driver.findElementByClassName("x-paging-info").getText();
	}

	
	public void confirmTheMessage() {
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}


}
