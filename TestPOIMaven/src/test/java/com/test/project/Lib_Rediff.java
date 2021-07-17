package com.test.project;

import org.openqa.selenium.WebDriver;

public class Lib_Rediff {
	//WebDriver driver;
	public String Login(String UN, String PWD) {
		//driver.get("https://www.rediff.com/");
		//return "Returning some value";
		if (UN.equals("admin")  && PWD.equals("root")) {
			return "LoginPass";
		}
		else{
			return "LoginFail";
		}

	}

}
