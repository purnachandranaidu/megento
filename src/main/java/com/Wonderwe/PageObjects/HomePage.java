package com.Wonderwe.PageObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
public WebDriver ldriver;
	
	public HomePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//a[@class='pro-close']")
	WebElement Close_Popup;

	public void Popup()
	{
		Close_Popup.click();
	}
	
	
	
	
	
}
