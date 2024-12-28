package com.pchousebd.pages;

import org.openqa.selenium.By;

import com.pchousebd.testcases.Base;

public class RegistrationPage extends Base{

	By accountPath = By.xpath("//span[normalize-space()='Account']");
	By continuePath = By.xpath("//a[normalize-space()='Continue']");
	By firstNamePath = By.xpath("//input[@name='firstname']");
	By lastNamePath = By.xpath("//input[@name='lastname']");
	By emailPath = By.xpath("//input[@name='email']");
	By telephonePath = By.xpath("//input[@name='telephone']");
	By passwordPath = By.xpath("//input[@name='password']");
	By confirmPasswordPath = By.xpath("//input[@name='confirm']");
	By newsletterPath = By.xpath("//input[@name='newsletter'][@value='1']");
	By agreePath = By.xpath("//input[@name='agree']");
	By registrationConfirmPath = By.xpath("//span[normalize-space()='Continue']");
	By continuetoProfile = By.xpath("//div[@class='pull-right']//a");
	
	public void clickAccount() {
		getDriver().findElement(accountPath).click();
	}
	public void continuePah() {
		getDriver().findElement(continuePath).click();
	}
	
	public void inputFirstname(String firstname) {
		getDriver().findElement(firstNamePath).sendKeys(firstname);
	}
	
	public void inputLastname(String lastname) {
		getDriver().findElement(lastNamePath).sendKeys(lastname);
	}
	
	public void inputEmail(String email) {
		getDriver().findElement(emailPath).sendKeys(email);
	}
	public void inputTelephone(String telephone) {
		getDriver().findElement(telephonePath).sendKeys(telephone);
	}
	
	public void inputPassword(String password) {
		getDriver().findElement(passwordPath).sendKeys(password);
	}
	
	public void inputConfirmPassword(String cpassword) {
		getDriver().findElement(confirmPasswordPath).sendKeys(cpassword);
	}
	
	public void ClickNewsletter() {
		getDriver().findElement(newsletterPath).click();
	}
	
	public void clickAgreePrivacy() {
		getDriver().findElement(agreePath).click();
	}
	
	public void clickRegistrationConfirm() {
		getDriver().findElement(registrationConfirmPath).click();
	}
	
	
	public void clickContinuetoProfile() {
		getDriver().findElement(continuetoProfile).click();
	}
	
	
}


