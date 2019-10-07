package com.Magento.testcases;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_002_SytemCache extends BaseClass {
	
	@Test(priority = 2)
	public void cache_clear() throws InterruptedException, IOException
	{
		try {
			com.Magento.pageobjects.System sys=new com.Magento.pageobjects.System();
			sys.systemCache();
			Thread.sleep(1000);
			sys.cacheM();
			Thread.sleep(1000);
			sys.FlushCac();
			
			if(driver.findElement(By.xpath("//div[text()='The Magento cache4 storage has been flushed.']")).isDisplayed())
			{
				Assert.assertTrue(true);
				System.out.println("Successfully cache flushed");
			}
			else {
				throw new Exception("UnSuccessfully cache notflushed");
				
			}
			
		
			
		} catch (Exception e) {
			
			errorMsg=e.getMessage();
			timestamp=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
			capturescreen(driver,timestamp);
			System.out.println(e.getMessage());
			Assert.fail(e.getMessage());
			
		}
		
	}

}
