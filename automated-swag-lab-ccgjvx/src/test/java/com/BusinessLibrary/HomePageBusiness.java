package com.BusinessLibrary;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.PageObjectRepository.HomePageObjects;
import com.PageObjectRepository.LoginPageObjects;
import com.genericLibrary.BaseClass;

public class HomePageBusiness extends BaseClass {

	HomePageObjects home;

	public HomePageBusiness() {
		home = PageFactory.initElements(driver, HomePageObjects.class);
	}

	public void selectFilter(String filter) {
	handleDropdown(home.getfilterDropdown(), filter);
		
	}

	public String[] getProductNameInOrder() {
		return home.getInventoryItemName();
	}

	public void addToCart(int itemcount) {
		List<WebElement> i = home.getAddToCartButtonEnabled();
		for (int j = 0; j < itemcount; j++) {
			i.get(j).click();
		}
	}

	public String getItemCountInCart() {
		return home.getItemCountInCart().getText();
	}

	public boolean verifyHomePage() {

		waitForElementToLoad(5, home.getHomePageHeading());
		return home.getHomePageHeading().isDisplayed();
	}

	public boolean verifyAllProductImagesAreVisible() {
		boolean flag = true;
		List<WebElement> i = home.getProductImages();
		for (WebElement webElement : i) {

			flag = flag && webElement.isDisplayed();
		}

		return flag;
	}

	public boolean verifyAllAddToCartByttonEnabled() {
		boolean flag = true;
		List<WebElement> i = home.getAddToCartButtonEnabled();
		for (WebElement webElement : i) {
			flag = flag && webElement.isEnabled();
		}

		return flag;
	}

}
