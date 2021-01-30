package ConstructorTest;

public class TestConstructorOverloading {

	public static void main(String[] args) {
		
		ConstructorOverloading con = new ConstructorOverloading();
		con.name = "Arjun";
		con.id = 18;
		con.description = "Using it for the first time";
		
		System.out.println("Data given is name: "+con.name+" id will be: "+con.id+" Description for it is: "+con.description);
		
		ConstructorOverloading con2 = new ConstructorOverloading("Mafia");
		System.out.println("Name is changed: "+con2.name+con2.id);
		
		//Constructor calling all class variables
		ConstructorOverloading con3 = new ConstructorOverloading("Completing name",11,"Describing",99,2);
		System.out.println("Name now is: "+con3.name+" Updated ID is: "+con3.id+" Describe the fields here as: "+con3.description+" Value is: "+con3.price+" Quantity you need is: "+con3.quantity);
	}

}
