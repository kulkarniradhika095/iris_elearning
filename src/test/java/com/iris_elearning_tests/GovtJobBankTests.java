package com.iris_elearning_tests;


import org.apache.log4j.Logger;

import org.testng.annotations.Test;

import com.iris_elearing_keywords.UserInterfaceKeywords;
import com.iris_elearing_util.Environment;
import com.iris_elearing_util.WaitFor;
import com.iris_elearning_config.TestBase;

public class GovtJobBankTests extends TestBase {
	private static final Logger log = Logger.getLogger(GovtJobBankTests.class);
	@Test
	public static void verifyResultsforGovtJobExamsBankingTests() {
		UserInterfaceKeywords.launchUrl(Environment.URL);
		WaitFor.time(3);
		
		
	}
}
