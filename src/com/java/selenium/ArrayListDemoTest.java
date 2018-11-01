package com.java.selenium;

// Here we can remove duplicates from an array.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ArrayListDemoTest {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		
		a.add(10);
		a.add("java");
		a.add(100);
		a.add(10);
		a.add("selenium");
		a.add(10.55);
		a.add("job");
		a.add("selenium");
		
		HashSet hashSet = new HashSet(a);
		System.out.println(hashSet);
		
		//Approach-2
		
		/*LinkedHashSet l = new LinkedHashSet(a);
		System.out.println(l);*/
		
		
	}

}
