package com.pchousebd.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends Base{
	
	@Test
	public void loginWithValidCredential() {
		getDriver().findElement(By.xpath("//span[normalize-space()='Account']")).click();
		getDriver().findElement(By.xpath("//input[@name='email']")).sendKeys("abdulkalam@gmail.com");
		getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("12345");
		getDriver().findElement(By.xpath("//button[@type='submit']")).click();
		
		String actual = getDriver().findElement(By.xpath("//span[normalize-space()='My Account']")).getText();
		
		Assert.assertTrue(actual.contains("My Account"),"Not Logged In.");
	}
}
