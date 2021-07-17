package com.tdd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.tdd.dev.Calculator;

class TestCalculator {
	
	static Calculator objcal;
	static int op1;
	static int op2;
	static int expSum , expSub;
	
	@BeforeClass
	static public void setupbeforeclass() {
		objcal = new Calculator();
		op1 = 15;
		op2 = 20;
		expSum = 35;
		expSub = 5;

	}

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	//@Test
	public void caltest() {
		
		objcal.print("Arjun");
	}
	@Test
	public void calAdd() {
		int sum = Calculator.Add(op1,op2);
		assertEquals(expSum, sum);
	}
	@Test
	public void calSub() {
		int sub = Calculator.Sub(op1,op2);
		assertEquals(expSub, sub);
	}

}
