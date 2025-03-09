package seleniumBasics;

import org.openqa.selenium.By;

public class Locators extends Base {

	public static void main(String[] args) 
	{
		Locators locator=new Locators();
		locator.initializeBrowser();
		locator.handlingLocators();
		locator.driverCloseAndQuit();
		// TODO Auto-generated method stub

	}
	public void handlingLocators()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		driver.findElement(By.id("single-input"));
		driver.findElement(By.className("form-control"));
		driver.findElement(By.tagName("button"));
		driver.findElement(By.name("keywords"));
		driver.findElement(By.linkText("Checkbox Demo"));
		driver.findElement(By.partialLinkText("Radio Buttons"));
		driver.findElement(By.cssSelector("button[id='button-one']"));
		driver.findElement(By.xpath("//input[@id='single-input-field']"));
		driver.findElement(By.xpath("//input[@id='value-a']"));
		driver.findElement(By.xpath("//input[@id='value-b']"));
		driver.findElement(By.xpath("//button[text()='show Message']"));
		driver.findElement(By.xpath("//button[text()='Get Total']"));
		driver.findElement(By.xpath("//button[@type='button' and @id='button-one']"));
		driver.findElement(By.xpath("//button[@type='buttonsecond' and @id='button-one']"));
		driver.findElement(By.xpath("//input[@id='single-input-field'//parent::div[@class='card']"));
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
		driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='card']"));
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
		driver.findElement(By.xpath("/div[@class='card']//descendant::div"));
	}
	
	

}
