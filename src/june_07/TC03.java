package june_07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TC03 {
	WebDriver driver;
	String url;
	
	@Before
	public void atBefore(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.jabong.com/";
		
	}
	
	@Test
	public void atTest() throws Exception{
		driver.get(url);
		Thread.sleep(4000);
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.id("qa-main-men")));
		
		act.build().perform();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[contains(@text,'New In Clothing')]")).click();
		driver.findElement(By.linkText("New In Shoes")).click();
	}
	
	@After
	public void After(){
		
	}

}
