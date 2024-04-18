package com.PageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePageObject {

	@FindBy (className = "complete-header")
	private WebElement thankYouMessage;
	
	public String validateThankYouMessage() {
		return thankYouMessage.getText();
	}
}
