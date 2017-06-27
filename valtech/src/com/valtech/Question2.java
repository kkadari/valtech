package com.valtech;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Question2 extends TestBase 
{
	@Test
	public void checkAboutPageNameInH1Tag()
	{
		Boolean testResult;
		
		testResult = homePage.gotoAboutPage().isPageNameinH1Tag("About");
		Assert.assertTrue(testResult, "About Page not Displayed in H1 Tag");
	}
	
	@Test
	public void checkServicesPageNameInH1Tag()
	{
		Boolean testResult;
		
		testResult = homePage.gotoServicesPage().isPageNameinH1Tag("Services");
		Assert.assertTrue(testResult, "Services Page not Displayed in H1 Tag");
	}
		
	@Test
	public void checkWorkPageNameInH1Tag()
	{
		Boolean testResult;
		testResult = homePage.gotoWorkPage().isPageNameinH1Tag("Work");
		Assert.assertTrue(testResult, "Work Page not Displayed in H1 Tag");
	}
}
