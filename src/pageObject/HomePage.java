package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	public HomePage  closeAd(){
		driver.findElement(By.id("csclose")).click();
		System.out.println("Ad is closed");
		
		return this;
	}
	
	public PostFreeAd clickOnPostFreeAd(){
		driver.findElement(By.xpath("//div[@class = 'post_ad_button yellow']")).click();
		
		return new PostFreeAd(driver);
	}

}
