package OOP;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Name : ");
		String name = s.nextLine();
		
		System.out.print("Price : ");
		float price = s.nextFloat();
		

		Product p = new Product(name, price);

	}

}
