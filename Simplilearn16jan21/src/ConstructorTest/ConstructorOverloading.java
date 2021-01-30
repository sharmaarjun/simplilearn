package ConstructorTest;

public class ConstructorOverloading {
	public String name;
	public int id;
	public String description;
	public int price;
	public int quantity;

	
	ConstructorOverloading(){};
	//this.name = name;
	//System.out.println(this.name);
	public ConstructorOverloading(String name) {
		this.name = name;
		}
	public ConstructorOverloading(String name, int id, String description, int price, int quantity) {
		super();
		this.name = name;
		this.id = id;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	};
	
}

