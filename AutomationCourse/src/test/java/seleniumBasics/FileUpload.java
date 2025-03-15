package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base {

	public static void main(String[] args) 
	{
		FileUpload fileupload=new FileUpload();
		fileupload.initializeBrowser();
		//fileupload.verifyFileUploadUsingSendKeys();
		try {
			fileupload.fileUploadUsingRobotClass();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//fileupload.driverCloseAndQuit();
		// TODO Auto-generated method stub

	}
	
	
	public void verifyFileUploadUsingSendKeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement choosefile=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		choosefile.sendKeys("C:\\Users\\sandr\\git\\AutomationRepository\\AutomationCourse\\src\\test\\resources\\Java-Interview-Questions.pdf");
		WebElement termsCheckbox=driver.findElement(By.xpath("//input[@id='terms']"));
		termsCheckbox.click();
	    WebElement submitButton=driver.findElement(By.xpath("//input[@id='submitbutton']"));
	    submitButton.click();
	}
	
	public void fileUploadUsingRobotClass() throws Throwable
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement selectpdffile=driver.findElement(By.xpath("//a[@id='pickfiles']"));
		selectpdffile.click();
		StringSelection s = new StringSelection("C:\\Users\\sandr\\git\\AutomationRepository\\AutomationCourse\\src\\test\\resources\\Java-Interview-Questions.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null); 
		Robot robot = new Robot();
		robot.delay(2500);
		 robot.keyPress(KeyEvent.VK_ENTER);
	     
	      robot.keyRelease(KeyEvent.VK_ENTER);
	      robot.keyPress(KeyEvent.VK_CONTROL);
	      robot.keyPress(KeyEvent.VK_V);
	      
	      
	      robot.keyRelease(KeyEvent.VK_CONTROL);
	      robot.keyRelease(KeyEvent.VK_V);
	      robot.keyPress(KeyEvent.VK_ENTER);

		
	}

}
