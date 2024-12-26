package com.pchousebd.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoverToProcessorTest extends Base{
	
	@Test
	public void hoverToProcessorOptions() throws InterruptedException {
		Actions action = new Actions(getDriver());
		
		WebElement element = getDriver().findElement(By.xpath("//span[normalize-space()='Processor']"));
		action.moveToElement(element).perform();
		Thread.sleep(1000);
	}

}
