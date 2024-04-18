package com.PageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPageObject {

	@FindBy(className = "title")
	private WebElement add_to_cart_page_title;
	
	@FindBy (className = "inventory_item_name")
	private WebElement product_name;
	
	@FindBy (className = "(//div[@class='inventory_item_price']/text())[2]")
	private WebElement product_price;
	
	@FindBy (id = "continue-shopping")
	private WebElement continue_shoping_btn;
	
	@FindBy (id = "checkout")
	private WebElement checkout_btn;
	
	public String validateTitle() {
		return add_to_cart_page_title.getText();
	}
	
	public String getProductName() {
		return product_name.getText();
	}
	
	public String getProductPrice() {
		return product_price.getText();
	}
	
	public void clickContinueShopingbutton() {
		continue_shoping_btn.click();
	}
	
	public void clickCheckoutButton() {
		checkout_btn.click();
	}
	
	
}
