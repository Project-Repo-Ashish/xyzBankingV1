package com.xyzbanking.testCase;

import org.testng.annotations.Test;
import org.testng.Assert;
import java.io.IOException;

import com.xyzbanking.pomPages.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws IOException {

	
		logger.info("URL is Opened");
		LoginPage lp = new LoginPage(driver);

		lp.giveUserName(username);
		logger.info("Enter User Name");

		lp.giveUserpassword(password);
		logger.info("Enter your Password");

		lp.clickLoginBTN();
		logger.info("Clicking on SignIn Button");

		if (driver.getTitle().equals(" Guru99 Bank Manager HomePage ")) {
			Assert.assertTrue(true);
			logger.info("LogIn test Passed");
		} else {
			captureScreen(driver, "loginTest");
			Assert.assertFalse(false);
			logger.info("LogIn test Failed");
		}
	}

}
