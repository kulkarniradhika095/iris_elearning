package com.iris_elearning_tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.iris_elearing_keywords.UserInterfaceKeywords;
import com.iris_elearing_util.Environment;
import com.iris_elearning_config.TestBase;
import com.iris_elearning_pages.HomePage;
import com.iris_elearning_pages.LoginPage;

public class HomePageTest extends TestBase{
	private static final Logger log = Logger.getLogger(LoginPage.class);
	
	@Test
	public void verifylogoimage() {
		UserInterfaceKeywords.launchUrl(Environment.URL);
		HomePage hm =new HomePage();
		boolean logo=hm.displaylogo();
		log.info(logo);
	}
	
	@Test
	public void verifyallcoursedropdown() {
		UserInterfaceKeywords.launchUrl(Environment.URL);
		HomePage hm =new HomePage();
		hm.clickoncoursedropdown();
		log.info("clicked on course dropdown");
	
	}
		
	

}
