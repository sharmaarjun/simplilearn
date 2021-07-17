package com.tdd.dev;

public class LoginClass {
	
	public String login(String username,String password) {
		System.out.println("You have entered username = "+username);
		System.out.println("You have entered password = "+password);
		if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")) {
			return "LoginPass";
		}else {
			return "LoginFail";
		}
		
	}

}
