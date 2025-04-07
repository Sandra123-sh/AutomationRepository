package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@data-toggle='dropdown']")private WebElement logoutadmin;
	@FindBy(xpath="//i[@class='ace-icon fa fa-power-off']")private WebElement logoutbutton;
	@FindBy(xpath="//b[text()='7rmart supermarket']")private WebElement maintitle;
	public HomePage clickOnAdmin() {
		logoutadmin.click();
		return this;
	}
	
	public LoginPage clickOnLogout()
	{
		logoutbutton.click();
		return new LoginPage(driver);
	}
	public String getTextFromTitle()
	{
		return maintitle.getText();
	}
	

}
