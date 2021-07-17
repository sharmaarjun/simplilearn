package com.tdd.test;

import org.testng.annotations.Test;

public class TestOrder {
  @Test
  public void a() {
	  System.out.println("A printer");
  }
  
  @Test(priority=1)
  public void b() {
	  System.out.println("B printer");
  }
  
  @Test
  public void c() {
	  System.out.println("C printer");
  }
  
  @Test(priority=2)
  public void d() {
	  System.out.println("D printer");
  }
}
