package Inheritance;

import java.util.Scanner;

public class SuperClass {
	public String category;
	public int tyres;
		public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			System.out.println("Enter detail about category or tyres: ");
			String entry = input.next();
			sup(entry);
		}
	public static void sup(String entry){
		if(entry.equalsIgnoreCase("Category")) {
		System.out.println("Your output will be "+entry);

	}else {
		System.out.println("You got the tyres = "+entry);
	}
	}
}
