package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;

public class SubCategoryPage {
	
	public WebDriver driver;
	
	public SubCategoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//p[text()='Sub Category']")private WebElement clicksubcategory;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category']")private WebElement clickmoreinfo;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement clicknew;
	@FindBy(xpath="//select[@id='cat_id']")private WebElement selectcategory;
	@FindBy(xpath="//input[@id='subcategory']")private WebElement entersubcategory;
	@FindBy(xpath="//input[@id='main_img']")private WebElement choosefile;
	@FindBy(xpath="//button[@class='btn btn-danger']")private WebElement clicksave;
	@FindBy(xpath="//p[text()='Sub Category']")private WebElement subcategory;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category']")private WebElement clickmoreinfo1;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")private WebElement clicksearch;
	@FindBy(xpath="//select[@id='un']")private WebElement selectcategory1;
	@FindBy(xpath="//input[@class='form-control']")private WebElement entersubcategory1;
	@FindBy(xpath="//button[@class='btn btn-danger btn-fix']")private WebElement clicksearchbutton;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")private WebElement subcategorydisplayed;
	@FindBy(xpath="//td[text()='Beetroot']")private WebElement Beetrootdisplayed;
	
	
	public void clickOnSubcategory()
	{
		clicksubcategory.click();
	}
	public void clickMoreinfo()
	{
		clickmoreinfo.click();
	}
	public void clickOnNew()
	{
		clicknew.click();
	}
	public void SelectCategory(String selectcategoryvalue)
	{
		selectcategory.sendKeys(selectcategoryvalue);
	}
	public void enterSubCategory(String subcategoryvalue)
	{
		entersubcategory.sendKeys(subcategoryvalue);
	}
	public void selectFile()
	{
		choosefile.sendKeys(Constants.BEETROOTFILE);
	}
	public void clickOnSave()
	{
		clicksave.click();
		
	}
	public void clickSubcategory()
	{
		clicksubcategory.click();
		
	}
	public void clickmoreinfo()
	{
		clickmoreinfo1.click();
	}
	
	public void clicksearch()
	{
		clicksearch.click();
	 }
	public void selectcategory1(String selectcategoryvalue1)
	{
		selectcategory1.sendKeys(selectcategoryvalue1);
	}
	public void entersubcategory1(String subcategoryvalue1)
	{
		entersubcategory1.sendKeys(subcategoryvalue1);
	}
	public void clickSearchbutton()
	{
		clicksearchbutton.click();
	}
	public boolean isSubCategoryAlertDisplayed()
	{
		return subcategory.isDisplayed();
	}
	public boolean isSubCategoryNameDisplayed()
	{
		return Beetrootdisplayed.isDisplayed();
	}
	
	}
		
	
	
	
