package com.ecom.selenium.external.browser.popup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonBrowser {
	
	WebDriver driver;
	//final String siteUrl = "https://www.amazon.in/";
	
  @BeforeMethod
  public void launchBrowser() {
  System.setProperty("webdriver.gecko.driver", 
			"C:\\Users\\Arjun Sharma\\eclipse-workspace\\phase1-selenium-scripting\\driver\\geckodriver.exe");
  driver = new FirefoxDriver();
  driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
  }
 
  @AfterMethod
  public void closeBrowser() {
		driver.close();
  }
  /*
		@Test
  public void f() throws InterruptedException {
			String siteUrl = "https://www.amazon.in/";
			driver.get(siteUrl);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"nav-global-location-popover-link\"]")).click();
			Thread.sleep(5000);
			String mainWindow = driver.getWindowHandle();
			
			// to handle all new open windows
			Set<String> windows = driver.getWindowHandles();
			Iterator<String> itrs = windows.iterator();	
			while (itrs.hasNext()) {
				String childWindow = itrs.next();
				//System.out.println("Young kids name : "+childWindow);
					// switch to child window
					driver.switchTo().window(childWindow);
					Thread.sleep(3000);
					driver.findElement(By.cssSelector("#GLUXZipUpdateInput")).sendKeys("134113");
					driver.findElement(By.cssSelector("#GLUXZipUpdate > span > input")).click();
					Thread.sleep(2000);
					driver.close();
			
		}
			driver.switchTo().window(mainWindow);
			
		}
		*/
		@Test
		public void addToCart() throws InterruptedException {
			String siteUrl = "https://www.amazon.in/";
			driver.get(siteUrl);
			WebElement searchBox1 = driver.findElement(By.id("twotabsearchtextbox"));
			searchBox1.sendKeys("iPhone 12");
			driver.findElement(By.id("nav-search-submit-button")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
			Thread.sleep(2000);
			//get window handle
			String mainWindow = driver.getWindowHandle();
			ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(newTab.get(1));
			driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
			Thread.sleep(2000);
			driver.close();
			driver.switchTo().window(newTab.get(0));
			/*
			while(windowitr.hasNext()) {
				String child = windowitr.next();
				driver.switchTo().window(child);
				
				driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
				Thread.sleep(2000);
			}
			*/
			
		}
}
