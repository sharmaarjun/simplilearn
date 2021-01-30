import java.util.Scanner;

public class hello {
	public static void main(String[] args) {
		System.out.println("Hello World");
		Variables obj = new Variables();
		Scanner s = new Scanner(System.in);
		obj.method();
		System.out.println("Data = "+obj.data);
		System.out.println("m = "+Variables.m);
		
		/* set the value and then get it */
		User ob = new User();
		ob.setUserId(100);
		System.out.println(ob.getUserId());
	}

}
