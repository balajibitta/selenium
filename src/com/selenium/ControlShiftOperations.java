package com.selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ControlShiftOperations {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		Actions actions = new Actions(driver);
		
		actions.sendKeys(Keys.chord(Keys.CONTROL,"t")).build().perform();
		Thread.sleep(3000);
		
		actions.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,"s")).build().perform();
		Thread.sleep(3000);
		
		actions.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,"a")).build().perform();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
