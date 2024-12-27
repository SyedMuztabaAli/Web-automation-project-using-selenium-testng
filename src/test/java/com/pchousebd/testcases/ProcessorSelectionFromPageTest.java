package com.pchousebd.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pchousebd.pages.IntelProcessorPage;

public class ProcessorSelectionFromPageTest extends Base {

	IntelProcessorPage intelprocessorpage = new IntelProcessorPage();
	@Test
	public void processorSelect() {
		intelprocessorpage.clickFirstProcessor();
		
		String actual = intelprocessorpage.actualMessage();
		
		String expected = intelprocessorpage.expectedMessage;
		Assert.assertTrue(actual.contains(expected),intelprocessorpage.warningMessage);
	}
}
