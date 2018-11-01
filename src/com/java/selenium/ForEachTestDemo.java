package com.java.selenium;

import java.util.ArrayList;
import java.util.Iterator;

public class ForEachTestDemo {

	public static void main(String[] args) {
	
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("hello");
		a.add("java");
		a.add("balaji");
		a.add("selenium");
		
		
		Iterator<String> itr = a.iterator();
		
		for (String s : a) {
			System.out.println(itr.next());
			
			if (s.equalsIgnoreCase("java")) {
				System.out.println("you can learn selenium also");
			}
			if (s.equalsIgnoreCase("selenium")) {
				System.out.println("More practice on java and selenium and fullfill your dreams");
			}
		}

	}

}
