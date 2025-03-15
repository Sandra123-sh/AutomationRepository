package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingCheckbox extends Base {

	public static void main(String[] args) 
	{
		HandlingCheckbox checkbox=new HandlingCheckbox();
	checkbox.initializeBrowser();
	checkbox.handlingCheckbox();
	//checkbox.handlingRadiobutton();
	//checkbox.driverCloseAndQuit();
		// TODO Auto-generated method stub

	}

	
	
	public void handlingCheckbox()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	WebElement checkbox1=driver.findElement(By.xpath("//input[@value='option-1']"));
		checkbox1.click();
		System.out.println(checkbox1.isSelected());

	}
	public void handlingRadiobutton()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
WebElement radiobutton1=driver.findElement(By.xpath("//input[@value='green']"));
radiobutton1.click();
	
	
}
}


