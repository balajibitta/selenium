package com.selenium;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.jna.platform.unix.X11.Screen;

public class SikuliTestDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        String filepath = "D:\\Guru99Demo\\Files\\";
        String inputFilePath = "D:\\Guru99Demo\\Files\\";
        Screen s = new Screen();
       // Pattern fileInputTextBox = new org.sikuli.script.Pattern(filepath+ "FileTextBox");
        //Pattern fileInputTextBox = new Pattern(filepath+ "FileTextBox.PNG");
        		//Pattern openButton = new Pattern(filepath + "OpenButton.PNG");
        org.sikuli.script.Pattern openButton = new org.sikuli.script.Pattern(filepath+ "OpenButton.PNG") ;
        WebDriver driver;

        // Open Chrome browser    
        driver = new FirefoxDriver();
        driver.get("http://demo.guru99.com/test/image_upload/index.php");

        // Click on Browse button and handle windows pop up using Sikuli
        driver.findElement(By.xpath(".//*[@id='photoimg']")).click();
       /* s.wait(20);
        //s.wait(fileInputTextBox, 20);
        s.type(fileInputTextBox, inputFilePath + "Test.docx");
        s.click(openButton);

        // Close the browser
        driver.close();*/

    }

}