package com.inetBanking.PageObjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUsername;
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement button;
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement lnklogout;
	public void setusername(String uname)
	{
		txtUsername.sendKeys(uname);
	}
	public void setpassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	public void loginbutton()
	{
		button.click();
	}
	public void clicklogout()
	{
		lnklogout.click();
	}

}
