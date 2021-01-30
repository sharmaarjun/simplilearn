package Collection;

import java.util.ArrayList;

public class Arrayflow {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Arjun");
		name.add("Sharma");
		
		System.out.println(name.get(1));
		for(String s : name) {
			System.out.println("Name stored in db are :: "+s);
		}
	}
}
