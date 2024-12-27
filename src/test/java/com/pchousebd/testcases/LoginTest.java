package com.pchousebd.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pchousebd.pages.LoginPage;

public class LoginTest extends Base{
	LoginPage loginpage = new LoginPage();
	
	@Test
	public void loginWithValidCredential() {
		/*getDriver().findElement(By.xpath("//span[normalize-space()='Account']")).click();
		getDriver().findElement(By.xpath("//input[@name='email']")).sendKeys("khan1234@gmail.com");
		getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("12345");
		getDriver().findElement(By.xpath("//button[@type='submit']")).click();
		
		String actual = getDriver().findElement(By.xpath("//span[normalize-space()='My Account']")).getText();
		*/
		loginpage.clickAccount();
		loginpage.inputEmail("khan1234@gmail.com");
		loginpage.inputPassword("12345");
		loginpage.clickSubmit();
		
		String actual = loginpage.actualMessage();
		
		Assert.assertTrue(actual.contains(loginpage.expectedMessage),loginpage.warningMessage);
	}
}
