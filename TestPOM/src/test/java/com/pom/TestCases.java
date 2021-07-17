package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCases {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun Sharma\\Downloads\\chromedriver_win32 (1)_chrome88\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		LoginClass log = new LoginClass(driver);
		log.Login_Valid("test", "pwd");
		

	}

}
