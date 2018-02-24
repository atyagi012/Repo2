package myPack1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC03 {

	WebDriver driver;
	String url;
	
	@BeforeTest
	public void atBefore() throws Exception{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		url = "http://www.google.com";
	}
	
	@Test
	public void atTest() throws Exception{
		driver.get(url);
		
		driver.findElement(By.id("gbqfq")).sendKeys("Hello");
		
		driver.findElement(By.name("btnG")).click();
		
		driver.getTitle();
	}
	
	@AfterTest
	public void atAfter() throws Exception{
		//driver.quit();
	}
	
}
