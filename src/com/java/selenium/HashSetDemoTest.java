package com.java.selenium;

// In this "duplicates" are not allowed and "insertion" is not preserved.
import java.util.HashSet;

public class HashSetDemoTest {

	public static void main(String[] args) {

		HashSet hashSet = new HashSet();
		
		hashSet.add(null);
		hashSet.add(10);
		hashSet.add(100);
		hashSet.add("java");
		hashSet.add("selenium");
		hashSet.add(10);
		hashSet.add("java");
		
		
		System.out.println(hashSet);
		
	}

}
