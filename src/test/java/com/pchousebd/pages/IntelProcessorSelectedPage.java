package com.pchousebd.pages;

import org.openqa.selenium.By;

import com.pchousebd.testcases.Base;

public class IntelProcessorSelectedPage extends Base{
	
	By addToCart = By.xpath("//a[@id='button-cart']");
	
	public void clickCart() throws InterruptedException {
		Thread.sleep(1000);
		getDriver().findElement(addToCart).click();
		Thread.sleep(2000);
	}
	
	
}
