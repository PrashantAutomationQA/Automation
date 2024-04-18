package com.BusinessLibrary;

import org.openqa.selenium.support.PageFactory;

import com.PageObjectRepository.AddToCartPageObject;
import com.genericLibrary.BaseClass;

public class AddCartPageBusiness extends BaseClass {
	AddToCartPageObject addToCart;

	public AddCartPageBusiness() {
		addToCart = PageFactory.initElements(driver, AddToCartPageObject.class);
	}
	
	public String ValidatePage() {
		return addToCart.validateTitle();
	}
	
	public String getProductName() {
		return addToCart.getProductName();
	}
	
	public int getProductPrice() {
		String productPrice = addToCart.getProductPrice();
		int productActualPrice = Integer.parseInt(productPrice);
		return productActualPrice;
	}
	
	public void clickContinueShoppingBtn() {
		addToCart.clickContinueShopingbutton();
	}
	
	public void clickCheckOutButton() {
		addToCart.clickCheckoutButton();
	}
}
