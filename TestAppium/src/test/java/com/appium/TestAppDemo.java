package com.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestAppDemo {
	
	
	

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

//		WebDriver driver;
//		AndroidDriver<MobileElement> driver2;
		
		URL URL = new URL("http://127.0.0.1:4723/wd/hub");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage" , "io.appium.android.apis");
		cap.setCapability("appActivity" , "io.appium.android.apis.ApiDemos");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(URL, cap);
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Controls\"]").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"1. Light Theme\"]").click();
		Thread.sleep(2000);
//		WebElement togg = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.ToggleButton[1]");
		MobileElement togg = (MobileElement) driver.findElement(By.id("io.appium.android.apis:id/toggle1"));
		
		String tog = togg.getText();
		System.out.println("First value: "+tog);
		togg.click();
		Thread.sleep(2000);
		String togg2 = driver.findElementByXPath("	\r\n" + 
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.ToggleButton[1]").getText();
		System.out.println("2nd value: "+togg2);
		Thread.sleep(2000);
		//Boolean Check ------->>>>>>
		
//		TC: Have CB1 checked
		MobileElement cb1 = (MobileElement) driver.findElementByXPath("//android.widget.CheckBox[@content-desc=\"Checkbox 1\"]");
		boolean check = Boolean.parseBoolean(cb1.getAttribute("checked"));
		if(!check) {
			cb1.click();
		}

		
		System.out.println("Initial Checkbox value: "+check);
		
//		TC2: CB1 should be unchecked
		 check = Boolean.parseBoolean(cb1.getAttribute("checked"));
		if(check) {     //Checking if it is checked already
			cb1.click();  // Uncheck 
		}

		
		driver.findElementByXPath("//android.widget.CheckBox[@content-desc=\"Checkbox 2\"]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.RadioButton[@content-desc=\"RadioButton 1\"]").click();
		String tex= driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Spinner/android.widget.TextView\r\n" + 
				"").getText();
		
		
		
		MobileElement spinner = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Spinner\r\n" + 
				"");
		System.out.println("Value of spinner before: "+tex);
		Thread.sleep(2000);
		spinner.click();
		Thread.sleep(2000);
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[3]\r\n" + 
				"").click();
		Thread.sleep(2000);
		String tex2 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Spinner/android.widget.TextView\r\n" + 
				"").getText();
		System.out.println("Value of spinner after: "+tex2);
		Thread.sleep(10000);

		driver.quit();
		
//		1. find the Radio Group
//		2. Find all the Radio Buttons inside  List
//		3. Iterate > Print the text
//		4. Condiiton
		
//		//className[@att='Value']
//		//android.widget.CheckBox	findElement 
//		/ findElements
//		android.widget.CheckBox
//		//className[contains(att,'val')]
		
	}

}
