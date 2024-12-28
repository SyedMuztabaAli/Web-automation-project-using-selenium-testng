package com.pchousebd.testcases;

import org.testng.annotations.Test;

import com.pchousebd.pages.CheckoutSuccessPage;

public class CheckoutSuccessTest extends Base{

	CheckoutSuccessPage checkoutsuccesspage = new CheckoutSuccessPage();
	
	@Test
	public void checkoutSuccess() throws InterruptedException {
		Thread.sleep(2000);
		checkoutsuccesspage.clickContinue(); 
		Thread.sleep(2000);
		
	}
	
	
	
}
