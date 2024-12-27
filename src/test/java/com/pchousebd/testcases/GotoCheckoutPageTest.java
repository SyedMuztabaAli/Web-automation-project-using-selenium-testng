package com.pchousebd.testcases;

import org.testng.annotations.Test;

import com.pchousebd.pages.ShoppingCartPage;

public class GotoCheckoutPageTest extends Base{
	ShoppingCartPage shoppingcartpage = new ShoppingCartPage();
	@Test
	public void checkoutButtonClick() throws InterruptedException {
		shoppingcartpage.clickCheckOut();
		Thread.sleep(2000);
//		String actual = getDriver().findElement(By.xpath("//span[normalize-space()='Quick Checkout']")).getText();
//		System.out.println(actual);
//		String expected = "Quick Checkout";
//		
//		Assert.assertTrue(actual.contains(expected),"Not in the checkout page.");
		
		
	}
}
