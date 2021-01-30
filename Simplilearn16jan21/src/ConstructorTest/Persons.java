package ConstructorTest;

public class Persons {
	public int id;
	public String name;
	public int age;
	
	//Default Constructor
	public Persons() {};

	public Persons(int id) {};
	
// right click >> source >> generate constructor
	public Persons(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
}