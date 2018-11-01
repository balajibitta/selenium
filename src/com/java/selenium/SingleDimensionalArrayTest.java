package com.java.selenium;

public class SingleDimensionalArrayTest {

	public static void main(String[] args) {

		/*float[] f = new float[10];
		
		f[1] = 10;
		f[3] = 10.5f;
		f[5] = 10.55f;

		for (int i = 0; i < f.length; i++) {
			
			System.out.println(f[i]);
		}*/
		
		String[] s = {"java", "selenium", "practice", "hardwork", "job"};
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		int[] a = new int[20];
		
		a[0] = 12;
		a[4] = 56;
		a[8] = 45;
		a[9] = 10;
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
