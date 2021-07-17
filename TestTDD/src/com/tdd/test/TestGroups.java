package com.tdd.test;

import org.testng.annotations.Test;

public class TestGroups {
	//refer testng.org for more groups option
	@Test(groups= {"smoke","login"})
	public void testLoginValid() {
		System.out.println("testLoginValid");
	}
	
	@Test(groups= {"Transfers","smoke"})
	public void testLoginInValid1() {
		System.out.println("testLoginInvalid1");
	}
	
	@Test
	public void testLoginInvalid2() {
		System.out.println("testLoginInvalid2");
	}
	
	
}
