package com.iris_elearning_pages;

import org.apache.log4j.Logger;
import org.apache.xmlbeans.impl.xb.xsdschema.Attribute.Use;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iris_elearing_keywords.UserInterfaceKeywords;
import com.iris_elearing_util.Environment;
import com.iris_elearing_util.PropUtil;

public class HomePage {
	private static final Logger log = Logger.getLogger(LoginPage.class);
	
	@FindBy(xpath="//img[@class='logo-img']")
	public WebElement logoimage;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[1]/div[1]/div/div[3]/div")
	public WebElement allcourserdrodown;
	
	@FindBy(xpath="//div[@class='exam-menu-wrap']")
	public WebElement exammenu;
	
	@FindBy(xpath="//input[@class='search-input-field ']")
	public WebElement searchtab;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[1]/div[1]/div/div[5]/div/div/div")
	public WebElement usernamedropdown;
	
	@FindBy(xpath="//div[@class='product-type-wrapper']")
	public WebElement explorebyproducts;
	
	@FindBy(xpath="//input[@class='mobNumber2']")
	public WebElement phonenumberbox;
	
	@FindBy(xpath="//button[@value='Get link']")
	public WebElement getlinkbtn;
	
	@FindBy(tagName="a")
	public WebElement alllinks;
	
	public static void switchUrl(WebElement element ,String url2) {
		PropUtil repository = new PropUtil();
		element.sendKeys(repository.getEnvDetails(url2));
	}

	public HomePage() {
		PageFactory.initElements(UserInterfaceKeywords.driver, this);
	}
	
	public boolean displaylogo() {
	return UserInterfaceKeywords.display(logoimage);
	
	}
	
	public void clickoncoursedropdown() {
		UserInterfaceKeywords.click(allcourserdrodown);

	}
	
	public void clickonexploreexams() {
		UserInterfaceKeywords.click(exammenu);
	}
	
	public void serachexams() {
		UserInterfaceKeywords.sendkey(searchtab);
		
	}
	
	public void hoveronuseracctdropdown() {
		UserInterfaceKeywords.mouseMove(usernamedropdown);
	}
	
	public void clickOnexplorebyproducts() {
		UserInterfaceKeywords.click(explorebyproducts);

	}
	
	public void enterphoneno() {
		phonenumberbox.sendKeys("phonenumber");

	}
	
	public void clickOngetlinkbtn() {
		UserInterfaceKeywords.click(getlinkbtn);
	}
	
	public void openallLinks() throws InterruptedException {
		UserInterfaceKeywords.clickonlinks(alllinks);

	}
	}
	


