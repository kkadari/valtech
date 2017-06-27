package com.valtech;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StageBase extends PageBase 
{
	public StageBase(WebDriver driver)
	{
		super(driver);
	}
	
	
	public boolean isPageNameinH1Tag(String pageheader)
	{
		//List<WebElement> alist = driver.findElements(By.xpath("//div[contains(@class,'page-header')]/h1"));
		List<WebElement> alist = driver.findElements(By.cssSelector("h1"));
		System.out.println(alist.size());
		Iterator<WebElement> itr1 = alist.iterator();
		while(itr1.hasNext()) {
		    String searchStr = itr1.next().getText();
		    System.out.println(searchStr);
		    if(searchStr.equalsIgnoreCase(pageheader)) return true;
		    
		}
		return false;
		
	}
}
