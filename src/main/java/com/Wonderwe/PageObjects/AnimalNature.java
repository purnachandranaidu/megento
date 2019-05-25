package com.Wonderwe.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnimalNature {

	public WebDriver ldriver;

	public AnimalNature(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(xpath ="//div[text()[normalize-space()='Animals & Nature']]")WebElement Animals;
	

	public void Popup1() {
		try {
			System.out.println(Animals);
			Animals.click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
