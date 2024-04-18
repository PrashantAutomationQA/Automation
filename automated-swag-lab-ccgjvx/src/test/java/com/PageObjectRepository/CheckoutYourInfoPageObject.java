package com.PageObjectRepository;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutYourInfoPageObject {

	@FindBy (className = "title")
	private WebElement validate_Title;
	
	@FindBy (id = "first-name")
	private WebElement txtFirstName;
	
	@FindBy (id = "lastName")
	private WebElement txtLastName;
	
	@FindBy (id = "postal-code")
	private WebElement txtPostalCode;
	
	@FindBy (id = "cancel")
	private WebElement btnCancel;
	
	@FindBy (id = "continue")
	private WebElement btnContinue;
	
	public String validateText() {
		return validate_Title.getText();
	}
	
	public void enterFirstName(String firstName) {
		txtFirstName.sendKeys(firstName);
	}
	
	public void enterLastName(String lastName) {
		txtLastName.sendKeys(lastName);
	}
	
	public void enterPostalCode(String postalCode) {
		txtPostalCode.sendKeys(postalCode);
	}
	
	public void clickOnCancilButton() {
		btnCancel.click();
	}
	
	public void clickOnContinueButton() {
		btnContinue.click();
	}
}

