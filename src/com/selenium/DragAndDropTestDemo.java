package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTestDemo {

	public static void main(String[] args) throws InterruptedException {

		String cDir = System.getProperty("user.dir");
		System.out.println(cDir);
		System.setProperty("webdriver.chrome.driver", cDir+"\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS);
		
		driver.get("http://jqueryui.com");
		driver.findElement(By.linkText("Draggable")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement draggable = driver.findElement(By.id("draggable"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(draggable, 150, 150).build().perform();
		
		driver.switchTo().defaultContent(); // here we can go from frame to window by using this defaultContent() method.
		driver.findElement(By.linkText("Droppable")).click();
		
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(source, target).build().perform();
		
		

	}

}
