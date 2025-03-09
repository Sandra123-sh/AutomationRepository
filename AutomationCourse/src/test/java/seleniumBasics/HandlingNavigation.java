package seleniumBasics;

public class HandlingNavigation extends Base {

	public static void main(String[] args) 
	{
		HandlingNavigation navigate=new HandlingNavigation();
		navigate.initializeBrowser();
		navigate.handlingNavigationCommands();
		//navigate.driverCloseAndQuit();
	}
		
	
		// TODO Auto-generated method stub

	
	public void handlingNavigationCommands()
	{
		driver.navigate().to("https://www.amazon.in");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

	}
}
