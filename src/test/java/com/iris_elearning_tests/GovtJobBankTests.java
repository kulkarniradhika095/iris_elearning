package com.iris_elearning_tests;

import org.testng.annotations.Test;

import com.iris_elearing_keywords.UserInterfaceKeywords;
import com.iris_elearing_util.Environment;
import com.iris_elearning_pages.HomePage;

public class GovtJobBankTests {
	@Test
	public static void verifyResultsforGovtJobExamsBankingTests() {
		UserInterfaceKeywords.launchUrl(Environment.URL);
		HomePage home = new HomePage();
		home.searchBar.click();
		home.leftRoundArrow.click();
		home.allCourses.click();
		
	}
}
