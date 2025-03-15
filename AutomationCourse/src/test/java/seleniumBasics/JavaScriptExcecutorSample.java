package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExcecutorSample extends Base{

	public static void main(String[] args) 
	{
		JavaScriptExcecutorSample javascriptexcecutorsample=new JavaScriptExcecutorSample();
		javascriptexcecutorsample.initializeBrowser();
		javascriptexcecutorsample.javaScriptSample();
		//javascriptexcecutorsample.driverCloseAndQuit();
		// TODO Auto-generated method stub

	}
	
	
	public void javaScriptSample()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", showMessageButton);
		js.executeScript("window.scrollBy(0,350)", "");//give positive value(above 150)
		//js.executeScript("window.scrollBy(0,-350)", "");//give negative value
		//js.executeScript("window.scrollBy(0,350)", "");

		
	}

}
