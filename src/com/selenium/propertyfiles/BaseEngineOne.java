package com.selenium.propertyfiles;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.selenium.utilities.ScreenShotUtility;

public class BaseEngineOne implements ScreenShotUtility{
	private static WebDriver driver;
	private static String curDir;
	private ExtentReports  extentReports;
	private static ExtentTest extentTest;
	@Parameters({"browser"})
	@BeforeSuite
	public void openBrowser(@Optional("firefox")String browser) {
		curDir = System.getProperty("user.dir");
		if (browser.equalsIgnoreCase("chrome")) {
			//driver.
			System.setProperty("webdriver.chrome.driver", curDir+"\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			manageInit();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", curDir+"\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			manageInit();
		}
		else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", curDir+"\\Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			manageInit();
		}
	}
	
	private void manageInit() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	}
	
	
	@AfterSuite
	public void closeBrowser() {
		if (driver!=null) 
		driver.close();
		else
			System.out.println("DRIVER IS POINTING TO NULL...PLZ CHECK");
	}
	
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	@BeforeMethod
	public void beforeTCExecution(Method method) {
		String tcName = method.getName();
		System.out.println("TC NAME IS: " + tcName);
		extentTest = extentReports.startTest(tcName);
	}
	
	@AfterMethod
	public void AFTERTCExecution(ITestResult result) throws IOException {
		String tcName = result.getName();
		if (result.getStatus()==result.FAILURE) 
		{
			ScreenShotUtility.screenShot(getDriver(), tcName, curDir);
			getExtentTestObj().log(LogStatus.FAIL, result.getThrowable());
		}
		else if (result.getStatus()==result.SKIP) 
		{
			ScreenShotUtility.screenShot(getDriver(), tcName, curDir);
			getExtentTestObj().log(LogStatus.SKIP, result.getThrowable());
		}
		//BaseEngine b = new BaseEngine();
		//b.screenShotOne(driver, tcName, curDir);
		extentReports.endTest(extentTest);
		extentReports.flush();
	}
	
	
	@BeforeTest
	public void initiateExtObj() {
		extentReports = new ExtentReports(curDir+"//reports//report.jpeg");
	}
	
	@AfterTest
	public void afterReport() {
		extentReports.close();
	}
	
	
	public static ExtentTest getExtentTestObj() {
		return extentTest;
	}
	
	public static String getDir()
	{
		return curDir;
	}

	
}
