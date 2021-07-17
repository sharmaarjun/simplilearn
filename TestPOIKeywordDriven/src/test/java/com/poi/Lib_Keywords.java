package com.poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lib_Keywords {
	
	WebDriver driver;
	public Lib_Keywords(WebDriver driver) {
		this.driver = driver;
	}
	
	public void OpenBrowser(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun Sharma\\Downloads\\chromedriver_win32 (1)_chrome88\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	}
	
	public void open_url(String URL) {
		driver.get(URL);
	}
	
	public void input_username(String strUN) {
		driver.findElement(By.id("login1")).sendKeys(strUN);
	}
	public void input_password(String strPWD) {
		driver.findElement(By.id("password")).sendKeys(strPWD);
	}
	public void click_login() {
		driver.findElement(By.className("signinbtn")).click();
	}
	public void finish() {
		System.out.println("---- Cycle Completed ----");
		driver.close();
	}
	
	// ------------- Search in Swiggy ---------------------- >>
	
	public void enterLoc(String loc) throws InterruptedException {
		WebElement enter = driver.findElement(By.id("location"));
		enter.sendKeys(loc);
		Thread.sleep(5000);
		enter.sendKeys(Keys.DOWN);
		enter.sendKeys(Keys.RETURN);
		
	}
	
	public void searchItem(String search) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div/div/ul/li[5]/div/a")).click();
		Thread.sleep(5000);
		WebElement srh = driver.findElement(By.className("_2BJMh"));
		srh.sendKeys(search);
		Thread.sleep(2000);
		srh.sendKeys(Keys.DOWN);
		srh.sendKeys(Keys.RETURN);
	}
	
	
	
	/*
	public void writeExcel(String FilePath, String Sheetname) throws IOException {
	//FileInputStream fileInputStream = new FileInputStream(FilePath);
	//XSSFWorkbook WBook = new XSSFWorkbook(fileoutput);
	FileOutputStream fileoutput = new FileOutputStream(FilePath);
	XSSFWorkbook WBook = null;
	
	XSSFSheet WSheet = WBook.getSheet(Sheetname);
	XSSFRow ROW = WSheet.getRow(1);
	XSSFCell cellOB = ROW.createCell(0);
	XSSFCell cellOU = ROW.createCell(1);
	XSSFCell cellUser = ROW.createCell(2);
	XSSFCell cellPass = ROW.createCell(3);
	XSSFCell cellLogin = ROW.createCell(4);
	XSSFCell cellFinish = ROW.createCell(5);
	cellOB.setCellValue("OpenBrowser");
	cellOU.setCellValue("open_url");
	cellUser.setCellValue("input_username");
	cellPass.setCellValue("input_password");
	cellLogin.setCellValue("click_login");
	cellFinish.setCellValue("finish");
	WBook.write(fileoutput);
	fileoutput.close();
	
	//fileInputStream.close();
	}
	*/
}
