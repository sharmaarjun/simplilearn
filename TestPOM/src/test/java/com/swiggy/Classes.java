package com.swiggy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Classes {
	WebDriver driver;
	@FindBy(id="location")
	WebElement loc;
	
	@FindBy(className="_3iFC5")
	WebElement find;
	
	public Classes(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void search(String city) throws InterruptedException {
		loc.sendKeys(city);
		find.click();
		Thread.sleep(2000);
		driver.close();
	}

}
