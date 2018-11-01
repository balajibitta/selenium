package com.java.selenium;

import java.util.Hashtable;

import org.apache.james.mime4j.storage.TempFileStorageProvider;

public class HashTableTestDemo {

	public static void main(String[] args) {

		Hashtable hashtable = new Hashtable();
		
		hashtable.put(new Temp(6), "A");
		hashtable.put(new Temp(6), 66);
		hashtable.put(new Temp(1), "b");
		//hashtable.put(new Temp(12), null); -----> In HashTable null is not allowed for both keys and values otherwise
			                                           // we will get nullpointer exception
				
		/*hashtable.put(6, "A");
		hashtable.put(6, 66);
		hashtable.put(1, "b");*/


		
		System.out.println(hashtable);
	}

}
class Temp {
	
	int i;
	
	Temp(int i){
		this.i = i;
	}
	
	public int hashCode() {
		return i;
		
	}
	
	public String toString() {
		return i+ "";
		
	}
}