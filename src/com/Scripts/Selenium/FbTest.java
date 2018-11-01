package com.Scripts.Selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.TestNG.Selenium.ActionEngine;
import com.TestNG.Selenium.BaseEngine;
import com.selenium.propertyfiles.BaseEngineOne;

public class FbTest extends BaseEngine {

	@Test
	public void faceBookTest () {
		System.out.println("FacebookTest");
		getDriver().get("https://www.facebook.com");
		getDriver().findElement(By.id("email")).sendKeys("balajibfour@gmail.com");
		getDriver().findElement(By.name("pass")).sendKeys("123456");
		getDriver().findElement(By.id("loginbutton")).click();
	}
}
