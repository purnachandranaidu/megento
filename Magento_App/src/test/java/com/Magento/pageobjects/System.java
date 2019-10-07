package com.Magento.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Magento.testcases.BaseClass;

public class System extends BaseClass {
	
	public System()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//li[contains(@class,'item-system ')]//a)[1]") WebElement system;
	@FindBy(xpath = "//li//a//span[text()='Cache Management']") WebElement cachemanage;
	@FindBy(id = "flush_magento") WebElement Flushcache;
	
	

	
	public void systemCache()
	{
		system.click();
	}
	public void cacheM()
	{
		cachemanage.click();
	}
	public void FlushCac()
	{
		Flushcache.click();
	}
	
}
