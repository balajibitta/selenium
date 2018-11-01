package com.selenium.pom.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.selenium.pom.utilities.BrowserFactory;

public class VerifyWebPages {

	@Test
	public void verifyValidWebPages() {
		
		WebDriver driver = BrowserFactory.startBrowser("firefox", "http://demosite.center/wordpress/wp-login.php");
		WebDriver driver2 = BrowserFactory.startBrowser("chrome", "https://www.gmail.com");
		
	}
}
