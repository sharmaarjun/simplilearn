package com.ecommerce.webapp.test.phase2_selenium_sikuli_maven;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SystemFunctionalityTest {
/*
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
*/
	@Test
	public void test() throws FindFailed {
		
		Screen screen = new Screen();
		// enter the location of screenshot
		screen.find("C:\\Users\\Arjun Sharma\\Downloads\\SikuliScreens\\capture.png");
		screen.doubleClick("C:\\Users\\Arjun Sharma\\Downloads\\SikuliScreens\\capture.png");
		//Pattern p1 = 
		
	}

}
