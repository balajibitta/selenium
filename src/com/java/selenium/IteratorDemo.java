package com.java.selenium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class IteratorDemo {

	public static void main(String[] args) {

		HashMap h = new HashMap<>();
		
		h.put(12, 34);  // In HashMap key does not allows duplicates
		h.put(12, 35);
		h.put(22, 34);
		h.put(120, 345);
		h.put(121, 343);
		
		Set keys = h.keySet();
		
		Iterator itr = keys.iterator();
		while (itr.hasNext()) {
			Object key = itr.next();
			Object value = h.get(key);
			
			System.out.println(key+ "---" +value);
			
		}

		ArrayList a = new ArrayList();
		
		a.add(10);
		a.add("java");
		a.add(100);
		a.add(10);
		a.add("selenium");
		a.add(10.55);
		a.add("job");
		a.add("selenium");
		System.out.println(a);
		
		Iterator itr1 = a.iterator();
		
		while (itr1.hasNext()) {
			//Object value = itr1.next();
			
			System.out.println(itr1.next());
			
		}
		
	}

}
