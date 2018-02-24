package june_06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC01 {
	WebDriver driver;
	String url;
	
	@Before
	public void atBefore(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.indianrail.gov.in/train_Schedule.html";
		
	}
	
	@Test
	public void atTest() throws Exception{
		driver.get(url);
		Thread.sleep(2000);
		
		driver.findElement(By.id("lccp_trnname")).sendKeys("4682");
		driver.findElement(By.name("getIt")).click();
		Thread.sleep(2000);
		
		WebElement table = driver.findElement(By.xpath("//html/body/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[6]/td/table/tbody"));
		
		List<WebElement> xRows = table.findElements(By.tagName("tr"));
		System.out.println("Total rows are " + xRows.size());
		
		String a = "//html/body/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[6]/td/table/tbody/tr[";

		int i = 2;
		String b = "]/td[3]";
		
		String xpStationName = a + i + b;
		String xpArrTime = "//html/body/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[6]/td/table/tbody/tr["+i+"]/td[5]";
		String xpDeptTime = "//html/body/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[6]/td/table/tbody/tr["+i+"]/td[6]";
		
		for(i = 2; i<=xRows.size(); i++){
			xpStationName = a + i + b;
			xpArrTime = "//html/body/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[6]/td/table/tbody/tr["+i+"]/td[5]";
			xpDeptTime = "//html/body/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[6]/td/table/tbody/tr["+i+"]/td[6]";
			
			String stationName = driver.findElement(By.xpath(xpStationName)).getText();
			System.out.println(stationName);
			
			if(stationName.equalsIgnoreCase("deoband")){
				System.out.println("Station Found");
				
				String arrTime = driver.findElement(By.xpath(xpArrTime)).getText();
				System.out.println(arrTime);
				
				String deptTime = driver.findElement(By.xpath(xpDeptTime)).getText();
				System.out.println(deptTime);
				
				break;
			}
		}
		
	}
	
	@After
	public void After(){
		
	}

}
