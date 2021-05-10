package pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import hooks.SelBase;



public class HomePage extends SelBase {
	
	 public HomePage(RemoteWebDriver driver) {
		 SelBase.driver=driver;
	    	
	 }
	
	public LoginPage clickLogout() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new LoginPage((ChromeDriver) driver);
	}

	public HomePage checkTitle() {
	
		String title = driver.getTitle();
		System.out.println("The page title="+title);
	
		if(title.contains("Leaftaps")){
		System.out.println("IN RIGHT PAGE");
		}
		else {
		System.out.println("IN WRONG PAGE");
		}
	
		return this;
		}

	public MyHomePage clickCRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage((ChromeDriver) driver);
		}
}
