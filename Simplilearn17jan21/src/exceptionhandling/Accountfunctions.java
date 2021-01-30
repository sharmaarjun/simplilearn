package exceptionhandling;

import java.util.Scanner;

public class Accountfunctions {
	
	public static void main(String[] args) {
		
	//create an account object
	Account account = new Account(16001, 25000, "John");
	//Scanner input = new Scanner(System.in);
	//System.out.println("Enter Account number: ");
	//int acc = input.nextInt();
	try {
		showBalance(account);
	} catch (Exception e) {
		System.out.println("Check again:"+ e.getMessage());
	}

	
	}
	private static void deposit(Account account) {
		
	}
	
	private static void showBalance(Account account) throws Exception {
		if(account.accnum == 16001) {
			System.out.println("This account belongs to ::"+account.name+"\n"+"whose balance is ::"+account.balance);
		}else {
			throw new Exception("Check out the detail"+account.accnum);
		}
	}
	
	private static void withdraw(Account account) {
	
	}
}
