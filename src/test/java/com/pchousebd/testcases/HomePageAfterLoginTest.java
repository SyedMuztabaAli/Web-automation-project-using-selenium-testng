package com.pchousebd.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageAfterLoginTest extends Base {
	
	@Test
	public void returnToHomePage() {
		getDriver().findElement(By.xpath("//img[@title='PC House']")).click();
		
		String actual = getDriver().findElement(By.xpath("//div[normalize-space()='Featured Categories']")).getText();
		String expected = "Featured Categories";
		Assert.assertTrue(actual.contains(expected));
		
	}

}
