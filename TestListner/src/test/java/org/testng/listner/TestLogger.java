package org.testng.listner;

public class TestLogger {

	public static void main(String[] args) {
		Logger mylog = new Logger();
		mylog.createLogger("Testing");
		mylog.writeLogs("Start testing");
		mylog.writeLogs("in the middle of code");
		mylog.writeLogs("Now we are in the end game");
		mylog.closeLogger();
		

	}

}
