package com.iris_elearning_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.iris_elearing_keywords.UserInterfaceKeywords;

public class GovtJobBankPage {
	public WebElement rightArrowCarousel;
	public WebElement bankMahaPack;
	public WebElement sbiClerk;
	
	
	public GovtJobBankPage() {
		bankMahaPack = UserInterfaceKeywords.driver.findElement(By.xpath(""));
		rightArrowCarousel = UserInterfaceKeywords.driver.findElement(By.xpath(""));
	}
}
