package com.java.selenium;


import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<String> ts1= new TreeSet<String>(); 

		// Elements are added using add() method 
		ts1.add("java"); 
		ts1.add("balu"); 
		ts1.add("selenium"); 
		
		/*ts1.add("A"); 
		ts1.add("B"); 
		ts1.add("C"); */

		// Duplicates will not get insert 
		ts1.add("balu"); 

		// Elements get stored in default natural 
		// Sorting Order(Ascending) 
		System.out.println(ts1); 

		/*Iterator itr = ts1.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}*/
	}

}
