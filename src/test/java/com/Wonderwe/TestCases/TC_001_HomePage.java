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
		
		
		if(act.equals("WonderWe: Free1 Online Fundraising - Raise Money for a Cause"))
		{
			Assert.assertTrue(true);
			System.out.println("Title Matched");
		}
		else
		{
			try {
				
				timestamp=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
				capturescreen(driver,timestamp);
				
			} catch (Exception e) {
				errorMsg=e.getMessage();
				
			}
			Assert.assertTrue(false);
			System.out.println("Title not matched");
			

		}
		page.Popup();
		//log.info("Browser Maximized");
		
	}

}
