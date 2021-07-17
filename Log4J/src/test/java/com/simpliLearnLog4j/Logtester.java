package com.simpliLearnLog4j;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class Logtester {
  @Test
  public void f() {
	  System.out.println("----------------Test----------------");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("------------Before Class ---------------------");
  }

}
