package com.Scripts.Selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.TestNG.Selenium.ActionEngine;
import com.relevantcodes.extentreports.LogStatus;
import com.selenium.supporters.PropertiesReusables;

// Here we can write GmailTest case without utilities(AppVariables, LOcMechValues)

public class GmailTestDemo extends ActionEngine {

	@Test
	public void gmailTest() throws IOException, InterruptedException {
		
		PropertiesReusables prConf = new PropertiesReusables("D:\\Java and selenium programs\\selenium\\src\\com\\selenium\\propertyfiles\\Config.properties");
		String url = prConf.getPropertyValue("gmail_url");
		getDriver().get(url);
		//System.out.println("URL entered as : " +url);
		getExtentTestObj().log(LogStatus.INFO, "URL entered as : " +url);
		
		Thread.sleep(2000);
		PropertiesReusables prOr = new PropertiesReusables("D:\\Java and selenium programs\\selenium\\src\\com\\selenium\\propertyfiles\\OR.properties");
		String un_id = prOr.getPropertyValue("un_id");
		String next_xpath = prOr.getPropertyValue("next_xpath");
		
		getDriver().findElement(By.id(un_id)).sendKeys("balu.bws@gmail.com");
		//System.out.println("UserName entered as : " +un_id);
		getExtentTestObj().log(LogStatus.INFO, "UserName entered as : " +un_id);

		getDriver().findElement(By.xpath(next_xpath)).click();
		//System.out.println("Clicked on next button");
		getExtentTestObj().log(LogStatus.INFO, "Clicked on next button");



	}
}
