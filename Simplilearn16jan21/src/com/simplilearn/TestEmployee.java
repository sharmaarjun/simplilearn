package com.simplilearn;

import java.util.Scanner;

public class TestEmployee {
	public static void main(String[] args) {
		
	String[] emp = {"John","David","Iron","Strange","Thanos"};
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the desired name: ");
	String empName = input.next();
	DesiredName(emp,empName);
	}
	public static void DesiredName(String[] emp, String empName) {
		boolean found = false;
		for(int i=0; i<emp.length; i++) {
			if(empName.equalsIgnoreCase(emp[i])) {
				System.out.println("Name is available in system at position: "+i);
				found = true;
			}
		}
		if(!found) {
			System.out.println("Name not available!!");
		}
	}
}
