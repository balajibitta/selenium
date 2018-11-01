package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsClassDemo {

	public static void main(String[] args) throws InterruptedException {


		String cDir = System.getProperty("user.dir");
		System.out.println(cDir);
		System.setProperty("webdriver.chrome.driver", cDir+ "\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(99, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		
		Actions actions = new Actions(driver);
		
		WebElement useranme = driver.findElement(By.id("identifierId"));
		actions.sendKeys("bittabalaji@gmail.com").build().perform();
		
		WebElement next = driver.findElement(By.id("identifierNext"));
		actions.click(next).build().perform();
		
		/*WebDriverWait wait = new WebDriverWait(driver, 56);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("password")))).sendKeys("11223344");*/
		
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.name("password"));
		actions.sendKeys("11223344").build().perform();
		
		WebElement signIn = driver.findElement(By.id("passwordNext"));
		actions.click(signIn).build().perform();
	}

}
