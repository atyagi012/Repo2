package june_07;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Locator {
	
	WebDriver driver;
	String url;
	
	@Before
	
	public void open()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		url = "http://spicejet.com/";
		
	}
	@Test
	
	public void testB() throws InterruptedException
	{
		driver.get(url);
		//By.id
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		//By.name
		
		driver.findElement(By.name("ctl00$mainContent$rbtnl_Trip")).click();
		
		//by CSS
		
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		//Dynamic Dropdown--Based on linput, selection is made
		//by Xpath
		
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		
		//by CSS using #
		
		//driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		
		//by name
		
		//driver.findElement(By.name("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		
		//How to find the xPath for destination location Amritsar
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='ATQ']")).click();
		
	}
	@After
	
	public void afterB()
	{
		
		
	}

}
