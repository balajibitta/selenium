package com.selenium;

// Here we can perform Single select dropdown

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownsTest {

	public static void main(String[] args) {
		
		/*String cDir = System.getProperty("user.dir");
		System.out.println(cDir);
		System.setProperty("webdriver.chrome.driver", cDir+ "\\chromedriver\\chromedriver.exe");*/
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(56, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
		WebElement day = driver.findElement(By.id("day"));
		
			Select select = new Select(day);
			
			if (select.isMultiple()) {
				
				System.out.println("It is a MultiSelect Dropdown");

			}
				
		else
			System.out.println("It is not a MultiSelect Dropdown");
			
			select.selectByIndex(17);
			select.selectByValue("7");
			select.selectByVisibleText("9");
			
			List<WebElement> dropdowns = select.getOptions();
			int lastIndex = dropdowns.size()-1;
			WebElement lastElement = dropdowns.get(lastIndex);
			lastElement.click();
			
			System.out.println("Last element is : " +lastIndex);
				
			WebElement firstElement = select.getFirstSelectedOption();
			System.out.println("First selected Element is : " +firstElement.getText());
			
			List<WebElement> elements = select.getOptions();
			System.out.println("No.of elements in a dropdown is : " +elements.size());
			
			List<WebElement> elements2 = select.getAllSelectedOptions();
			System.out.println("No.of selected options in a dropdown is : " +elements2.size());
			
			driver.quit();
	}

}
