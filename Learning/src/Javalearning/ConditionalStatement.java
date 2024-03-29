package Javalearning;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Math     : ");
		float mathGrade = s.nextFloat();
	
		System.out.print("Science  : ");
		float scienceGrade = s.nextFloat();
		
		System.out.print("English  : ");
		float englishGrade = s.nextFloat();
		
		System.out.print("Computer : ");
		float computerGrade = s.nextFloat();
		
		float average = (mathGrade + scienceGrade + englishGrade + computerGrade) / 4;
		
		System.out.println();
		System.out.println("Average : " + average);
		
		if(average > 100) System.out.println("Invalid Grade");
		else if(average >= 98)System.out.println("With Highest Honors");
		else if(average >= 95)System.out.println("With High Honors");
		else if(average >= 90)System.out.println("With Honors");
		else if(average >= 75)System.out.println("With Pass");
		else System.out.println("Failed");
		
	}

}

// Conditional Statements it compares two values so that our program can decide what action should be taken //