	package myPack2;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class Afterlogin 
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
			driver.get("http://seatnumber.com/search/train");
			Thread.sleep(4000);
		
			//driver.findElement(By.xpath("//html/body/div[2]/div[2]/div/div/div/div/a[1]")).click();
			driver.findElement(By.xpath("//html/body/div[2]/div[2]/div/div/div/div/a[1]")).click();
			driver.findElement(By.id("Email")).sendKeys("adstuckltd@gmail.com");
			driver.findElement(By.id("Passwd")).sendKeys("adstuckadmin");
			driver.findElement(By.id("signIn")).click();
			Thread.sleep(9000);
			
			driver.findElement(By.id("jdate")).click(); 
                        driver.findElement(By.linkText("22")).click(); 
			driver.findElement(By.id("from")).sendKeys("delhi");
			driver.findElement(By.id("to")).sendKeys("dehradun");
			driver.findElement(By.id("flight_number")).sendKeys("3456");
			new Select(driver.findElement(By.id("jclass"))).selectByIndex(1);
			driver.findElement(By.id("find")).click();
			
			
		}
	    
		
	}
