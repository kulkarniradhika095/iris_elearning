package com.iris_elearning_tests;



import org.testng.annotations.Test;



import com.iris_elearing_keywords.UserInterfaceKeywords;
import com.iris_elearing_util.Environment;
import com.iris_elearning_config.TestBase;
import com.iris_elearning_pages.GovtJobBankPage;

public class GovtJobBankTests extends TestBase {
	
	@Test
	public static void verifyResultsforGovtJobExamsBankingTests() {
		UserInterfaceKeywords.launchUrl(Environment.URL);
		GovtJobBankPage govt = new GovtJobBankPage();
		govt.clickAllCourses();
	}
}
