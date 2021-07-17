package com.extent;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestReportExtent {
	
	static ExtentReports reports;
	static ExtentTest test;
	@BeforeClass
	public static void startTest() {
		System.out.println(System.getProperty("user.dir")+"\\MyExtentReport.html");
		//reports = new ExtentReports(System.getProperty("user.dir")+"\\MyExtentReport.html");
	reports = new ExtentReports(System.getProperty("user.dir")+"\\MyExtentReport.html");
	}
	
	@Test
	public void testPass() {
		//Assert.assertTrue(true);
		test = reports.startTest("test start");
		try {
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Test pass has passed");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Test pass has failed");
		}
	}
	
	@Test
	public void testFail() {
		
		//Assert.assertTrue(false);
		test = reports.startTest("test start");
		test.log(LogStatus.FAIL, "Test Fail has failed");
				
	}
	
	
	@AfterClass
	public static void endTest() {
		reports.flush();
	}
}
