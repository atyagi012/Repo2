package july_11;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC02 {

	WebDriver driver;
	String url;
	Properties prop = new Properties();
	
	@Before
	public void launchBrowser() throws Exception{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void attest() throws Exception{
		
		driver.get("http://www.naukri.com");
		Thread.sleep(2000);
		
		//Read skill from XL
		String data[][] = ReadFrmXL.readXL();
		
		//Enter skill
		String vSkill = data[0][0];
		driver.findElement(By.name("qp")).sendKeys(vSkill);
		
		//Enter loc
		String vLoc = data[1][0];
		driver.findElement(By.name("ql")).sendKeys(vLoc);
	}
	
	@After
	public void closeBrowser(){
		//driver.quit();
	}
}
