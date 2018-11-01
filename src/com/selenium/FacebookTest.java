package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookTest {

	public static void main(String[] args) throws InterruptedException {


		String cDir = System.getProperty("user.dir");
		System.out.println(cDir);
		System.setProperty("webdriver.chrome.driver", cDir+ "\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(99, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("balajibfour@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("123456");
		
		//driver.findElement(By.id("loginbutton")).click();

		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).build().perform();
		
		
	}

}
