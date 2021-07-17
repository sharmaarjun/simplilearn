package com.poi;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class Lib_BusinessP {
	
	WebDriver driver = null;
	Lib_Keywords LB = new Lib_Keywords(driver);
	
	public void Login(String UN, String PWD) throws InterruptedException, IOException {
		
		LB.OpenBrowser("chrome");
		LB.open_url("https://mail.rediff.com/cgi-bin/login.cgi");
		LB.input_username(UN);
		LB.input_password(PWD);
		LB.click_login();
		Thread.sleep(2000);
		LB.finish();
		//LB.writeExcel("C:\\Users\\Arjun Sharma\\Desktop\\testdata.xlsx", "Write");
		
	}
	
	public void Search(String location, String item) throws InterruptedException {
		
		LB.OpenBrowser("chrome");
		LB.open_url("https://www.swiggy.com/");
		LB.enterLoc(location);
		Thread.sleep(3000);
		LB.searchItem(item);
		Thread.sleep(3000);
		LB.finish();
		
	}

}
