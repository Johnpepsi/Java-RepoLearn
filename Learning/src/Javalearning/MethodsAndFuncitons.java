package Javalearning;

public class MethodsAndFuncitons {

	public static void main(String[] args) {
		
// this topic is about methods/functions|Returns|Arguments //

		int number[] = {1,26,3,4,5};
		
		int result = summation(number);
		System.out.println(result);
		
	}

	static int summation(int numbers[]) {
		int sum = 0;
		
		for(int number: numbers) {
			sum = sum + number;
		}
		
		return sum;
		
	}
}




/* Create a program that has a method named SUMMATION it need to accept an array
 of integers then return the sum of the given array. */

// p.s display the SUM outside of the method. // 