package com.java.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// Here we can perform, Remove the duplicate elements from the below arraylist. 

public class ArrayListTestDemo {

	public static void main(String[] args) {

		List l = new ArrayList();
		
		l.add(10);
		l.add(20);
		l.add(10);
		l.add(30);
		l.add(40);
		l.add(30);
		
		// Approach-1
		
		Set s1 = new TreeSet();
		s1.addAll(l);
		System.out.println(s1);
		
		// Approach-2
		
		Set s2 = new TreeSet();
		List duplicates = new ArrayList();
		
		for (int i = 0; i < l.size(); i++) {
			//boolean b = s2.add(l.get(i));
			s2.add(l.get(i));
		}
		System.out.println(s2);
	}

}
