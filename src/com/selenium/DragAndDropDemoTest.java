package com.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemoTest {

	public static void main(String[] args) throws InterruptedException {
		
		/*String cDir = System.getProperty("user.dir");
		System.out.println(cDir);
		System.setProperty("webdriver.chrome.driver", cDir+"\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		
		WebDriver  driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS);
		
		driver.get("https://www.jqueryui.com");
		driver.findElement(By.linkText("Autocomplete")).click();
		
		Thread.sleep(2000);
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		//List<WebElement> iframe = new ArrayList<WebElement>();
		
		//driver.findElement(By.tagName("iframe "));
		System.out.println("No.of frames are : " +frames.size());
		
		
		int count = 0;
		
		for (WebElement frame : frames) {
			count++;
			System.out.println("id is : " +frame.getAttribute("id"));
			System.out.println("name is : " +frame.getAttribute("name"));
			System.out.println("classname is : " +frame.getAttribute("className"));
			System.out.println("src is : " +frame.getAttribute("src"));
			
			if (count==5) {
				break;
			}
		}
		//Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("tags")).sendKeys("java");
		
		// Here we can perform drag operation
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Draggable")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement draggable = driver.findElement(By.id("draggable"));
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(draggable, 150, 150).build().perform();
		
		//Here we can perform drag and drop operation
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Droppable")).click();
		
		driver.switchTo().frame(0);
		WebElement draggableOne = driver.findElement(By.id("draggable"));
		WebElement droppableOne = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(draggableOne, droppableOne).build().perform();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("API Documentation")).click();
	}

}
