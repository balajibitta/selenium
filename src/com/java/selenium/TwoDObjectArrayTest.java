package com.java.selenium;

public class TwoDObjectArrayTest {

	public static void main(String[] args) {
		
		 // Array of size 4x3 to hold integers.
	      Object[][] values =  {{ 10, "balaji", 30 }, { 40, 50, "java" }, { 70, 80, 90 }, { 11, 21, "selenium" }};
			        
	      /*{
	         { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 },
	         { 11, 21, 31 }
	      };*/

	      // Nested loops to print the array in tabular form.
	      for (int i = 0; i < 4; i++)
	      {
	         for (int j = 0; j < 3; j++)
	         {
	            System.out.print(values[i][j] + " ");
	         }

	         System.out.println();    // Print new line.
	      }

	}

}
