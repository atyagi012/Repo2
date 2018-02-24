package myPack1;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase06 {

	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		driver = new FirefoxDriver();
		
		url = "http://www.gmail.com";
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void atTest(){
		driver.get(url);
		
		driver.findElement(By.id("Email")).sendKeys("Abc");
		
		driver.findElement(By.id("Passwd")).sendKeys("passwd");
		
		driver.findElement(By.id("signIn")).click();
		
		//driver.
		
		//Pass/Fail
	}
	
	@After
	public void closeBrowser(){
		
	}
	
}
