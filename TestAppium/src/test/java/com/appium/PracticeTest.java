package com.appium;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class PracticeTest {

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
		driver.quit();
	}

	@Test
	public void ScrollandClick() throws InterruptedException {
		
		ClickonSeek("Seek Bar");
		Thread.sleep(2000);
		ScrollHorizontal();
		
	}
	public void ScrollHorizontal() throws InterruptedException {
		MobileElement seekbar = driver.findElement(By.id("io.appium.android.apis:id/seek"));
		int sbheight = seekbar.getSize().getHeight();
		int sbwidth = seekbar.getSize().getWidth();
		int startX = seekbar.getLocation().getX();
		int startY = seekbar.getLocation().getY();
		int endX = (int) (sbwidth * .5);
		int endY = sbheight;
		TouchAction scroll = new TouchAction(driver);
		scroll.longPress(PointOption.point(startX,startY)).moveTo(PointOption.point(endX,endY)).release().perform();
		System.out.println(driver.findElement(By.id("io.appium.android.apis:id/progress")).getAttribute("text"));
		System.out.println(driver.findElement(By.id("io.appium.android.apis:id/tracking")).getAttribute("text"));
		Thread.sleep(5000);
		
	}
	
	public void ClickonSeek(String Vname) {
		MobileElement parent = driver.findElement(By.id("android:id/content"));
		Boolean flgset = false;
		while (!flgset) {
			
		
		List<MobileElement> children = parent.findElements(By.id("android:id/text1"));
		for (MobileElement child : children) {
			System.out.println(child.getAttribute("text"));
			if(child.getAttribute("text").equalsIgnoreCase(Vname)) {
				child.click();
				flgset = true;
				break;
			}
		}
			if(!flgset) {
				Scroller();
			}
		}
	}
	
	
	public void Scroller() {
		int height = driver.manage().window().getSize().getHeight();
		int width = driver.manage().window().getSize().getWidth();
		int starty = (int) (height * .9);
		int startx = (int) (width * .5);
		int endy = (int) (height * .1);
		int endx = startx;
		
		TouchAction action = new TouchAction(driver);
		action.longPress(PointOption.point(startx,starty)).moveTo(PointOption.point(endx,endy)).release().perform();
	}

}
