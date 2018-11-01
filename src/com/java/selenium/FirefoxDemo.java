package com.java.selenium;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirefoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoteWebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.gmail.com");
	}

}
