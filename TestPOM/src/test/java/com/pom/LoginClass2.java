package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginClass2 {
	By username = By.id("login1");
	By password = By.id("password");
	
	@FindBy(id="login1")
	WebElement login;
	
	@FindBy(id="password")
	WebElement we_password;
	
	//Page Factory 
	public LoginClass2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Login_Valid(String sUN,String sPwd) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun Sharma\\Downloads\\chromedriver_win32 (1)_chrome88\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.className("mailicon")).click();
		driver.findElement(username).sendKeys(sUN);
		driver.findElement(password).sendKeys(sPwd);
		
		//driver.findElement(By.id("login1")).sendKeys("Arjun");
		//driver.findElement(By.id("password")).sendKeys("Qwerty");
		//driver.findElement(By.name("proceed")).click();
	}

}
