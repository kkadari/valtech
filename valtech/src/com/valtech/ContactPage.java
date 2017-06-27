package com.valtech;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage extends PageBase 
{
	
	public ContactPage(WebDriver driver)
	{
		super(driver);
	}

	public int noOfOffices()
	{

		List<WebElement> alist = driver.findElements(By.xpath("//ul[contains(@class,'contactcities')]/li"));
		System.out.println(alist.size());
		return alist.size();
		
	}
}
