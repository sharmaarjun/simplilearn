package com.gridmaven.test;

import java.net.MalformedURLException;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GridTestMaven {
	WebDriver driver;
	String strURL, URL;
    @BeforeTest
    public void setUp() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arjun Sharma\\Downloads\\chromedriver_win32 (1)_chrome88\\chromedriver.exe");
//        strURL = "https://www.rediff.com/";
      URL = "http://localhost:4444/wd/hub";
//        URL = "http://localhost:4444/grid/console";
//        URL = "http://192.168.1.100:4444/wd/hub";
        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setBrowserName("chrome");
        
//        capability.setPlatform(Platform.WIN10);
        driver = new RemoteWebDriver(new URL(URL), capability);
//        new remo
        
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }
    @Test
    public void sampleTest() throws InterruptedException {
//        driver.get(strURL);
        driver.get(URL);
        Thread.sleep(2000);
        System.out.println(driver.getTitle());    
        
    }
}
