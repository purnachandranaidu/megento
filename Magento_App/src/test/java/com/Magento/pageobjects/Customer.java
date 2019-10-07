package com.Magento.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Magento.testcases.BaseClass;

public class Customer extends BaseClass {
	
public Customer()
{
PageFactory.initElements(driver,this);	

}
@FindBy(xpath = "(//li[@id='menu-magento-customer-customer']//a)[1]")WebElement customer;

public void customer()
{
	customer.click();
	}
}
