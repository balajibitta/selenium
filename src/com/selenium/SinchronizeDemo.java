package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SinchronizeDemo {

	public static void main(String[] args) throws InterruptedException {

		String cDir = System.getProperty("user.dir");
		System.out.println(cDir);
		System.setProperty("webdriver.chrome.driver", cDir+ "\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(56, TimeUnit.SECONDS);
		
		driver.get("https://www.gmail.com");
		
		//driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("bittabalaji@gmail.com");
		
		driver.findElement(By.id("identifierNext")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 56);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("password")))).sendKeys("1223344");
		
		//driver.findElement(By.name("password")).clear();
		driver.findElement(By.id("passwordNext")).click();
		
		Thread.sleep(2000);
		driver.quit();
		

	}

}
