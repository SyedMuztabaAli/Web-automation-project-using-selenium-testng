package com.pchousebd.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegistrationTest extends Base{
	
    @Test
    public void registerWithValidCredential(){
    	
    	getDriver().findElement(By.xpath("//span[normalize-space()='Account']")).click();
    	getDriver().findElement(By.xpath("//a[normalize-space()='Continue']")).click();
    	getDriver().findElement(By.xpath("//input[@name='firstname']")).sendKeys("Khan");
    	getDriver().findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bahadur");
    	getDriver().findElement(By.xpath("//input[@name='email']")).sendKeys("khan1234@gmail.com");
    	getDriver().findElement(By.xpath("//input[@name='telephone']")).sendKeys("01345679012");
    	getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("12345");
    	getDriver().findElement(By.xpath("//input[@name='confirm']")).sendKeys("12345");
    	getDriver().findElement(By.xpath("//input[@name='newsletter'][@value='1']")).click();
    	getDriver().findElement(By.xpath("//input[@name='agree']")).click();
    	getDriver().findElement(By.xpath("//span[normalize-space()='Continue']")).click();
    	
    	
    }
    
    
    
}
