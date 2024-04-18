package com.PageObjectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects {

	@FindBy(className = "app_logo")
	private WebElement home_page_heading;
	
	@FindBy(tagName  = "select")
	private WebElement filterdropdown;

	@FindBy(xpath = "//div[@class='inventory_item']//img")
	private List<WebElement> product_images;

	@FindBy(xpath = "//div[@class='inventory_item']//button")
	private List<WebElement> product_addtocart_button;

	@FindBy(xpath = "//div[@class='inventory_item']//div[@class='inventory_item_name ']")
	private List<WebElement> inventory_item_name;

	@FindBy(xpath = "//div[@class='inventory_item']//div[@class='inventory_item_price']")
	private List<WebElement> inventory_item_price;

	@FindBy(xpath = "//a[@class='shopping_cart_link']/span")
	private WebElement item_count_incart;

	public WebElement getItemCountInCart() {
		return item_count_incart;
	}
	public WebElement getfilterDropdown() {
		return filterdropdown;
	}

	public List<WebElement> getAddToCartButtonEnabled() {
		return product_addtocart_button;
	}

	public List<WebElement> getProductImages() {
		return product_images;
	}

	public List<WebElement> getProductPrice() {
		return inventory_item_price;
	}
	public List<WebElement> getProductName() {
		return inventory_item_name;
	}

	public WebElement getHomePageHeading() {
		return home_page_heading;
	}

	public String[] getInventoryItemName() {
		 String[] strAr3= new String[inventory_item_name.size()];
		for (int i = 0; i < strAr3.length; i++) {
			strAr3[i]=inventory_item_name.get(i).getText();
		}
		return strAr3;
	}

	public void getInventoryItemPrice() {
		for (WebElement webElement : inventory_item_price) {
			System.out.println(webElement.getText());
		}
	}

}
