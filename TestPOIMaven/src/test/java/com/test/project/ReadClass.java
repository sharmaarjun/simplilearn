package com.test.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadClass {

	XSSFSheet excelWSheet;
	XSSFWorkbook exceWorkbook;
	XSSFCell cell;
	XSSFRow row;

	//	String FilePath = "Desktop\\testdata.xlsx";
	//	String SheetName = "Data";


	//FileInputStream fileinputstream=new FileInputStream(FilePath);
	public static void readTestExcel(String FilePath, String Sheetname) throws IOException {

		try {
		FileInputStream fileInputStream = new FileInputStream(FilePath);
		XSSFWorkbook WBook = new XSSFWorkbook(fileInputStream);
		XSSFSheet WSheet = WBook.getSheet(Sheetname);
		//4  - 1 to 3
		for (int i = 1; i <= 3; i++) {
			XSSFRow ROW = WSheet.getRow(i);
			XSSFCell cellID = ROW.getCell(0);
			int strID = (int) cellID.getNumericCellValue();
			System.out.println(strID);
			XSSFCell cellEmail = ROW.getCell(1);
			String strEmail = cellEmail.getStringCellValue();
			XSSFCell cellFName = ROW.getCell(2);
			String strFName = cellFName.getStringCellValue();
			XSSFCell cellLName = ROW.getCell(3);
			String strLName = cellLName.getStringCellValue();

			System.out.println(strID+" - "+strEmail+" - "+strFName+" - "+strLName);
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		catch (IOException e) {
			System.out.println("Could not read file");
		}
		finally {
			System.out.println("PRINT the values");
		}
		}
	public static void main(String[] args) throws IOException {
		readTestExcel("C:\\Users\\Arjun Sharma\\Desktop\\testdata.xlsx", "Data");
	}
}