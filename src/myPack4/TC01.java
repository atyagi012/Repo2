package myPack4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC01 {

	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		//Open Browser
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.jabong.com";
		
		driver.get(url);
		//driver.navigate().to(url);
		
	}
	
	@Test
	public void atTest(){
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 driver.findElement(By.id("searchInput")).sendKeys("Shirt");
		 driver.findElement(By.id("qa-searchBtn")).click();
		 
	}
	
	@After
	public void closeBrowser(){
		//driver.quit();
	}
	
}
