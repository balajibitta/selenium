package com.java.selenium;

// Here we can find no.of occurances of a charactor in the below string by using Regular expression

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharOccuranceTest {

	public static void main(String[] args) {
		
		int count = 0;
		
		Pattern p = Pattern.compile("h");
		
		Matcher matcher = p.matcher("adpheft123AbhJon");
		
		while (matcher.find()) {
			
			count++;
			System.out.println(matcher.group()+ "-" +matcher.start()+ "-" +matcher.end());
		}
		
		System.out.println("No.of ocurance of a char is : " +count);
	}

}
