package com.selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksTestDemo {

	public static void main(String[] args) throws InterruptedException {

		int enabledLinks = 0;
		int disabledLinks = 0;
		
		/*String cDir = System.getProperty("user.dir");
		System.out.println(cDir);
		System.setProperty("webdriver.gecko.driver", cDir+ "\\geckodriver\\geckodriver.exe");*/
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("selenium by ramesh");
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.linkText("Selenium : Selenium WebDriver By Ramesh Anapati")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		/*for (WebElement element : links) {
			System.out.println(element.getAttribute("href")); // In this "href" it will get all links and print on the console.
		}*/
		
		int totalLinks = links.size();
		System.out.println("Total no.of links are : " +totalLinks);
		
		/*Iterator itr = links.iterator();
		
		while (itr.hasNext()) {
			WebElement link = (WebElement) itr.next();
			
			if (link.isDisplayed() && link.isEnabled()) {
				enabledLinks++;
			}
			else {
				disabledLinks++;
			}
			System.out.println("Enabled links are : " +enabledLinks);
			System.out.println("Disabled links are : " +disabledLinks);
		}*/
		
		// iterate by using foreach loop.
		
		for (WebElement link : links) {
			
			if (link.isDisplayed() && link.isEnabled()) {
				enabledLinks++;
			}
			else {
				disabledLinks++;
			}
			System.out.println("Enabled links are : " +enabledLinks);
			System.out.println("Disabled links are : " +disabledLinks);
		}
		
		int total = enabledLinks + disabledLinks;
		
		if (total==totalLinks) {
			System.out.println("count is matched");
		}
		else {
			System.out.println("count is not matched");
		}
						
		Thread.sleep(2000);
		driver.quit();
    }
}
		
	


