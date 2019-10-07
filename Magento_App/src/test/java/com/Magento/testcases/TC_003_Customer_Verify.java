package com.Magento.testcases;

import org.testng.annotations.Test;

import com.Magento.pageobjects.Customer;

public class TC_003_Customer_Verify extends BaseClass {
	
	@Test(priority = 3)
	public void customer_verify()
	{
		Customer cus= new Customer();
		cus.customer();
		
	}

}
