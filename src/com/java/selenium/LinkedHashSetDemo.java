package com.java.selenium;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet l = new LinkedHashSet();
		
		l.add(null);
		l.add(10);
		l.add(100);
		l.add("java");
		l.add("selenium");
		l.add(10);
		l.add("java");
		
	
		System.out.println(l);
		
		
	}

}
