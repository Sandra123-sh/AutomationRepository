package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sun.tools.javac.util.List;

public class HandlingFrames extends Base {

	public static void main(String[] args) 
	{
		HandlingFrames handlingframes=new HandlingFrames();
		handlingframes.initializeBrowser();
		handlingframes.handlingframes();
		//handlingframes.driverCloseAndQuit();
	}
		// TODO Auto-generated method stub

	
	
	
	
	
	
	
	public void handlingframes()
	{
		 driver.navigate().to("https://demoqa.com/frames");
		List<WebElement> iFrames=(List<WebElement>) driver.findElements(By.tagName("iframe"));
	iFrames.size();
		System.out.println(iFrames.size());
		WebElement firstframe=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(firstframe);
		WebElement frametext=driver.findElement(By.id("sampleHeading"));
		System.out.println(frametext.getText());
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		
	}



}



			
		
	

	


