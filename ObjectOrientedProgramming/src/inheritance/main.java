package inheritance;

public class main {

	public static void main(String[] args) {
		
	Toddler t = new Toddler("John", "Male",22, "Software Developer");
	Kid k = new Kid("Jai","Female",21,"Accountant");
	
	t.checkStatus();
	k.checkStatus();
	
	}

}
