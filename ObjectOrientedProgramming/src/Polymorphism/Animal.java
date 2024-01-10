package Polymorphism;

public class Animal {
	
	String name;
	int hp;
	
	
	void dialog() {
	System.out.println("Please override this function");
		}
		
	void showStats() {
		System.out.println("Name : " + name );
		System.out.println("Hp   : " + hp);
	}
}
