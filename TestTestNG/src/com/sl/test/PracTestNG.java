package com.sl.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class PracTestNG {
  @Test(dataProvider = "dp")
  public void Test(Integer n, String s) {
	  System.out.println("Int value is "+n+" "+"String value is "+s);
  }
  
  @Test(dataProvider = "logindp")
  public void LoginTest(String un, String p){
	  //open browser
	  //login
	  //enter un and pwd
	  System.out.println("Username is "+un+" "+"Password is "+p);
	  
  }
  // how we can get the data -> a. hard coding b. from excel
  @Test
  public void t() {
	  System.out.println("Test 1 to run");
  }
  @Test
  public void t2() {
	  System.out.println("Test 2 to run");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  
  @DataProvider
  public String[][] logindp() {
    return new String[][] {
      new String[] { "admin", "password" },
      new String[] { "admin2", "password2" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class1");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class1");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test Class1");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test Class1");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite Class1");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite Class1");
  }


}
