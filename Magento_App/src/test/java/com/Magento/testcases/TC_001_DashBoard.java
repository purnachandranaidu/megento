package com.Magento.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.Magento.pageobjects.Dashboard;

public class TC_001_DashBoard extends BaseClass {
	
	@Test(priority = 1)
	public void Dashboardtabs() throws InterruptedException
	{
		Dashboard tabs=new Dashboard();
		tabs.Mviwe();
		Thread.sleep(1000);
		tabs.NewCustomers();
		Thread.sleep(1000);
		tabs.customers();
	}

}
