package dec_20;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC02 {
	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		//Browser Open
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Files\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		url = "http://www.flipkart.com";
		driver.get(url);
	}
	
	@Test
	public void atTestFlipKart(){
		//Close PopUp
		driver.findElement(By.xpath("//span[@class = 'close-icon close']")).click();
		
		driver.findElement(By.id("fk-top-search-box")).sendKeys("Shirts");
		
		driver.findElement(By.xpath("//input[@class = 'search-bar-submit fk-font-13 fk-font-bold']")).click();
	}
	
	@After
	public void quitSession(){
		
	}

}
