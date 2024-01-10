package Javalearning;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String[] usernames = {"Jai","Marc","Dad"}; 
		String[] passwords = {"boom", "gethack", "serber"};
				
		System.out.print("Username : ");
		String username = s.nextLine();
		
		System.out.print("Password : ");
	    String password = s.nextLine();
	    
	    boolean isExist = false;
	    
	    for(int i = 0;i < usernames.length;i++) {
	    
	    	if(username.equals(usernames[i]) && password.equals(passwords[i])) {
	    		isExist =  true;
	    		break;
	    		
	    	}
	    		
	    /* this code is very helpful. It applies to real systems. 
	    	Madalas gagamitin itong LOGIC gamit itong loops */
	  
	  }
	    if(isExist) System.out.println("Welcome " + username);
	    else System.out.println("Account Not Found");
	  
    }
}



// this problem is called Authentication Simulation //
/* Create a program that has 2 sets of arrays w/ values already one for the username and one
for the password, the username and password should be paired by the index, 

Let the user input
a username and password then check if the account exists on the 2 sets of arrays. */ 