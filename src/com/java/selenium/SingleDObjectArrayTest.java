package com.java.selenium;

public class SingleDObjectArrayTest {

	public static void main(String[] args) {
	
		Object[] obj = new Object[10];
		
		obj[1] = 5;
		obj[3] = 10.55f;
		obj[5] = "balaji";
		obj[7] = 5.105;
		obj[9] = "balu";
		
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}

	}

}
