package org.testng.listner;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyTestListner.class)
public class TestLogin {
  @Test
  public void testPass() {
	  Assert.assertTrue(true);
  }
  
  @Test (dependsOnMethods="testPass")
  public void TestPFail() {
  	Assert.assertTrue(false);
  }
  @Test (dependsOnMethods = "TestPFail")
  public void testDependsOn() {
	  System.out.println("Depends on Test Fail");
	  
  }
}
