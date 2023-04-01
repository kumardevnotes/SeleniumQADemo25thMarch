package com.io.operations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcelDemo {

		public static void main(String[] args) throws Exception {
			
			
	        String rootPath = System.getProperty("user.dir");		
			FileInputStream fileInputStream = new 
					FileInputStream(new File(rootPath + "//src//test//resources//MyTestData.xlsx")); 

			// Create Workbook instance holding reference to .xlsx file
			XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

			// Get first/desired sheet from the workbook
			XSSFSheet sheet = workbook.getSheet("appData");
			System.out.println(sheet.getRow(2).getCell(0).toString());
			
			System.out.println("Before writing/updating into excel sheet");
			System.out.println(sheet.getRow(2).getCell(2).toString());
			
			//To write into Excel sheet
		
			FileOutputStream fileOutputStream = new 
					FileOutputStream(new File(rootPath + "//src//test//resources//MyTestData.xlsx"));
			
			//To update or write changes into excel sheet
			sheet.getRow(2).getCell(2).setCellValue("training#1122");
			
			// save changes in excel sheet
			workbook.write(fileOutputStream);
			
			System.out.println("After writing/updating into excel sheet");
			System.out.println(sheet.getRow(2).getCell(2).toString());
			
			//To close excel sheet write operation
			fileOutputStream.close();
			
			
		}
	}

