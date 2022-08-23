package com.iris_elearning_tests;

import org.testng.annotations.Test;

import com.iris_elearing_keywords.UserInterfaceKeywords;
import com.iris_elearing_util.Environment;
import com.iris_elearning_config.TestBase;
import com.iris_elearning_pages.LoginPage;

public class LoginPageTests extends TestBase{
	@Test
	public static void verifyloginDetails() throws InterruptedException {
		UserInterfaceKeywords.launchUrl(Environment.URL);
		LoginPage Login = new LoginPage();
		Login.clickOnSignInButton();
		Login.enterEmail();
		Login.enterPassword();
		Login.clickOnLoginButton();
	}
	
	@Test
	public static void verifyloginPageIfEmpty()  {
		UserInterfaceKeywords.launchUrl(Environment.URL);
		LoginPage Login = new LoginPage();
		Login.clickOnSignInButton();
		Login.clickOnLoginButton();
	}
	
	@Test
	public static void continueWithFacebook()  {
		UserInterfaceKeywords.launchUrl(Environment.URL);
		LoginPage Login = new LoginPage();
		Login.clickOnSignInButton();
		Login.clickOnContinueWithFacebookButton();
		UserInterfaceKeywords.switchUrlFB(Environment.URLFACEBOOKPAGE);
		
	}
	@Test
	public static void continueWithGoogle()  {
		UserInterfaceKeywords.launchUrl(Environment.URL);
		LoginPage Login = new LoginPage();
		Login.clickOnSignInButton();
		Login.clickOnContinueWithGoogleButton();
		UserInterfaceKeywords.switchUrlGoogle(Environment.URLGOOGLEPAGE);
	}
	@Test
	public static void verifyForgotPassword() {
		UserInterfaceKeywords.launchUrl(Environment.URL);
		LoginPage Login = new LoginPage();
		Login.clickOnSignInButton();
		Login.clickOnForgotPasswordButton();
		Login.forgotPasswordEnterEmail();
		Login.clickOnSendOtp();
		Login.checkOtpBox();
		
	}
}
