package com.pchousebd.testcases;

import org.testng.annotations.Test;

import com.pchousebd.pages.IntelProcessorSelectedPage;

public class ProcessorAddToCartTest extends Base{
	IntelProcessorSelectedPage intelprocessorpage = new IntelProcessorSelectedPage();
	@Test
	public void addTocartProcessor() throws InterruptedException {
		intelprocessorpage.clickCart();
	}
}
