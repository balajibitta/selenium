package com.selenium;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RealTimeTextDemo {

	public static void main(String[] args) throws IOException {
		
		String cDir = System.getProperty("user.dir");
		System.out.println(cDir);
		System.setProperty("webdriver.chrome.driver", cDir+ "\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(58, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com");
		WebElement electronics = driver.findElement(By.xpath("//*[text()='Electronics']"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(electronics).build().perform();
		String electronicsText = electronics.getText();
		
		File file = new File("D:\\Java and selenium programs\\selenium\\Flipkart.txt");
		boolean b = file.createNewFile();
		
		System.out.println(b);
		
		/*if (b) 
			System.out.println("File is Created");
		else
			System.out.println("File is not Created");*/
		
		FileWriter fileWriter = new FileWriter(file);
		BufferedWriter bwWriter = new BufferedWriter(fileWriter);
		
		bwWriter.write(electronicsText);
		bwWriter.flush();
		
		

	}

}
