package com.Wonderwe.TestCases;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Wonderwe.PageObjects.HomePage;

public class TC_001_HomePage extends BaseClass {
	
	@Test
	public void Title() throws InterruptedException, IOException
	{
		HomePage page=new HomePage(driver);
		Thread.sleep(1000);
		String act=driver.getTitle();
		
		try {
			page.Popup();
			
			
			if(act.equals("WonderWe: Free1 Online Fundraising - Raise Money for a Cause"))
			{
				Assert.assertTrue(true);
				System.out.println("Title Matched");
			}
			
			else
			{
				timestamp=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
				capturescreen(driver,timestamp);
				System.out.println("Title MissMatched");
				Assert.fail();
						

			}	
			
		}	
			catch (Exception e) {
				
				errorMsg=e.getMessage();
				
				
				
			}
			
	}	
}
