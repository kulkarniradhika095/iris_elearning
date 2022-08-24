package com.iris_elearning_config;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.iris_elearing_keywords.UserInterfaceKeywords;

public class TestBase {
	@Parameters("browser-Name")
	@BeforeMethod
	public void setUp(@Optional("chrome") String browserName) {
			UserInterfaceKeywords.launchBrowser(browserName);
		}
	
	@AfterMethod
	public void tearDown() {
		UserInterfaceKeywords.driver.close();
	}
}
