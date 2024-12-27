package com.pchousebd.pages;

import org.openqa.selenium.By;

import com.pchousebd.testcases.Base;

public class QuickCheckoutPage extends Base{

	By billingAddressName = By.xpath("//input[@name='firstname']");
	By billingAddress = By.xpath("//input[@name='address_1']");
	By checkboxPath = By.xpath("//div[@class='checkbox']//input");
	//By checkboxPath = By.xpath("//label[contains(text(),'I have read and agree to the ')]");
	By confirmButtonPath = By.xpath("//button[@id='quick-checkout-button-confirm']");
	
	public void inputName(String name) {
		getDriver().findElement(billingAddressName).sendKeys(name);
	}
	
	public void inputAddress(String address) {
		getDriver().findElement(billingAddress).sendKeys(address);
	}
	
	public void clickCheckBox() {
		getDriver().findElement(checkboxPath).click();
	}
	
	public void clickConfirm() {
		getDriver().findElement(confirmButtonPath).click();
	}
}
