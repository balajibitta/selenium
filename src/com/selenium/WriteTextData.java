package com.selenium;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextData {

	public static void main(String[] args) throws IOException {

		File file = new File("D:\\Java and selenium programs\\selenium\\selenium.txt");
		boolean b = file.createNewFile();
		System.out.println(b);
		FileWriter filewriter = new FileWriter(file);
		BufferedWriter bwriter = new BufferedWriter(filewriter);
		bwriter.write("Welcome to Selenium");
		bwriter.newLine();
		bwriter.write("Do Hardwork and Get a Job");
		bwriter.flush();

	}

}
