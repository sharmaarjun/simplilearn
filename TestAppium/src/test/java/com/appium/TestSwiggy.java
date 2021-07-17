package com.appium;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class TestSwiggy {
	
	
	AndroidDriver<MobileElement> driver;

	@BeforeTest
	public void setUp() throws Exception {
		
		URL URL = new URL("http://127.0.0.1:4723/wd/hub");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage" , "in.swiggy.android");
		cap.setCapability("appActivity" , "in.swiggy.android.activities.HomeActivity");
		
//		cap.setCapability("autoGrantPermissions", "true");

		driver = new AndroidDriver<MobileElement>(URL, cap);
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
	}

	
	@Test
	public void testLocation() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<MobileElement> lstSetLoc = driver.findElements(By.id("in.swiggy.android:id/set_location_text"));
		System.out.println(lstSetLoc.size());
		if (lstSetLoc.size()>0) {
			lstSetLoc.get(0).click();
		}
		Thread.sleep(1000);
		List<MobileElement> lstAllBtns = driver.findElements(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
		System.out.println(lstAllBtns.size());
		if (lstAllBtns.size()>0) {
			lstAllBtns.get(0).click();
		}
		
//		
		Thread.sleep(45000);
		driver.findElement(By.id("in.swiggy.android:id/item_menu_top_header_restaurant_name1")).click();
//		in.swiggy.android:id/item_menu_top_header_restaurant_name1
        Thread.sleep(3000);
        driver.findElement(By.id("in.swiggy.android:id/location_description")).click();
//        in.swiggy.android:id/location_description
        Thread.sleep(3000);
        driver.findElement(By.id("in.swiggy.android:id/location_description")).sendKeys("Electronic City");
        Thread.sleep(3000);
        driver.hideKeyboard();
        Thread.sleep(1000);
//		MobileElement prntLocs = driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView"));
//		Thread.sleep(1000);
//		List<MobileElement> lstViews = prntLocs.findElements(By.xpath("//android.widget.LinearLayout"));
//		lstViews.get(1).click();
		List<MobileElement> searchItems = driver.findElements(By.id("in.swiggy.android:id/google_place_search_title_text"));
		System.out.println(searchItems.get(0).getText()+ "\n value of index 1"+searchItems.get(1).getText());
		searchItems.get(0).click();
		
		Thread.sleep(1000);
		
        
		Thread.sleep(420000);
	}
	
	

}
