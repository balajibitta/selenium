package com.selenium.supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextReusables {
private String filePath;
private FileWriter fw;
private BufferedWriter bw;
private FileReader fr;
private BufferedReader br;
public TextReusables(String filePath) throws IOException
{
	this.filePath = filePath;
	File file = new File(filePath);
	boolean status=file.createNewFile();
	if (status) {
		System.out.println("File is created newly....");
	}
	else
	{
		System.out.println("Return existing file!....");
	}
	fw = new FileWriter(filePath);
	bw = new BufferedWriter(fw);
	fr = new FileReader(filePath);
	br = new BufferedReader(fr);
}

public void writeIntData(int data) throws IOException {
	bw.write(data);
	bw.flush();
}

public void writeData(String data) throws IOException {
	bw.write(data);
	bw.flush();
}

public String readSingleLine() throws IOException {
	String data = br.readLine();
	return data;
}

public List getTotalFileData() throws IOException
{
	List fileData = new ArrayList<>();
	while(br.ready())
	{
		String data = br.readLine();
		fileData.add(data);
	}
	return fileData;
}

}
