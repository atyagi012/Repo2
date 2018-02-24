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

public class TC01 {

	WebDriver driver;
	String url;
	Properties prop = new Properties();
	
	@Before
	public void launchBrowser() throws Exception{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		String filePath = "D:\\Selenium_Projects\\ANT_TESTNG\\data.properties";
		File file  = new File(filePath);
		
		FileInputStream fIP = new FileInputStream(file);
		
		prop.load(fIP);
		
	}
	
	@Test
	public void attest() throws Exception{
		
		//Read url from prop file
		String vUrl = prop.getProperty("url");
		
		driver.get(vUrl);
		
		//Enter Skills
		String vSkill = prop.getProperty("skill");
		driver.findElement(By.name("qp")).sendKeys(vSkill);
		
		//Enter loc
		String vLoc = prop.getProperty("loc");
		driver.findElement(By.name("ql")).sendKeys(vLoc);
		
	}
	
	@After
	public void closeBrowser(){
		//driver.quit();
	}
}
