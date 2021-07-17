package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginClass {
	@FindBy(id="login1")
	WebElement login;
	
	@FindBy(id="password")
	WebElement we_password;
	
	@FindBy(name="proceed")
	WebElement submit;

	WebDriver driver;
	
//	By username = By.id("login1");
//	By password = By.id("password");
//	By sub = By.name("proceed");
	
	//Page Factory 
	public LoginClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void Login_Valid(String sUN,String sPwd) {
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun Sharma\\Downloads\\chromedriver_win32 (1)_chrome88\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
		
		driver.findElement(By.className("mailicon")).click();

		login.sendKeys(sUN);
		we_password.sendKeys(sPwd);
		submit.click();
		driver.close();
//		
		//driver.findElement(username).sendKeys(sUN);
		//driver.findElement(password).sendKeys(sPwd);
		
		//driver.findElement(By.id("login1")).sendKeys("Arjun");
		//driver.findElement(By.id("password")).sendKeys("Qwerty");
		//driver.findElement(By.name("proceed")).click();
	}

}
