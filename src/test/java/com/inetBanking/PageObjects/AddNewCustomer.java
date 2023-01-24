package com.inetBanking.PageObjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class AddNewCustomer {
	WebDriver ldriver;
	public AddNewCustomer(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement lnkAddCustomer;
	
	@FindBy(how=How.NAME, using="name")
	@CacheLookup
	WebElement txtCustomerName;
	
	@FindBy(how=How.NAME, using="rad1")
	@CacheLookup
	WebElement rdbutton; 
	
	@FindBy(how=How.ID_OR_NAME, using="dob")
	@CacheLookup
	WebElement dob;
	
	@FindBy(how=How.NAME, using="addr")
	@CacheLookup
	WebElement adrbox;
	
	@FindBy(how=How.NAME, using="city")
	@CacheLookup
	WebElement ctname;
	
	@FindBy(how=How.NAME, using="state")
	@CacheLookup
	WebElement stname;
	
	@FindBy(how=How.NAME, using="pinno")
	@CacheLookup
	WebElement pinno;
	
	
	@FindBy(how=How.NAME, using="telephoneno")
	@CacheLookup
	WebElement mobno;
	
	@FindBy(how=How.NAME, using="emailid")
	@CacheLookup
	WebElement eid;
	
	@FindBy(how=How.NAME, using="password")
	@CacheLookup
	WebElement pword;
	
	@FindBy(how=How.NAME, using="sub")
	@CacheLookup
	WebElement submit;
	
	public void ClickAddNewCustomer()
	{
		lnkAddCustomer.click();
	}
	
	public void AddCustomerName(String cname)
	{
		txtCustomerName.sendKeys(cname);
	}
	
	public void SelectGender()
	{
		rdbutton.click();
	}
	
	public void AddDateofBirth(String mm, String dd, String yy)
	{
		dob.sendKeys(mm);
		dob.sendKeys(dd);
		dob.sendKeys(yy);
	}
	public void AddAdress(String adr)
	{
		adrbox.sendKeys(adr);
	}
	
	public void AddCity(String city)
	{
		ctname.sendKeys(city);
	}
	
	public void AddState(String state)
	{
		stname.sendKeys(state);
	}
	
	public void pinnum(String pin)
	{
		pinno.sendKeys(String.valueOf(pin));
	}
	
	public void teleno(String tpno)
	{
		mobno.sendKeys(tpno);
	}
	
	public void mail(String emid)
	{
		eid.sendKeys(emid);
	}
	
	public void pwrd(String pswd)
	{
		pword.sendKeys(pswd);
	}
	
	public void submitt()
	{
		submit.click();
	}

	
	

}
