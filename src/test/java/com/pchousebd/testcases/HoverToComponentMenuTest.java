package com.pchousebd.testcases;


import org.testng.annotations.Test;

import com.pchousebd.pages.HomePage;

public class HoverToComponentMenuTest extends Base{
	HomePage homepage = new HomePage();

	@Test
	public void hoverToComponentDropOptions() throws InterruptedException {
		
//		Actions action = new Actions(getDriver());
//		WebElement element = getDriver().findElement(By.xpath("//span[normalize-space()='Components']"));
//		action.moveToElement(element).perform();
//		
//		Thread.sleep(1000);
		
		homepage.hoverOnComponent();
	}
}
