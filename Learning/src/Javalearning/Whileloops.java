package Javalearning;

import java.util.Scanner;

public class Whileloops {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int lives = 3;
		String answer;
		
		while(lives > 0) {
			
			System.out.println("What is the largest country? ");
			System.out.print("Answer : ");
			answer = s.nextLine();
		
			if(answer.equalsIgnoreCase("Philippines")) break;
			
			else lives--;
			
		}
		
		if(lives > 0) System.out.println("You Won!!");
		else System.out.println("You LOST!!");
		
		
		
     }
  }

// this is a QUIZ GAME. A program that will ask the user a question make the user 
// the question, check if its correct if not deduct a life to the user and ask the question again
// until their lives runs out or they answer correctly.

