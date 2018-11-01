package com.TestNG.Selenium;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;

public class BaseEngine {

	private static String cDir;
	private static WebDriver driver;
	private static String curDir;
	
    @org.testng.annotations.Parameters({"browser"})
	@BeforeSuite
	public void openBrowser(@Optional("firefox")String browser) {
		cDir = System.getProperty("user.dir");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", cDir+ "\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			manageInit();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			manageInit();
		}
		else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", cDir+ "\\Drivers\\IEDriverServer.exe");
			manageInit();
		}
		
	}
	private void manageInit() {
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public void closeBrowser() throws InterruptedException {
		if (driver!=null) {
			Thread.sleep(3000);
			driver.close();
		}
		else
			System.out.println("driver is pointing to null : please check");
	}
	
	public static WebDriver getDriver() {
		return driver;
		
	}
	
	@BeforeMethod
	public void beforeTcExecution(Method method) {
		String tcName = method.getName();
		System.out.println("TC NAME IS : " +tcName);
	}
	
	@AfterMethod
	public void afterTcExecution(ITestResult result) throws IOException {
		String tcName = result.getName();
		if (result.getStatus()==result.FAILURE) {
			TakesScreenshot t = (TakesScreenshot)getDriver();
			File file = t.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File(cDir+"\\failurescreenshots\\"+tcName+".jpeg"));
		}
		else if (result.getStatus()==result.SKIP) {
			TakesScreenshot t = (TakesScreenshot)getDriver();
			File file = t.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File(cDir+"\\failurescreenshots\\"+tcName+".jpeg"));
		}
	}
	
	public static String getDir() {
		return curDir;
	}
}
