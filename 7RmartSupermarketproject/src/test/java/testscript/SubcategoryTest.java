package testscript;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Messeges;
import pages.LoginPage;
import pages.SubCategoryPage;
import utilities.ExcelUtility;
import utilities.RandomDataUtility;

public class SubcategoryTest extends Base {
	@Test
	public void verifyWhetherUserCanAddSubcategoryPage() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(0, 0,"LoginPage");
		String passwordvalue=ExcelUtility.getStringData(0, 1,"LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue);
		login.enterPasswordOnPasswordField(passwordvalue);
		login.clickonloginbutton();
		//RandomDataUtility randomutility=new RandomDataUtility();
		//String selectsubcategoryvalue= randomutility.createRandomUsername();
		//String subcategoryvalue=randomutility.createRandomPassword();
		SubCategoryPage subcategory=new SubCategoryPage(driver);
		subcategory.clickOnSubcategory();
		subcategory.clickMoreinfo();
		subcategory.clickOnNew();
		String selectsubcategoryvalue1=ExcelUtility.getStringData(0, 0,"SubcategoryPage");
		String subcategoryvalue1=ExcelUtility.getStringData(0, 1,"SubcategoryPage");
		subcategory.SelectCategory(selectsubcategoryvalue1);
		subcategory.enterSubCategory(subcategoryvalue1);
		subcategory.selectFile();
		subcategory.clickOnSave();
		boolean isSubcategoryAlertDisplayed=subcategory.isSubCategoryAlertDisplayed();
		Assert.assertTrue(isSubcategoryAlertDisplayed,Messeges.SUBCATEGORYADDED);
	}
	@Test
	public void verifyWhetherUserCanSearchSubcategoryPage() throws IOException
	{
		String usernamevalue=ExcelUtility.getStringData(0, 0,"LoginPage");
		String passwordvalue=ExcelUtility.getStringData(0, 1,"LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(usernamevalue);
		login.enterPasswordOnPasswordField(passwordvalue);
		login.clickonloginbutton();
		String selectcategoryvalue1 =ExcelUtility.getStringData(0, 0,"SubCategoryPage");
		String subcategoryvalue1 =ExcelUtility.getStringData(0, 1,"SubCategoryPage");
		SubCategoryPage subcategory=new SubCategoryPage(driver);
		subcategory.clickSubcategory();
		subcategory.clickmoreinfo();
		subcategory.clicksearch();
		subcategory.selectcategory1(selectcategoryvalue1);
		subcategory.entersubcategory1(subcategoryvalue1);
	    subcategory.clickSearchbutton();
		boolean isSubCategoryNameDisplayed=subcategory.isSubCategoryNameDisplayed();
		Assert.assertTrue(isSubCategoryNameDisplayed,Messeges.CANNOTADDSUBCATEGORYNAME);
	}
	

}
