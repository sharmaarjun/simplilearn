package exceptionhandling;

import java.io.IOException;
import java.util.Scanner;


public class multiple {
	final static int response = 1000;
	static float total;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount: ");
		try {
		int amount = Integer.parseInt(input.next());
		total = response/amount;
		fun(amount);
		}
		catch (AccountNotFoundException e) {
			System.out.println("Personalized text = "+ e.getMessage());
		}
		catch (IOException e) {
			System.out.println("IO error: "+ e.getClass());
		}
		catch (ArithmeticException a) {
			System.out.println("Arithmetic : " + a.getMessage());
			a.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Catch error msg:"+ e.getMessage());
		}
		finally {
			System.out.println("This needs to be executed");
		}
		
		
	}
	public static void fun(int amount) throws Exception {
		if (amount >= 2) {
			System.out.println("It's a valid number. Result is "+total);
		}
		else {
			throw new AccountNotFoundException("This is not excepted at all." + amount); 
			
		}
	}

}
