package com.Scripts.Selenium;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.TestNG.Selenium.ActionEngine;
import com.relevantcodes.extentreports.LogStatus;
import com.selenium.supporters.ExcelReader;
import com.selenium.supporters.PropertiesReusables;
import com.selenium.utilities.AppVariables;
import com.selenium.utilities.LocMchValues;

public class LoginTest extends ActionEngine{
	@Test
public void login() throws IOException, EncryptedDocumentException, InvalidFormatException, InterruptedException {
		
		PropertiesReusables prConf = AppVariables.getOrObj(AppVariables.getConfFilePath());
		PropertiesReusables prOr = AppVariables.getOrObj(AppVariables.getOrFilePath());
		String gmail_url = prConf.getPropertyValue("gmail_url");
		getDriver().get(gmail_url);
		//getExtentTestObj().log(LogStatus.INFO, "URL is entered with as: " + gmail_url);
		
		ExcelReader excelReader = AppVariables.getExcelObj();
		
		enterData(LocMchValues.id, prOr.getPropertyValue("un_id"), excelReader.getSingleCellData("Sheet1", 0, 0));
		//getExtentTestObj().log(LogStatus.INFO, "Data Typing Action is done on USERNAME with testdata: " + excelReader.getSingleCellData("Sheet1", 0, 0));
		
		click(LocMchValues.id, prOr.getPropertyValue("next_id"));
		//getExtentTestObj().log(LogStatus.INFO, "clicked on NEXT button");
		
		//waitForTime(LocMchValues.name, prOr.getPropertyValue("pwd_name"));
		Thread.sleep(2000);
		enterData(LocMchValues.name, prOr.getPropertyValue("pwd_name"), excelReader.getSingleCellData("Sheet1", 0, 0));
		//getExtentTestObj().log(LogStatus.INFO, "Data Typing Action is done on PASSWORD with testdata: " + excelReader.getSingleCellData("Sheet1", 0, 1));
		
		click(LocMchValues.id, prOr.getPropertyValue("signin_id"));
		//getExtentTestObj().log(LogStatus.INFO, "clicked on SIGNIN button");
		
		
		
	}
}
