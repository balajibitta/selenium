package com.selenium.log4j;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.mongodb.diagnostics.logging.Logger;

public class GmailTest {

	public static void main(String[] args) throws InterruptedException {

		PropertyConfigurator.configure("D:\\Java and selenium programs\\selenium\\src\\com\\selenium\\propertyfiles\\log4j.properties");
		org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(GmailTest.class);
		
		/*String cDir = System.getProperty("user.dir");
		logger.info(cDir);
		System.setProperty("webdriver.chrome.driver", cDir+"\\chromedriver\\chromedriver.exe");*/
		
		WebDriver driver = new FirefoxDriver();
		
		logger.info("Browser is launched");
		driver.get("https://www.gmail.com");
		logger.info("URL is entered as : https://www.gmail.com");
	
		Thread.sleep(2000);
		driver.close();
				
		}

}
