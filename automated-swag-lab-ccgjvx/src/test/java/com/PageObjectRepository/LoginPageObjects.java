package com.PageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {

	@FindBy(xpath = "//input[@id='user-name']")
	private WebElement txtUserName;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement txtPassword;

	@FindBy(xpath = "//input[@id='login-button']")
	private WebElement btnLogin;

	@FindBy(xpath  = "//h3[@data-test='error']")
	private WebElement error_division;
	
	
	public WebElement getErrorDivision() {
		return	error_division;
		}
	
	public void enterUserName(String userName) {
		txtUserName.sendKeys(userName);
	}

	public void enterPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void clickLoginButton() {
		btnLogin.click();
	}
}
