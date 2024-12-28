package com.pchousebd.pages;

import org.openqa.selenium.By;

import com.pchousebd.testcases.Base;

public class CheckoutSuccessPage extends Base{

	By continueToHomePagePath = By.xpath("//div[@class='pull-right']//a");
	
	public void clickContinue() {
		getDriver().findElement(continueToHomePagePath).click();
	}
}
