package org.practice.cloud;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.log4testng.Logger;

public class InitDriver {
	private WebDriver driver=null;
	private static InitDriver initialize=null;
	private static final Logger log =Logger.getLogger(InitDriver.class);
	
	public WebDriver getDriverInstance(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			log.info("please enter valid browser");
		}
		return driver;
	}
	
	private InitDriver(){
		
		
	}
	
	public  static InitDriver initializationDriver() {
		if(initialize==null)
			initialize = new InitDriver();
		else
			return initialize;
		
		return initialize;
	}

}
