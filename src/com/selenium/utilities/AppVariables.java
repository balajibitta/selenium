package com.selenium.utilities;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.TestNG.Selenium.BaseEngine;
import com.selenium.propertyfiles.BaseEngineOne;
import com.selenium.supporters.ExcelReader;
import com.selenium.supporters.PropertiesReusables;

public class AppVariables 
{
private static String orFilePtah=BaseEngineOne.getDir()+"\\src\\com\\selenium\\propertyfiles\\OR.properties";
private static String confFilePtah=BaseEngineOne.getDir()+"\\Config.properties";
private static String excelFilePtah=BaseEngineOne.getDir()+"\\src\\com\\selenium\\propertyfiles\\TestData.xls";

public static String getOrFilePath()
{
	return orFilePtah;
}

public static String getConfFilePath()
{
	return confFilePtah;
}
public static String getExcelFilePath()
{
	return excelFilePtah;
}

public static ExcelReader getExcelObj() throws EncryptedDocumentException, InvalidFormatException, IOException
{
	ExcelReader excelReader = new ExcelReader(excelFilePtah);
	return excelReader;
}


public static PropertiesReusables getOrObj(String file) throws EncryptedDocumentException, InvalidFormatException, IOException
{
	PropertiesReusables propertiesReusables = new PropertiesReusables(file);
	return propertiesReusables;
}

}
