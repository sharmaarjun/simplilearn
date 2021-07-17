package com.jmeter;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkClass {

	WebDriver driver;
	
	//LOGIN
	@FindBy(id="username")
	WebElement usern;
	@FindBy(id="password")
	WebElement passw;
	@FindBy(id="Login")
	WebElement log;
	
	//SEARCH
	@FindBy(xpath="//*[@id=\"160:0;p\"]")
	WebElement search;	
	@FindBy(xpath="//*[@id=\"19119:0\"]/div[2]/span/div")
	WebElement gedc;
	
	public LinkClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void Login(String user, String pass) {
		
		usern.sendKeys(user);
		passw.sendKeys(pass);
		log.click();
	}
	
	public void Search(String partner) throws InterruptedException {
		Thread.sleep(2000);
		search.sendKeys(partner);
		search.submit();
		//gedc.click();
	}
	
	public void End() {
		driver.quit();
	}
	
}
