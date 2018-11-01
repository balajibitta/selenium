package com.selenium.pom.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.selenium.pom.LoginPageNew;
import com.selenium.pom.utilities.BrowserFactory;

public class VerifyWordpressLoginPage {

	@Test
	public void checkLoginPage() throws InterruptedException {
		
		//It will launch browser and specify url
		WebDriver driver = BrowserFactory.startBrowser("firefox", "http://demosite.center/wordpress/wp-login.php");
		
		//created page object using page factory
		LoginPageNew login_page = PageFactory.initElements(driver, LoginPageNew.class);
		
		//call method
		login_page.login_Wordpress("admin", "demo123");
		
		Thread.sleep(2000);
		driver.quit();
	}
}
