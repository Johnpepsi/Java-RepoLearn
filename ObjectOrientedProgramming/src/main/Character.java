package main;

import main.Character;

public class Character {
			
			String name, dialog; 
			int hp, mp, lvl;
			
			Character(String name, String dialog, int hp, int mp, int lvl){
				
				this.name = name;
				this.dialog = dialog;
				this.hp = hp;
				this.mp = mp;
				this.lvl = lvl;

		}

			void introduce() {
				
				System.out.println("I' am " + name);
			}
			
			void sayDialog() {
				System.out.println(name + " : " + dialog);
			}
			
			void talkTo(Character x) {
				System.out.println(name + " : Hello, " + x.name);
			}
	}

