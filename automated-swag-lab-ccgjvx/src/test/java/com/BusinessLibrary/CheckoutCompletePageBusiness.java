package com.BusinessLibrary;

import org.openqa.selenium.support.PageFactory;

import com.PageObjectRepository.CheckoutCompletePageObject;
import com.genericLibrary.BaseClass;

public class CheckoutCompletePageBusiness extends BaseClass {
	CheckoutCompletePageObject completePage;
	
	public CheckoutCompletePageBusiness() {
		completePage = PageFactory.initElements(driver, CheckoutCompletePageObject.class);
	}
	
	public String validateThankyouMessage() {
		return completePage.validateThankYouMessage();
	}




}
