package com.selenium;

// Here we can perform How to Remove duplicates forom dropdowns in selenium webdriver 
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTestDemo {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Java and selenium programs\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");	
		WebElement day = driver.findElement(By.id("day"));

		Select select = new Select(day);
		
		List<WebElement> list = select.getOptions();
		System.out.println("No.of elements in a dropdown is : " +list.size());
		
		/*Set set = new HashSet();
		
		for (WebElement element : list) {
			
			set.add(element);
		}
		System.out.println("After removing duplicates : " +set.size());*/
		
		
		Set set = new HashSet(list);       //-------->Here Hashset() doesn't allow the duplicates
		System.out.println("After removing duplicates : " +set.size());
		
		/*Set set = new HashSet<>();
		set.addAll(list);
		System.out.println("After removing duplicates : " +set.size());*/
		
	}

}
