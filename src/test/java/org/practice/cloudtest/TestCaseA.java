package org.practice.cloudtest;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.practice.cloud.InitDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class TestCaseA {
	private WebDriver driver=null;
	private final static Logger log =Logger.getLogger(TestCaseA.class);
	@Parameters({"browser"})
	@BeforeClass
	public void driverSetup(String browserName) {
		InitDriver initiate = InitDriver.initializationDriver();
		driver = initiate.getDriverInstance(browserName);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4000));
		driver.get("https://google.com/");
		
	}
	
	@Test
	public void TestFirst()
	{
		log.info("Test1");
	}
	
	@Test
	public void TestSecond()
	{
		log.info("Test2");
	}
	
	@Test
	public void TestThird()
	{
		log.info("Test3");
	}
	
	@Test
	public void TestFail()
	{
		Assert.fail();
	}
	
	@AfterClass
	public void driverFree()
	{
		driver.quit();
	}

}
