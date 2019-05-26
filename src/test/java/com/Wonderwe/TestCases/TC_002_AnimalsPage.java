package com.Wonderwe.TestCases;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Wonderwe.PageObjects.Animals;

public class TC_002_AnimalsPage extends BaseClass {
	
	@Test(priority=2)
	public void Animalsss() throws Exception
	{
		try {
			
			Animals animals=new Animals();
			Thread.sleep(10000);
			animals.Animal_page();
			
			String Act=driver.findElement(By.xpath("//div[@class='bigtext']/h1")).getText();
			if(Act.equals("Animalsss and Nature"))
			{
				Assert.assertTrue(true);
				System.out.println("Page Navigated Successfully");
			}
			
			else
			{
				throw new Exception("Page Navigation Error");
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
