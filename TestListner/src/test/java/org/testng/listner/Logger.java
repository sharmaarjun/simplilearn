package org.testng.listner;

import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyTestListner.class)
public class Logger {
	
	FileWriter myLogs1;
	@Test
	public String createLogger(String fileValue) {
		try {
			myLogs1 = new FileWriter(fileValue+".log");
		} catch (IOException e) {
			return e.getMessage();
		}
		return "Created Logs";
	}
	@Test (dependsOnMethods = "createLogger")
	public String writeLogs(String entry) {
		try {
			myLogs1.write(entry);
		} catch (IOException e) {
			return e.getMessage();
		}
		return "Logs added";
	}
//	@Test
	public String closeLogger() {
		try {
			myLogs1.close();
		} catch (IOException e) {
			return e.getMessage();
		}
		return "End Now";
	}

}
