package com.grid.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestGrid {

	WebDriver driver;
	String strURL, URL;
    @BeforeTest
    public void setUp() throws MalformedURLException {
//        System.setProperty("webdriver.chrome.driver", "E:\\installs\\Selenium\\chromedriver_win32_85\\chromedriver.exe");
        strURL = "https://www.rediff.com/";
//        URL = "http://localhost:4444/wd/hub";
        URL = "http://192.168.0.102:4444/wd/hub";
        DesiredCapabilities capability = DesiredCapabilities.chrome();
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
    public void sampleTest() {
        driver.get(strURL);
        System.out.println(driver.getTitle());    
        
    }
}
