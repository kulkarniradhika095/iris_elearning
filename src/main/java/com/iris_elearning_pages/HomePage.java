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
	
	public HomePage() {
		PageFactory.initElements(UserInterfaceKeywords.driver, this);
	}
	
}
