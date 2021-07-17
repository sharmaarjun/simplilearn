package com.swiggy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpCases {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun Sharma\\Downloads\\chromedriver_win32 (1)_chrome88\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		Classes cls = new Classes(driver);
		cls.search("chandigarh");

	}

}
