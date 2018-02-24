package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class PostFreeAd {

	private WebDriver driver;
	
	public PostFreeAd(WebDriver driver){
		this.driver = driver;
	}
	
	public PostFreeAd mouseOverOnCars_Bikes() throws Exception{
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//div[text() = 'Cars & Bikes']")));
		act.build().perform();
		Thread.sleep(2000);
		return this;
		
	}
	
	public UploadFreeAd clickOnCars(){
		//driver.findElement(By.xpath("//a[(text() = ' Cars'])")).click();
		driver.findElement(By.xpath("//html/body/div[2]/div[8]/div[4]/div[2]/div/ul/li[1]/a")).click();
		return new UploadFreeAd(driver);
	}
	
	
	
}
