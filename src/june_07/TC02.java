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

public class TC02 {
	WebDriver driver;
	String url;
	
	@Before
	public void atBefore(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.naukri.com";
		
	}
	
	@Test
	public void atTest() throws Exception{
		driver.get(url);
		Thread.sleep(2000);
		
		driver.findElement(By.name("qp")).sendKeys("Java");
		driver.findElement(By.name("ql")).sendKeys("Delhi");
		
		//Keyboard Event
		
		driver.findElement(By.name("ql")).sendKeys(Keys.TAB);
		
		driver.findElement(By.xpath("//input[@class = 'sdTxt w85']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@class = 'sdTxt w85']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@class = 'sdTxt w85']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@class = 'sdTxt w85']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@class = 'sdTxt w85']")).sendKeys(Keys.ARROW_DOWN);
		
		System.out.println("*****************");
		
		//Mouse Over : More, Click : MCA
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[text() = 'More']")));
		act.build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text() = 'MCA']")).click();
	}
	
	@After
	public void After(){
		
	}

}
