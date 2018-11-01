package com.java.selenium;

import java.util.TreeSet;

public class TreeSetTestDemo {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet();
		
		ts.add("A");
		ts.add("c");
		ts.add("B");
		ts.add("a");
		ts.add("D");
		ts.add("A"); //-----> duplicates are not allowed in TreeSet.

		
		System.out.println(ts);

	}

}
