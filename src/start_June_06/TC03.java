package start_June_06;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC03 {
	
	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.naukri.com";
	}
	
	@Test
	public void atTest() throws Exception{
		driver.get(url);
		driver.findElement(By.name("qp")).sendKeys("java");
		driver.findElement(By.name("ql")).sendKeys("noida");
		driver.findElement(By.id("qsbFormBtn")).click();
		Thread.sleep(2000);
		//driver.get("java jobs in noida");
		String text=driver.findElement(By.xpath("//h1[@class='small_title']")).getText();
	//System.out.println("text");
	System.out.println(text);
	
	}
}
