package org.practice.cloudtest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.practice.cloud.InitDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCaseA {
	private WebDriver driver=null;
	
	@Parameters({"browser"})
	@BeforeClass
	public void driverSetup(String browserName) {
		driver = InitDriver.createBrowserInstance(browserName);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4000));
		driver.get("https://google.com/");
		
	}
	
	@Test
	public void TestFirst()
	{
		System.out.println("Test1");
	}
	
	@Test
	public void TestSecond()
	{
		System.out.println("Test2");
	}
	
	
	@AfterClass
	public void driverFree()
	{
		driver.quit();
	}

}
