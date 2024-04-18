package com.BusinessLibrary;

import org.openqa.selenium.support.PageFactory;

import com.PageObjectRepository.CheckoutOverViewPageObject;
import com.genericLibrary.BaseClass;

public class CheckoutOverViewPageBusiness extends BaseClass {

	CheckoutOverViewPageObject overviewPage;

	public CheckoutOverViewPageBusiness() {
		overviewPage = PageFactory.initElements(driver, CheckoutOverViewPageObject.class);
	}

	public String getOverViewText() {
		return overviewPage.getOverviewText();
	}

	public String getPaymentInfoLabel() {
		return overviewPage.getPaymentInfoLabel();
	}

	public String getPaymentInfoValue() {
		return overviewPage.getPaymentInfoValue();
	}

	public String getShippingInfoLabel() {
		return overviewPage.getShippingInfoLabel();
	}

	public String getShippingInfoValue() {
		return overviewPage.getShippingInfoValue();
	}

	public String getTotalInfoValue() {
		return overviewPage.getTotalInfoValue();
	}

	public int getProductTotalPrice() {
		String productTotalPrice = overviewPage.getProductTotalPrice();
		int productTotalPriceValue = Integer.parseInt(productTotalPrice);
		return productTotalPriceValue;
	}

	public int getTaxPrice() {
		String productTaxPrice = overviewPage.gettaxPrice();
		int productTaxPriceValue = Integer.parseInt(productTaxPrice);
		return productTaxPriceValue;
	}

	public int gettotalPrice() {
		CheckoutOverViewPageBusiness overviewBiz = new CheckoutOverViewPageBusiness();
		int totalPrice = overviewBiz.getProductTotalPrice() + overviewBiz.getTaxPrice();
		return totalPrice;
	}
	
	public void clickOnCancel() {
		overviewPage.clickOnCancelButton();
	}
	
	public void clickOnFinish() {
		overviewPage.clickOnFinishButton();
	}

}
