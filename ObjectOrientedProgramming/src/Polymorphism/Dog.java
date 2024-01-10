package Polymorphism;

public class Dog extends Animal{

	Dog(){
		name = "Bird"; 
		hp = 100;
	}
	
	Dog(String name){
		this.name = name;
		hp = 100;
	}
	
	void dialog() {
		System.out.println(name + " : Arf Arf");
	}
}
