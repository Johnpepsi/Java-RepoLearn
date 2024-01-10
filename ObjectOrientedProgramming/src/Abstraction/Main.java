package Abstraction;

public class Main {

	public static void main(String[] args) {
		
		//Concrete Idea //
		Car h = new Toyota();
		Car t = new Honda();

		h.setName("Asian");
		t.setName("Too Asian");
		
		h.showName();
		t.showName();
	}

}
