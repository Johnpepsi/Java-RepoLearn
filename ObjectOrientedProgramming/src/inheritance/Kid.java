package inheritance;

public class Kid extends Toddler{
	
	int gradeLevel;
	
	Kid(String name,String sex,int age, String myOccupation){
		super(name,sex,age,myOccupation);
		this.gradeLevel = gradeLevel;
	}
}
