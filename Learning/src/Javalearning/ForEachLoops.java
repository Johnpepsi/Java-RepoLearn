package Javalearning;

import java.util.Scanner;

public class ForEachLoops {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		String[] names = {"Belo", "Dinar", "Dawri", "Bonnie"};
		
		System.out.println("Name to search :");
		String search = s.nextLine();
		
		for(String name:names) {
			if(name.equalsIgnoreCase(search)) {
				System.out.println("We Found, " + name);
				break;
			}else {
				System.out.println(name);
			}
			
			
			
		}
		
		
		

	}

}
