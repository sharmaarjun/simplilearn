package com.simplilearn;

public class TestWhileLoop {
	public static void main(String[] args) {
	
		int count = 1;
		while(count < 10) {
			System.out.println("Count is: "+count);
			count ++;
		}
		do {
			System.out.println("DO Count is: "+count);
			// terminator
			count ++;
		}while(count<5);
	}
	
}
