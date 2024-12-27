package com.pchousebd.testcases;


import org.testng.annotations.Test;

import com.pchousebd.pages.HomePage;

public class HoverToProcessorTest extends Base{
	HomePage homepage = new HomePage();
	
	@Test
	public void hoverToProcessorOptions() throws InterruptedException {
		homepage.hoverOnProcessor();
	}

}
