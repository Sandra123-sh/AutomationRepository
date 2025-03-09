package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base {

	public static void main(String[] args) {
		TableHandling tablehandling=new TableHandling();
		tablehandling.initializeBrowser();
		tablehandling.tableHandling();
		//tablehandling.driverCloseAndQuit();
	}

	
	
	
	
	
	public void tableHandling()
	{
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement showmore1=driver.findElement(By.xpath("//a[@id='showMoreLess']"));
		showmore1.click();
		WebElement fulltable=driver.findElement(By.xpath("//table[@id='dataTable']"));
		System.out.println(fulltable.getText());
		WebElement tablerow=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[2]"));
		System.out.println(tablerow.getText());
		
		
		

}
}