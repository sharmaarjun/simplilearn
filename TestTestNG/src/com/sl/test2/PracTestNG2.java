package com.sl.test2;

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

public class PracTestNG2 {
	
	@Test(dataProvider = "signupdp")
	public void signup(String us, String ps) {
		System.out.println("Sign up name - "+us+" "+"Password would be "+ps);
	}

@Test
  public void t() {
	  System.out.println("Test 1 to run class 2");
  }
  @Test
  public void t2() {
	  System.out.println("Test 2 to run class2");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method class 2");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method class 2");
  }

  
  @DataProvider
  public String[][] signupdp(){
	  return new String[][] {
		  new String[] {"user1","pass1"},
		  new String[] {"user2","pass2"},
	  };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class2");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class2");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test Class2");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test Class2");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite Class2");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite Class2");
  }

}
