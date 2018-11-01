package com.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		FileInputStream fip = new FileInputStream("D:\\Java and selenium programs\\selenium\\TestData\\Excelfile.xlsx");
		Workbook workbook = WorkbookFactory.create(fip);
		Sheet sheet1 = workbook.getSheet("sheet1");
		
		Row row0 = sheet1.getRow(0);
		Cell cell00 = row0.getCell(0);
		String cellvalue00 = cell00.getStringCellValue();
		System.out.println("cell0 value in row0 is:" + cellvalue00);
		//row0.getCell(0).getStringCellValue();
		//System.out.println("cell0 value is:" +cell0);
		
		Cell cell01 = row0.getCell(1);
		String cellvalue01 = cell01.getStringCellValue();
		System.out.println("cell1 value in row0 is:" + cellvalue01);
		
		Row row1 = sheet1.getRow(1);
		Cell cell11 = row1.getCell(1);
		double cellvalue1 = cell11.getNumericCellValue();
		System.out.println("cell1 value in row1 is:" + cellvalue1);
		
		Sheet sheet2 = workbook.getSheet("sheet2");
		Row row02 = sheet2.getRow(0);
		Cell cell = row02.getCell(0);
		row02.getCell(0).getStringCellValue();
		System.out.println("cell0 value in sheet2 is:" +cell);

	}

}
