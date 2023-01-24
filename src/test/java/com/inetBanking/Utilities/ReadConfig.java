package com.inetBanking.Utilities;

import java.io.File;


import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	public ReadConfig()
	{
		File src=new File("./Configuration/config.properties");
		try
		{
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+e.getMessage());
		}
		
	}
	public String getApplicationurl()
	{
		String Url=pro.getProperty("URL");
		return Url;
	}
	public String getUsername()
	{
		String username=pro.getProperty("USERNAME");
		return username;
	}
	public String getPassword()
	{
		String password=pro.getProperty("PASSWORD");
		return password;
	}
	public String getChromePath()
	{
		String chromepath=pro.getProperty("CHROMEPATH");
		return chromepath;
	}
	public String getFirefoxPath()
	{
		String firepath=pro.getProperty("FIREPATH");
		return firepath;
	}
	

}
