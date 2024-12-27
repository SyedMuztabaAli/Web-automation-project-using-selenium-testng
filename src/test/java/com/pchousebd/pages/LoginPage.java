package com.pchousebd.pages;

import org.openqa.selenium.By;

import com.pchousebd.testcases.Base;

public class LoginPage extends Base{
	
	public String expectedMessage = "My Account";
	public String warningMessage = "Not Logged In.";
	
	By account = By.xpath("//span[normalize-space()='Account']");
	By emailField = By.xpath("//input[@name='email']");
	By passwordField = By.xpath("//input[@name='password']");
	By submitButton = By.xpath("//button[@type='submit']");
	By actual = By.xpath("//span[normalize-space()='My Account']");
	
	public void clickAccount() {
		getDriver().findElement(account).click();
	}
	public void inputEmail(String email) {
		getDriver().findElement(emailField).sendKeys(email);
	}
	
	public void inputPassword(String password) {
		getDriver().findElement(passwordField).sendKeys(password);
	}
	
	public void clickSubmit() {
		getDriver().findElement(submitButton).click();
	}
	
	public String actualMessage() {
		return getDriver().findElement(actual).getText();
	}
	
}
