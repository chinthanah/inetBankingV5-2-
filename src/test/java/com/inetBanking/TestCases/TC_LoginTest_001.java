package com.inetBanking.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.inetBanking.PageObjects.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_001 extends BaseClass {
	@Test
	public void Login() throws IOException
	{
		logger.info("URL is opened");
		LoginPage lp=new LoginPage(driver);
		
		lp.setusername(Username);
		logger.info("username entered");
		
		lp.setpassword(Password);
		logger.info("password entered");
		
		lp.loginbutton();
		logger.info("login button clicked");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
				Assert.assertTrue(true);
				logger.info("test passed");
		}
		else
		{
			captureScreen(driver,"Login");
			Assert.assertTrue(false);
			logger.info("test failed");
		}
	}
}
