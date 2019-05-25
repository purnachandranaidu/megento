package com.Wonderwe.TestCases;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Wonderwe.PageObjects.HomePage;

public class TC_001_HomePage extends BaseClass {
	
	@Test(priority=1)
	public void Title() throws IOException 
	{
		
		try {
			HomePage page=new HomePage(driver);
			String act=driver.getTitle();
			Thread.sleep(1000);
			page.Popup();
			
			if(act.equals("WonderWe: Free Online Fundraising - Raise Money for a Cause"))
			{
				Assert.assertTrue(true);
				System.out.println("Title Matched");
			}
			
			else
			{
				throw new Exception("Title Mismatched");
				

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
