package june_07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class TC04 {
	WebDriver driver;
	String url;
	
	@Before
	public void atBefore(){
		driver = new FirefoxDriver();
		
		/*//IE
		System.setProperty("webdriver.ie.driver", "D:\\Selenium_Files\\IE_Driver_64_bit\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
		//Chrome
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Files\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		*/
		driver.manage().window().maximize();
		
		url = "http://www.google.com";
		
		//driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		//driver.manage().timeouts().setScriptTimeout(50, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void atTest() throws Exception{
		driver.get(url);
		Thread.sleep(2000);    //wait
		
		
		//Exp wait
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("lst-ib")));*/
		
		WebElement txtBox = driver.findElement(By.id("lst-ib"));
		
		//Fluent wait
		
		new FluentWait<WebElement>(txtBox)
		.withTimeout(30, TimeUnit.SECONDS)
		.pollingEvery(5, TimeUnit.SECONDS)
		.until(
				
				new Function<WebElement, Boolean>() {
					
					public Boolean apply(WebElement txtBox){
						
						txtBox.clear();
						txtBox.sendKeys("Java");
						//return true;
						
						return null;
					}
				}
			);
	}
	
	@After
	public void After(){
		
	}

}
