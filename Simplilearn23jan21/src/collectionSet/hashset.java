package collectionSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class hashset {

	public static void main(String[] args) {

		Set<String> groceries = new HashSet<String>();
		groceries.add("Bread");
		groceries.add("Butter");
		groceries.add("Milk");
		System.out.println("We have: "+groceries);
		
		for(String name: groceries) {
			System.out.println("->"+name);
		}
		
		
		TreeSet<String> nameset = new TreeSet<String>();
			nameset.add("Ross");
			nameset.add("Monica");
			nameset.add("Chandler");
			nameset.add("Phoebe");
			nameset.add("Rachael");
			
			//using iterator
			Iterator<String> itr = nameset.iterator();
			while(itr.hasNext()) {
				System.out.println("FRIENDS --> "+itr.next());
			}
		

	}

}
