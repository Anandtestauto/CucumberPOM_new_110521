package pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import hooks.SelBase;



public class LoginPage extends SelBase {
	
	public LoginPage(RemoteWebDriver driver) {
		SelBase.driver = driver;
		//PageFactory.initElements(driver, this);
	}
	
	
		public LoginPage enterUsername(String username){
			driver.findElementById("username").sendKeys(username);
			return this;
		}

		public LoginPage enterPassword(String Password) throws InterruptedException {
			//Thread.sleep(3000);
			driver.findElementById("password").sendKeys(Password);
			//driver.findElementById("passwor").sendKeys(Password);
			return this;
		}

		public HomePage clickLogin(){
			driver.findElementByClassName("decorativeSubmit").click();
			return new HomePage((ChromeDriver) driver);
				}

		public LoginPage ErrorMessage() {
	
			System.out.println("Error message should be displayed");
			return this;
		}
}
