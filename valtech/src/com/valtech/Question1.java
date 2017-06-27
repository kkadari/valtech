package com.valtech;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Question1 extends TestBase{
	
	@Test
	public void checkLatestNewsDisplayed()
	{
		Boolean testResult;
		
		testResult = homePage.isLatestNewsDisplayed();
		Assert.assertTrue(testResult, "Latest News not Displayed on Home page");
	}

}
