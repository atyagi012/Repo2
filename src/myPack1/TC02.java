package myPack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC02 {
	
	WebDriver driver;
	String url;
	
	@BeforeMethod
	public void launchBrowser() throws Exception{
		
		driver = new FirefoxDriver();
		url = "http://www.google.com";
		
		
		
	}
	
	@Test
	
	public void atTest() throws Exception{
		driver.get(url);
		
		System.out.println(driver.getTitle());

		Assert.assertTrue(false);
	}
	
	@AfterMethod
	public void closeBrowser() throws Exception{
		driver.quit();
	}

}
