package Array;

import java.util.ArrayList;
import java.util.Iterator;

public class list {
	static String message = "this is new";
	
	
	public static void main(String[] args) {
	
	ArrayList<String> en = new ArrayList<String>();
	en.add("Bread");
	en.add("Milk");
	System.out.println("->"+en);
	Iterator<String> itr = en.iterator();
	while(itr.hasNext()) {
		System.out.println("->>>> ::"+itr.next());
	}
	ist(message);
	}


public static void ist(String text){
	list.message = text;
	System.out.println(text);
}
	

}
