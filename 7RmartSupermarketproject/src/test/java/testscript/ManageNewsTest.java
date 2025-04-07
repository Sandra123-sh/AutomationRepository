package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Messeges;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;
import utilities.WaitUtility;

public class ManageNewsTest extends Base {
	@Test
	public void verifyWhetherUserCanManageNews() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(0, 0,"LoginPage");
		String passwordvalue=ExcelUtility.getStringData(0, 1,"LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue);
		login.enterPasswordOnPasswordField(passwordvalue);
		login.clickonloginbutton();
		String newsdescription=ExcelUtility.getStringData(0, 0,"ManageNewsPage");
		ManageNewsPage managenews=new ManageNewsPage(driver);
		managenews.clickOnManageNews();
		managenews.clickOnNew();
		managenews.enterOnNews(newsdescription);
		managenews.clickOnSave();
		boolean isAlertMessegeDisplayed=managenews.isAlertMessegeDisplayed();
		Assert.assertTrue(isAlertMessegeDisplayed,Messeges.USERCANNOTCREATENEW);
		
		
	}
	
	@Test
	public void verifyWhetherUserCanSearchNews() throws IOException
	{
		String username=ExcelUtility.getStringData(0, 0,"LoginPage");
		String passwordvalue=ExcelUtility.getStringData(0, 1,"LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(username);
		login.enterPasswordOnPasswordField(passwordvalue);
		login.clickonloginbutton();
		String titledescription=ExcelUtility.getStringData(0,0,"ManageNewsPage");
		ManageNewsPage managenews=new ManageNewsPage(driver);
		managenews.clickOnManageNews1();
		managenews.clickOnSearch();
	    managenews.enterNewsOnTitle(titledescription);
		managenews.clickOnSearchNews();
		boolean isSearchIconDisplayed=managenews.isSearchIconDisplayed();
		Assert.assertTrue(isSearchIconDisplayed,Messeges.USERCANNOTCREATENEWS);
		
		
	}
	
	
	
	
	
	
	
	

}
