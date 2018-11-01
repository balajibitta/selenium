package com.selenium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDemoTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(99, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		//WebElement day = driver.findElement(By.id("day"));
		//Select select = new Select(day);
		
		Select select = new Select(driver.findElement(By.id("day")));
		select.selectByIndex(21);
		
		// Here we can get last element in a dropdown day.
		
		List<WebElement> dropdowns = select.getOptions();
		int lastIndex = dropdowns.size()-1;
		WebElement lastElement = dropdowns.get(lastIndex);
		lastElement.click();
		
		// Here we can perform remove the duplicate elements in a dropdown
		
		Set<WebElement> set = new HashSet<WebElement>(dropdowns);
		System.out.println("After removing the duplicates : " +set.size());
		
		//Set<WebElement> elements = new HashSet();
		List<WebElement> removeDup = new ArrayList<>();
		int totaldup = removeDup.size();
		System.out.println("total duplicate elements are : " +totaldup);
		
		for (WebElement webElement : dropdowns) {
			boolean b=set.add(webElement);
			
			if (b) {
				System.out.println("It is not aduplicate");
			}else
				System.out.println("It is a duplicate : " +webElement);
			removeDup.add(webElement);
		}
		
		System.out.println("removed duplicates are : " +removeDup.size());
		
		Thread.sleep(1000);
		driver.quit();
		
	}

}
