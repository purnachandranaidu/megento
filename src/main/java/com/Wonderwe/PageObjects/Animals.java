package com.Wonderwe.PageObjects;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Wonderwe.TestCases.BaseClass;

public class Animals extends BaseClass {

	
	public Animals()
	{
		
		PageFactory.initElements(driver, this);
	}

	

	@FindBy(xpath="(//div[@class='homePage-title'])[1]") WebElement Aanimals;
	
	public void Animal_page() throws Exception
	{
		Thread.sleep(1000);
		Aanimals.click();
		
	}
}
