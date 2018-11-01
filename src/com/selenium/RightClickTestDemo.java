package com.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

// In order to perform Right click operations in Actions class we have a method called "Context click" method.

public class RightClickTestDemo {

	public static void main(String[] args) throws InterruptedException {

		String cDir = System.getProperty("user.dir");
		System.out.println(cDir);
		System.setProperty("webdriver.chrome.driver", cDir+"\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		driver.findElement(By.id("lst-ib")).sendKeys("selenium by ramesh");
		driver.findElement(By.name("btnK")).click();
		
		//Actions actions = new Actions(driver);
		//actions.sendKeys(Keys.ENTER).build().perform();
		
		
		WebElement seleniumLink = driver.findElement(By.linkText("Selenium : Selenium WebDriver By Ramesh Anapati"));
		
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Selenium : Selenium WebDriver By Ramesh Anapati")).click();
		Actions actions = new Actions(driver);
		
		actions.contextClick(seleniumLink).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.CONTROL).sendKeys(Keys.RETURN).build().perform();
		
		String seleniumLinkText = driver.getWindowHandle();
		
		Set<String> windows = driver.getWindowHandles();
		
		List<String> list = new ArrayList<>(windows);
		
		String seleniumWindow = list.get(1);
		driver.switchTo().window(seleniumWindow);
	}

}
