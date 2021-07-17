package com.jmeter;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class example {

	WebDriver driver;
	String URL = "https://lendingpoint--dev.my.salesforce.com/";
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun Sharma\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get(URL);
	}
	
	@Test
	public void launch() {
		WebElement usern = driver.findElement(By.id("username"));
		usern.sendKeys("arjun.sharma@trantorinc.com.dev");
		WebElement passw = driver.findElement(By.id("password"));
		passw.sendKeys("Arjun@11jan21");
		WebElement log = driver.findElement(By.id("Login"));
		log.click();
	}
	
	@Test
	public void test() {
		System.out.println("This is the jmeter result");
	}
	
	@After
	public void close() {
		driver.quit();
		}

}
