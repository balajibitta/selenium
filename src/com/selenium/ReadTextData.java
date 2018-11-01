package com.selenium;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextData {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\Java and selenium programs\\selenium\\selenium.txt");
		FileReader filereader = new FileReader(file);
		BufferedReader bufferedreader = new BufferedReader(filereader);
		
		String line1 = bufferedreader.readLine();
		System.out.println(line1);
		
		String line2 = bufferedreader.readLine();
		System.out.println(line2);
		
		String line3 = bufferedreader.readLine();
		System.out.println(line3);
		
		/*while(bufferedreader.ready())
		{
			String text = bufferedreader.readLine();
			System.out.println(text);
		}*/

	}

}
