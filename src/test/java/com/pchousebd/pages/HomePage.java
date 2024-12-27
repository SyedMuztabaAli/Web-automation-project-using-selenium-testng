package com.pchousebd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.pchousebd.testcases.Base;

public class HomePage extends Base {
	
	
	public String homepageTitle = "Trusted Retail Computer Store In Bangladesh | PC House BD";
	public String warningMessage = "Title doesn't match.";
	public String expectedMessage = "Featured Categories";
	
	By titlePath = By.xpath("//img[@title='PC House']");
	By componentPath = By.xpath("//span[normalize-space()='Components']");
	By processorPath = By.xpath("//span[normalize-space()='Processor']");
	By actualMessagePath = By.xpath("//div[normalize-space()='Featured Categories']");
	By intelPath = By.xpath("//li[@class='menu-item menu-item-c156']//a");
	
	public void clickTitle() {
		getDriver().findElement(titlePath).click();
	}
	
	public void hoverOnComponent() throws InterruptedException {
		
		Actions action = new Actions(getDriver());
		action.moveToElement(getDriver().findElement(componentPath)).perform();
		Thread.sleep(500);
		
	}
	
	public void hoverOnProcessor() throws InterruptedException {
		Actions action = new Actions(getDriver());
		action.moveToElement(getDriver().findElement(processorPath)).perform();
		Thread.sleep(500);
		
	}
	
	public void clickIntel() throws InterruptedException {
		getDriver().findElement(intelPath).click();
		Thread.sleep(1000);
	}
	
	public String actualMessage() {
		return getDriver().findElement(actualMessagePath).getText();
	}
	
			
}
