package com.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertiesTest {
public static void main(String[] args) throws IOException {
	FileInputStream fip = new FileInputStream
("D:\\Java and selenium programs\\selenium\\src\\com\\selenium\\propertyfiles\\OR.properties");

	Properties pr = new Properties();
	pr.load(fip);
	
	String s = "123";
	int i =Integer.parseInt(s);
	String un_id = pr.getProperty("un_id");
	System.out.println("un_id: " + un_id);
	
	WebDriver d = new FirefoxDriver();
	d.get("https://www.gmail.com");
	d.findElement(By.id(un_id)).sendKeys("abc123");
	String un_xpath = pr.getProperty("un_xpath","selenium");
	System.out.println("un_xpath: " + un_xpath);
	String next_id = pr.getProperty("next_id");
	System.out.println("next_id: " + next_id);
	
	/*pr.setProperty("hello", "dont sleep");
	pr.store(new FileOutputStream("E:\\Eclipse workspace\\pb8seleniumjava\\src\\com\\automation\\appln\\objectrepository\\OR.properties"), "....");
	*/
	Set keys = pr.keySet();
	for(Object k : keys)
	{
		String key = (String)k;
		String values = pr.getProperty(key);
		System.out.println(values);
	}
}
}







