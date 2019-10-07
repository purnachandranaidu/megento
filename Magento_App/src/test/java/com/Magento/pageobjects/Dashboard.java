package com.Magento.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Magento.testcases.BaseClass;

public class Dashboard extends BaseClass {

	public Dashboard() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='grid_tab_reviewed_products']")
	WebElement Mostviewd;
	@FindBy(id = "grid_tab_new_customers")
	WebElement NewCustomers;
	@FindBy(id = "grid_tab_customers")
	WebElement Customers;

	public void Mviwe()

	{
		Mostviewd.click();
	}

	public void NewCustomers()

	{
		NewCustomers.click();
	}

	public void customers()

	{
		Customers.click();
	}

}
