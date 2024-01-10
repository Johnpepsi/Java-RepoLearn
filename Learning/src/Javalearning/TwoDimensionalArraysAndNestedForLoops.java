package Javalearning;

public class TwoDimensionalArraysAndNestedForLoops {

	public static void main(String[] args) {
		
		String users[][] = {
				{"Kobe","131e"},
				{"Don","213d"},
				{"Aga","ewqf2", "pares"},
				{"Lebron","fe21","venus", "mars"}
				
		};
		
		for (String user[]:users) {
			
			for(String info:user) {
				System.out.println(info);
			}
		
			System.out.println();
			
		}
	}
}

// This is how 2D array works. Medyo mahirap intindihin to for beginners // 