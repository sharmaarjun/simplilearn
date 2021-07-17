package com.sl.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestJunit {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each");
	}

	@Test
	void test() {
		System.out.println("This is my test");
	}
	
	@Test
	void test2() {
		System.out.println("This is my 2nd test");
	}
	
	@Test
	void test3() {
		System.out.println("This is my 3rd test");
	}
}
