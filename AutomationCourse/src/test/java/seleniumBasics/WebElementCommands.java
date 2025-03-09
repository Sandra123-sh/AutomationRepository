package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {

	public static void main(String[] args) 
	{
		WebElementCommands web=new WebElementCommands();
		web.initializeBrowser();
		web.handlingWebElementCommands();
		//web.driverCloseAndQuit();
		
		
		
	}
		// TODO Auto-generated method stub

	
	
	
	public void handlingWebElementCommands()
	{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement messagefield= driver.findElement(By.xpath("//input[@id='single-input-field']"));
	messagefield.sendKeys("sandra");
	WebElement showmessagebutton= driver.findElement(By.xpath("//button[@id='button-one']"));
	System.out.println(showmessagebutton.isDisplayed());
	System.out.println(showmessagebutton.isEnabled());
	showmessagebutton.click();
	//messagefield.clear();
	System.out.println(showmessagebutton.getCssValue("background-color"));
	System.out.println(messagefield.getTagName());
	WebElement yourmessage= driver.findElement(By.xpath("//div[@id='message-one']"));
	System.out.println(yourmessage.getText());
	
	
	}
}



