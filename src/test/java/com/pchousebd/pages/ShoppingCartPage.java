package com.pchousebd.pages;

import org.openqa.selenium.By;

import com.pchousebd.testcases.Base;

public class ShoppingCartPage extends Base{
	By checkoutPath = By.xpath("//a[@class='btn btn-primary']//span[contains(text(),'Checkout')]");
	
	public void clickCheckOut() throws InterruptedException {
		getDriver().findElement(checkoutPath).click();
	}
}
