package com.java.selenium;

import java.util.HashMap;

// In the "Map" interface we can store the values in the form of 'key-value' pairs.
public class HashMapDemo {

	public static void main(String[] args) {

		HashMap h = new HashMap();
		
		// Here 'key' doesn't allows duplicates and value allows duplicates and also insertion order is not preserved.
		
		h.put(1, "java");
		h.put(2, "selenium");
		h.put("practice", 3);
		h.put(4, "hardwork");
		h.put(2, "java");
		h.put(1, "selenium");
		h.put(null, null);
		h.put(null, "practice more");
		
		
		System.out.println(h);
		
	}

}
