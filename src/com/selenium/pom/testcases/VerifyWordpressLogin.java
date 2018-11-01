package com.selenium.pom.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.selenium.pom.LoginPage;

public class VerifyWordpressLogin {

	@Test
	public void verifyValidLogin() {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demosite.center/wordpress/wp-login.php");
		LoginPage login = new LoginPage(driver);
		
		/*login.typeUserName();
		login.typePassword();
		login.clickLoginButton();*/
		
		login.loginToWordPress();
		
		driver.quit();
	}
}
