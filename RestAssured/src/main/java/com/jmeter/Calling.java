package com.jmeter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calling {

	static WebDriver driver;
	static String URL = "https://lendingpoint--dev.my.salesforce.com/";
	static String us = "arjun.sharma@trantorinc.com.dev";
	static String ps = "Arjun@11jan21";
	static String addr = "gedc";
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Arjun Sharma\\\\Downloads\\\\chromedriver_win32 (3)\\\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	    driver.get(URL);
		
	LinkClass lc = new LinkClass(driver);
	lc.Login(us, ps);
	Thread.sleep(30000);
	lc.Search(addr);
	
}
}
