package com.TestNG.Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.selenium.propertyfiles.BaseEngineOne;

public class ActionEngine extends BaseEngineOne{

	public static WebElement getElement(String locType,String locMech)
	{
		WebElement element = null;
		switch(locType)
		{
		case "id":
			element = getDriver().findElement(By.id(locMech));
			break;
		case "name":
			element = getDriver().findElement(By.name(locMech));
			break;
		case "css":
			element = getDriver().findElement(By.cssSelector(locMech));
			break;
		case "xpath":
			element = getDriver().findElement(By.xpath(locMech));
			break;
		case "class":
			element = getDriver().findElement(By.className(locMech));
			break;
		case "linkText":
			element = getDriver().findElement(By.linkText(locMech));
			break;
		case "partialLinkText":
			element = getDriver().findElement(By.partialLinkText(locMech));
			break;
		case "tagName":
			element = getDriver().findElement(By.tagName(locMech));
			break;
		}
		return element;
	}

	public static List<WebElement> getElements(String locType,String locMech)
	{
		List<WebElement> element = null;
		switch(locMech)
		{
		case "id":
			element = getDriver().findElements(By.id(locType));
			break;
		case "name":
			element = getDriver().findElements(By.name(locType));
			break;
		case "css":
			element = getDriver().findElements(By.cssSelector(locType));
			break;
		case "xpath":
			element = getDriver().findElements(By.xpath(locType));
			break;
		case "class":
			element = getDriver().findElements(By.className(locType));
			break;
		case "linkText":
			element = getDriver().findElements(By.linkText(locType));
			break;
		case "partialLinkText":
			element = getDriver().findElements(By.partialLinkText(locType));
			break;
		case "tagName":
			element = getDriver().findElements(By.tagName(locType));
			break;
		}
		return element;
	}
	
public static void click(String locType,String locMech) {
	WebElement element = getElement(locType, locMech);
	if (element.isDisplayed()&&element.isEnabled())
		element.click();
	else
		System.out.println("ELEMENT IS NOT DISPLAYED");
}

	public static void enterData(String locType,String locMech,String testData) {
		WebElement element = getElement(locType, locMech);
		if (element.isDisplayed()&&element.isEnabled()) {
			element.clear();
			element.sendKeys(testData);
		}
		else
			System.out.println("ELEMENT IS NOT DISPLAYED");
	}
	
public static void mouseHover(String locType,String locMech) {
	WebElement element = getElement(locType, locMech);
	Actions actions = new Actions(getDriver());
if (element.isDisplayed()&&element.isEnabled()) 
	actions.moveToElement(element).build().perform();
else
	System.out.println("Element is not displayed");
}	
	
	
	public static void sendKeysEnter() {
		Actions actions = new Actions(getDriver());
		actions.sendKeys(Keys.ENTER).perform();
	}
	
	
	public static void rightClick(String locType,String locMech) {
		WebElement element = getElement(locType, locMech);
		Actions actions = new Actions(getDriver());
		if (element.isDisplayed()&&element.isEnabled())
			actions.contextClick(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).perform();
		else
			System.out.println("Element is not displayed");
	}
	
	public static void selectByValue(String locType,String locMech,String value) {
		WebElement element = getElement(locType, locMech);
		if (element.getTagName().equalsIgnoreCase("select")) {
			Select select = new Select(getElement(locType, locMech));
			select.selectByValue(value);
		}
		else
		{
			List<WebElement> elements = getElements(locType, locMech);
			elements.get(0).click();
		}
		
	}
	
	
	public static void switchBW2Windows() {
		String curWin = getDriver().getWindowHandle();
		Set<String> windows = getDriver().getWindowHandles();
		for(String window:windows)
		{
			if (!window.equalsIgnoreCase(curWin)) {
				getDriver().switchTo().window(window);
				break;
			}
		}
	}
	
	
	public static void switchMultiWindows(int index) {
		String curWin = getDriver().getWindowHandle();
		Set<String> windows = getDriver().getWindowHandles();
		List<String> listWindows = new ArrayList(windows);
		String windowName = listWindows.get(index);
		getDriver().switchTo().window(windowName);
	}
	
	public static boolean waitForTime(String locType,String locMech) {
		
		boolean flag = true;
		for(int i=0;i<45;i++)
		{
			try {
				Thread.sleep(2000);
				WebElement element = getElement(locType, locMech);
				if(element.isDisplayed()&&element.isEnabled())
				{
					flag = true;
					break;
				}
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				flag = false;
			}
		}
		return flag;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



















}
