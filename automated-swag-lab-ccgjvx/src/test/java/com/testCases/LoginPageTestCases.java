package com.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BusinessLibrary.HomePageBusiness;
import com.BusinessLibrary.LoginPageBusiness;
import com.genericLibrary.BaseClass;

public class LoginPageTestCases extends BaseClass {

	@BeforeMethod
	public void gearUp() {

		launchBrowser("Chrome");
		openUrl(valueOf().getProperty("app.url"));
	}

	@Test(description = "Verify User is able to login with Valid Credentials")
	public void login_With_Valid_Credentials_Test() {
		LoginPageBusiness LOGINPAGE = new LoginPageBusiness();
		LOGINPAGE.loginToApplication(valueOf().getProperty("user.generic"), valueOf().getProperty("pwd.generic"));
		HomePageBusiness home = new HomePageBusiness();
		Assert.assertEquals(home.verifyHomePage(), true, "Home Page is not loaded");
	}

	@Test(description = "Verify User is unable to login with invalid Credentials")
	public void login_With_Invalid_Credentials_Test() {
		LoginPageBusiness LOGINPAGE = new LoginPageBusiness();
		LOGINPAGE.loginToApplication(valueOf().getProperty("user.locked"), valueOf().getProperty("pwd.generic"));
		Assert.assertEquals(LOGINPAGE.getErrorMessage(), "Epic sadface: Sorry, this user has been locked out.",
				"error message incorrect");
	}

	@AfterMethod
	public void gearDown() {

		quitBrowser();
	}

}
