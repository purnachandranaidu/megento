package com.Magento.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	
	public  ReadConfig()
	{
		java.io.File src= new java.io.File("./Configuration/Config.properties");
	
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
			
		} catch (Exception e) {
			System.out.println("Exception is" + e.getMessage());
			
		}
		
	}
	
	public String getApplicationurl()
	{
		String url=pro.getProperty("url");
		return url;
		
	}
	
	public String getchromepath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	public String getfirepath()
	{
		String getfirepath=pro.getProperty("firefox");
		return getfirepath;
	}
	public String getedgepath()
	{
		String edgepath=pro.getProperty("Edge");
		return edgepath;
	}
	public String username()
	{
		String username=pro.getProperty("username");
		return username;
	}
	public String password()
	{
		String pasword=pro.getProperty("password");
		return pasword;
	}
	
}
