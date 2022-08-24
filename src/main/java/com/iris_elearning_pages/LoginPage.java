package com.iris_elearning_pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iris_elearing_keywords.UserInterfaceKeywords;
import com.iris_elearing_util.PropUtil;
import com.iris_elearing_util.WaitFor;

public class LoginPage {
private static final Logger log = Logger.getLogger(LoginPage.class);
	
	@FindBy(xpath = "//div[@class='login-btn ripple']")
	public WebElement signInButton;
	
	@FindBy(xpath = "//input[@placeholder='Enter email address']")
	public WebElement emailTextBox;  
	
	@FindBy(xpath = "//input[@placeholder='Enter password']")
	public WebElement passwordTextBox;
	
	@FindBy(xpath = "//div[@buttontext=\"LOGIN\"]")
	public WebElement loginButton; 
	
	@FindBy(xpath = "//div[@class='facebook-button']")
	public WebElement continueWithFacebook; 
	
	@FindBy(xpath = "//input[@value='Log In']")
	public WebElement facebookLoginButton; 
	
	@FindBy(xpath = "//div[@class='google-button']")
	public WebElement continueWithGoogle; 
	
	@FindBy(xpath = "//span[@class='devider']")
	public WebElement forgotPassword; 
	
	@FindBy(xpath = "//input[@placeholder='Enter email address']")
	public WebElement forgotPasswordEnterEmail; 
	
	@FindBy(xpath = "//span[@class='button-text']")
	public WebElement sendOtpButton; 
	
	@FindBy(xpath = "//div[@class='otpContainer']")
	public WebElement otpBox; 
	
	@FindBy(xpath = "//span[@class='devider']")
	public WebElement resendOtp; 
	
	@FindBy(xpath = "//span[@class='button-text']")
	public WebElement validteOtp; 
	
	public static void switchUrl(WebElement element ,String url2) {
		PropUtil repository = new PropUtil();
		element.sendKeys(repository.getEnvDetails(url2));
	}

	public LoginPage() {
		PageFactory.initElements(UserInterfaceKeywords.driver, this);
	}
	
	public void clickOnSignInButton() {
		WaitFor.elementToBeClickable(signInButton);
		signInButton.click();
		log.info("Clicked on SignIn/Login button..!");
		
	}
	public void enterEmail() {
		UserInterfaceKeywords.sendKeys(emailTextBox, "reg_Email");
		log.info("Email entered");
	}

	public void enterPassword() {
		UserInterfaceKeywords.sendKeys(passwordTextBox, "password");
		log.info("Password entered");
	}

	public void clickOnLoginButton() {
		WaitFor.elementToBeClickable(loginButton);
		loginButton.click();
		log.info("Clicked on loginButton");
	}
	public void clickOnContinueWithFacebookButton() {
		continueWithFacebook.click();
		log.info("Clicked on continue With Facebook");
	}

	public void clickOnContinueWithGoogleButton() {
		continueWithGoogle.click();		
		log.info("Clicked on continue with google");
	}

	public void clickOnForgotPasswordButton() {
		forgotPassword.click();
		log.info("Clicked on forgot password");
	}

	public void forgotPasswordEnterEmail() {
		UserInterfaceKeywords.sendKeys(forgotPasswordEnterEmail, "reg_Email");
		log.info("Email Entered");
	}

	public void clickOnSendOtp() {
		sendOtpButton.click();
		log.info("Clicked on send Otp");
	}

	public void checkOtpBox() {
		WaitFor.elementToBeClickable(otpBox);
		if (otpBox == null) {
			resendOtp.click();
			log.info("Clicked on resend Otp");
		}else {
			validteOtp.click();
			log.info("Clicked on validate Otp");
		}
		
	}
	
}
