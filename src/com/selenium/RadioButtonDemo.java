package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo {

	public static void main(String[] args) {


		String cDir = System.getProperty("user.dir");
		System.out.println(cDir);
		System.setProperty("webdriver.chrome.driver", cDir+ "\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(99, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		WebElement radio = driver.findElement(By.id("u_0_j"));
		
		if (radio.isDisplayed() && radio.isEnabled()) {
			radio.click();
		}
		else
			System.out.println("unable to click on radio button");
		
		if (radio.isSelected()) {
			System.out.println("radio button is selected");
		}
		else {radio.click();
			System.out.println("second time performing click operation");
		}
		
	}

}
