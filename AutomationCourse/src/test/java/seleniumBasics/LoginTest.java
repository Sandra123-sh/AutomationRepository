package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends TestngBase {

@Test(description= "verify whether user is able to successfully login with valid credentials")
public void verifyWhetherUserCanLoginWithValidCredentials()
{
	LoginPage login=new LoginPage(driver);
	login.enterUserNmaeOnUsernameField();
	login.enterPasswordOnPasswordField();
	login.clickOnLoginButton();
	

}
@Test(description= " verify whether user is able to successfully login with valid credentials")
public void verifyWhetherUserCanLoginWithValidUsernameAndInvalidPassword()
{
	WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
	username.sendKeys("standar_duser");
	WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys("secret__sauce");
	WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
	login.click();
	
}
@Test(description=" verify whether user is able to successfully login with valid credentials")
public void verifyWhetherUserCanLoginWithInvalidUsernameAndValidPassword()
{
	WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
	username.sendKeys("standarduser");
	WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys("secret_sauce");
	WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
	login.click();
}
@Test(description= "verify whether user is able to successfully login with valid credentials")
public void verifyWhetherUserCanLoginWithInvalidCredentials()
{
	WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
	username.sendKeys("standarduser");
	WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys("secret_sssauce");
	WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
	login.click();
}
	
	
	
	
}



