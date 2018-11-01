package com.java.selenium;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class EnumerationDemo {

	public static void main(String[] args) {

		  Hashtable h = new Hashtable();     
          		  	  
	        h.put(1, "All the best"); 
	        h.put(2, "selenium"); 
	        h.put(3, "java"); 
	           
	        // create enumeration  
	   Enumeration e = h.elements(); 
	      
	  // System.out.println("display values:" ); 
	      
	    while (e.hasMoreElements()) { 
	   System.out.println(e.nextElement());

	   }

	}

}
