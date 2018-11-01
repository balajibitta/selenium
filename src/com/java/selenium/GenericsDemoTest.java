package com.java.selenium;

// Before generics, we can store any type of objects in collection i.e. non-generic. 
//Now generics, forces the java programmer to store specific type of objects.
//Here We can hold only a single type of objects in generics. It doesn’t allow to store other objects.

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemoTest {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();
		
		a.add("hello");
		a.add("java");
		a.add("balaji");
		a.add("selenium");
		
		String s = a.get(0);
		System.out.println("element is : " +s);
		
		Iterator<String> itr = a.iterator();
		
		while (itr.hasNext()) {
			//String string = (String) itr.next();
			//System.out.println(string);
			
			System.out.println(itr.next());
			
		}
	}

}
