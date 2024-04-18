package com.BusinessLibrary;

import org.openqa.selenium.support.PageFactory;

import com.PageObjectRepository.LoginPageObjects;
import com.genericLibrary.BaseClass;

public class LoginPageBusiness extends BaseClass {

	LoginPageObjects login;

	public LoginPageBusiness() {
		login = PageFactory.initElements(driver, LoginPageObjects.class);
	}

	public void enterUserName(String userName) {

		login.enterUserName(userName);
	}

	public void enterPassword(String password) {

		login.enterPassword(password);
	}

	public void clickOnLoginButton() {

		login.clickLoginButton();
		
	}
	
	public String getErrorMessage() {
		return login.getErrorDivision().getText();
	}
	
	public void loginToApplication(String Username, String Password) {
		enterUserName(Username);
		enterPassword(Password);
		clickOnLoginButton();
		
	}

}
