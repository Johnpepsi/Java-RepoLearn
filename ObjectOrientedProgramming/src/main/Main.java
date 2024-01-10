package main;

import main.Character;

public class Main {

	public static void main(String[] args) {
		
		Character c = new Character("Jai", "Hello myLove", 120,21,3);
		Character c1 = new Character("Mew", "Hello pokemon", 203,21,33);
		c.talkTo(c1);
		

	}

}
