package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

	public static void main(String[] args) throws InterruptedException {
		
		String cDir = System.getProperty("user.dir");
		System.out.println(cDir);
		System.setProperty("webdriver.chrome.driver", cDir+ "\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		
		String title = driver.getTitle();
		System.out.println("Title is : " +title);
		
		String cururl = driver.getCurrentUrl();
		System.out.println("CURRENT URL is : " +cururl);
		
		WebElement username = driver.findElement(By.id("identifierId"));
		username.clear();
		username.sendKeys("bittabalaji@gmail.com");
		
		//driver.findElement(By.id("identifierId")).sendKeys("bittabalaji@gmail.com");
		
		WebElement next = driver.findElement(By.id("identifierNext"));
		next.click();
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("venkateswara");
		
		WebElement signIn = driver.findElement(By.id("passwordNext"));
		signIn.click();
		
		//driver.quit();

	}

}
