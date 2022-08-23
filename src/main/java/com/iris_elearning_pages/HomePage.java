package com.iris_elearning_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(xpath = "//div[@class='all-course-content false']")
	public WebElement allCourses;
	@FindBy(xpath = "//input[@placeholder='Find video courses, mock tests, live classes...']")
	public WebElement searchBar;
	@FindBy(xpath = "//img[@src=\"/images/testi-pagi.svg\"]")
	public WebElement leftRoundArrow;
}
