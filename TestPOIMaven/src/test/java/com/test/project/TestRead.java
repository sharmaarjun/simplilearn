package com.test.project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestRead {
	
	public static void readTestExcel(String FilePath, String SheetName) throws IOException {
		
		try {
			
		FileInputStream inputstream = new FileInputStream(FilePath);
		XSSFWorkbook ExcelWBook = new XSSFWorkbook(inputstream);
		XSSFSheet ExcelWSheet = ExcelWBook.getSheet(SheetName);
		int startrow = 1;
		int Totalrow = ExcelWSheet.getLastRowNum();
		System.out.println(Totalrow+" num of rows");
		for (int i = startrow;i<=Totalrow;i++) {
			XSSFRow ROW = ExcelWSheet.getRow(i);
			XSSFCell cell_id = ROW.getCell(0,MissingCellPolicy.CREATE_NULL_AS_BLANK);
			String strid = cell_id.getStringCellValue();
			
			XSSFCell cell_email = ROW.getCell(1,MissingCellPolicy.CREATE_NULL_AS_BLANK);
			String stremail = cell_email.getStringCellValue();
			
			XSSFCell cell_password = ROW.getCell(2,MissingCellPolicy.CREATE_NULL_AS_BLANK);
			String strpass = cell_password.getStringCellValue();
			
			XSSFCell cell_fname = ROW.getCell(3,MissingCellPolicy.CREATE_NULL_AS_BLANK);
			String strfn = cell_fname.getStringCellValue();
			
			XSSFCell cell_lname = ROW.getCell(4,MissingCellPolicy.CREATE_NULL_AS_BLANK);
			String strln = cell_lname.getStringCellValue();
			
			System.out.println(strid+" - "+stremail+" - "+strpass+" - "+strfn+" - "+strln);
		}
		} catch (NullPointerException e) {
			System.out.println("Error message caught "+e.getMessage());
		}
	}

	public static void main(String[] args) throws IOException {
		readTestExcel("C:\\Users\\Arjun Sharma\\Desktop\\testdata.xlsx","Data");

	}

}
