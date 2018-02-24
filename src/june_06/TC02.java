package june_06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
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
		Thread.sleep(6000);
		
		//Mouse Over More
		Actions act =new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[text() = 'More']")));
		act.build().perform();
		Thread.sleep(2000);
		
		//Click on MCA
		driver.findElement(By.xpath("//a[text() = 'MCA']")).click();
		Thread.sleep(2000);
		
		//Go to Other window
		Set<String> mySet = driver.getWindowHandles();
		Iterator<String> Itr = mySet.iterator();
		List<String> myL = new ArrayList<String>();
		
		for(int i = 0; i<mySet.size(); i++){
			myL.add(Itr.next());
		}
		driver.switchTo().window(myL.get(1));
		Thread.sleep(2000);
		
		driver.findElement(By.id("metroCitySearchBox")).sendKeys("Hello");
		
	}
	
	@After
	public void After(){
		
	}

}
