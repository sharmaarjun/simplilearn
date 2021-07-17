package com.sl.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibRediff {
	
	public void Login(String strun, String strpwd) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun Sharma\\Downloads\\chromedriver_win32 (1)_chrome88\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.className("mailicon")).click();
		driver.findElement(By.id("login1")).sendKeys(strun);
		driver.findElement(By.id("password")).sendKeys(strpwd);
		driver.findElement(By.name("proceed")).click();
	}
	
	public void Compose(String strTo) {
		//Navigate to compose
		//Fill in To and CC
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun Sharma\\Downloads\\chromedriver_win32 (1)_chrome88\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.className("mailicon")).click();
		driver.findElement(By.linkText("Forgot Password?")).click();
		driver.findElement(By.id("txtlogin")).sendKeys(strTo);
		driver.findElement(By.name("next")).click();
	}
	
	public void Logout() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun Sharma\\Downloads\\chromedriver_win32 (1)_chrome88\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.close();
		
	}
}
