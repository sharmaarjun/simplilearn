package com.appium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestAppium {
  @Test
  public void MyTest() {
	  System.out.println("MyTest");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Befoe Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

}
