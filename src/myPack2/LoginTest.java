	package myPack2;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest 
{
	public WebDriver driver;
	
	
    @BeforeTest
    public void fireFoxDrriver()
    {
    	
 	driver = new FirefoxDriver();
 	driver.manage().window().maximize();
 	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
 	
    }
    @Test
	public void seatNumber() throws Exception{
		driver.get("http://www.seatnumber.com");
	
		driver.findElement(By.xpath(".//*[@id='top']/div/nav/ul/li[4]/a")).click();
		driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/div/div/a[1]")).click();
		driver.findElement(By.id("Email")).sendKeys("adstuckltd@gmail.com");
		driver.findElement(By.id("Passwd")).sendKeys("adstuckadmin");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(10000);
		new Select(driver.findElement(By.id("country"))).selectByIndex(1);
		System.out.println("Select Country");
		Thread.sleep(4000);
		
		new Select(driver.findElement(By.id("services"))).selectByIndex(1);
		System.out.println("Select Services");
		Thread.sleep(4000);
		
		//driver.findElement(By.xpath(".//*[@id='ibuy']")).click();
		
		//driver.findElement(By.id("ibuy")).click();
		
		driver.findElement(By.xpath("//input[@value = 'I want to Buy']")).click();
		System.out.println("Click on I want to buy");
		Thread.sleep(4000);
		
	}
    
	
}