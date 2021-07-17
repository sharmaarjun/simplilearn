package com.ecommerce.webapp.test.phase2_selenium_autoit_13_02_2021;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AutoITUpload {
  
	WebDriver driver;
	final String siteUrl = "https://www.amazon.in/";
	
  @BeforeMethod
  public void launchBrowser() {
  System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Arjun Sharma\\eclipse-workspace\\phase2-selenium-autoit-13-02-2021\\driver\\chromedriver.exe");
  driver = new ChromeDriver();
  driver.get(siteUrl);
  }

  @Test
  public void f() {
	  driver.findElement(By.id("username")).sendKeys("arjun");
	  
  }
  
  @AfterMethod
  public void afterMethod() {
  }

}
