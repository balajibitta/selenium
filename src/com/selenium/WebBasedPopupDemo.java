package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebBasedPopupDemo {

	public static void main(String[] args) throws InterruptedException {
		
		String cDir = System.getProperty("user.dir");
		System.out.println(cDir);
		System.setProperty("webdriver.chrome.driver", cDir+ "\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("D:\\Java and selenium programs\\selenium\\prompt");
		driver.findElement(By.xpath("html/body/fieldset/button")).click();
		//driver.findElement(By.id("loginsubmit")).click();
	
		Alert alert = driver.switchTo().alert();
		String popupText = alert.getText();
		System.out.println("Popuptext is :" + popupText);
		alert.sendKeys("balaji");
		
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
	}

}
