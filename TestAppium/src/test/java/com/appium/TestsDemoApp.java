package com.appium;

import static org.junit.Assert.*;

import java.net.URL;
import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Sleeper;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class TestsDemoApp {

	AndroidDriver<MobileElement> driver;

	@Before
	public void setUp() throws Exception {
		URL URL = new URL("http://127.0.0.1:4723/wd/hub");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage" , "io.appium.android.apis");
		cap.setCapability("appActivity" , "io.appium.android.apis.ApiDemos");

		driver = new AndroidDriver<MobileElement>(URL, cap);

		Thread.sleep(1000);
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]").click();
		Thread.sleep(1000);

	}

	@After
	public void tearDown() throws Exception {
	}

	//	@Test
	public void testRadioGroup() throws InterruptedException {

		//		1. find the Radio Group
		//		2. Find all the Radio Buttons inside  List
		//		3. Iterate > Print the text
		//		4. Condition  > check Radio Button 1
		//		CP: Check the default Status for all the RBs
		//		Checked on RB and again check status of RB

		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Controls\"]").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"1. Light Theme\"]").click();
		Thread.sleep(1000);


		MobileElement RadioGroup = (MobileElement) driver.findElement(By.xpath("//android.widget.RadioGroup"));
		List<MobileElement> lstRB = RadioGroup.findElements(By.xpath(".//android.widget.RadioButton"));
		for (MobileElement RB : lstRB) {
			System.out.println(RB.getAttribute("text"));
			if (RB.getAttribute("text").equals("RadioButton 1")) {
				RB.click();

			}
		}


		//		testSpinner
		//		testCheckBox





	}
//@Test
public void dragDrop() throws InterruptedException {
	driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]").click();
	Thread.sleep(2000);
	MobileElement source = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_3"));
	
	MobileElement target = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_2"));
	int startX = source.getLocation().getX();
	int startY = source.getLocation().getY();
	int endX =  554;     //target.getLocation().getX();
	int endY = startY; 			//target.getLocation().getY();
	System.out.println(startX);
	System.out.println(startY);
	System.out.println(endX);
	System.out.println(endY);
	
	TouchAction action = new TouchAction(driver);
	action
	.longPress(PointOption.point(startX, startY))
	.moveTo(PointOption.point(endX, endY))
	.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
//	.release().
	.perform();
	Thread.sleep(7000);
	String actualText = driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
//	Assert.assertEquals("Dropped!", actualText);
	
}




//	@Test
	public void testSeekBar() throws InterruptedException {
		clickOnView("Seek Bar");
		//		scroll_Up();
		
		
		MobileElement seekbar = driver.findElement(By.id("io.appium.android.apis:id/seek"));
		
		
		
//		int height = seekbar.getSize().getHeight();
		int width = seekbar.getSize().getWidth();
		
		
		int startX = seekbar.getLocation().getX();
		int startY = seekbar.getLocation().getY();
		int endX = (int) (startX + (width * 0.5));
		int endY = startY;
		
		TouchAction action = new TouchAction(driver);
		action.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();
		
		System.out.println(driver.findElement(By.id("io.appium.android.apis:id/progress")).getAttribute("text"));
		Thread.sleep(5000);
		
		
//		Scroll Right >> Horizontal Scroll
//		X changing
//		Y consistent
		
		
		
		
		

	}

	@Test
	public void testScrollUpDown() throws InterruptedException {
		clickOnView("Layouts");
		//		scroll_Up();
	}


	public void clickOnView(String ExpVName) throws InterruptedException {
		MobileElement parent = (MobileElement) driver.findElement(By.id("android:id/content"));
		boolean flgFound = false;

		while (!flgFound) {

			List<MobileElement> views = parent.findElements(By.id("android:id/text1"));
			for (MobileElement view : views) {
				System.out.println(view.getAttribute("text"));
				if (view.getAttribute("text").equals(ExpVName)) {
					view.click();
					flgFound = true;
					break;

				}
			}

			if (!flgFound) {
				scroll_Up();
				scroll_Down();
				scroll_Up();
			}

		}
	}
	public void scroll_Down() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Scroll Down ....");
		int height = driver.manage().window().getSize().getHeight();
		//		WD
		int width = driver.manage().window().getSize().getWidth();
		//		
		//		StartY  90% of Ht
		int endY = (int) (height * 0.9); 
		//		StartX 50% of W
		int endX = (int) (width * 0.5);
		//		EndY  10% of Ht
		int startY = (int) (height * 0.2);
		//		EndX = StartX
		int startX = endX;


		TouchAction action = new TouchAction(driver);
		action.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();
		
		Thread.sleep(1000);

		

	}
	public void scroll_Up() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Scroll UP ....");
		//		Ht
		int height = driver.manage().window().getSize().getHeight();
		//		WD
		int width = driver.manage().window().getSize().getWidth();


		//		
		//		StartY  90% of Ht
		int startY = (int) (height * 0.9); 
		//		StartX 50% of W
		int startX = (int) (width * 0.5);
		//		EndY  10% of Ht
		int endY = (int) (height * 0.1);
		//		EndX = StartX
		int endX = startX;


		TouchAction action = new TouchAction(driver);
		action.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();
		
		Thread.sleep(1000);


	}

}