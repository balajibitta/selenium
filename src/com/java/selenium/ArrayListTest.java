package com.java.selenium;

// Here we can Remove the duplicates from an array and print the removed duplicates on the console.

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListTest {

	public static void main(String[] args) {
		
		int[] a = {12,14,16,12,12,16,18,34,36,34};
		
		Set s = new TreeSet();
		
		List duplicates = new ArrayList();
		
		for (int i = 0; i < a.length; i++) {
			boolean b = s.add(a[i]);
			
			if (b) {
				System.out.println("It is added");
			}
			else {
				System.out.println("It is a duplicate");
				duplicates.add(a[i]);
			}
		}
		System.out.println(s);
		System.out.println("Removed duplicates are : " +duplicates);
	}

}
