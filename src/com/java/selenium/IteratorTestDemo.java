package com.java.selenium;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTestDemo {

	public static void main(String[] args) {

ArrayList a = new ArrayList();

		a.add("10");
		a.add("java");
		a.add("100");
		a.add("10");
		a.add("selenium");
		a.add("10.55");
		a.add("job");
		a.add("selenium");
		System.out.println(a);
		
		Iterator itr = a.iterator();
		
		while (itr.hasNext()) {
			
			String string = (String) itr.next();
			
			System.out.println(string);
			
			if (string.equalsIgnoreCase("java")) {
				System.out.println("welcome to java and More Pracice on java");
			}
			
			if (string.equalsIgnoreCase("selenium")) {
				System.out.println("welcome to selenium and more practice on selenium and do hardwprk");
				
			}
		}
		
	}

}
