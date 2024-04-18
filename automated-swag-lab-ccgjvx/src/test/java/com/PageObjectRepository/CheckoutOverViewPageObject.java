package com.PageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverViewPageObject {

	@FindBy (className = "title")
	private WebElement overviewText;
	
	@FindBy	(xpath = "//div[@data-test='payment-info-label']")
	private WebElement payment_info_label;
	
	@FindBy	(xpath = "//div[@data-test='payment-info-value']")
	private WebElement payment_info_value;
	
	@FindBy	(xpath = "//div[@data-test='shipping-info-label']")
	private WebElement shipping_info_label;
	
	@FindBy	(xpath = "//div[@data-test='shipping-info-value']")
	private WebElement shipping_info_value;
	
	@FindBy	(xpath = "//div[@data-test='total-info-label']")
	private WebElement total_info_label;
	
	@FindBy	(xpath = "(//div[@class='summary_subtotal_label']//text())[2]")
	private WebElement product_total_price;
	
	@FindBy	(xpath = "(//div[@class='summary_tax_label']//text())[2]")
	private WebElement tax_price;
	
	
	@FindBy	(xpath = "(//div[@class='summary_total_label']//text())[2]")
	private WebElement total_price;
	
	@FindBy (id = "cancel")
	private WebElement btnCancel;
	
	@FindBy (id = "finish")
	private WebElement btnFinish;
	
	public String getOverviewText() {
		return overviewText.getText();
	}
	
	public String getPaymentInfoLabel() {
		return payment_info_label.getText();
	}
	
	public String getPaymentInfoValue() {
		return payment_info_value.getText();
	}
	
	public String getShippingInfoLabel() {
		return shipping_info_label.getText();
	}
	
	public String getShippingInfoValue() {
		return shipping_info_value.getText();
	}
	
	public String getTotalInfoValue() {
		return total_info_label.getText();
	}
	
	public String getProductTotalPrice() {
		return product_total_price.getText();
	}
	
	public String gettaxPrice() {
		return tax_price.getText();
	}
	
	public String getTotalPrice() {
		return total_price.getText();
	}
	
	public void clickOnCancelButton() {
		btnCancel.click();
	}
	
	public void clickOnFinishButton() {
		btnFinish.click();
	}
	
	
	
}
