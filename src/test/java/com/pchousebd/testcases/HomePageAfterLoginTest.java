package com.pchousebd.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pchousebd.pages.HomePage;

public class HomePageAfterLoginTest extends Base {
	HomePage homepage = new HomePage();
	@Test
	public void returnToHomePage() {
		//getDriver().findElement(By.xpath("//img[@title='PC House']")).click();
		
		homepage.clickTitle();
		
		String actual = homepage.actualMessage();
		Assert.assertTrue(actual.contains(homepage.expectedMessage));
		
	}

}
