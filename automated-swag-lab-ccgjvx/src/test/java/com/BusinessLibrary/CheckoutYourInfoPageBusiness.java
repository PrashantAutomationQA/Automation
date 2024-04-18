package com.BusinessLibrary;

import org.openqa.selenium.support.PageFactory;

import com.PageObjectRepository.CheckoutYourInfoPageObject;
import com.genericLibrary.BaseClass;

public class CheckoutYourInfoPageBusiness extends BaseClass {
	CheckoutYourInfoPageObject infoPage;
	
	public CheckoutYourInfoPageBusiness() {
		infoPage = PageFactory.initElements(driver, CheckoutYourInfoPageObject.class);
	}
	
	public String validatePageText() {
		return infoPage.validateText();
	}
	
	public void enterFirstName(String firstName) {
		infoPage.enterFirstName(firstName);
	}
	
	public void enterLastName(String lastName) {
		infoPage.enterLastName(lastName);
	}
	
	public void enterPostalCode(String postalCode) {
		infoPage.enterPostalCode(postalCode);
	}
	
	public void clickOnCancelButton() {
		infoPage.clickOnCancilButton();
	}
	
	public void clickOnContinueButton() {
		infoPage.clickOnContinueButton();
	}
	
}
