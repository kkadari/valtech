package com.valtech;

import org.openqa.selenium.WebDriver;

public class PageBase {
	
	protected WebDriver driver;
	
	public PageBase(WebDriver driver)
	{
		this.driver = driver;
	}

}
