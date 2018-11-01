package com.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingWindowsTestDemo {

	public static void main(String[] args) throws InterruptedException {

		String cDir = System.getProperty("user.dir");
		System.out.println(cDir);
		System.setProperty("webdriver.chrome.driver", cDir+"\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS);
		
		driver.get("https://www.bing.com");
		//driver.get("https://www.bing.com/maps?FORM=Z9LH3");
		//driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
		//driver.findElement(By.id("sb_form_go")).click();
		
	
		WebElement maps = driver.findElement(By.linkText("Maps"));
		
		Actions actions = new Actions(driver);
		actions.contextClick(maps).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		
		String bing = driver.getWindowHandle();
	
		Set<String> windows = driver.getWindowHandles();
		
		List<String> list = new ArrayList<>(windows);
		
		String mapsWindow = list.get(1);
		driver.switchTo().window(mapsWindow);
		
			
		String secondWindow = driver.getWindowHandle();
			
		
		Thread.sleep(2000);
		driver.findElement(By.id("maps_sb")).sendKeys("srnagar");
		
		//driver.findElement(By.className("searchbox")).sendKeys("value labs llp");
			
		/*driver.findElement(By.className("directionsIcon")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'directionsPanelRoot\']/div/div[2]/div[2]/div/div/div[2]/div/div[1]/input")).sendKeys("srnagar");
		//driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("srnagar");	

		Thread.sleep(2000);*/
		
		//driver.findElement(By.xpath("//*[@id='maps_sb']")).sendKeys("srnagar");
		//driver.quit();
	}

}
