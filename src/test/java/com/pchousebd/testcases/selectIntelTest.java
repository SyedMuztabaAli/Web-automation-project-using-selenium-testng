package com.pchousebd.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class selectIntelTest extends Base{

	@Test
	public void selectIntel() throws InterruptedException {
		getDriver().findElement(By.xpath("//li[@class='menu-item menu-item-c156']//a")).click();
		Thread.sleep(1000);
	}
}
