package com.valtech;

import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class TestBase 
{
	protected WebDriver webDriver;
	protected HomePage homePage;
	protected Properties testConfig;
	
	@BeforeMethod
	public void beforeMethod() throws FileNotFoundException, IOException
	{
		testConfig = new Properties();
		testConfig.load(new FileInputStream("config.properties"));

		 webDriver = WebDriverHelper.createDriver(testConfig.getProperty("browser"));
		 webDriver.navigate().to(testConfig.getProperty("baseUrl"));

	  	homePage = new HomePage(webDriver);
		
	}
	

	
	@AfterMethod
	public void afterMethod()
	{
		WebDriverHelper.quitDriver(webDriver);
	}
	
	

}
