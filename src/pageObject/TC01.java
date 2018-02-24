package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC01 {
	WebDriver driver;
	String url;
	@BeforeMethod
	public void launchBrowser(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		url = "http://www.quikr.com";
	}
	
	@Test
	public void atTest() throws Exception{
		
		driver.get(url);
		
		new HomePage(driver)
		.closeAd()
		.clickOnPostFreeAd()
		.mouseOverOnCars_Bikes()
		.clickOnCars();
	}
	
	@AfterMethod
	public void closeBrowser(){
		//driver.quit();
	}

}
