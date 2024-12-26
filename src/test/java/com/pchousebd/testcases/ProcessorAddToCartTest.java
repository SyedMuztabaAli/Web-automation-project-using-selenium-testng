package com.pchousebd.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProcessorAddToCartTest extends Base{

	@Test
	public void addTocartProcessor() {
		getDriver().findElement(By.xpath("//a[@id='button-cart']")).click();
		String actual = getDriver().findElement(By.xpath("//span[normalize-space()='Shopping Cart']")).getText();
		String expected ="Shopping Cart";
		Assert.assertTrue(actual.contains(expected),"Not added to the cart.");
	}
}
