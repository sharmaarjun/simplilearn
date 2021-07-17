package com.test.project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadUtility {

	public void readexcel(String FilePath, String Sheetname) {
		Lib_Rediff obj = new Lib_Rediff();
		
		try {
			FileInputStream fileInputStream = new FileInputStream(FilePath);
			XSSFWorkbook WBook = new XSSFWorkbook(fileInputStream);
			XSSFSheet WSheet = WBook.getSheet(Sheetname);
			//4  - 1 to 3
			for (int i = 1; i <= 3; i++) {
				XSSFRow ROW = WSheet.getRow(i);
				XSSFCell cellID = ROW.getCell(0,MissingCellPolicy.CREATE_NULL_AS_BLANK); //return blank instead of null pointer exception
				int strID = (int) cellID.getNumericCellValue();
				XSSFCell cellUsername = ROW.getCell(1,MissingCellPolicy.CREATE_NULL_AS_BLANK);
				String strUsername = cellUsername.getStringCellValue();
				XSSFCell cellpass = ROW.getCell(2,MissingCellPolicy.CREATE_NULL_AS_BLANK);
				String strPass = cellpass.getStringCellValue();
				XSSFCell cellExpresult = ROW.getCell(3);
				String strExpResul = cellExpresult.getStringCellValue();
				
//				Login
				String strTCResult = "FAIL";
				String ActRes = obj.Login(strUsername, strPass);
				if (strExpResul.equals(ActRes)) {
					strTCResult = "PASS";
				}
				System.out.println("Actual result is "+ActRes);
				XSSFCell cellActRes = ROW.createCell(4);
				XSSFCell cellTCRes = ROW.createCell(5);
				cellActRes.setCellValue(ActRes);
				cellTCRes.setCellValue(strTCResult);
				
				
				System.out.println(strID+" - "+strUsername+" - "+strPass);
				}
			
			FileOutputStream fileoutput = new FileOutputStream("C:\\Users\\Arjun Sharma\\Desktop\\testdata_Login.xlsx");
			WBook.write(fileoutput);
			fileInputStream.close();
		
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

}
