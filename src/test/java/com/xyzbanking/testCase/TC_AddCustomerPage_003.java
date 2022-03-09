package com.xyzbanking.testCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.xyzbanking.pomPages.AddCustomerPage;
import com.xyzbanking.pomPages.LoginPage;

public class TC_AddCustomerPage_003 extends BaseClass {
	
	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.giveUserName(username);
		logger.info("User name is provided");
		lp.giveUserpassword(password);
		logger.info("Passsword is provided");
		lp.clickLoginBTN();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust=new AddCustomerPage(driver);
		
		addcust.clickAddNewCustomer();
		
		logger.info("providing customer details....");
		
		
		addcust.custName("Ashish");
		addcust.custgender("male");
		addcust.custdob("10","15","2004");
		Thread.sleep(5000);
		addcust.custaddress("INDIA");
		addcust.custcity("IND");
		addcust.custstate("MP");
		addcust.custpinno("450001");
		addcust.custtelephoneno("987890091");
		
		String email=randomestring()+"@gmail.com";
		addcust.custemailid(email);
		addcust.custpassword("abcdef");
		addcust.custsubmit();
		
		Thread.sleep(3000);
		
		logger.info("validation started....");
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed....");
			
		}
		else
		{
			logger.info("test case failed....");
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
			
	}
}
