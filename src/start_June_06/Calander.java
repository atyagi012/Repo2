package start_June_06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

//import GoogleDocs.*;
public class Calander extends LBC{

	@Test
	public void table() throws Exception{
		driver.get("http://www.makemytrip.com/");
		//Thread.sleep(3000);
		driver.findElement(By.id("start_date_sec")).click();
		
		
		Thread.sleep(15000);
		//WebElement table1=driver.findElement(By.xpath("//html/body/div[9]/div[2]/table/tbody"));
													   //html/body/div[9]/div[2]/table/tbody
		
		WebElement table1 = driver.findElement(By.xpath("//table[@class = 'ui-datepicker-calendar']"));
		
		String st=table1.getText();
		System.out.println(st);
		List<WebElement> myl=table1.findElements(By.tagName("tr"));
		String Date="19";
		/*for(WebElement cell:myl){
			if(cell.getText().equals(Date)){
				cell.findElement(By.linkText(Date)).click();
				break;
			}*/
		
		System.out.println("**************");
		for(int i = 3; i<6; i++){
			
			for(int j = 1; j<8; j++){
				
				String xpRow1 = "//html/body/div[9]/div[2]/table/tbody/tr[3]/td["+j+"]";
				try{
					String s = driver.findElement(By.xpath(xpRow1)).getText();
					System.out.println(s);
				}catch(Exception e){
					System.out.println("Date not there");
					
					int a = j+2;
					String xpRow2 = "//html/body/div[9]/div[2]/table/tbody/tr["+a+"]/td["+j+"]";
					String xpRow3 = xpRow2 + "/a";
					System.out.println(driver.findElement(By.xpath(xpRow3)).getText());
					
					String f = driver.findElement(By.xpath(xpRow3)).getText();
					
					if(f.equals("15")){
						System.out.println("Hello");
						driver.findElement(By.xpath(xpRow3)).click();
						break;
					}
				}
			}
		
			if(i==2){
				break;
			}
			
		}
		
		
			}
	
}
