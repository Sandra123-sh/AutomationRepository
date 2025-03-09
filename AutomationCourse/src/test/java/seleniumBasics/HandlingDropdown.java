package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown extends Base {

	public static void main(String[] args) 
	{
		HandlingDropdown drop= new HandlingDropdown();
		drop.initializeBrowser();
		drop.handlingDropDown();
		//drop.driverCloseAndQuit();
		
		// TODO Auto-generated method stub

	}
	
	
	public void handlingDropDown()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
      WebElement dropdown1= driver.findElement(By.id("dropdowm-menu-1"));
      Select select= new Select(dropdown1);
      //select.selectByIndex(3);
    //  select.selectByVisibleText("python");
     // select.selectByValue("sql");
}


	
		
	
}


