package com.selenium;

import java.util.concurrent.TimeUnit;
                                          // In complete
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestNgTest {

	private static WebDriver driver;

	@Test
	@BeforeSuite
	public void OpenBrowser() throws InterruptedException {
		
		//WebDriver driver = new FirefoxDriver();
		
		driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		manageInit();
	
	}
	private void manageInit() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
	}
	
	@AfterSuite
	public static void closeBrowser() {
		
		if (driver!=null) 
			driver.close();
		else
			System.out.println("driver is pointing to null please check");
	}
	
	

}
