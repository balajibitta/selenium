package com.selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// wendriver wait class

public class GmailTest {

	public static void main(String[] args) throws InterruptedException {
		
		String cDir = System.getProperty("user.dir");
		System.out.println(cDir);
		System.setProperty("webdriver.chrome.driver", cDir+ "\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(99, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		
		String title = driver.getTitle();
		System.out.println("Title is : " +title);
		
		String curUrl = driver.getCurrentUrl();
		System.out.println("The Current URL is : " +curUrl);
		
		/*String pageSource = driver.getPageSource();
		System.out.println("Source code of the page is : " +pageSource);*/
		
		Set<String> windowNames = driver.getWindowHandles();
		System.out.println("window names are : " +windowNames);
		
		WebElement username = driver.findElement(By.id("identifierId"));
		username.clear();
		username.sendKeys("bittabalaji@gmail.com");
		
		//WebDriverWait wait = new WebDriverWait(driver, 56);
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("identifierId"))));
		
		/*WebElement next = driver.findElement(By.id("identifierNext"));
		next.click();*/
		
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(2000);
		
		/*WebElement password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("12345678");*/
		
		driver.findElement(By.name("password")).sendKeys("12345678");
		
		/*WebElement signIn = driver.findElement(By.id("passwordNext"));
		signIn.click();*/
		
		driver.findElement(By.id("passwordNext")).click();
		
		//driver.quit();
	}

}
