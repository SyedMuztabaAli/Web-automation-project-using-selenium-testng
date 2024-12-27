package com.pchousebd.testcases;

import org.testng.annotations.Test;

import com.pchousebd.pages.QuickCheckoutPage;

public class QuickChekoutTest extends Base{
	QuickCheckoutPage quickcheckoutpage = new QuickCheckoutPage();
	@Test
	public void checkout() throws InterruptedException {
		try {
			
			quickcheckoutpage.inputName("Khan Bahadur");
			quickcheckoutpage.inputAddress("Uttara,Sector-6");
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		quickcheckoutpage.clickCheckBox();
		
		Thread.sleep(500);
		
		quickcheckoutpage.clickConfirm();
		Thread.sleep(10000);
		
		
	}

}
