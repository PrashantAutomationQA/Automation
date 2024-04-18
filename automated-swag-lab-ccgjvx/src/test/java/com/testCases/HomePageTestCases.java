package com.testCases;

import java.util.Arrays;
import java.util.Collections;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BusinessLibrary.HomePageBusiness;
import com.BusinessLibrary.LoginPageBusiness;
import com.genericLibrary.BaseClass;

public class HomePageTestCases extends BaseClass {

	@BeforeMethod
	public void gearUp() {

		launchBrowser("Chrome");
		openUrl(valueOf().getProperty("app.url"));
	}

	@Test(description = "Verify All the product Images are visible")
	public void verify_Product_images_visibility_Test() {
		LoginPageBusiness LOGINPAGE = new LoginPageBusiness();
		LOGINPAGE.loginToApplication(valueOf().getProperty("user.generic"), valueOf().getProperty("pwd.generic"));
		HomePageBusiness home = new HomePageBusiness();
		waitForPageToLoad();
		Assert.assertEquals(home.verifyAllProductImagesAreVisible(), true, "images are broken in Home page");
	}

	@Test(description = "Verify All the Add to cart button enabled")
	public void verify_Product_cart_button_enabled_Test() {
		LoginPageBusiness LOGINPAGE = new LoginPageBusiness();
		LOGINPAGE.loginToApplication(valueOf().getProperty("user.generic"), valueOf().getProperty("pwd.generic"));
		HomePageBusiness home = new HomePageBusiness();
		Assert.assertEquals(home.verifyAllAddToCartByttonEnabled(), true, "images are broken in Home page");

	}

	@Test(description = "Verify product count increment in cart ")
	public void verify_Product_count_in_cart_Test() {
		LoginPageBusiness LOGINPAGE = new LoginPageBusiness();
		LOGINPAGE.loginToApplication(valueOf().getProperty("user.generic"), valueOf().getProperty("pwd.generic"));
		HomePageBusiness home = new HomePageBusiness();
		home.addToCart(2);
		Assert.assertEquals(home.getItemCountInCart(), "2", "verification of 2 items added into cart and count match");
	}

	@Test(description = "Verify product count decrement in cart ")
	public void verify_Product_count_decrement_in_cart_Test() {
		LoginPageBusiness LOGINPAGE = new LoginPageBusiness();
		LOGINPAGE.loginToApplication(valueOf().getProperty("user.generic"), valueOf().getProperty("pwd.generic"));
		HomePageBusiness home = new HomePageBusiness();
		home.addToCart(2);
		home.addToCart(1);
		Assert.assertEquals(home.getItemCountInCart(), "1",
				"verification of 2 items added into cart and removed one from card and count match");

	}

	@Test(description = "Verify product filter A to Z ")
	public void verify_Product_Filter_A_to_Z_Test() {
		LoginPageBusiness LOGINPAGE = new LoginPageBusiness();
		LOGINPAGE.loginToApplication(valueOf().getProperty("user.generic"), valueOf().getProperty("pwd.generic"));
		HomePageBusiness home = new HomePageBusiness();
		String[] beforefilter = home.getProductNameInOrder();
		home.selectFilter("Name (A to Z)");
		String[] afterfilter = home.getProductNameInOrder();
		Assert.assertEquals(beforefilter, afterfilter);

	}
	
	@Test(description = "Verify product filter Z to A ")
	public void verify_Product_Filter_Z_to_A_Test() {
		LoginPageBusiness LOGINPAGE = new LoginPageBusiness();
		LOGINPAGE.loginToApplication(valueOf().getProperty("user.generic"), valueOf().getProperty("pwd.generic"));
		HomePageBusiness home = new HomePageBusiness();
		String[] beforefilter = home.getProductNameInOrder();
		Arrays.sort(beforefilter,Collections.reverseOrder());
		home.selectFilter("Name (Z to A)");
		String[] afterfilter = home.getProductNameInOrder();
		Assert.assertEquals(beforefilter, afterfilter);

	}

	@AfterMethod
	public void gearDown() {

		quitBrowser();
	}

}
