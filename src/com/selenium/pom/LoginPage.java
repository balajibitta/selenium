/**
 * 
 */
package com.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author venkateswara
 *
 *  Here we can perfom page object model - POM - using Normal approach
 *  
 *  This class will store all locator and methods of login page
 */
public class LoginPage {

	WebDriver driver;
	
	By username = By.id("user_login");
	By password = By.id("user_pass");
	By loginbutton = By.id("wp-submit");
	
	public LoginPage(WebDriver driver)    //---- This is constructor for initialize webdriver
		
	{
		this.driver = driver;
	}
	
	public void loginToWordPress() {
		
		driver.findElement(username).sendKeys("balaji");
		driver.findElement(password).sendKeys("balaji123");
		driver.findElement(loginbutton).click();
	}
	/*public void typeUserName()
	{
		driver.findElement(username).sendKeys("balaji");
	}
	
	public void typePassword()
	{
		driver.findElement(password).sendKeys("balaji123");
	}

	public void clickLoginButton()
	{
		driver.findElement(loginbutton).click();
	}*/

	
}
