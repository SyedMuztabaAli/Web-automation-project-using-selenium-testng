package com.pchousebd.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pchousebd.pages.HomePage;

public class HomePageTest extends Base{
	
	HomePage homepage= new HomePage();
	
	@Test (priority = 0)
	public void homePageStartup() {
		getDriver().get("https://www.pchouse.com.bd/");
		String actual =  getDriver().getTitle();
		String expected = homepage.homepageTitle;
		
		Assert.assertTrue(actual.contains(expected),homepage.warningMessage);
	}

}
