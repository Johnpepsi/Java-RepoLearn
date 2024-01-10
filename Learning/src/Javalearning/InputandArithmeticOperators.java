package Javalearning;

import java.util.Scanner;

public class InputandArithmeticOperators {

	public static void main(String[] args) {
		
		
		String numOne;
		String numTwo;
		String result;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("First Name : ");
		numOne = s.nextLine();
		
		System.out.println("Second Name : ");
		numTwo = s.nextLine();
		
		result = numOne + numTwo;
		
		System.out.println();
		System.out.println(numOne + "+" + numTwo + " = " + result);
	}

}

// can change to float only if want to add numbers. (float) are meant for numbers. 
// nextFloat and nextLine are different. nextLine are for String. //