package com.java.selenium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

	static String s = "abcde@123";
	
	public static void main(String[] args) {

		Pattern p = Pattern.compile("[a-zA-Z]");
		
		Matcher matcher = p.matcher(s);
		
		while (matcher.find()) {
			
			System.out.println(matcher);
		}
	}

}
