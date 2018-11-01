package com.java.selenium;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		
		a.add(10);
		a.add("java");
		a.add(100);
		a.add(10);
		a.add("selenium");
		a.add(10.55);
		a.add("job");
		System.out.println(a);
		
		ArrayList arraylist = new ArrayList();	
		
		arraylist.addAll(a);
		arraylist.add("Practice");
		System.out.println(arraylist);

		ArrayList arraylist1 = new ArrayList();
		
		arraylist1.addAll(arraylist);
		arraylist1.addAll(a);
		arraylist1.add("Hardwork");
		System.out.println(arraylist1);
		
		

		
	}

}
