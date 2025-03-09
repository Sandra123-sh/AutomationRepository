package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.image.Kernel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base {

	public static void main(String[] args) 
	{
		HandlingActions handlingaction=new HandlingActions();
		handlingaction.initializeBrowser();
		//handlingaction.verifyrightclick();
		//handlingaction.verifydraganddrop();
		try {
			handlingaction.verifykeyboardActions();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//handlingaction.verifymousehover();
		//handlingaction.driverCloseAndQuit();
		// TODO Auto-generated method stub

	}
	
	
	
	
public void verifyrightclick()
{
driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
WebElement showmessage=driver.findElement(By.id("button-one"));
Actions actions=new Actions(driver);
actions.contextClick().build().perform();
}

public void verifymousehover()
{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement mousehover=driver.findElement(By.xpath("//a[text()='Simple Form Demo']"));
	Actions actions=new Actions(driver);
	actions.moveToElement(mousehover).build().perform();
}

public void verifydraganddrop()
{
	driver.navigate().to("https://demoqa.com/droppable");
	WebElement drag=driver.findElement(By.id("draggable"));
	WebElement drop=driver.findElement(By.id("droppable"));
	Actions actions=new Actions(driver);
	actions.dragAndDrop(drag, drop).build().perform();
	
	
}
public void verifykeyboardActions() throws Throwable
{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_T);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_T);
	
	
	
	
	
}



	
	{
		
	}

}
