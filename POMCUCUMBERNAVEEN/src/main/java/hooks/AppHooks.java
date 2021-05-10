package hooks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AppHooks extends SelBase {
	
	@Before
	public void precondition(Scenario sc) throws InterruptedException, IOException{
		
		
		FileInputStream fis=new FileInputStream("./src/main/resources/config.properties");
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
  
		String url=prop.getProperty("url");
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		
		Thread.sleep(3000);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println(sc.getName());
	//	System.out.println(sc.getId());
	
	}
	
	 @After 
	 public void postcondition(Scenario sc){
	 
		
		 driver.close();
		 System.out.println(sc.getStatus()); 
	 }
	 
}
		

