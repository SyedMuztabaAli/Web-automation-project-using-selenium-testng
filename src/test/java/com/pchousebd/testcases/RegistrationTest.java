package com.pchousebd.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class RegistrationTest extends Base{
	
    @Test
    public void registerWithValidCredential(){
    	
    	getDriver().findElement(By.xpath("//span[normalize-space()='Account']")).click();
    	getDriver().findElement(By.xpath("//a[normalize-space()='Continue']")).click();
    	getDriver().findElement(By.xpath("//input[@name='firstname']")).sendKeys("Abdul");
    	getDriver().findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kalam");
    	getDriver().findElement(By.xpath("//input[@name='email']")).sendKeys("abdulkalam@gmail.com");
    	getDriver().findElement(By.xpath("//input[@name='telephone']")).sendKeys("01345679012");
    	getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("12345");
    	getDriver().findElement(By.xpath("//input[@name='confirm']")).sendKeys("12345");
    	getDriver().findElement(By.xpath("//input[@name='newsletter'][@value='1']")).click();
    	getDriver().findElement(By.xpath("//input[@name='agree']")).click();
    	getDriver().findElement(By.xpath("//span[normalize-space()='Continue']")).click();
    	
    	
    }
    
    
    
}
