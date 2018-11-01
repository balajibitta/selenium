package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

// Here we can perform page object model (POM) - second approach - PageFactory

public class LoginPageNew {

	 WebDriver driver;

		public LoginPageNew(WebDriver localdriver) {
			
			this.driver = localdriver;
		}
		
	@FindBy(id="user_login") WebElement username;
	@FindBy(id="user_pass") WebElement password;
	//@FindBy(id="wp-submit") WebElement submitbutton;
	
	@FindBy(how=How.ID, using = "wp-submit") WebElement submit_button; // this is second approach (i.e standard approach) for finding locators in a web page by using pagefactory
	 
	
	public void login_Wordpress(String uid, String pass) {
		
		username.sendKeys(uid);
		password.sendKeys(pass);
		submit_button.click();
	}
	
}
