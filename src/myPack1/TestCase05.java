package myPack1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;

public class TestCase05 {
	
	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.google.com";
		
	}
	
	@Test
	public void atTest(){
		driver.get(url);
		
		driver.findElement(By.id("gbqfq")).sendKeys("Hello");
		
		driver.findElement(By.name("btnG")).click();
	}
	
	@After
	public void closeBrowser(){
		
	}

}
