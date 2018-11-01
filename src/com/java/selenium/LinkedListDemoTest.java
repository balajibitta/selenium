package com.java.selenium;

import java.util.LinkedList;

public class LinkedListDemoTest {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		
		l.add(null);
		l.add(10);
		l.add(10);
		l.add(100.55);
		l.add("java");
		l.add("selenium");
		l.add("practice");
		l.add("hardwork");
		
		l.removeFirst();
		l.addLast("job");
		System.out.println(l);
		
		
	}

}
