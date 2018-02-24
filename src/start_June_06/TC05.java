package start_June_06;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.sikuli.api.DesktopScreenRegion;
import org.sikuli.api.ImageTarget;
import org.sikuli.api.ScreenRegion;
import org.sikuli.api.Target;
import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.desktop.DesktopKeyboard;

public class TC05 {
	
	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		//driver = new FirefoxDriver();
		
		System.setProperty("webdriver.ie.driver", "D:\\Selenium_Files\\IE_Driver_64_bit\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		
		url = "https://tools.hcl.com/tool";
	}
	
	@Test
	public void atTest() throws Exception{
		driver.get(url);
		Thread.sleep(2000);
		
		String filePath = "D:\\Selenium_Files\\ImagePattern\\userName.png";
		File file = new File(filePath);
		
		Target target = new ImageTarget(file);
		
		ScreenRegion sr1 = new DesktopScreenRegion();
		ScreenRegion sr2 = sr1.find(target);
		
		Keyboard kb = new DesktopKeyboard();
		//kb.type(sr2.);
		
		kb.type("hcltech\\amit-kumark");
		//kb.type(arg0);
		
	
	}
}
