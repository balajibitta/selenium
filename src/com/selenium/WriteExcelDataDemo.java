package com.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelDataDemo {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		FileInputStream fip = new FileInputStream("D:\\Java and selenium programs\\selenium\\TestData\\Excelfile.xlsx");
		Workbook workbook = WorkbookFactory.create(fip);
		Sheet sheet1 = workbook.getSheet("sheet1");
		
		Row row0 = sheet1.createRow(0);
		//Cell cell0 = row0.createCell(0);
		//cell0.setCellValue("balaji");
		
		row0.createCell(0).setCellValue("balaji");
		row0.createCell(1).setCellValue("practice");
		
		Row row1 = sheet1.createRow(1);
		row1.createCell(0).setCellValue("get a job");
		row1.createCell(1).setCellValue("122");
		
		Sheet sheet2 = workbook.getSheet("sheet2");
		Row row2= sheet2.createRow(0);
		row2.createCell(0).setCellValue("Hardwork");
		
		FileOutputStream fop = new FileOutputStream("D:\\Java and selenium programs\\selenium\\TestData\\Excelfile.xlsx");
		workbook.write(fop);
	}

}
