package com.Wonderwe.TestCases;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Wonderwe.PageObjects.AnimalNature;

public class TC_002_AnimalsFunds extends BaseClass {
	public WebDriver driver;
	
	
	@Test(priority=2)
	public void Animal_Nature() throws IOException
	{
		try {
			
			AnimalNature animals=new AnimalNature(driver);
			animals.Popup1();
			String Act=driver.findElement(By.xpath("//div[@class='bigtext']/h1")).getText();
			if(Act=="Animals and Nature")
			{
				Assert.assertTrue(true);
				System.out.println("Page Navigated Successfully");
			}
			
			else
			{
				throw new Exception("Page Not Navigated Properly");
			}
			
		} catch (Exception e) {
			errorMsg=e.getMessage();
			timestamp=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
			capturescreen(driver,timestamp);
			System.out.println(e.getMessage());
			//Assert.assertTrue(false);
			Assert.fail(e.getMessage());
			
			
		}
	}

}
