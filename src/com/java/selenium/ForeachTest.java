package com.java.selenium;

import java.util.ArrayList;
import java.util.Iterator;

//

public class ForeachTest {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		
		a.add(10);
		a.add(100);
		a.add(1000);
		a.add(10000);
		
		Iterator itr = a.iterator();
		
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			
			System.out.println(integer);
			
			if (integer.equals(10000)) {
				System.out.println("10000 value is there");
			}
		}
		
		Iterator itr1 = a.iterator();
		
		while (itr1.hasNext()) {
			Integer integer = (Integer) itr1.next();
			System.out.println(integer);
		}
		for (Object object : a) {
			Integer integer = (Integer) object;
			
			if (integer==1000) {
				System.out.println("1000 value is there");
			}
			}
		
		String[] s = {"hello", "java", "selenium"};
		
		/*for (String s1 : s) {
			
			System.out.println(s1);
			
		}*/
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		
	}

}
