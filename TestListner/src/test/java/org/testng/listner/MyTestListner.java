package org.testng.listner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListner implements ITestListener {
	Logger log = new Logger();

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println(context.getName()+"Everything is over now");
		log.closeLogger();
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println(context.getName()+"Everything just started");
		log.createLogger("Testing2");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime dateTime = LocalDateTime.now();
		String crtDt = dtf.format(dateTime);
		
		log.writeLogs("Starting");
	}
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName()+"has started");
		log.writeLogs("Start testing");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName()+"has failed");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName()+"has skipped");
	}

	

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName()+"has passed");
	}
		
}
