package com.pchousebd.testcases;

import org.testng.annotations.Test;

import com.pchousebd.pages.HomePage;

public class selectIntelTest extends Base{
	HomePage homepage = new HomePage();
	@Test
	public void selectIntel() throws InterruptedException {
		homepage.clickIntel();
	}
}
