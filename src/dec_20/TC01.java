package dec_20;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TC01 {
	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		//Open Browser
		//driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Files\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		url = "http://www.naukri.com";
		
		driver.get(url);
	}
	
	@Test
	public void atTestNaukriSearchJobs(){
		//Enter skills
		driver.findElement(By.name("qp")).sendKeys("Java");
		
		//Enter LOC
		driver.findElement(By.name("ql")).sendKeys("Noida");
		
		//Click on Search
		driver.findElement(By.id("qsbFormBtn")).click();
	}
	
	@After
	public void quitBrowser(){
		//driver.quit();  //Close Browser
	}

}









