package com.selenium.pom.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.selenium.pom.FileUploadPage;
import com.selenium.pom.utilities.BrowserFactory;

public class VerifyFileUploadTest {

	@Test
	
	public void checkFileUpload() {
		
		WebDriver driver = BrowserFactory.startBrowser("firefox", "http://demo.guru99.com/test/upload/");
		
		FileUploadPage file_upload = PageFactory.initElements(driver, FileUploadPage.class);
		
		file_upload.fileUpload_guru99("C:\\Users\\venkateswara\\Desktop");
	}
}
