package com.selenium.pom;

import org.jsoup.select.Evaluator.Id;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadPage {

	   WebDriver driver;

	public FileUploadPage(WebDriver localdriver) {
		this.driver = localdriver;
	}
	
	@FindBy(id = "uploadfile_0") WebElement browseFile;
	@FindBy(id = "terms") WebElement acceptTerms;
	@FindBy(id = "submitbutton") WebElement submitButton;
	
	public void fileUpload_guru99(String filepath) {
		
		browseFile.sendKeys(filepath);
		acceptTerms.click();
		submitButton.click();
	}
}
