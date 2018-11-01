package com.java.selenium;

// here we can validate indian mobile number is valid or not by using regular Expression. 
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest {

	public static void main(String[] args) {

		String s = "+91 9581197311";
		
		//Pattern p = Pattern.compile("[a/[+]?91]![6789][0-9]{9}");
		
		Pattern p = Pattern.compile("91?[6-9][0-9]{9}");

		Matcher matcher = p.matcher(s);
		if (matcher.find() && matcher.group().equals(s)) {
			
			System.out.println("valid");
		}
		else
			System.out.println("invalid");
	}

}
