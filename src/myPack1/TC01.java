package myPack1;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC01 {
	
	WebDriver driver;
	String url;
	
	@BeforeMethod
	public void launchBrowser() throws Exception{
		
		//driver = new FirefoxDriver();
		
		driver = new InternetExplorerDriver();
		
		String filePath = "DataStorage/testData.properties";
		
		File file = new File(filePath);
		
		FileInputStream fIP = new FileInputStream(file);
		
		Properties prop = new Properties();
		
		prop.load(fIP);
	
		url = prop.getProperty("url");
		
	}
	
	@Test
	public void atTest() throws Exception{
		driver.get(url);
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("abc123")).click();
	}
	
	@AfterMethod
	public void closeBrowser(ITestResult result) throws Exception{
		
		if(!result.isSuccess()){
			//Take screenshot
			
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			String filename = result.getMethod().getMethodName() + "-" 
					+ new SimpleDateFormat("dd-MM-yyyy_hh-mm-ss")
					.format(new GregorianCalendar().getTime()) 
					+ ".jpg";
			
			String dest = "D:\\";
			
			String finalScreen = dest + filename;
			
			File destFile = new File(finalScreen);
			
			FileUtils.copyFile(srcFile, destFile);
			
		}
		
		
		driver.quit();
	}

}
