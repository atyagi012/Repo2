package start_June_06;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC01 {
	
	//Open Browser : Firefox
	//Open Google
	//Type java in text box
	//Click on Search button
	
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
		
		//Typing java in google text box
		driver.findElement(By.id("lst-ib")).sendKeys("Java");
		
		
	}

}
