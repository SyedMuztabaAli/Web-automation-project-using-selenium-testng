package com.pchousebd.testcases;

import org.testng.annotations.Test;

import com.pchousebd.pages.RegistrationPage;

public class RegistrationTest extends Base{
	
    @Test
    public void registerWithValidCredential() throws InterruptedException{
    	RegistrationPage registrationpage = new RegistrationPage();
    	
    	registrationpage.clickAccount();
    	registrationpage.continuePah();
    	registrationpage.inputFirstname("Lewis");
    	registrationpage.inputLastname("Hamilton");
    	registrationpage.inputEmail("lewishamilton@gmail.com");
    	registrationpage.inputTelephone("01594569321");
    	registrationpage.inputPassword("12345@g");
    	registrationpage.inputConfirmPassword("12345@g");
    	registrationpage.ClickNewsletter();
    	registrationpage.clickAgreePrivacy();
    	registrationpage.clickRegistrationConfirm();
    	registrationpage.clickContinuetoProfile();
    	
    	Thread.sleep(1000);
    	
    }
    
}
