package com.sl.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginRediff {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun Sharma\\Downloads\\chromedriver_win32 (1)_chrome88\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.className("mailicon")).click();
		driver.findElement(By.id("login1")).sendKeys("Arjun");
		driver.findElement(By.id("password")).sendKeys("Qwerty");
		driver.findElement(By.name("proceed")).click();
		driver.close();
	}
}
