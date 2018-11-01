package com.java.selenium;

import java.util.ArrayList;

public class ForEachDemoTest {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();
		
		a.add("10");
		a.add("20");
		a.add("30");
		a.add("40");
		
		// iterate using foreach loop
		
		for (Object object : a) {
			String string = (String) object;
			
			System.out.println(string);
			
			if (string=="20") {
				System.out.println("Do hardwork for job");
			}
		}
		
ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		
		// iterate using foreach loop
		
		for (Object object : arrayList) {
			Integer integer = (Integer) object;
			
			System.out.println(integer);
			
			if (integer==20) {
				System.out.println("Do hardwork for job");
			}
		}
	}

}
