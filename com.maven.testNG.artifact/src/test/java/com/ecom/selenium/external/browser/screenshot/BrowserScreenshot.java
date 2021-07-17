package com.ecom.selenium.external.browser.screenshot;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class BrowserScreenshot {
  
	WebDriver driver;
	final String siteUrl = "https://www.amazon.in/";
	
  @BeforeMethod
  public void launchBrowser() {
  System.setProperty("webdriver.gecko.driver", 
			"C:\\Users\\Arjun Sharma\\eclipse-workspace\\phase1-selenium-scripting\\driver\\geckodriver.exe");
  driver = new FirefoxDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }
  @Test
  public void takeScreenShot() throws IOException, URISyntaxException, InterruptedException {
	  driver.get(siteUrl);
	  Thread.sleep(5000);
	  TakesScreenshot ts = (TakesScreenshot) driver;
	  File src = ts.getScreenshotAs(OutputType.FILE);
	  URI uri = new URI(siteUrl);
	  
	  org.openqa.selenium.io.FileHandler.copy(src, new File("C:\\Users\\Arjun Sharma\\Downloads\\SIMPLILEARN\\FEB-selenium\\ss.png"+uri.getHost()));
	  //FileHandler.copy(src, new File("C:\\Users\\Arjun Sharma\\Downloads\\SIMPLILEARN\\FEB-selenium"+uri.getHost()));
  
  }

}
