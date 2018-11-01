package com.java.selenium;

// Here we can perform number of occurances of a charactor

public class StringTest {

	public static void main(String[] args) {
	
		int count = 0;
		String s = "welcome to core java and selenium";
		
		char[] c = s.toCharArray();
		
		for (int i = 0; i < c.length; i++) {
			
			if (c[i] == 'e') {
				count++;
			}
		}
		System.out.println("no.of occurence of c char 'e' is : " +count);
	}

}
