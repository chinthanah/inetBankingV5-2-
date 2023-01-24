package com.inetBanking.TestCases;

import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.Test;

import com.inetBanking.PageObjects.AddNewCustomer;
import com.inetBanking.PageObjects.LoginPage;

import junit.framework.Assert;

public class TC_AddNewCustomerTest_002 extends BaseClass{

	@Test
	public void NewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		logger.info("url opened");
		
		lp.setusername(Username);
		logger.info("username is provided");
		
		lp.setpassword(Password);
		logger.info("password is provided");
		
		lp.loginbutton();
		logger.info("login button clicked");
		
		Thread.sleep(3000);
		
		AddNewCustomer addcust=new AddNewCustomer(driver);
		
		addcust.ClickAddNewCustomer();
		logger.info("New Customer clicked");
		
		Thread.sleep(30000);
		
		addcust.AddCustomerName("moon");
		logger.info("Customer name entered");
		
		addcust.SelectGender();
		logger.info("gender selected");
		
		addcust.AddDateofBirth("03","06","1993");
		logger.info("date of birth entered");
		
		addcust.AddAdress("Earth");
		logger.info("Address entered");
		
		addcust.AddCity("Shadow");
		logger.info("city entered");
		
		addcust.AddState("star");
		logger.info("stata name entered");
		
		addcust.pinnum("23556");
		logger.info("pin no entered");
		
		addcust.teleno("39824090455");
		logger.info("telephone no entered");
		
		String email=randomstring()+"@gmail.com";
		addcust.mail(email);
		logger.info("email entered");
		
		addcust.pwrd("987h7");
		logger.info("password entered");
		
		addcust.submitt();
		logger.info("submit button clicked");
		
		try {
		    // Add a wait timeout before this statement to make 
		    // sure you are not checking for the alert too soon.
		    Alert alt = driver.switchTo().alert();
		    alt.accept();
		} catch(NoAlertPresentException noe) {
		    // No alert found on page, proceed with test.
		}
		
		Thread.sleep(30000);
		logger.info("validation started");
		
		@SuppressWarnings("unused")
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		if(res=true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed");
		}
		else
		{
			captureScreen(driver,"NewCustomer");
			Assert.assertTrue(false);
			logger.info("test case failed");
		}
	}
	

}
