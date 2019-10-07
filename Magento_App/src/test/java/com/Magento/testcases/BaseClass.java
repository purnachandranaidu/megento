package com.Magento.testcases;


import java.io.File;
import java.io.IOException;

import org.automationtesting.excelreport.Xl;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Magento.utilities.ReadConfig;

public class BaseClass {
	
	public static WebDriver driver;
	public static String timestamp;
	public static String errorMsg;
	public static String testMethodName;
	
	ReadConfig readconfig=new ReadConfig();
	public String url=readconfig.getApplicationurl();
	public String username=readconfig.username();
	public String password=readconfig.password();
	public String chrome=readconfig.getchromepath();
	public String fire=readconfig.getfirepath();
	public String edge=readconfig.getedgepath();
	
	
	
	@BeforeSuite
	public void setUp()
	{
		
		System.setProperty("webdriver.chrome.driver", readconfig.getchromepath());
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("login")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class='action-login action-primary']")).click();
	}
	
	

	@AfterSuite()
	public void tearDown() throws Exception
	{
		Xl.generateReport("Xl-Report.xlsx");
		/* driver.close(); */
	}
	
	public void capturescreen(WebDriver driver, String tname) throws IOException
	{
		timestamp=tname;
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir") + "/Screenshots/"+ timestamp + ".png");
		FileHandler.copy(source, target);
		System.out.println("screenshot taken");
		
	}

}
