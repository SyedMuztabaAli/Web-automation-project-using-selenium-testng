package com.pchousebd.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	private static String browsername = System.getProperty("browser", "chrome");
	private static final ThreadLocal<WebDriver> DRIVER_LOCAL = new ThreadLocal();
	public static WebDriver getDriver() {
		return DRIVER_LOCAL.get();
	}

	public static void setDriver(WebDriver driver) {

		Base.DRIVER_LOCAL.set(driver);
	}
	
	
	
	public static WebDriver getBrowser(String browserName) {
		if(browserName=="chrome") {
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver();
		}
		else if(browserName == "firefox") {
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver();
		}
		else if(browserName =="edge") {
			WebDriverManager.edgedriver().setup();
			return new EdgeDriver();
		}
		else {
			throw new RuntimeException("Browser not found");
		}
		
	}
	
	@BeforeSuite
	public static synchronized void setBrowser() {
		WebDriver webdriver = getBrowser(browsername);
		webdriver.manage().window().maximize();
		setDriver(webdriver);
	}

	@AfterSuite
	public static synchronized void quitBrowser() {
		getDriver().quit();

	}
}