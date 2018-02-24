package start_June_06;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC02 {
	
	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.facebook.com";
	}
	
	@Test
	public void atTest() throws Exception{
		driver.get(url);
		
		driver.findElement(By.id("email")).sendKeys("User1");
		driver.findElement(By.name("pass")).sendKeys("abc@123");
		
		//
		new Select(driver.findElement(By.id("month"))).selectByIndex(3);  //Should select March
		
		new Select(driver.findElement(By.id("day"))).selectByValue("3");
		
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("1980");
		
		
		//driver.fi
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value = 'Log In']")).click();
		Thread.sleep(2000);
		
		if(driver.findElement(By.id("persist_box")).isSelected()){
			System.out.println("Checked");
		}else{
			System.out.println("UnChecked");
			//To Select..?
			
			driver.findElement(By.id("persist_box")).click();
			System.out.println("Checked now");
		}
		
		
		/*if(driver.findElement(By.name("login")).isDisplayed()){
			System.out.println("Login is fail.");
		}else{
			System.out.println("Login is passed");
		}*/
		
		String exp_title = "Welcome to facebook";
		String act_title = driver.getTitle();
		
		if(exp_title.equalsIgnoreCase(act_title)){
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}
	}

}
