package com.pchousebd.pages;

import org.openqa.selenium.By;

import com.pchousebd.testcases.Base;

public class IntelProcessorPage extends Base{
	
	public String expectedMessage = "Specification";
	public String warningMessage = "Didn't select a processor";
	By firstProcessorPath = By.xpath("(//div[contains(@class,'name')])[1]");
	By actualMessagePath = By.xpath("//li[@class='tab-1 active']//a");
	
	public void clickFirstProcessor() {
		getDriver().findElement(firstProcessorPath).click();
		
	}
	
	public String actualMessage() {
		return getDriver().findElement(actualMessagePath).getText();
	}
	
}
