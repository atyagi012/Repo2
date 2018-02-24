package start_June_06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LBC {
	WebDriver driver;
	
	@BeforeMethod
	public void atBefore(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void atAfter(){
		driver.quit();
		
	}

}
