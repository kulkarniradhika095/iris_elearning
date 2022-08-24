package com.iris_elearning_pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iris_elearing_keywords.UserInterfaceKeywords;

public class HomePage {
	
	@FindBy(xpath = "//div[@class='all-course-wrap']")
	public WebElement allCourses;
	
	@FindBy(xpath = "//input[@placeholder='Find video courses, mock tests, live classes...']")
	public WebElement searchBar;
	
	@FindBy(xpath = "//img[@src=\"/images/testi-pagi.svg\"]")
	public WebElement leftRoundArrow;
	
<<<<<<< HEAD
	@FindBy(xpath="//div[@id='my-purchased-home-page']")
	public WebElement myPurchasedcourses;
	
	@FindBy(xpath="//div[@class='examm-menu-list visible active']")
	public WebElement examMenuList;
	
	@FindBy(xpath="//img[@class='logo-img']")
	public WebElement logoimage;
=======
	public HomePage() {
		PageFactory.initElements(UserInterfaceKeywords.driver, this);
	}
>>>>>>> 26689c596d3b67b0213297132fc66c2f032c799e
	
}
