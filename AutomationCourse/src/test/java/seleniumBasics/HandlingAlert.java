package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlert extends Base {

	public static void main(String[] args) 
	{
		HandlingAlert handlingalert=new HandlingAlert();
		handlingalert.initializeBrowser();
		//handlingalert.handlingSimpleAlert();
		//handlingalert.handlingConfirmAlert();
		handlingalert.handlingPromptAlert();
		//handlingalert.driverCloseAndQuit();
	
		// TODO Auto-generated method stub

	}
	
	
	
	public void handlingSimpleAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement clickalert= driver.findElement(By.xpath("//button[@id='alertButton']"));
		clickalert.click();
		Alert alertRef= driver.switchTo().alert();
		alertRef.accept();
		
	}
	
	public void handlingConfirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement clickconfirmalert=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		clickconfirmalert.click();
		Alert alertref=driver.switchTo().alert();
		alertref.accept();
	}
	public void handlingPromptAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement clickpromptalert=driver.findElement(By.xpath("//button[@id='promtButton']"));
		clickpromptalert.click();
		Alert alertref=driver.switchTo().alert();
		alertref.sendKeys("sampletext");
		alertref.accept();
	
	
	
	
	{
		
	}

	}
}

