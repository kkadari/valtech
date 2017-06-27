package com.valtech;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase 
{
	protected Properties testConfig;
	
	public HomePage(WebDriver driver) throws FileNotFoundException, IOException
	{
		super(driver);
		testConfig = new Properties();
		testConfig.load(new FileInputStream("config.properties"));
	}
	
	public boolean isLatestNewsDisplayed()
	{
		List<WebElement> wlist = driver.findElements(By.ByClassName.className("block-header__heading"));
		System.out.println(wlist.size());
		Iterator<WebElement> itr = wlist.iterator();

		while(itr.hasNext()) {
			String searchStr = itr.next().getText();
		    System.out.println(searchStr);
		    if(searchStr.equalsIgnoreCase("Latest News")) return true;
		    
		}
		return false;
		
	}
	
	public AboutPage gotoAboutPage()
	{
		driver.navigate().to(testConfig.getProperty("baseUrl") + testConfig.getProperty("aboutUri"));
		return new AboutPage(driver);
	}
	
	public ServicesPage gotoServicesPage()
	{
		driver.navigate().to(testConfig.getProperty("baseUrl") + testConfig.getProperty("servicesUri"));
		return new ServicesPage(driver);
	}
	
	public WorkPage gotoWorkPage()
	{
		driver.navigate().to(testConfig.getProperty("baseUrl") + testConfig.getProperty("workUri"));
		return new WorkPage(driver);
	}
	
	public ContactPage gotoContactPage()
	{
		driver.findElement(By.xpath("//*[@id='contacticon']")).click();
		return new ContactPage(driver);
	}
	
	
}
