package com.simplilearn;

import java.util.Scanner;

public class TestBankAccount {

	public static void main(String[] args) {
		String[] user = {"Pnb","Sbi","icici","uco","Dena"};
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your user here: ");
		String emp = input.next();
		findUser(user, emp);

	}
	public static void findUser(String[] user,String emp) {
		Boolean found = false;
		for(int i = 0; i < user.length; i++) {
			if(emp.equalsIgnoreCase(user[i])) {
				System.out.println("User exists in db at position: "+i);
				found = true;
			}
		}
		if(!found) {
			System.out.println("User not found, Try Again");
		}
	}
}