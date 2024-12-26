package com.pchousebd.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends Base{
	
	@Test (priority = 0)
	public void homePageStartup() {
		getDriver().get("https://www.pchouse.com.bd/");
		String actual =  getDriver().getTitle();
		String expected = "Trusted Retail Computer Store In Bangladesh | PC House BD";
		
		Assert.assertTrue(actual.contains(expected),"Title doesn't match.");
	}

}
