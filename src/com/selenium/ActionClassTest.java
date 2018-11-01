package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Java and selenium programs\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("selenium by ramesh");
		//driver.findElement(By.name("btnK")).click();
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		
		WebElement seleniumLink = driver.findElement(By.linkText("Selenium : Selenium WebDriver By Ramesh Anapati"));
		
		action.sendKeys(Keys.END).perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.HOME).perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.DOWN).perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.chord(Keys.CONTROL, "s")).perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.chord(Keys.CONTROL, Keys.SHIFT, "s")).perform();
	}

}
