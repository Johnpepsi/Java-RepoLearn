package inheritance;

public class Toddler extends Person {
	
	String myOccupation;
	
	Toddler(String name, String sex, int age, String myOccupation){
		
		super(name,sex,age);
		this.myOccupation = myOccupation;
		
	}
	
	void drink() {
		System.out.println(name + " Drinking coffee");
	}

	public void checkStatus() {
		super.checkStatus();
		System.out.println("Occupation: " + myOccupation);
	}
}
