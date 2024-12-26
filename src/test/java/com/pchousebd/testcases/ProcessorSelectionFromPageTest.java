package com.pchousebd.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProcessorSelectionFromPageTest extends Base {

	
	@Test
	public void processorSelect() {
		getDriver().findElement(By.xpath("(//div[contains(@class,'name')])[1]")).click();
		
		String actual = getDriver().findElement(By.xpath("//li[@class='tab-1 active']//a")).getText();
		
		String expected = "Specification";
		Assert.assertTrue(actual.contains(expected),"Didn't select a processor");
	}
}
