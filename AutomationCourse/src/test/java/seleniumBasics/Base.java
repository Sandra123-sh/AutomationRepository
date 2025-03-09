package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;
	

	public static void main(String[] args) 
	{
		Base base=new Base();
		base.initializeBrowser();//call the method for initialization
		base.driverCloseAndQuit();//method for quit and close the window
		// TODO Auto-generated method stub

	}
	public void initializeBrowser()
	{
	
		//driver = new FirefoxDriver();
		//driver = new EdgeDriver();
		driver= new ChromeDriver();
		driver.get("https://selenium.qabible.in");
		driver.manage().window().maximize();//maximise the screen
	}
				
		
	
	public void driverCloseAndQuit()
	{
	driver.quit();
	}
	

}