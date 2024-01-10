package Abstraction;

public abstract class Car {

	String name;
	
	
	abstract void makeSound(); 
	abstract void speed();
	
	void showName() {
		System.out.println("Name : " + name);
	}
	
	void setName(String name) {
		this.name = name;
	}
}
 