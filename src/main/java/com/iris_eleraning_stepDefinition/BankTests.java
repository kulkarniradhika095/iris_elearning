package com.iris_eleraning_stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import com.iris_elearing_keywords.UserInterfaceKeywords;
import com.iris_elearing_util.Environment;
import com.iris_elearning_config.TestBase;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BankTests extends TestBase {
	public static void clickAllCourses() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.findElement(By.xpath("//img[@src='/images/downrow-menu.svg']")).click();
	}
	
	@FindBy(xpath = "//a[@style=\'cursor: pointer; text-transform: capitalize;\']")
	public WebElement governmentJobExams;
	
	@FindBy(xpath = "//img[@src=\'https://cpimages.careerpower.in/CategoryImages/2021-06-27T17%3A43%3A16.645_government.png\']")
	public WebElement governmentJobExamsLogo;
	
	@FindBy(xpath = "//div/ul/li[@data-id=\"0\"]")
	public WebElement Banking;
	
	
	@Given("Chrome browser is opened")
	public void openBrowser() {
		UserInterfaceKeywords.launchBrowser("Chrome");
	}
	@And("Url is launched")
	public void launchUrl() {
		UserInterfaceKeywords.launchUrl(Environment.URL);
	}
	@When("Click on All Courses tab")
	public void clickOnAllCourses() {
		clickAllCourses();
	}
	@Then("All courses tab should show Government Job Exams and Banking tabs to be selected by default")
	public void getText() {
		governmentJobExamsLogo.getLocation();
		governmentJobExams.getText();
		Banking.getText();
	}
	@Then("Close Browser")
	public void closeBrowser() {
		UserInterfaceKeywords.driver.close();
	}
}
