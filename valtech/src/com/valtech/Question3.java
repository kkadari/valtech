package com.valtech;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Question3 extends TestBase 
{
	@Test
	public void checkNumberOfOffices()
	{
		int officeCount;
		int expectedCount = 36;
		
		officeCount = homePage.gotoContactPage().noOfOffices();
		Assert.assertEquals(officeCount, expectedCount);
	}
}
