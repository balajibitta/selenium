package com.Scripts.Selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.TestNG.Selenium.ActionEngine;
import com.TestNG.Selenium.BaseEngine;
import com.selenium.propertyfiles.BaseEngineOne;

public class GmailTest extends BaseEngine {

	@Test

	public void gmailTest() {
		System.out.println("GmailTest");
		getDriver().get("https://www.gmail.com");
		getDriver().findElement(By.id("identifierId")).sendKeys("balu.bws@gmail.com");
		getDriver().findElement(By.id("identifierNext")).click();
		getDriver().findElement(By.name("password")).sendKeys("balu@111");
		getDriver().findElement(By.id("passwordNext")).click();
	}

}
