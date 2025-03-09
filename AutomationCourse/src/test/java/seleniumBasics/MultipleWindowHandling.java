package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base {

	public static void main(String[] args) {
		MultipleWindowHandling multiplewindowhandling=new MultipleWindowHandling();
		multiplewindowhandling.initializeBrowser();
		multiplewindowhandling.multiplewindowhandling();
		multiplewindowhandling.driverCloseAndQuit();
	}


		// TODO Auto-generated method stub

	
	
	
	public void multiplewindowhandling()
	{
	
	driver.navigate().to("https://demo.guru99.com/popup.php");
	String parentwindowHandleId=driver.getWindowHandle();
	System.out.println(parentwindowHandleId);
	WebElement clickhere=driver.findElement(By.xpath("//a[text()=Click Here]"));
	clickhere.click();
	Set<String> handleId=driver.getWindowHandles();
	System.out.println(handleId);
	Iterator<String>values=handleId.iterator();
	while(values.hasNext())
	{
		String current_id=values.next();
		if(!current_id.equals(parentwindowHandleId))
		{
			driver.switchTo().window(current_id);
			WebElement email_fld=driver.findElement(By.xpath("//input[@name='sandra@gmail,com']"));
			email_fld.sendKeys("mail id");
			WebElement submit_fld=driver.findElement(By.xpath("//input[@name='sandra']"));
			submit_fld.click();
			driver.switchTo().defaultContent();
		}



	
	
	{

}
	}
	}
}



