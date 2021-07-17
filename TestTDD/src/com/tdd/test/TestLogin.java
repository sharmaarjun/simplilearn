package com.tdd.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.function.ObjLongConsumer;

//import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.tdd.dev.LoginClass;

class TestLogin {
	static LoginClass objlogin;

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		objlogin = new LoginClass();
		
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

	@Test
	void testlogin() {
		String username = "Admin";
		String password = "password";
		String statuslogin = objlogin.login(username,password);
		assertEquals("LoginPass", statuslogin);
		
	}
	@Test
	void testblankusername() {
		String username = "";
		String password = "password";
		String statuslogin = objlogin.login(username,password);
		assertEquals("LoginFail", statuslogin);
		
	}
	@Test
	void testblankpassword() {
		String username = "Admin";
		String password = "";
		String statuslogin = objlogin.login(username,password);
		assertEquals("LoginFail", statuslogin);
		
	}
}
